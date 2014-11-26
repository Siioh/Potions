package com.gmail.siioh.PotionFoods;

import com.gmail.siioh.PotionFoods.foods.Catnip;
import com.gmail.siioh.PotionFoods.foods.TestPotion;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class PotionFoodInit {
	
	public static Item testPotion;
	public static Item catnip;
	
	public static void init() {
		testPotion = new TestPotion();
		catnip = new Catnip(0, 0, false);
		GameRegistry.registerItem(testPotion, "Test Potion");
		GameRegistry.registerItem(catnip, "Catnip");
	}
}
