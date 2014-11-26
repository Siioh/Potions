package com.gmail.siioh.PotionBlocks;

import com.gmail.siioh.PotionBlocks.blocks.TestBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PotionBlockInit {
	
	public static Block testBlock;
	
	public static void init() {
		testBlock = new TestBlock(Material.ground);
		GameRegistry.registerBlock(testBlock, "Test Block");
	}
}
