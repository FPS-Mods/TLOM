package com.fps.tlom.init;

import com.fps.tlom.TLOM;
import com.fps.tlom.item.ModItemGroup;
import com.fps.tlom.item.ModItemTier;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TLOM.MOD_ID);

    public static final RegistryObject<Item> AMBER = register("amber", new Item(new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));
    public static final RegistryObject<Item> ANCIENT_SCRAP = register("ancient_scrap", new Item(new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));
    public static final RegistryObject<Item> ANCIENT_INGOT = register("ancient_ingot", new Item(new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));
    public static final RegistryObject<Item> SPIRIT_ORB = register("spirit_orb", new Item(new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));
    public static final RegistryObject<Item> GOAT_BUTTER = register("goat_butter", new Item(new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));
    public static final RegistryObject<Item> SALMON_MEUNIERE = register("salmon_meuniere", new Item(new Item.Properties().tab(ModItemGroup.ZELDA_MOD).food(new Food.Builder().nutrition(6).saturationMod(1.5f).build())));

    // Tools
    public static final RegistryObject<Item> ANCIENT_PICKAXE = register("ancient_pickaxe", new PickaxeItem(ModItemTier.ANCIENT, 1, -2.8f, new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));
    public static final RegistryObject<Item> ANCIENT_SHOVEL = register("ancient_shovel", new ShovelItem(ModItemTier.ANCIENT, 1.5F, -3.0F, new Item.Properties().tab(ModItemGroup.ZELDA_MOD)));

    private static <T extends Item> RegistryObject<T> register(String id, T item)
    {
        return ModItems.ITEMS.register(id, () -> item);
    }
}
