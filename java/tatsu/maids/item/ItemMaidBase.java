package tatsu.maids.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import tatsu.maids.info.core;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class ItemMaidBase extends Item {


    public ItemMaidBase(String name)
    {
        super();
        setRegistryName(core.MOD_ID,name);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(CreativeTabs.tabMisc); //for now.
    }

}
