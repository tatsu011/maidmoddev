package tatsu.maids.render;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import tatsu.maids.core.MaidConfig;
import tatsu.maids.entities.EntityMaid;
import tatsu.maids.info.CORE;
import tatsu.maids.model.ModelMaid;
import tatsu.maids.model.ModelMaidBase;
import tatsu.maids.util.MaidModelRegistry;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class RenderContainer {

    public static void preInit()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityMaid.class, RenderMaid::new);

        MaidModelRegistry.registerMaidStyle(new ModelMaid(),new ResourceLocation(CORE.MOD_ID, "textures/models/maid.png"), "MaidMod:BaseMaid:1");
        MaidModelRegistry.registerMaidStyle(new ModelMaid(),new ResourceLocation(CORE.MOD_ID, "textures/models/maid2.png"), "MaidMod:BaseMaid:2");

        if(MaidConfig.EnableBustyMaids) {
            MaidModelRegistry.registerMaidStyle(new ModelMaidBase(), new ResourceLocation(CORE.MOD_ID, "textures/models/maid.png"), "MaidMod:BustyMaid:1");
            MaidModelRegistry.registerMaidStyle(new ModelMaidBase(), new ResourceLocation(CORE.MOD_ID, "textures/models/maid2.png"), "MaidMod:BustyMaid:2");
        }

    }


}
