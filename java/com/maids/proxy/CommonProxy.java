package com.maids.proxy;

import com.maids.core.MaidConfig;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tatsu on 4/12/2016.
 */
public abstract class CommonProxy implements IProxy {


    public void preInit(FMLPreInitializationEvent event)
    {
        //Config goes here
        MaidConfig.init(event.getSuggestedConfigurationFile());

        //block registry goes here
        //Item registry goes here
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
