package com.github.cmds;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CircleEffect implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (args.length == 1) {
            if (args[0].equals("tp")) {
                player.sendMessage("Effect Started");
                Location loc = player.getLocation();
                player.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 0);


            }

        }
        return true;
    }
}

