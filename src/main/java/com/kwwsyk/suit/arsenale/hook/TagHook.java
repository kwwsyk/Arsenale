package com.kwwsyk.suit.arsenale.hook;

import net.minecraft.resources.ResourceLocation;

/**
 * Hook which resolves a tag at runtime and applies it to the target object.
 */
public interface TagHook extends Hook {
    @Override
    ResourceLocation id();
}
