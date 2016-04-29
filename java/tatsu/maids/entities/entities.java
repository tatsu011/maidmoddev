package tatsu.maids.entities;

import tatsu.maids.core.MaidMod;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by Tatsu on 4/11/2016.
 */
public class entities {



    public static void init()
    {
        /*
        EntityRegistry.registerMob(EntityMaid.class,"Maid",0, MaidMod.instance,80,3,true);
        EntityList.entityEggs.put("Something",new EntityList.EntityEggInfo(core.MOD_ID + ".Maid",0,1));
        */
        int id = 10;

        registerMob(EntityMaid.class, "Maid", id++);
    }



    private static void registerMob(Class<? extends Entity> entity, String name, int FGEggColor, int BGEggColor, int id)
    {
        EntityRegistry.registerModEntity(entity, name, id, MaidMod.instance, 80, 5, true);
        //EntityList.addMapping(entity, name, id, FGEggColor, BGEggColor);
    }

    private static void registerMob(Class<? extends Entity> entity, String name, int id)
    {
        EntityRegistry.registerModEntity(entity, name, id, MaidMod.instance, 80, 5, true);
        //EntityList.addMapping(entity, name, id, FGEggColor, BGEggColor);
    }


}
