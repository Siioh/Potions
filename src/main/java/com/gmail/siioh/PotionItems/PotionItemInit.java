package com.gmail.siioh.PotionItems;

import com.gmail.siioh.PotionItems.items.ReinforcedBottle;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class PotionItemInit {
	
	public static Item reinforcedBottle;

	public static void init() {
		reinforcedBottle = new ReinforcedBottle();
		GameRegistry.registerItem(reinforcedBottle, "Reinforced Bottle");
	}
}
