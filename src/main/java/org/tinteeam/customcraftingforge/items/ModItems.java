package org.tinteeam.customcraftingforge.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.tinteeam.customcraftingforge.CustomCrafting;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CustomCrafting.MODID);
    public static final RegistryObject<Item> FE_COIL = ITEMS.register("fe_coil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_DIAMOND = ITEMS.register("blank_diamond",
            () -> new Item(new Item.Properties()));
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
