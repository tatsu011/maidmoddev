package com.maids.util;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by Tatsu on 4/16/2016.
 */
public class Logging {

    public static void log(Level logLevel, @NotNull String FormattedMessage, @Nullable Object... objects)
    {
        FMLLog.log(logLevel, FormattedMessage, objects);
    }


    public static void info( @NotNull String FormattedMessage, @Nullable Object... object) {log(Level.INFO, FormattedMessage,object); }

}
