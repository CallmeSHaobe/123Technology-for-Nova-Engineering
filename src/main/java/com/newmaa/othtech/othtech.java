package com.newmaa.othtech;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class othtech {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_NAME);
    public static final String COMMON_PROXY = "com.newmaa.othtech.proxy.CommonProxy";
    public static final String CLIENT_PROXY = "com.newmaa.othtech.proxy.ClientProxy";




    /**
     * <a href="https://cleanroommc.com/wiki/forge-mod-development/event#overview">
     *     Take a look at how many FMLStateEvents you can listen to via the @Mod.EventHandler annotation here
     * </a>
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
//        LOGGER.info("Hello From {}!", Reference.MOD_NAME);
    }

}
