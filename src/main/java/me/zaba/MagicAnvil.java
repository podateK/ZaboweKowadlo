package me.zaba;

import events.AnvilOpenEvent;
import events.ClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicAnvil extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new AnvilOpenEvent(), this);
        getServer().getPluginManager().registerEvents(new ClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
