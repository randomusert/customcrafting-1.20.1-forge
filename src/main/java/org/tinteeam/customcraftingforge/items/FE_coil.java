package org.tinteeam.customcraftingforge.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import  static org.tinteeam.customcraftingforge.items.ModItems.ITEMS;

public class FE_coil {
    public static final RegistryObject<Item> FE_COIL = ITEMS.register("fe_coil",
            () -> new Item(new Item.Properties()));

}
