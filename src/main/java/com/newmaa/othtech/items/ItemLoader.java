package com.newmaa.othtech.items;

import com.newmaa.othtech.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;
@Mod.EventBusSubscriber
public class ItemLoader {
    public final static Item itemIridiueisamariosmium = new ItemIridiueisamariosmium();
    public final static Item itemLookHEI = new ItemLookHeI();

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(itemIridiueisamariosmium.setRegistryName(Reference.MOD_ID + ":itemiridiueisamariosmium"), itemLookHEI.setRegistryName(Reference.MOD_ID + ":itemlookhei"));
    }
    @SubscribeEvent
    public static void registerItemModel(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(itemIridiueisamariosmium,0,new ModelResourceLocation(
                Objects.requireNonNull(itemIridiueisamariosmium.getRegistryName()),
                "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemLookHEI,0,new ModelResourceLocation(
                Objects.requireNonNull(itemLookHEI.getRegistryName()),
                "inventory"));
    }
}
