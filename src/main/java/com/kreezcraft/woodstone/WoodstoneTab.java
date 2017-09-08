package com.kreezcraft.woodstone;

import com.kreezcraft.woodstone.blocks.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WoodstoneTab extends CreativeTabs {

	public WoodstoneTab(String label) {
		super(Woodstone.MODID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitBlocks.WOODSTONE_FURNACE);
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}

	
}