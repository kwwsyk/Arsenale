package com.kwwsyk.suit.arsenale.art;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import net.minecraft.resources.ResourceLocation;

/**
 * Registry for {@link WeaponArt} instances. It mirrors the vanilla registry
 * pattern but keeps things simple for the early development stage.
 */
public final class ArtRegistry {
    private static final Map<ResourceLocation, WeaponArt> ARTS = new HashMap<>();

    private ArtRegistry() {}

    public static void register(WeaponArt art) {
        ARTS.put(art.id(), art);
    }

    public static Optional<WeaponArt> get(ResourceLocation id) {
        return Optional.ofNullable(ARTS.get(id));
    }

    public static Map<ResourceLocation, WeaponArt> all() {
        return Collections.unmodifiableMap(ARTS);
    }
}
