package com.kreezcraft.woodstone;

import org.apache.logging.log4j.Logger;

import com.kreezcraft.woodstone.proxy.CommonProxy;
import com.kreezcraft.woodstone.recipes.ModRecipes;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Woodstone.MODID, version = Woodstone.VERSION, name = Woodstone.NAME)
public class Woodstone
{
    public static final String MODID = "woodstone";
    public static final String VERSION = "1.12.1-1.1";
    public static final String NAME = "Woodstone";
    
	@SidedProxy(serverSide = "com.kreezcraft.woodstone.proxy.CommonProxy", clientSide = "com.kreezcraft.woodstone.proxy.ClientProxy")
	public static CommonProxy proxy;

    @Mod.Instance
    public static Woodstone instance;
    
    public static final WoodstoneTab creativeTab = new WoodstoneTab("Woodstone");

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    }
    
}
