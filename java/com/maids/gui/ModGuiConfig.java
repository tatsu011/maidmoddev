package com.maids.gui;

import com.maids.core.MaidConfig;
import com.maids.info.core;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;

/**
 * Created by Tatsu on 4/16/2016.
 */
public class ModGuiConfig extends GuiConfig {

    ModGuiConfig(GuiScreen parentScreen) {
        super(  parentScreen,
                new ConfigElement(MaidConfig.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                core.MOD_ID,
                true, //Disabling head maids will require the removal of every head maid and unregisters their entities.
                true,
                GuiConfig.getAbridgedConfigPath(MaidConfig.config.toString()));
    }
}
