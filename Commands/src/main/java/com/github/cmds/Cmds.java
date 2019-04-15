package com.github.cmds;

import org.bukkit.plugin.java.JavaPlugin;

public class Cmds extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage("Cmd Works");
        getCommand("addXp").setExecutor(new addXpClass());

    }
}
