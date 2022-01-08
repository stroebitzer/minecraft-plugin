package com.stroebitzer.minecraft.ueberbiber;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Rabbit.Type;
import org.bukkit.inventory.meta.FireworkMeta;

public class RabbitCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.getLogger().info("(UEBERBIBER PLUGIN) Spawning a rabbit");        
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = player.getLocation();

            Rabbit rabbit = player.getWorld().spawn(location, Rabbit.class);
            rabbit.setRabbitType(Type.GOLD);
        }
        return true;
    }

}
