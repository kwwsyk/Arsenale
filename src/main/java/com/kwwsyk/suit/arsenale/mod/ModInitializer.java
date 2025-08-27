package com.kwwsyk.suit.arsenale.mod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.neoforged.fml.common.Mod;

/**
 * Entry point for the Arsenale mod. This class is intentionally light‑weight
 * and only establishes the basic logging and identification values. Further
 * systems are bootstrapped through their own registries.
 */
@Mod(ModInitializer.MOD_ID)
public class ModInitializer {
    public static final String MOD_ID = "arsenale";
    private static final Logger LOGGER = LoggerFactory.getLogger(ModInitializer.class);

    public ModInitializer() {
        LOGGER.info("Initializing Arsenale mod framework");
    }
}
