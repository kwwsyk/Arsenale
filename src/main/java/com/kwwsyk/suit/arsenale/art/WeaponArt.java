package com.kwwsyk.suit.arsenale.art;

import net.minecraft.resources.ResourceLocation;

/**
 * Represents a weapon art – a special attack with an optional cost and
 * cooldown.  The actual animation or effect is defined elsewhere; this class
 * merely stores the identifying data.
 */
public record WeaponArt(ResourceLocation id, int cost, int cooldown) {}
