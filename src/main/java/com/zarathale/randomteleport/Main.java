package com.zarathale.randomteleport;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("rtpadmin").setExecutor(new RandomTeleportCommand());
        getLogger().info("RandomTeleport enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("RandomTeleport disabled.");
    }
}
