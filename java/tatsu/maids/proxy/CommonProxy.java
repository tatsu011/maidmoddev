package tatsu.maids.proxy;

import tatsu.maids.core.MaidConfig;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tatsu.maids.item.ItemCollection;

/**
 * Created by Tatsu on 4/12/2016.
 */
public abstract class CommonProxy {


    public void preInit(FMLPreInitializationEvent event)
    {
        //Config goes here
        MaidConfig.init(event.getSuggestedConfigurationFile());

        //block registry goes here
        //Item registry goes here
        ItemCollection.init();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
