package com.dbtgaming.Mod101.item;

import com.dbtgaming.Mod101.Mod101CreativeTab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by curin_000 on 1/23/2017.
 */
public class ItemBase extends Item
{
    public ItemBase(String UnlocalizedName, String RegistryName,
                    int MaxStackSize, int MaxDamage, CreativeTabs tab)
    {
        this.maxStackSize = MaxStackSize;
        this.setCreativeTab(tab);
        this.setUnlocalizedName(UnlocalizedName);
        this.setRegistryName(RegistryName);
        this.setMaxDamage(MaxDamage);
    }

    public ItemBase(String UnlocalizedName, String RegistryName, int MaxStackSize,
                    int MaxDamage)
    {
        this.maxStackSize = MaxStackSize;
        this.setCreativeTab(Mod101CreativeTab.INSTANCE);
        this.setUnlocalizedName(UnlocalizedName);
        this.setRegistryName(RegistryName);
        this.setMaxDamage(MaxDamage);
    }

    public void RegisterRender()
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0,
                new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
