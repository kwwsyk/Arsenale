package com.kwwsyk.suit.arsenale.weapon;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import net.minecraft.resources.ResourceLocation;

/**
 * Simple in-memory registry for weapon templates. During startup weapon
 * definitions are loaded from {@code Param} files and registered here so that
 * other systems can look them up by identifier.
 */
public final class WeaponRegistry {
    private static final Map<ResourceLocation, WeaponTemplate> TEMPLATES = new HashMap<>();

    private WeaponRegistry() {}

    public static void register(WeaponTemplate template) {
        TEMPLATES.put(template.id(), template);
    }

    public static Optional<WeaponTemplate> get(ResourceLocation id) {
        return Optional.ofNullable(TEMPLATES.get(id));
    }

    public static Map<ResourceLocation, WeaponTemplate> all() {
        return Collections.unmodifiableMap(TEMPLATES);
    }
}
