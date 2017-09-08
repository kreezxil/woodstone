package com.kreezcraft.woodstone;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;

public class Config {

    public static Configuration cfg = CommonProxy.config;

    private static final String CATEGORY_FIRE = "Fire Chances";
   
    public static int furnaceFireChance, pistonFireChance, woodstoneDustFireChance;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() {
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            Woodstone.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_FIRE, "Fire Chances");
        furnaceFireChance = cfg.getInt("Woodstone Furnace", CATEGORY_FIRE, 10, 0, 100, "Chance that the Woodstone Furnace will catch fire. [range: 0~100]");
        pistonFireChance = cfg.getInt("Woodstone Piston", CATEGORY_FIRE, 10, 0, 100, "Chance that the Woodstone Piston will catch fire. [range: 0~100]");
        woodstoneDustFireChance = cfg.getInt("Woodstone Dust", CATEGORY_FIRE, 10, 0, 100, "Chance that Woodstone Dust will catch fire. [range: 0~100]");
    }

}