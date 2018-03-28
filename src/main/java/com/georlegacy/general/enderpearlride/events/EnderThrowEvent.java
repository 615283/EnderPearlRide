package com.georlegacy.general.enderpearlride.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class EnderThrowEvent implements Listener {

    @EventHandler
    public void onThrow(ProjectileLaunchEvent e) {
        if (e.getEntityType().equals(EntityType.ENDER_PEARL)) {
            if (!(e.getEntity().getShooter() instanceof Player)) return;
            if (((Player) e.getEntity().getShooter()).hasPermission("enderpearlride.ride")) {
                e.getEntity().addPassenger((Player) e.getEntity().getShooter());
            }
        }
    }

}
