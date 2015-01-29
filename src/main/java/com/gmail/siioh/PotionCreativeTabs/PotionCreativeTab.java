package com.gmail.siioh.PotionCreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class PotionCreativeTab extends CreativeTabs{

	public static final PotionCreativeTab tab = new PotionCreativeTab();

	public PotionCreativeTab() {
		super("potionsTab");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.ender_eye ;
	}

}
