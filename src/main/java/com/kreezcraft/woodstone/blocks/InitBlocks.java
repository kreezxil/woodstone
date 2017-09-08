package com.kreezcraft.woodstone.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;

public class InitBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final TileEntity WOODSTONE_FURNACE = new WoodstoneFurnace("woodstone_furnace");
}