package tatsu.maids.util;

import net.minecraft.util.ResourceLocation;
import tatsu.maids.api.render.EmptyMaidModel;
import tatsu.maids.core.MaidMod;

import java.util.*;

/**
 * Created by Tatsu on 4/30/2016.
 */
public class MaidModelRegistry {

    static HashMap<String, MaidStyleNormal> modelMap;

    public static void Init()
    {
        modelMap = new HashMap();
    }

    public static void registerMaidStyle(EmptyMaidModel model, ResourceLocation texture, String name)
    {
        if(!modelMap.containsKey(name))
        {
            modelMap.put(name, new MaidStyleNormal(model, texture));
        }
    }


    public static EmptyMaidModel getModel(String key)
    {
        if(modelMap.containsKey(key))
        {
            MaidStyleNormal container = modelMap.get(key);
            return container.Model;
        }
        else
        {
            MaidMod.Log.error("Invalid key for style- " + key);
            return null;
        }
    }

    public static MaidStyleNormal getStyle(String key)
    {
        if(modelMap.containsKey(key))
        {
            return modelMap.get(key);

        }
        else
        {
            MaidMod.Log.error("Invalid key for model- " + key);
            return getStyle(getRandomMaidStyle());
            //runtime is O(1). (Technically this will only ever get called twice per recursion.)
        }
    }

    //TODO: implement the selection of a random maid model.
    public static String getRandomMaidStyle()
    {
        Random random = new Random();
        List<String> keys = new ArrayList<>(modelMap.keySet());

        return keys.get(random.nextInt(keys.size()));

    }







}
