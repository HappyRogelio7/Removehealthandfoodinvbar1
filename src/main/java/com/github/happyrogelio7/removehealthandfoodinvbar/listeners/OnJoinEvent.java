package com.github.happyrogelio7.removehealthandfoodinvbar.listeners;

import com.github.happyrogelio7.removehealthandfoodinvbar.Removehealthandfoodinvbar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoinEvent implements Listener {

    private Removehealthandfoodinvbar plugin;

    public OnJoinEvent(Removehealthandfoodinvbar plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        p.setFoodLevel(-1);

        // Start REMOVE XP BAR
        p.setLevel(-100);
        // END REMOVE XP BAR

        p.setMaxHealth(1);
    }
}
