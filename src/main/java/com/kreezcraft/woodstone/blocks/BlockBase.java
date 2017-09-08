package com.kreezcraft.woodstone.blocks;

import com.kreezcraft.woodstone.Woodstone;
import com.kreezcraft.woodstone.Items.InitItems;
import com.kreezcraft.woodstone.client.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setUnlocalizedName(Woodstone.MODID + "." + name);
		setCreativeTab(Woodstone.creativeTab);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		Woodstone.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}