package tatsu.maids.util;

import tatsu.maids.api.render.EmptyMaidModel;
import tatsu.maids.core.MaidMod;

import java.util.HashMap;

/**
 * Created by Tatsu on 4/30/2016.
 */
public class MaidModelRegistry {

    static HashMap modelMap;

    public static void Init()
    {
        modelMap = new HashMap();
    }

    public static void registerMaidModel(EmptyMaidModel model, String name)
    {
        if(!modelMap.containsKey(name))
        {
            modelMap.put(name, model);
        }
    }


    public static EmptyMaidModel getModel(String key)
    {
        if(modelMap.containsKey(key))
        {
            return (EmptyMaidModel)modelMap.get(key);
        }
        else
        {
            MaidMod.Log.error("Invalid key for model- " + key);
            return null;
        }
    }





}
