package com.georlegacy.general.enderpearlride;

import com.georlegacy.general.enderpearlride.events.EnderThrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderPearlRide extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EnderThrowEvent(), this);
    }
}
