package com.maids.item;

import com.maids.entities.EntityMaid;
import com.maids.info.items;
import com.maids.util.Logging;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Tatsu on 4/20/2016.
 */
public class ItemSpawnMaid extends ItemMaidBase {


    public ItemSpawnMaid() {

        super(items.SPAWNMAID_REGNAME);

    }


    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
        {
            EntityMaid maid = new EntityMaid(worldIn);
            Logging.info("Created maid object and set position.");

            maid.setHomePosAndDistance(pos.add(0,1,0), 0);

            System.out.println("SPawning Maid");
            worldIn.spawnEntityInWorld(maid);
            System.out.println("Maid Spawned Successfully!");
            return EnumActionResult.SUCCESS;
        }


        return EnumActionResult.PASS;
    }


    //@Override

}
