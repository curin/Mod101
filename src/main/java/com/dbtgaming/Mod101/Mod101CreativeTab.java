package com.dbtgaming.Mod101;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by curin_000 on 1/23/2017.
 */
public class Mod101CreativeTab extends CreativeTabs
{
    public static final CreativeTabs INSTANCE = new Mod101CreativeTab();

    public Mod101CreativeTab()
    {
        super(MODCONSTANTS.MODID);
    }

    public static final ItemStack Icon = new ItemStack(Items.BOOK);

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem()
    {
        return Icon;
    }
}
