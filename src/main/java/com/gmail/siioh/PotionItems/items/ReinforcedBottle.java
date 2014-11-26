package com.gmail.siioh.PotionItems.items;

import com.gmail.siioh.PotionItems.PotionItem;

import net.minecraft.creativetab.CreativeTabs;

public class ReinforcedBottle extends PotionItem {
	public ReinforcedBottle() {
		setMaxStackSize(64);
	    setCreativeTab(CreativeTabs.tabBrewing);
	    setUnlocalizedName("reinforcedBottle");
	    setTextureName("potions:reinforcedBottle");
	}
}
