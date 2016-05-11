package tatsu.maids.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.Style;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import tatsu.maids.api.render.EmptyMaidModel;
import tatsu.maids.core.MaidMod;
import tatsu.maids.util.MaidModelRegistry;
import tatsu.maids.util.MaidStyleNormal;

import java.util.UUID;

/**
 * Created by Tatsu on 4/12/2016.
 */

public class EntityMaid extends EntityAgeable implements IEntityOwnable
{

    public ItemStackHandler itemHandler;

    String StyleID;


    //Animation Variables.
    public boolean isIdle = false;



    public EntityMaid(World worldIn) {
        super(worldIn);

        StyleID = MaidModelRegistry.getRandomMaidStyle();
        MaidMod.Log.info("Style for maid: " + StyleID);
        this.setSize(1F,2F);
        itemHandler = new ItemStackHandler(23)
        {
            @Override
            protected void onContentsChanged(int slot)
            {
                super.onContentsChanged(slot);
                //EntityMaid.this.markDirty();
            }
        };

    }


    protected void initEntityAI()
    {
        //this.tasks.addTask(0, new EntityAISwimming(this));
        //this.tasks.addTask(1, new EntityAIWander(this, 0.6D));
        //this.tasks.addTask(9, new EntityAIOpenDoor(this, true));
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand p_184645_2_, ItemStack stack)
    {
        isIdle = !isIdle;
        //basically you stop moving once you are right clicked.

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
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
        return super.hasCapability(capability, facing);
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return (T) itemHandler;
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

    public EmptyMaidModel getModel()
    {
        return MaidModelRegistry.getModel(StyleID);
    }


    public MaidStyleNormal getStyle()
    {
        return MaidModelRegistry.getStyle(StyleID);
    }



}
