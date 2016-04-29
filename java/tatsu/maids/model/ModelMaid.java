package tatsu.maids.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;


public class ModelMaid extends ModelBase
{
  //fields
    ModelRenderer bipedHead;
    ModelRenderer bipedBody;
    ModelRenderer Skirt;
    ModelRenderer Bow;
    ModelRenderer bipedRightArm;
    ModelRenderer bipedLeftArm;
    ModelRenderer bipedRightLeg;
    ModelRenderer bipedLeftLeg;
    ModelRenderer Bonnet;
    ModelRenderer Adhego;

    ModelBiped.ArmPose LeftArmPose = ModelBiped.ArmPose.EMPTY;
    ModelBiped.ArmPose RightArmPose = ModelBiped.ArmPose.EMPTY;
    public boolean RightHanded = true;

  
  public ModelMaid()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      bipedHead = new ModelRenderer(this, 0, 0);
      bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8);
      bipedHead.setRotationPoint(0F, 0F, 0F);
      bipedHead.setTextureSize(64, 64);
      bipedHead.mirror = true;
      setRotation(bipedHead, 0F, 0F, 0F);
      bipedBody = new ModelRenderer(this, 16, 16);
      bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
      bipedBody.setRotationPoint(0F, 0F, 0F);
      bipedBody.setTextureSize(64, 64);
      bipedBody.mirror = true;
      setRotation(bipedBody, 0F, 0F, 0F);
      Skirt = new ModelRenderer(this, 0, 32);
      Skirt.addBox(0F, 0F, 0F, 10, 10, 8);
      Skirt.setRotationPoint(-5F, 9F, -4F);
      Skirt.setTextureSize(64, 64);
      Skirt.mirror = true;
      setRotation(Skirt, 0F, 0F, 0F);
      Bow = new ModelRenderer(this, 0, 50);
      Bow.addBox(0F, 0F, 0F, 10, 10, 0);
      Bow.setRotationPoint(-5F, 6F, 4.1F);
      Bow.setTextureSize(64, 64);
      Bow.mirror = true;
      setRotation(Bow, 0F, 0F, 0F);
      bipedRightArm = new ModelRenderer(this, 40, 16);
      bipedRightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
      bipedRightArm.setRotationPoint(-5F, 2F, 0F);
      bipedRightArm.setTextureSize(64, 64);
      bipedRightArm.mirror = true;
      setRotation(bipedRightArm, 0F, 0F, 0F);
      bipedLeftArm = new ModelRenderer(this, 40, 16);
      bipedLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
      bipedLeftArm.setRotationPoint(5F, 2F, 0F);
      bipedLeftArm.setTextureSize(64, 64);
      bipedLeftArm.mirror = true;
      setRotation(bipedLeftArm, 0F, 0F, 0F);
      bipedRightLeg = new ModelRenderer(this, 0, 16);
      bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
      bipedRightLeg.setTextureSize(64, 64);
      bipedRightLeg.mirror = true;
      setRotation(bipedRightLeg, 0F, 0F, 0F);
      bipedLeftLeg = new ModelRenderer(this, 0, 16);
      bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
      bipedLeftLeg.setTextureSize(64, 64);
      bipedLeftLeg.mirror = true;
      setRotation(bipedLeftLeg, 0F, 0F, 0F);
      Bonnet = new ModelRenderer(this, 32, 0);
      Bonnet.addBox(0F, 0F, 0F, 8, 5, 0);
      Bonnet.setRotationPoint(-4F, -13F, 0F);
      Bonnet.setTextureSize(64, 64);
      Bonnet.mirror = true;

      setRotation(Bonnet, 0F, 0F, 0F);
      Adhego = new ModelRenderer(this, 32, 1);
      Adhego.addBox(0F, 0F, 0F, 0, 5, 5);
      Adhego.setRotationPoint(0F, -13F, -5F);
      Adhego.setTextureSize(64, 64);
      Adhego.mirror = true;
      setRotation(Adhego, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float Scale)
  {
    super.render(entity, f, f1, f2, f3, f4, Scale);
    setRotationAngles(f, f1, f2, f3, f4, Scale, entity);
    bipedHead.render(Scale);
    bipedBody.render(Scale);
    Skirt.render(Scale);
    Bow.render(Scale);
    bipedRightArm.render(Scale);
    bipedLeftArm.render(Scale);
    bipedRightLeg.render(Scale);
    bipedLeftLeg.render(Scale);
    Bonnet.render(Scale);
    Adhego.render(Scale);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase) entityIn).getTicksElytraFlying() > 4;
    this.bipedHead.rotateAngleY = netHeadYaw * 0.017453292F;

    if (flag) {
      this.bipedHead.rotateAngleX = -((float) Math.PI / 4F);
    } else {
      this.bipedHead.rotateAngleX = headPitch * 0.017453292F;
    }

    this.bipedBody.rotateAngleY = 0.0F;
    this.bipedRightArm.rotationPointZ = 0.0F;
    this.bipedRightArm.rotationPointX = -5.0F;
    this.bipedLeftArm.rotationPointZ = 0.0F;
    this.bipedLeftArm.rotationPointX = 5.0F;
    float f = 1.0F;

    if (flag) {
      f = (float) (entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
      f = f / 0.2F;
      f = f * f * f;
    }

    if (f < 1.0F) {
      f = 1.0F;
    }

    this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
    this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
    this.bipedRightArm.rotateAngleZ = 0.0F;
    this.bipedLeftArm.rotateAngleZ = 0.0F;
    this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
    this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
    this.bipedRightLeg.rotateAngleY = 0.0F;
    this.bipedLeftLeg.rotateAngleY = 0.0F;
    this.bipedRightLeg.rotateAngleZ = 0.0F;
    this.bipedLeftLeg.rotateAngleZ = 0.0F;

    if (this.isRiding) {
      this.bipedRightArm.rotateAngleX += -((float) Math.PI / 5F);
      this.bipedLeftArm.rotateAngleX += -((float) Math.PI / 5F);
      this.bipedRightLeg.rotateAngleX = -1.4137167F;
      this.bipedRightLeg.rotateAngleY = ((float) Math.PI / 10F);
      this.bipedRightLeg.rotateAngleZ = 0.07853982F;
      this.bipedLeftLeg.rotateAngleX = -1.4137167F;
      this.bipedLeftLeg.rotateAngleY = -((float) Math.PI / 10F);
      this.bipedLeftLeg.rotateAngleZ = -0.07853982F;
    }

    this.bipedRightArm.rotateAngleY = 0.0F;
    this.bipedRightArm.rotateAngleZ = 0.0F;

    switch (this.LeftArmPose) {
      case EMPTY:
        this.bipedLeftArm.rotateAngleY = 0.0F;
        break;
      case BLOCK:
        this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - 0.9424779F;
        this.bipedLeftArm.rotateAngleY = 0.5235988F;
        break;
      case ITEM:
        this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
        this.bipedLeftArm.rotateAngleY = 0.0F;
    }

    switch (this.RightArmPose) {
      case EMPTY:
        this.bipedRightArm.rotateAngleY = 0.0F;
        break;
      case BLOCK:
        this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - 0.9424779F;
        this.bipedRightArm.rotateAngleY = -0.5235988F;
        break;
      case ITEM:
        this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
        this.bipedRightArm.rotateAngleY = 0.0F;
    }

    if (this.swingProgress > 0.0F) {
      EnumHandSide enumhandside = this.getMainHand(entityIn);
      ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
      this.getArmForSide(enumhandside.opposite());
      float f1 = this.swingProgress;
      this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f1) * ((float) Math.PI * 2F)) * 0.2F;

      if (enumhandside == EnumHandSide.LEFT) {
        this.bipedBody.rotateAngleY *= -1.0F;
      }

      this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
      this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
      this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
      f1 = 1.0F - this.swingProgress;
      f1 = f1 * f1;
      f1 = f1 * f1;
      f1 = 1.0F - f1;
      float f2 = MathHelper.sin(f1 * (float) Math.PI);
      float f3 = MathHelper.sin(this.swingProgress * (float) Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
      modelrenderer.rotateAngleX = (float) ((double) modelrenderer.rotateAngleX - ((double) f2 * 1.2D + (double) f3));
      modelrenderer.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
      modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
    }
    this.bipedBody.rotateAngleX = 0.0F;
    this.bipedRightLeg.rotationPointZ = 0.1F;
    this.bipedLeftLeg.rotationPointZ = 0.1F;
    this.bipedRightLeg.rotationPointY = 12.0F;
    this.bipedLeftLeg.rotationPointY = 12.0F;
    this.bipedHead.rotationPointY = 0.0F;

    this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
    this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
    this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

    if (this.RightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW) {
      this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY;
      this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY + 0.4F;
      this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
      this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
    } else if (this.LeftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW) {
      this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY - 0.4F;
      this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY;
      this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
      this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
    }

        //copyModelAngles(this.bipedHead, this.Bonnet);
        //copyModelAngles(this.bipedHead, this.Adhego);
        //copyModelAngles(this.bipedBody, this.Skirt);
        //copyModelAngles(this.bipedBody, this.Bow);
  }

  protected ModelRenderer getArmForSide(EnumHandSide side)
  {
    return side == EnumHandSide.LEFT ? this.bipedLeftArm : this.bipedRightArm;
  }

  protected EnumHandSide getMainHand(Entity p_187072_1_)
  {
    return p_187072_1_ instanceof EntityLivingBase ? ((EntityLivingBase)p_187072_1_).getPrimaryHand() : EnumHandSide.RIGHT;
  }

}
