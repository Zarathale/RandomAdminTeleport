package com.ServerName.randomteleport;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTeleportCommand implements CommandExecutor {

    private static final Random RANDOM = new Random();
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player admin = (Player) sender;

        if (!admin.hasPermission("randomteleport.use")) {
            admin.sendMessage("You do not have permission to use this command.");
            return true;
        }

        List<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
        players.remove(admin);

        if (players.isEmpty()) {
            admin.sendMessage("No other players are online to teleport to.");
            return true;
        }

        Player target = players.get(RANDOM.nextInt(players.size()));
        admin.teleport(target.getLocation());
        admin.sendMessage("You have been teleported to: " + target.getName());
        return true;
    }
}
