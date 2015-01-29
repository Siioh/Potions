package com.gmail.siioh.PotionFoods.foods;

import com.gmail.siioh.PotionCreativeTabs.PotionCreativeTab;
import com.gmail.siioh.PotionFoods.PotionFood;

public class Catnip extends PotionFood {
	public Catnip(int var1, float var2, boolean var3) {
		super(var1, var2, var3);
		setMaxStackSize(32);
        setCreativeTab(PotionCreativeTab.tab);
        setUnlocalizedName("catnip");
        setTextureName("potions:catnip");
	}

}
