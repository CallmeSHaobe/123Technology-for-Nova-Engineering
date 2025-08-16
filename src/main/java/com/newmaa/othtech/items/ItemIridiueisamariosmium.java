package com.newmaa.othtech.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.newmaa.othtech.Reference;
import com.newmaa.othtech.othtech;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemIridiueisamariosmium extends Item{
    public ItemIridiueisamariosmium() {
        this.setTranslationKey(Reference.MOD_ID + "." + "itemiridiueisamariosmium");
        this.setCreativeTab(othtech.othtab);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(ChatFormatting.WHITE + "到底有多强？！");
    }
}
