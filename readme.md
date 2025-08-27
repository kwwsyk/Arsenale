# Arsenale

Early framework for the Arsenale mod.  The goal of this commit is to begin
laying out the core architecture described in [`DESIGN/features.md`](DESIGN/features.md)
by providing a minimal yet functional code base.

The framework currently includes:
- A basic mod entry point.
- Simple configuration class with the major toggles.
- Hook interfaces (`AttributeHook`, `CapabilityHook`, `TagHook`).
- Registries for weapon templates and weapon arts.
- A lightweight parameter manager that reads JSON files.

This is only a starting point; functionality will be expanded in future commits.
