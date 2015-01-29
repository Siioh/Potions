package com.gmail.siioh.PotionItems;

import com.gmail.siioh.PotionItems.items.MagicDust;
import com.gmail.siioh.PotionItems.items.ReinforcedBottle;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class PotionItemInit {
	
	public static Item reinforcedBottle;
	public static Item magicDust;

	public static void init() {
		reinforcedBottle = new ReinforcedBottle();
		magicDust = new MagicDust();
		GameRegistry.registerItem(reinforcedBottle, "Reinforced Bottle");
		GameRegistry.registerItem(magicDust, "Magic Dust");
	}
}
