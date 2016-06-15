package tatsu.maids.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tatsu.maids.api.render.EmptyMaidModel;
import tatsu.maids.entities.EntityMaid;

/**
 * Created by Tatsu on 4/12/2016.
 */
public class RenderMaid extends Render<EntityMaid> {

    public RenderMaid(RenderManager manager)
    {
        //super(manager, null, 0.5f);
        super(manager);
        //model = new ModelMaidBase();
        shadowSize = 0.5f;
    }

    private EmptyMaidModel model;

    @Override
    public void doRender(EntityMaid entity, double x, double y, double z, float yaw, float partialTickTime)
    {
        model = entity.getModel();
        GL11.glPushMatrix();
        //Magic happens.
        GL11.glTranslatef((float)x, (float)y + 1.5f, (float)z);
        GL11.glScalef(-1F,-1F,1F);
        bindEntityTexture(entity);
        model.render(entity,0f,0f,0f,0f,0f, 0.0625f);


        GL11.glPopMatrix();
        super.doRender(entity,x,y,z,yaw,partialTickTime); //do you even need to run...?
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityMaid entity) {
        EntityMaid maid = entity;

        return maid.getStyle().Texture;
    }





}
