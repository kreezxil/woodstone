package com.kreezcraft.woodstone;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Woodstone.MODID, version = Woodstone.VERSION)
public class Woodstone
{
    public static final String MODID = "woodstone";
    public static final String VERSION = "1.12.1-1.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
