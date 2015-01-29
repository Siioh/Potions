package com.gmail.siioh.PotionBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.gmail.siioh.PotionCreativeTabs.PotionCreativeTab;
import com.gmail.siioh.PotionBlocks.PotionBlock;

public class TestBlock extends PotionBlock {
	public TestBlock(Material material) {
		super(material);
		setHardness(0.9F);
        setStepSound(Block.soundTypeSand);
        setBlockName("jthrBlock");
        setCreativeTab(PotionCreativeTab.tab);
        setBlockTextureName("potions:jthrBrick");
	}
}
		