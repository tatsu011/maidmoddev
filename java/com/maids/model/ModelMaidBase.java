package com.maids.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBiped - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelMaidBase extends ModelBase {
    public ModelRenderer RightArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer Torso;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer Bonnet;
    public ModelRenderer Adhego;
    public ModelRenderer Skirt;
    public ModelRenderer Boobs;

    public ModelMaidBase() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Bonnet = new ModelRenderer(this, 32, 3);
        this.Bonnet.setRotationPoint(-4.0F, -10.0F, 0.0F);
        this.Bonnet.addBox(0.0F, 0.0F, 0.0F, 8, 2, 0, 0.0F);
        this.Boobs = new ModelRenderer(this, 18, 23);
        this.Boobs.setRotationPoint(-4.2F, 3.3F, -2.0F);
        this.Boobs.addBox(0.0F, 0.0F, 0.0F, 8, 3, 2, 0.0F);
        this.setRotateAngle(Boobs, -0.29914943379182807F, 0.0F, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.RightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Adhego = new ModelRenderer(this, 32, 1);
        this.Adhego.setRotationPoint(0.0F, -11.0F, -4.0F);
        this.Adhego.addBox(0.0F, 1.0F, 0.0F, 0, 2, 4, 0.0F);
        this.Torso = new ModelRenderer(this, 16, 16);
        this.Torso.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.Skirt = new ModelRenderer(this, 0, 32);
        this.Skirt.setRotationPoint(-4.5F, 9.0F, -4.0F);
        this.Skirt.addBox(0.0F, 0.0F, 0.0F, 9, 10, 8, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RightLeg = new ModelRenderer(this, 0, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head.addChild(this.Bonnet);
        this.Torso.addChild(this.Boobs);
        this.Head.addChild(this.Adhego);
        this.Torso.addChild(this.Skirt);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.RightArm.render(f5);
        this.LeftLeg.render(f5);
        this.Torso.render(f5);
        this.Head.render(f5);
        this.RightLeg.render(f5);
        this.LeftArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
