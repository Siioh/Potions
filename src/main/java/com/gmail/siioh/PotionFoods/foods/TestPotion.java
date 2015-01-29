package com.gmail.siioh.PotionFoods.foods;

import com.gmail.siioh.PotionCreativeTabs.PotionCreativeTab;
import com.gmail.siioh.PotionFoods.PotionFood;

public class TestPotion extends PotionFood {
	public TestPotion() {
		super(0, 0, true);
		setAlwaysEdible();
		setPotionEffect(9, 5, 1, 1.0F);
		setCreativeTab(PotionCreativeTab.tab);
		setUnlocalizedName("testPotion");
		setTextureName("potions:reinforcedGreenbottle");
	}
}
