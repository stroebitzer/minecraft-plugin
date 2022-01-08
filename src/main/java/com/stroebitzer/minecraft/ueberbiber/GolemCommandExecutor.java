package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.w3c.dom.html.HTMLBRElement;

public class GolemCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().info("(UEBERBIBER PLUGIN) Spawning an Golem");        
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();
            IronGolem golem = player.getWorld().spawn(location, IronGolem.class);
            golem.setHealth(100);
            golem.setCustomName("Hansi Der Hinterseer");
        }
        return true;
    }

}
