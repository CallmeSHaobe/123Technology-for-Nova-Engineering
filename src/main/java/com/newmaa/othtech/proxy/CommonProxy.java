package com.newmaa.othtech.proxy;

import com.newmaa.othtech.Reference;
import com.newmaa.othtech.items.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        new ItemLoader();
    }

    public void initialize(FMLInitializationEvent event) {
    }


}
