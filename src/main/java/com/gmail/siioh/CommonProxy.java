package com.gmail.siioh;

import com.gmail.siioh.PotionBlocks.PotionBlockInit;
import com.gmail.siioh.PotionFoods.PotionFoodInit;
import com.gmail.siioh.PotionItems.PotionItemInit;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void registerRenderers() {
		//Nothing to render!
	}
	
	public void preInit(FMLPreInitializationEvent event) {
            PotionBlockInit.init();
            PotionFoodInit.init();
            PotionItemInit.init();
    }
}
