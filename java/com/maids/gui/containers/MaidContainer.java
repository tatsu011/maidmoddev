package com.maids.gui.containers;

import com.maids.entities.EntityMaid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;

import java.util.UUID;

/**
 * Created by Tatsu on 4/14/2016.
 */
public class MaidContainer extends Container {

    EntityMaid Maid;

    IInventory maidInventory;

    public MaidContainer(EntityPlayer player, EntityMaid maid)
    {
        Maid = maid;

    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {

        if(this.maidInventory.isUseableByPlayer(playerIn))
        {
            if(playerIn.getUniqueID() == Maid.getOwnerId())
            {
                return true;
            }
            //Maid says "Sorry, you are not my master."

            return false; //stubbed.
        }
        return false;


    }
}
