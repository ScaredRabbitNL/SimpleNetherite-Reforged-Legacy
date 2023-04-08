package net.scaredrabbit.simplenetheritereforged.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scaredrabbit.simplenetheritereforged.SimpleNetheriteReforged;
import net.scaredrabbit.simplenetheritereforged.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SimpleNetheriteReforged.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RAW_NETHERITE_BLOCK);
        blockWithItem(ModBlocks.STONE_NETHERITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_NETHERITE_ORE);
        blockWithItem(ModBlocks.ENDSTONE_NETHERITE_ORE);
        blockWithItem(ModBlocks.NETHERRACK_NETHERITE_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
