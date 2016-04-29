package tatsu.maids.tasks;

import tatsu.maids.entities.EntityMaid;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;

/**
 * Created by Tatsu on 4/18/2016.
 */
public class MaidFoodStats {

    /** The player's food level. */
    private int foodLevel = 20;
    /** The player's food saturation. */
    private float foodSaturationLevel = 5.0F;
    /** The player's food exhaustion. */
    private float foodExhaustionLevel;
    /** The player's food timer value. */
    private int foodTimer;
    private int prevFoodLevel = 20;


    public void addStats(int foodLevelIn, float foodSaturationModifier)
    {
        this.foodLevel = Math.min(foodLevelIn + this.foodLevel, 20);
        this.foodSaturationLevel = Math.min(this.foodSaturationLevel + (float)foodLevelIn * foodSaturationModifier * 2.0F, (float)this.foodLevel);
    }

    public void addStats(ItemFood foodItem, ItemStack stack)
    {
        this.addStats(foodItem.getHealAmount(stack), foodItem.getSaturationModifier(stack));
    }

    public void onUpdate(EntityMaid maid)
    {
        EnumDifficulty difficulty = maid.worldObj.getDifficulty();
        //int TaskDifficulty = maid.task.getTaskDifficulty();
    }


}
