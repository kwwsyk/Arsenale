package com.kwwsyk.suit.arsenale.weapon;

import net.minecraft.resources.ResourceLocation;

/**
 * A specific weapon that extends a {@link WeaponTemplate} with its own
 * exclusive traits or weapon arts.
 */
public record NamedWeapon(ResourceLocation id, WeaponTemplate template) {}
