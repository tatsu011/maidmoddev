package com.maids.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tatsu on 4/12/2016.
 */
public interface IProxy {

    public void init(FMLInitializationEvent event);
    public void preInit(FMLPreInitializationEvent event);
    public void postInit(FMLPostInitializationEvent event);

}
