package tatsu.maids.api.render;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Tatsu on 4/30/2016.
 */
public interface ICustomMaidModel {

    //Width and height of the base model.
    /**
     *  Gets the width of the maid in blocks.
     * @return The width of the maid.
     */
    float getWidth();

    /**
     * Gets the height of the the maid in blocks.
     * @return The height of the maid.
     */
    float getHeight();


    //all the limbs.

    /**
     *
     * @return the right arm of your maid model. Cannot be null.
     */
    ModelRenderer RightArm();

    /**
     * @return The left arm of your maid model.Cannot be null.
     */
    ModelRenderer LeftArm();

    /**
     * @return The head of your maid model.  Cannot be null.
     */
    ModelRenderer Head();

    /**
     * @return the Body of your maid model.  Cannot be null.
     */
    ModelRenderer Torso();

    /**
     *
     * @return The right leg of your maid model.  Cannot be null.
     */
    ModelRenderer RightLeg();

    /**
     * @Return The left leg of your maid model.  Cannot be null.
     */
    ModelRenderer LeftLeg();




}
