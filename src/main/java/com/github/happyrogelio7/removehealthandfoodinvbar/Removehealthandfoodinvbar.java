package com.github.happyrogelio7.removehealthandfoodinvbar;

import com.github.happyrogelio7.removehealthandfoodinvbar.listeners.OnJoinEvent;
import com.github.happyrogelio7.removehealthandfoodinvbar.listeners.PlayerFoodLevelEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Removehealthandfoodinvbar extends JavaPlugin {

    //Note Author: I only did it to test for the moment I managed to remove the XP bar.
    //Note Author: I only did it to test for the moment I managed to remove the XP bar.
    //Note Author: I only did it to test for the moment I managed to remove the XP bar.
    //Note Author: I only did it to test for the moment I managed to remove the XP bar.

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("Enabled Plugin: Removehealthandfoodinvbar");
        Bukkit.getConsoleSender().sendMessage("Created by HappyRogelio7");
        Bukkit.getConsoleSender().sendMessage("Version: 1.0-SNAPSHOT");
        Bukkit.getConsoleSender().sendMessage("GitHub: https://github.com/HappyRogelio7/");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents((Listener)new OnJoinEvent(this), (Plugin)this);
        pm.registerEvents((Listener)new PlayerFoodLevelEvent(this), (Plugin)this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("Disabled Plugin: Removehealthandfoodinvbar");
        Bukkit.getConsoleSender().sendMessage("Created by HappyRogelio7");
        Bukkit.getConsoleSender().sendMessage("Version: 1.0-SNAPSHOT");
        Bukkit.getConsoleSender().sendMessage("GitHub: https://github.com/HappyRogelio7/");
    }
}
