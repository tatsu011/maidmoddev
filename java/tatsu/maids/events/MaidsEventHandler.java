package tatsu.maids.events;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.EmptyHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import tatsu.maids.entities.EntityMaid;
import tatsu.maids.gui.MaidInventory;
import tatsu.maids.info.core;

/**
 * Created by Tatsu on 4/29/2016.
 */
public class MaidsEventHandler {

    @SubscribeEvent
    public void onCapEvent(AttachCapabilitiesEvent.Entity e)
    {
        e.addCapability(new ResourceLocation(core.MOD_ID, "MaidInventory"), new MyCapProvider(e.getEntity()));
    }

    public class MyCapProvider implements ICapabilityProvider
    {
        public final IInventory handler;

        public MyCapProvider(Entity e)
        {
            if(e.getClass() == EntityMaid.class)
                handler =  new MaidInventory();
            else
                handler = null;
        }

        @SuppressWarnings("unchecked")
        @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing)
        {
            if(capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
                return (T) handler;
            return null;
        }

        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing)
        {
            return capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
        }
    }

}
