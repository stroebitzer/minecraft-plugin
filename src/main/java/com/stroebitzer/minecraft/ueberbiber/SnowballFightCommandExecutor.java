package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowman;

public class SnowballFightCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().info("(UEBERBIBER PLUGIN) Spawning an snowman");        
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            for (int i=0; i<42; i++) {
                player.getWorld().spawn(location, Snowman.class);
            }
        }
        return true;
    }

}
