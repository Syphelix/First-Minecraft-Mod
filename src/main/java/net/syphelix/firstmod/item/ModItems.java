package net.syphelix.firstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.syphelix.firstmod.FirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CONDU = ITEMS.register("condu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MADROBE = ITEMS.register("madrobe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REALMIUMSTICK = ITEMS.register("realmiumstick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REALMIUMESSENCE = ITEMS.register("realmiumessence",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXPO = ITEMS.register("expo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FULMI = ITEMS.register("fulmi",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REALMIUMINGOT = ITEMS.register("realmiumingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
