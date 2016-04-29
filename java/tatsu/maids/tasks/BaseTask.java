package tatsu.maids.tasks;

import tatsu.maids.entities.EntityMaid;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.item.Item;

/**
 * Created by Tatsu on 4/14/2016.
 */
public abstract class BaseTask extends EntityAIBase {

    public abstract String getTaskName();

    public abstract Item GetTaskCommands();

    private EntityMaid Maid;

    public int getTaskDifficulty() {
        return 1;
    }

    public boolean requireHeadMaid() {
        return false;
    }

    public BaseTask(EntityMaid maid)
    {
        Maid = maid;
    }



}
