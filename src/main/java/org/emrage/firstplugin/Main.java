package org.emrage.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.emrage.firstplugin.listener.PlayerListener;
import org.emrage.firstplugin.listener.ServerListener;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
    }

    public void registerCommands() {
    }
    public void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerListener(), this);
        pm.registerEvents(new ServerListener(), this);
    }
}
