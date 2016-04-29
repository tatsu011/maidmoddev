package com.maids.core;


import com.maids.entities.entities;
import com.maids.info.core;
import com.maids.info.gui;
import com.maids.info.proxy;
import com.maids.item.ItemCollection;
import com.maids.proxy.CommonProxy;
import com.maids.util.Logging;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = core.MOD_ID, version = core.VERSION, name = core.MOD_NAME, guiFactory = gui.CONFIG_GUI_FACTORY)
public class MaidMod {

    @Mod.Instance(core.MOD_ID)
    public static MaidMod instance;

    @SidedProxy(clientSide = proxy.CLIENTPROXY,serverSide = proxy.COMMONPROXY)
    public static CommonProxy prox;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Logging.info("Please wait patently, maids are being fed.");
        prox.preInit(event);
        ItemCollection.init();
        entities.init();
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Logging.info("Please wait warmly, maids are getting dressed.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        Logging.info("Greetings Master, anything I can help you with today?");
    }



}
