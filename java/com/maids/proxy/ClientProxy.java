package com.maids.proxy;

import com.maids.Render.RenderContainer;
import com.maids.item.ItemCollectionClient;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class ClientProxy extends  CommonProxy {


    public void initSounds()
    {

    }

    public void initRender()
    {
        ItemCollectionClient.init();
        RenderContainer.preInit();
    }


    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        initRender();
        initSounds();

    }


}
