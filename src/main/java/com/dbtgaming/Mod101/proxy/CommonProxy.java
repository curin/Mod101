package com.dbtgaming.Mod101.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by curin_000 on 1/23/2017.
 */
public interface CommonProxy
{
    void PreInit(FMLPreInitializationEvent event);
    void Init(FMLInitializationEvent event);
    void PostInit(FMLPostInitializationEvent event);
}
