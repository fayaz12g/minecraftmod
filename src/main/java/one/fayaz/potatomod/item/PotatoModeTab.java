package one.fayaz.potatomod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import one.fayaz.potatomod.PotatoMod;
import one.fayaz.potatomod.block.PotatoBlocks;

public class PotatoModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PotatoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> POTATO_TAB = CREATIVE_MODE_TABS.register("potato_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((PotatoItems.POISONOUS_POTATO.get())))
                    .title(Component.translatable("creativetab.potato_tab"))
                    .displayItems((pParameters,pOutput) -> {
                        // Items
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

                        // Blocks
                        pOutput.accept(PotatoBlocks.BAKED_POTATO_BRICKS.get());
                        pOutput.accept(PotatoBlocks.BIG_BRAIN.get());
                        pOutput.accept(PotatoBlocks.CHARRED_BAKED_POTATO_BRICKS.get());
                        pOutput.accept(PotatoBlocks.COMPRESSED_POISONOUS_POTATO_BLOCK.get());
                        pOutput.accept(PotatoBlocks.CORRUPTED_PEELGRASS_BLOCK.get());
                        pOutput.accept(PotatoBlocks.CORRUPTED_POTATO_PEELS_BLOCK.get());
                        pOutput.accept(PotatoBlocks.DOUBLE_COMPRESSED_POISONOUS_POTATO_BLOCK.get());
                        pOutput.accept(PotatoBlocks.EXPIRED_BAKED_POTATO_BRICKS.get());
                        pOutput.accept(PotatoBlocks.FLOATATER.get());
                        pOutput.accept(PotatoBlocks.FLOATATO.get());
                        pOutput.accept(PotatoBlocks.FRYING_TABLE.get());
                        pOutput.accept(PotatoBlocks.GRAVTATER.get());
                        pOutput.accept(PotatoBlocks.PEDESTAL.get());
                        pOutput.accept(PotatoBlocks.PEELGRASS_BLOCK_SNOW.get());
                        pOutput.accept(PotatoBlocks.POISONOUS_MASHED_POTATO.get());
                        pOutput.accept(PotatoBlocks.POISONOUS_POTATO_BLOCK.get());
                        pOutput.accept(PotatoBlocks.POISONOUS_POTATO_ORE.get());
                        pOutput.accept(PotatoBlocks.POISONOUS_POTATO_ZOMBIE_HEAD_BLOCK_SIDE.get());
                        pOutput.accept(PotatoBlocks.POISONOUS_POTATO_ZOMBIE_HEAD_BLOCK_TOP.get());
                        pOutput.accept(PotatoBlocks.POISONOUS_POTATO_ZOMBIE_HEAD_HAT.get());
                        pOutput.accept(PotatoBlocks.POISON_FARMLAND.get());
                        pOutput.accept(PotatoBlocks.POISON_FARMLAND_MOIST.get());
                        pOutput.accept(PotatoBlocks.POISON_PATH_SIDE.get());
                        pOutput.accept(PotatoBlocks.POISON_PATH_TOP.get());
                        pOutput.accept(PotatoBlocks.POTATOES_STAGE0.get());
                        pOutput.accept(PotatoBlocks.POTATOES_STAGE1.get());
                        pOutput.accept(PotatoBlocks.POTATOES_STAGE2.get());
                        pOutput.accept(PotatoBlocks.POTATOES_STAGE3.get());
                        pOutput.accept(PotatoBlocks.POTATO_BATTERY_INVERTED_TOP.get());
                        pOutput.accept(PotatoBlocks.POTATO_BATTERY_SIDE.get());
                        pOutput.accept(PotatoBlocks.POTATO_BATTERY_TOP.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_DOWN_BASE.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_DOWN_FRUSTUM.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_DOWN_MIDDLE.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_DOWN_TIP.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_DOWN_TIP_MERGE.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_UP_BASE.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_UP_FRUSTUM.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_UP_MIDDLE.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_UP_TIP.get());
                        pOutput.accept(PotatoBlocks.POTATO_BUD_UP_TIP_MERGE.get());
                        pOutput.accept(PotatoBlocks.POTATO_CUTTER_BOTTOM.get());
                        pOutput.accept(PotatoBlocks.POTATO_CUTTER_SAW.get());
                        pOutput.accept(PotatoBlocks.POTATO_CUTTER_SIDE.get());
                        pOutput.accept(PotatoBlocks.POTATO_CUTTER_TOP.get());
                        pOutput.accept(PotatoBlocks.POTATO_DOOR_BOTTOM.get());
                        pOutput.accept(PotatoBlocks.POTATO_DOOR_TOP.get());
//                        pOutput.accept(PotatoBlocks.POTATO_FLOWER.get());
//                        pOutput.accept(PotatoBlocks.POTATO_FRUIT_BOTTOM.get());
//                        pOutput.accept(PotatoBlocks.POTATO_FRUIT_SIDE.get());
//                        pOutput.accept(PotatoBlocks.POTATO_FRUIT_TOP.get());
//                        pOutput.accept(PotatoBlocks.POTATO_LEAVES.get());
//                        pOutput.accept(PotatoBlocks.POTATO_PEDICULE.get());
//                        pOutput.accept(PotatoBlocks.POTATO_PEELS_BLOCK.get());
//                        pOutput.accept(PotatoBlocks.POTATO_PLANKS.get());
//                        pOutput.accept(PotatoBlocks.POTATO_PORTAL.get());
//                        pOutput.accept(PotatoBlocks.POTATO_REFINERY_FRONT.get());
//                        pOutput.accept(PotatoBlocks.POTATO_REFINERY_FRONT_ON.get());
//                        pOutput.accept(PotatoBlocks.POTATO_REFINERY_SIDE.get());
//                        pOutput.accept(PotatoBlocks.POTATO_REFINERY_TOP.get());
//                        pOutput.accept(PotatoBlocks.POTATO_SPROUTS.get());
//                        pOutput.accept(PotatoBlocks.POTATO_STEM.get());
//                        pOutput.accept(PotatoBlocks.POTATO_STEM_TOP.get());
//                        pOutput.accept(PotatoBlocks.POTATO_TRAPDOOR.get());
                        pOutput.accept(PotatoBlocks.POTONE.get());
                        pOutput.accept(PotatoBlocks.POTONE_COPPER_ORE.get());
                        pOutput.accept(PotatoBlocks.POTONE_DIAMOND_ORE.get());
                        pOutput.accept(PotatoBlocks.POTONE_GOLD_ORE.get());
                        pOutput.accept(PotatoBlocks.POTONE_IRON_ORE.get());
                        pOutput.accept(PotatoBlocks.POTONE_LAPIS_ORE.get());
                        pOutput.accept(PotatoBlocks.POTONE_REDSTONE_ORE.get());
                        pOutput.accept(PotatoBlocks.QUADRUPLE_COMPRESSED_POISONOUS_POTATO_BLOCK.get());
                        pOutput.accept(PotatoBlocks.RESIN_ORE.get());
                        pOutput.accept(PotatoBlocks.STRONG_ROOTS.get());
                        pOutput.accept(PotatoBlocks.TATER.get());
                        pOutput.accept(PotatoBlocks.TATERSTONE.get());
                        pOutput.accept(PotatoBlocks.TERREDEPOMME.get());
                        pOutput.accept(PotatoBlocks.TRIPLE_COMPRESSED_POISONOUS_POTATO_BLOCK.get());
                        pOutput.accept(PotatoBlocks.VICIOUS_POTATO.get());
                        pOutput.accept(PotatoBlocks.VICIOUS_POTATO_ENABLED.get());
                        pOutput.accept(PotatoBlocks.WEAK_ROOTS.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
