package com.kwwsyk.suit.arsenale.weapon;

import net.minecraft.resources.ResourceLocation;

/**
 * Represents a weapon template which provides base stats and behaviour for a
 * group of weapons. Concrete items or named weapons will reference a
 * template and extend it with additional data.
 */
public record WeaponTemplate(ResourceLocation id, float baseDamage) {}
