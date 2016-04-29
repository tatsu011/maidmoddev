package com.maids.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Tatsu on 4/11/2016.
 */
public class ItemCollection {


    public static ItemMaidBase spawnMaid = new ItemSpawnMaid();


    public static void init()
    {
        registerItem((Item)spawnMaid);
    }

    private static <T extends Item> T registerItem(T item)
    {
        GameRegistry.register(item);
        return item;
    }


}
