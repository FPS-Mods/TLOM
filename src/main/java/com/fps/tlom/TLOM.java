package com.fps.tlom;

import com.fps.tlom.init.ModBlocks;
import com.fps.tlom.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TLOM.MOD_ID)
public class TLOM {

    public static final String MOD_ID = "tlom";

    private static final Logger LOGGER = LogManager.getLogger();

    public TLOM() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
