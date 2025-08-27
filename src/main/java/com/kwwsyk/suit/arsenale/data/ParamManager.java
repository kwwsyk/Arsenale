package com.kwwsyk.suit.arsenale.data;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import net.minecraft.resources.ResourceLocation;

/**
 * Basic manager that loads JSON parameter files into memory.  The data is
 * stored as raw {@link JsonElement} structures, allowing other systems to
 * deserialize into their own record types.  This is a lightweight stand-in for
 * the full Param/ParamEditor system described in the design document.
 */
public final class ParamManager {
    private static final Gson GSON = new GsonBuilder().setLenient().create();
    private static final Map<ResourceLocation, JsonElement> PARAMS = new ConcurrentHashMap<>();

    private ParamManager() {}

    public static void load(ResourceLocation id, Path path) throws IOException {
        try (Reader reader = Files.newBufferedReader(path)) {
            PARAMS.put(id, GSON.fromJson(reader, JsonElement.class));
        }
    }

    public static JsonElement get(ResourceLocation id) {
        return PARAMS.get(id);
    }

    public static Map<ResourceLocation, JsonElement> all() {
        return Map.copyOf(PARAMS);
    }
}
