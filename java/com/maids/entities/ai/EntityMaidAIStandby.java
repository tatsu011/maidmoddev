package com.maids.entities.ai;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathNavigate;

/**
 * Created by Tatsu on 4/14/2016.
 */
public class EntityMaidAIStandby extends EntityAIBase {

    //private PathNavigate pathFinder;



    @Override
    public boolean shouldExecute() {
        return false;
    }
}
