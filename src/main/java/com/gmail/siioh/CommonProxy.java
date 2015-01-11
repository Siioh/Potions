package com.gmail.siioh;

//import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;

import com.gmail.siioh.PotionBlocks.PotionBlockInit;
import com.gmail.siioh.PotionCreativeTabs.LeSuperTestNameTab;
import com.gmail.siioh.PotionFoods.PotionFoodInit;
import com.gmail.siioh.PotionItems.PotionItemInit;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void registerRenderers() {
		//Nothing to render!
	}
	
	//Creative Tabs
  	public static CreativeTabs LeSuperTestNameTab = new LeSuperTestNameTab(CreativeTabs.getNextID(), "LeSuperTestNameTab");
  	 
	public void preInit(FMLPreInitializationEvent event) {
            PotionBlockInit.init();
            PotionFoodInit.init();
            PotionItemInit.init();
    }
}
