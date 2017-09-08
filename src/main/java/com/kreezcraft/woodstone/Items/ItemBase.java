package com.kreezcraft.woodstone.Items;

import com.kreezcraft.woodstone.Woodstone;
import com.kreezcraft.woodstone.client.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(Woodstone.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
		setCreativeTab(Woodstone.creativeTab);
		}

	public void registerItemModel() {
		Woodstone.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		Woodstone.proxy.registerItemRenderer(this, 0, "inventory");
	}

}