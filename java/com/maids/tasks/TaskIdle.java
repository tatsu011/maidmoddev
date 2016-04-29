package com.maids.tasks;

import com.maids.entities.EntityMaid;
import net.minecraft.item.Item;

/**
 * Created by Tatsu on 4/18/2016.
 */
public class TaskIdle extends BaseTask {


    public TaskIdle(EntityMaid maid)
    {
        super(maid);


    }

    @Override
    public String getTaskName() {
        return "Idle";
    }

    @Override
    public Item GetTaskCommands() {
        return null;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }
}
