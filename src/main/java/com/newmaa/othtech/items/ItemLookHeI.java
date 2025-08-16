package com.newmaa.othtech.items;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.newmaa.othtech.Reference;
import com.newmaa.othtech.othtech;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemLookHeI extends Item
{
    public ItemLookHeI() {
        this.setTranslationKey(Reference.MOD_ID + "." + "itemlookhei");
        this.setCreativeTab(othtech.othtab);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(ChatFormatting.WHITE + "看不了NEI了");
    }
}
