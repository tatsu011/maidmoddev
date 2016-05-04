package tatsu.maids.item;

import tatsu.maids.entities.EntityMaid;
import tatsu.maids.info.items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static tatsu.maids.core.MaidMod.Log;

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
            Log.info("Created maid object and set position.");

            maid.setHomePosAndDistance(pos, 0);

            Log.info("SPawning Maid");
            worldIn.spawnEntityInWorld(maid);
            Log.info("Maid Spawned Successfully at pos", pos);
            return EnumActionResult.PASS;
        }


        return EnumActionResult.PASS;
    }


    //@Override

}
