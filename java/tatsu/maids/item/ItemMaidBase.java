package tatsu.maids.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import tatsu.maids.info.CORE;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class ItemMaidBase extends Item {


    public ItemMaidBase(String name)
    {
        super();
        setRegistryName(CORE.MOD_ID,name);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(CreativeTabs.MISC); //for now.
    }

}
