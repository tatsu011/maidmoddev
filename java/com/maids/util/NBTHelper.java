package com.maids.util;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by Tatsu on 4/18/2016.
 */
public class NBTHelper {

    public static ItemStack checkNBT(ItemStack stack)
    {
        if (stack.getTagCompound() == null)
            stack.setTagCompound(new NBTTagCompound());

        return stack;
    }

    public static Entity checkNBT(Entity entity)
    {
        return entity; //FOR NOW!
    }


}
