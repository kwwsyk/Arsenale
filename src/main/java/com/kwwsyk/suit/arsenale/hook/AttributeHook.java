package com.kwwsyk.suit.arsenale.hook;

import net.minecraft.resources.ResourceLocation;

/**
 * Hook for attribute adjustments such as attack speed or damage modifiers.
 * Implementations are expected to be lightweight and side-effect free.
 */
public interface AttributeHook extends Hook {
    @Override
    ResourceLocation id();
}
