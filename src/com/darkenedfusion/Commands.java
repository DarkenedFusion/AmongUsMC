package com.darkenedfusion;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class Commands implements CommandExecutor {
	
	 @Override
	 public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		 Player player = (Player) sender;
		 if(label.equalsIgnoreCase("start")){
	            if (!(sender instanceof Player)){
	                sender.sendMessage("Console can't do this!");
	                return true;
	            }
		 
		 
	 }
		 if(sender instanceof Player) {
			 for (Player p : Bukkit.getOnlinePlayers()) {
					teamPicker(p);
					startTitle(p);
				}
		 }
		
		 
		 
		 
		 
		 
		 
		 
		 return true;
	
	
	

	 }
	 
	 public void startTitle(Player player) {
		 String title = ChatColor.WHITE + "SHHHHHHH!";
		 String subTitle = null;
		 int duration = 50;
		 int fadeIn = 10;
		 int fadeOut = 5;
		 player.sendTitle(title, null, duration, fadeIn, fadeOut);
	 }

	 
	
@SuppressWarnings("deprecation")
public boolean teamPicker(Player player) {
    ScoreboardManager manager = Bukkit.getScoreboardManager();
    Scoreboard board = manager.getNewScoreboard();
    Team crew = board.registerNewTeam("Crew");
    Team imposter = board.registerNewTeam("Imposter");
    double assignRandom = Math.random();
    
    if(assignRandom <= 0.5D) {
        if(crew.hasPlayer(player)) {
            player.sendMessage("Already in a team");
            return true;
        }
        
        
        player.sendMessage("You are a Crewmate!");
        
        crew.addPlayer(player);
        return true;
    }
    if(imposter.hasPlayer(player)) {
        player.sendMessage("Already in a team");
        return true;
    }
    
    player.sendMessage("You are an Imposter!");
    
    
    
    imposter.addPlayer(player);
	return true;
	
	
	}




	public void murderWeapon(Inventory playerInventory, Player player, Team team) {
		ItemStack weapon = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = weapon.getItemMeta();
		weapon.getItemMeta().setDisplayName(ChatColor.DARK_RED + "Murder Weapon");
		weapon.getItemMeta().addEnchant(Enchantment.DAMAGE_ALL, 100, true);
		weapon.getItemMeta().setUnbreakable(true);
		weapon.setItemMeta(meta);
		if(team.getName().equals("imposter")) {
			playerInventory.addItem(weapon);
			
		}
		
		
	}
	
	public void sameTeam(Team team, Player player) {
		if(team.getName().equals("imposter")) {
			)
		}
	}
	
	
	










}
				 
			 
		 
	 
	 
	 
	 
	 
	 
	 
	 
