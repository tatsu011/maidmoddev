package tatsu.maids.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tatsu on 4/11/2016.
 */
public class ItemCollection {


    public static ItemMaidBase spawnMaid ;


    public static void init()
    {
        spawnMaid = GameRegistry.register(new ItemSpawnMaid());
    }



}
