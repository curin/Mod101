package com.dbtgaming.Mod101.item;

/**
 * Created by curin_000 on 1/23/2017.
 */
public class ItemCheese extends ItemBase
{

    public ItemCheese() {
        super(ItemReference.Mod101Items.CHEESE.GetUnlocalizedName(),
                ItemReference.Mod101Items.CHEESE.GetRegistryName(), 16, 0);
    }
}
