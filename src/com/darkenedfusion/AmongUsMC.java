package com.darkenedfusion;

import org.bukkit.plugin.java.JavaPlugin;

public class AmongUsMC extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		this.getCommand("start").setExecutor(new Commands());
		
	}
	
	@Override
	public void onDisable() {
		
	}

}
