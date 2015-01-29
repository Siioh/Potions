package com.gmail.siioh.PotionItems.items;

import com.gmail.siioh.PotionCreativeTabs.PotionCreativeTab;
import com.gmail.siioh.PotionItems.PotionItem;

public class MagicDust extends PotionItem{
	public MagicDust() {
		setMaxStackSize(64);
	    setCreativeTab(PotionCreativeTab.tab);
	    setUnlocalizedName("magicDust");
	    setTextureName("potions:magicDust");
	}
}
