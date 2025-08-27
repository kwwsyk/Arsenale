package com.kwwsyk.suit.arsenale.mod;

/**
 * Simple configuration used during early development. In a full implementation
 * this would be backed by NeoForge's config system but for now we expose a set
 * of tunable fields.
 */
public class Config {
    public boolean enableAutoHooks = true;
    public boolean betterCombatBridge = true;
    public boolean editorEnabled = true;
    public boolean debugF3Overlay = false;
    public NetworkSyncMode networkSyncMode = NetworkSyncMode.HASH_CHECK;

    public enum NetworkSyncMode {
        HASH_CHECK,
        FORCE_CONSISTENCY
    }
}
