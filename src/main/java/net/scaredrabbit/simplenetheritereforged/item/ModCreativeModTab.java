package net.scaredrabbit.simplenetheritereforged.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.scaredrabbit.simplenetheritereforged.SimpleNetheriteReforged;

@Mod.EventBusSubscriber(modid = SimpleNetheriteReforged.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModTab {
    public static CreativeModeTab SIMPLENETHERITE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register e){
        SIMPLENETHERITE_TAB = e.registerCreativeModeTab(new ResourceLocation(SimpleNetheriteReforged.MODID, "simplenetherite_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RAW_NETHERITE.get()))
                        .title(Component.translatable("creativemodetab.simplenetherite_tab")));
    }
}
