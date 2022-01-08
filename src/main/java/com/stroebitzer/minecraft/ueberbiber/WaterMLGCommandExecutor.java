package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WaterMLGCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().info("(UEBERBIBER PLUGIN) Spawning an water block");        
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            location.setY(location.getY()-2);
            location.getBlock().setType(Material.WATER_BUCKET);
        }
        return true;
    }

}
