package com.gmail.siioh;

import com.gmail.siioh.PotionListener.PotionListener;


import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="Potions", version="1.0.0")
public class Potions
{
	PotionListener events = new PotionListener();
	// The instance of your mod that Forge uses.
    @Instance(value = "potions")
    public static Potions instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.gmail.siioh.potions.client.ClientProxy",
    		serverSide="com.gmail.siioh.potions.CommonProxy")
    
    public static CommonProxy proxy;
    public static Item reinforcedBottle;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
        GameRegistry.addShapelessRecipe(new ItemStack(reinforcedBottle), new ItemStack(Items.glass_bottle), new ItemStack(Items.iron_ingot));
        proxy.registerRenderers();
        FMLCommonHandler.instance().bus().register(events);
    	MinecraftForge.EVENT_BUS.register(events);
    }
  
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	//Stub
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
       // Stub Method
    }
}