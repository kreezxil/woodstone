package com.kreezcraft.woodstone.blocks;

import com.kreezcraft.woodstone.Woodstone;
import com.kreezcraft.woodstone.client.IHasModel;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class WoodstoneFurnace extends TileEntityFurnace implements IHasModel {
	
	protected String name;

	public WoodstoneFurnace(String name) {
		this.name = name;
		setUnlocalizedName(Woodstone.MODID + "." + name);
		setCreativeTab(Woodstone.creativeTab);
		setRegistryName(name);
		Initblocks.BLOCKS.add(this);
		Init
	}

	@Override
	public void registerModels() {
		
		
	}

}
