package com.dbtgaming.Mod101;

import com.dbtgaming.Mod101.init.ModItems;
import com.dbtgaming.Mod101.proxy.ClientProxy;
import com.dbtgaming.Mod101.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by curin_000 on 1/23/2017.
 */
@Mod(modid = MODCONSTANTS.MODID, name = MODCONSTANTS.NAME, version = MODCONSTANTS.VERSION)
public class Mod101
{
    @Mod.Instance
    public static Mod101 INSTANCE;

    @SidedProxy(clientSide = MODCONSTANTS.CLIENT_PROXY, serverSide = MODCONSTANTS.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        System.out.println("PreInitting");
        ModItems.Init();
        ModItems.Register();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        System.out.println("Initting");
        proxy.Init(event);
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
