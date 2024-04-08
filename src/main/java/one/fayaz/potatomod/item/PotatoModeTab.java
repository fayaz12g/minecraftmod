package one.fayaz.potatomod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import one.fayaz.potatomod.PotatoMod;

public class PotatoModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PotatoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> POTATO_TAB = CREATIVE_MODE_TABS.register("potato_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((PotatoItems.POISONOUS_POTATO.get())))
                    .title(Component.translatable("creativetab.potato_tab"))
                    .displayItems((pParameters,pOutput) -> {
                        pOutput.accept(PotatoItems.AMBER_GEM.get());
                        pOutput.accept(PotatoItems.CORRUPTED_POTATO_PEELS.get());
                        pOutput.accept(PotatoItems.DENT.get());
                        pOutput.accept(PotatoItems.GOLDEN_POISONOUS_POTATO.get());
                        pOutput.accept(PotatoItems.HASH_BROWNS.get());
                        pOutput.accept(PotatoItems.HOT_POTATO.get());
                        pOutput.accept(PotatoItems.LASHING_POTATO.get());
                        pOutput.accept(PotatoItems.POISONOUS_POLYTRA.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTATO.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTATO_CHESTPLATE.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTATO_CHIPS.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTATO_FRIES.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTATO_SLICES.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTATO_STICKS.get());
                        pOutput.accept(PotatoItems.POISONOUS_POTA_TOES.get());
                        pOutput.accept(PotatoItems.POTATO.get());
                        pOutput.accept(PotatoItems.POTATO_BUD.get());
                        pOutput.accept(PotatoItems.POTATO_DOOR.get());
                        pOutput.accept(PotatoItems.POTATO_EYE.get());
                        pOutput.accept(PotatoItems.POTATO_HAMMER.get());
                        pOutput.accept(PotatoItems.POTATO_HANGING_SIGN.get());
                        pOutput.accept(PotatoItems.POTATO_OF_KNOWLEDGE.get());
                        pOutput.accept(PotatoItems.POTATO_PEDICULE.get());
                        pOutput.accept(PotatoItems.POTATO_PEELER.get());
                        pOutput.accept(PotatoItems.POTATO_PEELS.get());
                        pOutput.accept(PotatoItems.POTATO_SIGN.get());
                        pOutput.accept(PotatoItems.POTATO_STAFF.get());
                        pOutput.accept(PotatoItems.TOXIC_BEAM.get());
                        pOutput.accept(PotatoItems.TOXIC_RESIN.get());
                        pOutput.accept(PotatoItems.VENOMOUS_POTATO.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
