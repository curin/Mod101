package com.dbtgaming.Mod101.proxy;

import com.dbtgaming.Mod101.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by curin_000 on 1/23/2017.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void PreInit(FMLPreInitializationEvent event)
    {

    }

    @Override
    public void Init(FMLInitializationEvent event)
    {
        ModItems.RegisterRenders();
    }

    @Override
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
