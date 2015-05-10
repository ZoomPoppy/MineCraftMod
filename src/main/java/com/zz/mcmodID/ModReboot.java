package com.zz.mcmodID;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by zz on 2015/5/10.
 */
@Mod(modid = "mcmodID",version = "1.7.10")
public class ModReboot {
    @Mod.Instance()
    public static Object instance;
    public Block secondBlock;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("...........................................................................");
        secondBlock =(Block) (new BlockStone().setBlockName("zz").setHardness(3));
        LanguageRegistry.addName(secondBlock,"my first blcok");
        MinecraftForge.addGrassSeed(null, 40);
        GameRegistry.registerBlock(secondBlock,"secondblcok");
    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

}
