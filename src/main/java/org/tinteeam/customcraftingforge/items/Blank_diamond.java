package org.tinteeam.customcraftingforge.items;

import static org.tinteeam.customcraftingforge.items.ModItems.ITEMS;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;



public class Blank_diamond {
    public static final RegistryObject<Item> BLANK_DIAMOND = ITEMS.register("blank_diamond",
            () -> new Item(new Item.Properties()));
}
