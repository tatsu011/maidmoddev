package tatsu.maids.render;

import tatsu.maids.entities.EntityMaid;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class RenderContainer {

    public static void preInit()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityMaid.class, RenderMaid::new);
    }


}
