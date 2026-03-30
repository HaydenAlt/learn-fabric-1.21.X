package com.haydenalt.learn.item;

import com.haydenalt.learn.Learn;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Learn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Learn.LOGGER.info("Registering Mod Items for " + Learn.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SAPPHIRE);
            entries.add(RAW_SAPPHIRE);
        });
    }
}
