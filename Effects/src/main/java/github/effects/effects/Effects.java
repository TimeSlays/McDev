package github.effects.effects;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public final class Effects extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage("Effects Works!");
        getServer().getPluginManager().registerEvents(this, this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void EffectOn(PlayerMoveEvent e){
        Player player = e.getPlayer();
        Location loc = player.getLocation();

        player.getWorld().playEffect(loc, Effect.SMOKE, 0);
        player.getWorld().playEffect(loc, Effect.SMOKE, 0);
        player.getWorld().playEffect(loc, Effect.SMOKE, 0);
        player.getWorld().playEffect(loc, Effect.SMOKE, 0);
        player.getWorld().playEffect(loc, Effect.SMOKE, 0);
        player.getWorld().playEffect(loc, Effect.SMOKE, 0);
    }
}
