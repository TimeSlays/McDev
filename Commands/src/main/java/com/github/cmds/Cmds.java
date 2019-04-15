package com.github.cmds;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Cmds extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage("Cmd Works");
        getCommand("addXp").setExecutor(new addXpClass());
        getCommand("eft").setExecutor(new CircleEffect());


        }
    }

