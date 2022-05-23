package com.github.happyrogelio7.removehealthandfoodinvbar.listeners;

import com.github.happyrogelio7.removehealthandfoodinvbar.Removehealthandfoodinvbar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class PlayerFoodLevelEvent implements Listener {

    private Removehealthandfoodinvbar plugin;

    public PlayerFoodLevelEvent(Removehealthandfoodinvbar plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerFoodLevel(FoodLevelChangeEvent e){
        //e.setFoodLevel(e.getFoodLevel() - 1);
        e.setCancelled(true);
    }
}
