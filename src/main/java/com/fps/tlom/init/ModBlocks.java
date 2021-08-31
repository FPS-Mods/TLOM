package com.fps.tlom.init;

import com.fps.tlom.TLOM;
import com.fps.tlom.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TLOM.MOD_ID);

    public static final RegistryObject<Block> AMBER_ORE = register("amber_ore", new Block(Block.Properties.of(Material.STONE).strength(2f, 10f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)), ModItemGroup.ZELDA_MOD);
    public static final RegistryObject<Block> SCRAP_ORE = register("scrap_ore", new Block(Block.Properties.of(Material.STONE).strength(2f, 10f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)), ModItemGroup.ZELDA_MOD);
    public static final RegistryObject<Block> AMBER_BLOCK = register("amber_block", new Block(Block.Properties.of(Material.STONE).strength(2f, 10f).sound(SoundType.STONE)), ModItemGroup.ZELDA_MOD);

    private static <T extends Block> RegistryObject<T> register(String id, T block, ItemGroup tab)
    {
        ModItems.ITEMS.register(id, () -> new BlockItem(block, new Item.Properties().tab(tab)));
        return ModBlocks.BLOCKS.register(id, () -> block);
    }
}
