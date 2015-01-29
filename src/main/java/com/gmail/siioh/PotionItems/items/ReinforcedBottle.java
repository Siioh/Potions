package com.gmail.siioh.PotionItems.items;

import com.gmail.siioh.PotionCreativeTabs.PotionCreativeTab;
import com.gmail.siioh.PotionItems.PotionItem;

public class ReinforcedBottle extends PotionItem {
	public ReinforcedBottle() {
		setMaxStackSize(64);
	    setCreativeTab(PotionCreativeTab.tab);
	    setUnlocalizedName("reinforcedBottle");
	    setTextureName("potions:reinforcedBottle");
	}
}
