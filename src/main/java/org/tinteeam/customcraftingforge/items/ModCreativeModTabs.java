package org.tinteeam.customcraftingforge.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import org.tinteeam.customcraftingforge.CustomCrafting;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CustomCrafting.MODID);



    public static final RegistryObject<CreativeModeTab> CUSTOMCRAFTING_ITEMS = CREATIVE_MODE_TABS.register(
            "customcrafting_tab",() -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.customcrafting_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLANK_DIAMOND.get());
                        pOutput.accept(ModItems.FE_COIL.get());

                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
