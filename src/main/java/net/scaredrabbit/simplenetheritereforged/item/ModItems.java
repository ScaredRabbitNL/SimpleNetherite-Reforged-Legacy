package net.scaredrabbit.simplenetheritereforged.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scaredrabbit.simplenetheritereforged.SimpleNetheriteReforged;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleNetheriteReforged.MODID);
    public static final RegistryObject<Item> RAW_NETHERITE = ITEMS.register("raw_netherite",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ModItems.ITEMS.register(eventBus);
    }

}

