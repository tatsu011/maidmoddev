package tatsu.maids.item;

import tatsu.maids.info.CORE;
import tatsu.maids.info.ITEMS;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Tatsu on 4/29/2016.
 */
public class ItemCollectionClient {


    public static void init()
    {
        ModelResourceLocation itemModel = new ModelResourceLocation(CORE.MOD_ID + ":" + ITEMS.SPAWNMAID_REGNAME, "inventory");
        final int DEFAULT_ITEM_SUBTYPE = 0;
        ModelLoader.setCustomModelResourceLocation(ItemCollection.spawnMaid,DEFAULT_ITEM_SUBTYPE,itemModel);
    }


}
