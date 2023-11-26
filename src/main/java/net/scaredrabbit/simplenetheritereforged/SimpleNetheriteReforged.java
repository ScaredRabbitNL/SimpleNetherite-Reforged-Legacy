package net.scaredrabbit.simplenetheritereforged;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.scaredrabbit.simplenetheritereforged.block.ModBlocks;
import net.scaredrabbit.simplenetheritereforged.item.ModCreativeModTab;
import net.scaredrabbit.simplenetheritereforged.item.ModItems;
import org.slf4j.Logger;

import static net.scaredrabbit.simplenetheritereforged.SimpleNetheriteReforged.MODID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class SimpleNetheriteReforged {
    public static final String MODID = "simplenetheritereforged";
    private static final Logger LOGGER = LogUtils.getLogger();
    public SimpleNetheriteReforged() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        //modEventBus.addListener(this::addCreative);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    @Deprecated(forRemoval = true)
    public void addCreative(BuildCreativeModeTabContentsEvent e) {

            e.accept(ModItems.RAW_NETHERITE);
            e.accept(ModBlocks.DEEPSLATE_NETHERITE_ORE);
            e.accept(ModBlocks.ENDSTONE_NETHERITE_ORE);
            e.accept(ModBlocks.NETHERRACK_NETHERITE_ORE);
            e.accept(ModBlocks.RAW_NETHERITE_BLOCK);
            e.accept(ModBlocks.STONE_NETHERITE_ORE);
        }
    }

