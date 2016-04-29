package tatsu.maids.core;

import tatsu.maids.info.core;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class MaidConfig
{
    public static Configuration config;



    public static boolean EnableHeadMaid = true;

    public static void init(File cfg)
    {

        if(config == null)
        {
            config = new Configuration(cfg);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(core.MOD_ID))
        {
            loadConfig();
        }
    }

    public void loadConfig()
    {
        EnableHeadMaid = config.getBoolean("EnableHeadMaid",config.CATEGORY_GENERAL, true, "Enables the Head Maid");

        if(config.hasChanged())
        {
            config.save();
        }
    }

}
