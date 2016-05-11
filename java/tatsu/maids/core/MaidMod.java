package tatsu.maids.core;


import net.minecraftforge.common.MinecraftForge;
import tatsu.maids.entities.entities;
import tatsu.maids.events.MaidsEventHandler;
import tatsu.maids.info.core;
import tatsu.maids.info.gui;
import tatsu.maids.info.proxy;
import tatsu.maids.item.ItemCollection;
import tatsu.maids.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tatsu.maids.util.MaidModelRegistry;


@Mod(modid = core.MOD_ID, version = core.VERSION, name = core.MOD_NAME, guiFactory = gui.CONFIG_GUI_FACTORY)
public class MaidMod {

    @Mod.Instance(core.MOD_ID)
    public static MaidMod instance;

    @SidedProxy(clientSide = proxy.CLIENTPROXY,serverSide = proxy.COMMONPROXY)
    public static CommonProxy prox;

    public static Logger Log = LogManager.getLogger("MaidMod");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Log.info("Please wait patently, maids are being fed.");
        MaidModelRegistry.Init();
        prox.preInit(event);
        //ItemCollection.init();
        entities.init();

        //Register the maid's capabilities.
        MinecraftForge.EVENT_BUS.register(new MaidsEventHandler());
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Log.info("Please wait warmly, maids are getting dressed.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        Log.info("Greetings Master, anything I can help you with today?");
    }



}
