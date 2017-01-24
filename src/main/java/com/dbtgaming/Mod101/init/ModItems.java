package com.dbtgaming.Mod101.init;

import com.dbtgaming.Mod101.MODCONSTANTS;
import com.dbtgaming.Mod101.item.ItemCheese;
import com.dbtgaming.Mod101.item.ItemReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by curin_000 on 1/23/2017.
 */
public class ModItems
{
    public static Item Cheese;

    public static void Init()
    {
        Cheese = new ItemCheese();
    }

    public static void Register()
    {
        GameRegistry.register(Cheese);
    }

    public static void RegisterRenders()
    {
        registerRender(Cheese);
    }

    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
