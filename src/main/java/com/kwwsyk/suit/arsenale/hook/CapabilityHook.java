package com.kwwsyk.suit.arsenale.hook;

import net.minecraft.resources.ResourceLocation;

/**
 * Hook for attaching capabilities such as new stats or data components to an
 * item or entity.
 */
public interface CapabilityHook extends Hook {
    @Override
    ResourceLocation id();
}
