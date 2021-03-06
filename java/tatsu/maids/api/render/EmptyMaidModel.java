package tatsu.maids.api.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import tatsu.maids.entities.EntityMaid;

/**
 * Created by Tatsu on 4/30/2016.
 */
public abstract class EmptyMaidModel extends ModelBase implements ICustomMaidModel {
    public void setRotationAngles(Entity entity, float f, float f1, float f2, float headAngleY, float headAngleX, float scale) {
        super.setRotationAngles(f, f1,f2,headAngleY,headAngleX,scale,entity);

        renderMaid((EntityMaid)entity, f,f1,f2,headAngleY,headAngleX,scale);

    }

    //Helper functions.
    private void renderMaid(EntityMaid maid, float time, float swingSupress, float f2, float headAngleY, float headAngleX, float scale)
    {
        //Now we can access custom entity values.
        Head().rotateAngleY = headAngleY * 0.017453292F;
        Head().rotateAngleX = headAngleX * 0.017453292F;




    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }




}
