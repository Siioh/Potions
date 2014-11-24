package com.gmail.siioh;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
	// The instance of your mod that Forge uses.
    @Instance(value = "potions")
    public static Potions instance;
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.gmail.siioh.potions.client.ClientProxy",
    		serverSide="com.gmail.siioh.potions.CommonProxy")
    
    public static CommonProxy proxy;
    public static Item reinforcedBottle;
    public static Block testDirt;
    public static Item testPotion;
    public static Block jthrBlock;
    public static Item catnip;
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	testPotion = new PotionFood(0, 0, false)
    		.setAlwaysEdible()
    		.setPotionEffect(9, 10, 1, 1.0F)
    		.setCreativeTab(CreativeTabs.tabBrewing)
    		.setUnlocalizedName("testPotion")
    		.setTextureName("potions:testPotion");
        reinforcedBottle = new PotionItem()
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabs.tabBrewing)
            .setUnlocalizedName("reinforcedBottle")
            .setTextureName("potions:reinforcedBottle");
        testDirt = new PotionBlock(Material.ground)
            .setHardness(0.5F)
            .setStepSound(Block.soundTypeGravel)
            .setBlockName("testDirt")
            .setCreativeTab(CreativeTabs.tabBlock)
            .setBlockTextureName("potions:testDirt");
        jthrBlock = new PotionBlock(Material.ground)
            .setHardness(0.9F)
            .setStepSound(Block.soundTypeAnvil)
            .setBlockName("jthrBlock")
            .setCreativeTab(CreativeTabs.tabBlock)
            .setBlockTextureName("potions:jthrBrick");
        catnip = new PotionFood(1, 0, true)
            .setMaxStackSize(33)
            .setCreativeTab(CreativeTabs.tabDecorations)
            .setUnlocalizedName("catnip")
            .setTextureName("potions:reinforcedBottle");
                   
            GameRegistry.addShapelessRecipe(new ItemStack(reinforcedBottle), new ItemStack(Items.glass_bottle), new ItemStack(Items.iron_ingot));
            
            GameRegistry.registerItem(reinforcedBottle, "Reinforced Bottle");
            GameRegistry.registerItem(testPotion, "Test Potion");
            GameRegistry.registerBlock(testDirt, "Test Dirt");
            GameRegistry.registerBlock(jthrBlock, "JTHRSuperBlock");
            GameRegistry.registerItem(catnip, "catnip");
            proxy.registerRenderers();
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