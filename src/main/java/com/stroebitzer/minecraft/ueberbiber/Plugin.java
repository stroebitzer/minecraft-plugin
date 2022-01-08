package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    public void onEnable() {
        this.getLogger().info("(UEBERBIBER PLUGIN) Ueberbiber Plugin Enabled");
        this.getCommand("dragon").setExecutor(new DragonCommandExecutor());
        this.getCommand("firework").setExecutor(new FireworkCommandExecutor());
        this.getCommand("snowballfight").setExecutor(new SnowballFightCommandExecutor());
        this.getCommand("buildinghelp").setExecutor(new BuildingHelpCommandExecutor());
        this.getCommand("Goldenrabbit").setExecutor(new RabbitCommandExecutor());
        this.getCommand("Golem").setExecutor(new GolemCommandExecutor());
    }   

}