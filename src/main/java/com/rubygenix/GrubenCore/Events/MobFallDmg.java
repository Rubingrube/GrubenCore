package com.rubygenix.GrubenCore.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

//This event keeps mobs from taking fall damage to make mob farms harder
public class MobFallDmg implements Listener {
    @EventHandler
    public void onMobFall(EntityDamageEvent event){
        if(event.getCause() == EntityDamageEvent.DamageCause.FALL){
            event.setCancelled(true);
        }
    }
}