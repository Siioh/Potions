package com.gmail.siioh.PotionBlocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.gmail.siioh.PotionBlocks.PotionBlock;

public class TestBlock extends PotionBlock {
	public TestBlock(Material material) {
		super(material);
		setHardness(0.9F);
        setStepSound(Block.soundTypeAnvil);
        setBlockName("jthrBlock");
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName("potions:jthrBrick");
	}
}
