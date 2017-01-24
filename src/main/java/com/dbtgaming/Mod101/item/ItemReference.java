package com.dbtgaming.Mod101.item;

import com.dbtgaming.Mod101.MODCONSTANTS;

/**
 * Created by curin_000 on 1/23/2017.
 */
public class ItemReference
{
    public static enum Mod101Items
    {
        CHEESE("cheese", "ItemCheese");

        private String _unlocalizedName;
        private String _registryName;

        Mod101Items(String unlocalizedName, String registryName) {
            _unlocalizedName = unlocalizedName;
            _registryName = registryName;
        }

        public String GetUnlocalizedName() {
            return MODCONSTANTS.MODID.toLowerCase() + "." + _unlocalizedName;
        }

        public String GetRegistryName() {
            return _registryName;
        }
    }
}
