package com.newmaa.othtech;

import com.newmaa.othtech.items.ItemIridiueisamariosmium;
import com.newmaa.othtech.items.ItemLoader;
import com.newmaa.othtech.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class othtech {
    @Mod.Instance(Reference.MOD_ID)
    private static othtech instance;
    public static final CreativeTabs othtab = new CreativeTabs(Reference.MOD_ID) {

        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemLoader.itemIridiueisamariosmium);
        }


    };
    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_NAME);
    @SidedProxy
            (clientSide = "com.newmaa.othtech.proxy.CommonProxy",
                    serverSide = "com.newmaa.othtech.proxy.ClientProxy"
            )
    private static CommonProxy proxy;


    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.initialize(event);
    }

}
