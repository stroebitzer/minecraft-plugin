package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Player;

public class BuildingHelpCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().info("(UEBERBIBER PLUGIN) Spawning an Enderman");        
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            for (int i = 0; i<10; i++){
                Enderman enderman = player.getWorld().spawn(location,Enderman.class);
            }
        }
        return true;
    }

}
