package git.timesslays.mcdev;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class McDev extends JavaPlugin implements Listener {
    //PluginEnabled
    @Override
    public void onEnable ( ) {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage( "Test" );
        getServer().getPluginManager().registerEvents(this,this );
    }
    //PluginDisabled
    @Override
    public void onDisable ( ) {
        // Plugin shutdown logic
    }
    //JoinEvent
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e){
        Player p = e.getPlayer();
        //First Time Join Message
        if(!(p.hasPlayedBefore())) {
            e.setJoinMessage( ChatColor.GRAY + p.getName( ) + ChatColor.DARK_AQUA + " has joined for the first time!" );
            //Normal Join Message
        }else {
            e.setJoinMessage( ChatColor.GRAY + p.getName( ) + ChatColor.BLUE + " has joined the server! :D" );
        }

    }
    //QuitEvent
    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage( ChatColor.GRAY + p.getName() + ChatColor.DARK_PURPLE + " has quit the server! :C" );
    }
}