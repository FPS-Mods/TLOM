package com.fps.tlom.item;

import com.fps.tlom.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ZELDA_MOD = new ItemGroup("zeldaMod") {
        @Override public ItemStack makeIcon() { return new ItemStack(ModItems.AMBER.get()); }
    };
}
