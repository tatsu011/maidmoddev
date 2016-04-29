package com.maids.api.caps;

import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.items.IItemHandler;

/**
 * Created by Tatsu on 4/29/2016.
 */
public interface IMaidInventoryProvider extends INBTSerializable {

    /**
     *
     * @param maidID The id of the maid in the world.
     * @return the 23 inventory slots.
     */

    public IItemHandler getMaidInventory(int maidID);





}
