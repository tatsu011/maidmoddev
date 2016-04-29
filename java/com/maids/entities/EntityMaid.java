package com.maids.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.UUID;

/**
 * Created by Tatsu on 4/12/2016.
 */

public class EntityMaid extends EntityAgeable implements IEntityOwnable
{
    public EntityMaid(World worldIn) {
        super(worldIn);


    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand p_184645_2_, ItemStack stack)
    {
        return true;
    }

    @Override
    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();

        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
    }

    @Override
    public UUID getOwnerId() {
        return null;
    }

    @Override
    public Entity getOwner() {
        return null;
    }

    @Override
    public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, net.minecraft.util.EnumFacing facing)
    {
        return super.hasCapability(capability, facing);


    }

    @Override
    public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing)
    {
        return super.getCapability(capability, facing);
    }


/*
    public boolean processInteract(EntityPlayer player, EnumHand hand, ItemStack stack)
    {
        //par1World.spawnParticle("heart", par2 + minX + Math.random() * (maxX - minX), par3 + maxY, par4 + minZ + Math.random() * (maxZ - minZ), 0, 0 ,0);
        if(ownerUUID == null)
            ownerUUID = player.getUniqueID();


        if(stack == null && player.getUniqueID() == ownerUUID )
        {
            worldObj.spawnParticle(EnumParticleTypes.HEART ,posX + Math.random(), posY + Math.random() + 1, posZ + Math.random(), 0, 0 ,0);
            return true;
        }
            //worldObj.spawnParticle(EnumParticleTypes.HEART ,posX + Math.random(), posY + Math.random() + 1, posZ + Math.random(), 0, 0 ,0);
        return true;    //temporary.  This is where alot of the magic is going to happen- and it will depend on what's in the player's hand.

    }

*/
}
