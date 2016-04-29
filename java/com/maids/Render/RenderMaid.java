package com.maids.Render;

import com.maids.entities.EntityMaid;
import com.maids.info.core;
import com.maids.model.ModelMaid;
import com.maids.model.ModelMaidBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class RenderMaid extends Render {

    public RenderMaid(RenderManager manager)
    {
        super(manager);
        model = new ModelMaidBase();
        shadowSize = 0.5f;
    }

    private ModelMaidBase model;
    private static final ResourceLocation texture = new ResourceLocation(core.MOD_ID, "textures/models/maid.png");

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime)
    {
        EntityMaid maid = (EntityMaid)entity;

        GL11.glPushMatrix();
        //Magic happens.
        GL11.glTranslatef((float)x, (float)y + 1.5f, (float)z);
        GL11.glScalef(-1F,-1F,1F);
        bindEntityTexture(maid);
        model.render(maid,0f,0f,0f,0f,0f, 0.0625f);


        GL11.glPopMatrix();
        super.doRender(entity,x,y,z,yaw,partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }
}
