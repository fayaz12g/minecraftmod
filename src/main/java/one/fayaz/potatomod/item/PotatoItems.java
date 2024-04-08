package one.fayaz.potatomod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import one.fayaz.potatomod.PotatoMod;

public class PotatoItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PotatoMod.MOD_ID);

    public static final RegistryObject<Item> AMBER_GEM = ITEMS.register("amber_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CORRUPTED_POTATO_PEELS = ITEMS.register("corrupted_potato_peels",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DENT = ITEMS.register("dent",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_POISONOUS_POTATO = ITEMS.register("golden_poisonous_potato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HASH_BROWNS = ITEMS.register("hash_browns",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOT_POTATO = ITEMS.register("hot_potato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LASHING_POTATO = ITEMS.register("lashing_potato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LASHING_POTATO_EXTENDED = ITEMS.register("lashing_potato_extended",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POLYTRA = ITEMS.register("poisonous_polytra",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTATO = ITEMS.register("poisonous_potato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTATO_CHESTPLATE = ITEMS.register("poisonous_potato_chestplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTATO_CHIPS = ITEMS.register("poisonous_potato_chips",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTATO_FRIES = ITEMS.register("poisonous_potato_fries",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTATO_SLICES = ITEMS.register("poisonous_potato_slices",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTATO_STICKS = ITEMS.register("poisonous_potato_sticks",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISONOUS_POTA_TOES = ITEMS.register("poisonous_pota_toes",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO = ITEMS.register("potato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_BUD = ITEMS.register("potato_bud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_DOOR = ITEMS.register("potato_door",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_EYE = ITEMS.register("potato_eye",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_HAMMER = ITEMS.register("potato_hammer",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_HANGING_SIGN = ITEMS.register("potato_hanging_sign",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_OF_KNOWLEDGE = ITEMS.register("potato_of_knowledge",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_PEDICULE = ITEMS.register("potato_pedicule",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_PEELER = ITEMS.register("potato_peeler",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_PEELS = ITEMS.register("potato_peels",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_SIGN = ITEMS.register("potato_sign",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTATO_STAFF = ITEMS.register("potato_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOXIC_BEAM = ITEMS.register("toxic_beam",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOXIC_RESIN = ITEMS.register("toxic_resin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VENOMOUS_POTATO = ITEMS.register("venomous_potato",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
