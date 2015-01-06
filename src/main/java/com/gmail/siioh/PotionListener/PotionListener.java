package com.gmail.siioh.PotionListener;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.ServerChatEvent;

public class PotionListener {
	
	@SubscribeEvent
	public void Chat(ServerChatEvent evt){
		evt.player.addExperienceLevel(1);
	}
}
