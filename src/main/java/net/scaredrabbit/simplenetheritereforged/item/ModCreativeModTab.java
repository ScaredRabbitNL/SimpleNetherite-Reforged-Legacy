package net.scaredrabbit.simplenetheritereforged.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.scaredrabbit.simplenetheritereforged.SimpleNetheriteReforged;

@Mod.EventBusSubscriber(modid = SimpleNetheriteReforged.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleNetheriteReforged.MODID);
    public static final RegistryObject<CreativeModeTab> SIMPLENETHERITE_TAB = CREATIVE_MODE_TABS.register("simplenetherite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_NETHERITE.get()))
                    .title(Component.translatable("creativemodetab.simplenetherite_tab"))
                    .displayItems((p_270258_, p_259752_) -> {

                        })
                    .build());
    /*
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register e){
        SIMPLENETHERITE_TAB = e.registerCreativeModeTab(new ResourceLocation(SimpleNetheriteReforged.MODID, "simplenetherite_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RAW_NETHERITE.get()))
                        .title(Component.translatable("creativemodetab.simplenetherite_tab")));
    }

     */
}
