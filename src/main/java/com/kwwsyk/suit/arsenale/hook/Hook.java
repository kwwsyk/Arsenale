package com.kwwsyk.suit.arsenale.hook;

import net.minecraft.resources.ResourceLocation;

/**
 * Base marker interface for all hook types. Hooks allow other mods or the
 * configuration to augment behaviour without hard dependencies. Hooks are
 * looked up by {@link ResourceLocation} identifier.
 */
public interface Hook {
    ResourceLocation id();
}
