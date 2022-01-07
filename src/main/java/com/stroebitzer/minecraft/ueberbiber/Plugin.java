package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    public void onEnable() {
        this.getLogger().info("(UEBERBIBER PLUGIN) Ueberbiber Plugin Enabled");
        this.getCommand("dragon").setExecutor(new DragonCommandExecutor());
        this.getCommand("firework").setExecutor(new FireworkCommandExecutor());
    }

}