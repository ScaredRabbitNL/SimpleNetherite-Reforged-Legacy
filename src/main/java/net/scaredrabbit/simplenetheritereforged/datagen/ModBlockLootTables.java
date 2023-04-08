package net.scaredrabbit.simplenetheritereforged.datagen;

import net.scaredrabbit.simplenetheritereforged.block.ModBlocks;
import net.scaredrabbit.simplenetheritereforged.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RAW_NETHERITE_BLOCK.get());

        add(ModBlocks.STONE_NETHERITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.STONE_NETHERITE_ORE.get(), ModItems.RAW_NETHERITE.get()));
        add(ModBlocks.DEEPSLATE_NETHERITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_NETHERITE_ORE.get(), ModItems.RAW_NETHERITE.get()));
        add(ModBlocks.NETHERRACK_NETHERITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_NETHERITE_ORE.get(), ModItems.RAW_NETHERITE.get()));
        add(ModBlocks.ENDSTONE_NETHERITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_NETHERITE_ORE.get(), ModItems.RAW_NETHERITE.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
