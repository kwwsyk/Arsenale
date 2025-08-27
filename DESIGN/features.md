# Arsenale Mod Features Summary

## 1. Weapon Class Expansion
- Adds about 100 weapon templates (Weapon Class/Weapon Type).
- Each weapon has unique appearance, moveset, and stat configuration.
- Supports **Specified/Named Weapons**, which add exclusive traits and weapon arts on top of templates.

## 2. Integration with Forging Mods
- Compatible with **Silent Gear**: provides 100+ blueprints; material stats directly participate in scaling.
- Compatible with **Tetra**: templates mapped to module slots and part trees; named weapons can lock preset combos.
- Compatible with **Tinkers’ Construct**: templates mapped to tool types, supporting materials and modifiers.
- Base stats and scaling ratios are uniformly defined in **Param**, ensuring cross‑mod consistency.

## 3. Movesets & Weapon Arts (Param‑Driven, Simple Runtime Implementation)
- **State‑based Movesets**: switch by environment (sprint, heavy, falling, flying, underwater). Generates action JSON to integrate with **Better Combat**; falls back to built‑in tables if mod is absent.
- **Weapon Arts**: treated as special movesets. Independent registry **ArtRegistry**, including cost, cooldown, animation, and effects; can bind to weapon classes or named weapons.
- **Param‑First Definition**: action tables, frame data, hitboxes, resource cost, cooldown, and priority are defined in **Param**, compiled into read‑only curves/tables at runtime.
- **Debug Tools**:
  - F3 toggle shows attack outlines/hitboxes/movement trails with keyframe markers.
  - Command: `/arsenale simulate <id>` outputs DPS, frame histograms, stagger loops; raises alerts on out‑of‑range values.

## 4. Parameters & Editor (Param + ParamEditor)
- **Param Management**:
  - **JSON is the runtime source of truth**, validated via `Codec`.
  - **CSV only for batch editing**, converted into JSON.
  - Supports inheritance and fragment reuse (ref/extends).
- **In‑Game Editor**:
  - Form‑based UI (sliders, steppers, dropdowns, multi‑selects, curve editors).
  - Real‑time preview of stat changes and action timelines; local validation → server arbitration → snapshot broadcast.
  - Permission controlled (OP/permission node only), with audit logs and version rollback.
  - Supports CSV import and JSON export.

## 5. Hook System & Config Options
- **Hooks**: `AttributeHook`, `CapabilityHook`, `TagHook`, identified by `ResourceLocation`; applied if present, silently skipped if missing.
- **Config Options** (examples):
  - `enableAutoHooks`: auto‑apply hooks or not.
  - `betterCombatBridge`: enable/disable action bridge.
  - `editorEnabled`: allow in‑game editor.
  - `debugF3Overlay`: F3 debug overlay toggle.
  - `networkSyncMode`: parameter sync strategy (hash check/force consistency).

## 6. Performance & Compatibility
- Compiles actions and stats into read‑only tables during resource load; combat runtime is reflection‑free and table‑driven.
- Network sync uses only diffs and hashes; mismatched versions are rejected with notification.
- Auto‑downgrades gracefully when linked mods are absent, recipes and registry entries remain usable.

## 7. Development & Extension (API + Extra Param)
- **API**: exposes interfaces for reading/writing Param, action generators, and weapon art registry; provides datagen and simulator entry points.
- **Extendable Custom Extra Param**: third‑party mods can register “extra param” fields under their namespace (`ResourceLocation`‑keyed), included in validation and export; used for new attributes, resource costs, or action modifiers.

