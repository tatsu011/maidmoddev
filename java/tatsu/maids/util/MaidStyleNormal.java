package tatsu.maids.util;

import net.minecraft.util.ResourceLocation;
import tatsu.maids.api.render.EmptyMaidModel;

/**
 * Created by Tatsu on 5/10/2016.
 */
public class MaidStyleNormal {

    public EmptyMaidModel Model;
    public ResourceLocation Texture;

    public MaidStyleNormal(EmptyMaidModel model, ResourceLocation texture)
    {
        Model = model;
        Texture = texture;
    }


}
