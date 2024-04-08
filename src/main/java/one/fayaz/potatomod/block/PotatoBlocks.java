package one.fayaz.potatomod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import one.fayaz.potatomod.PotatoMod;
import one.fayaz.potatomod.item.PotatoItems;

import java.util.function.Supplier;

public class PotatoBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PotatoMod.MOD_ID);

    public static final RegistryObject<Block> BAKED_POTATO_BRICKS = registerBlock("baked_potato_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BIG_BRAIN_FRONT_BACK = registerBlock("big_brain_front_back",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BIG_BRAIN_LEFT_RIGHT = registerBlock("big_brain_left_right",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BIG_BRAIN_TOP_BOTTOM = registerBlock("big_brain_top_bottom",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHARRED_BAKED_POTATO_BRICKS = registerBlock("charred_baked_potato_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COMPRESSED_POISONOUS_POTATO_BLOCK = registerBlock("compressed_poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORRUPTED_PEELGRASS_BLOCK = registerBlock("corrupted_peelgrass_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORRUPTED_PEELGRASS_BLOCK_SIDE = registerBlock("corrupted_peelgrass_block_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORRUPTED_POTATO_PEELS_BLOCK = registerBlock("corrupted_potato_peels_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DOUBLE_COMPRESSED_POISONOUS_POTATO_BLOCK = registerBlock("double_compressed_poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> EXPIRED_BAKED_POTATO_BRICKS = registerBlock("expired_baked_potato_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATER_BACK = registerBlock("floatater_back",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATER_BACK_TRIGGERED = registerBlock("floatater_back_triggered",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATER_FRONT = registerBlock("floatater_front",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATER_SIDE = registerBlock("floatater_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATO = registerBlock("floatato",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FRYING_TABLE = registerBlock("frying_table",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAVTATER = registerBlock("gravtater",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEDESTAL = registerBlock("pedestal",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEELGRASS_BLOCK_SIDE = registerBlock("peelgrass_block_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEELGRASS_BLOCK_SNOW = registerBlock("peelgrass_block_snow",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEELGRASS_BLOCK_TOP = registerBlock("peelgrass_block_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_MASHED_POTATO = registerBlock("poisonous_mashed_potato",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ORE = registerBlock("poisonous_potato_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ZOMBIE_HEAD_BLOCK_SIDE = registerBlock("poisonous_potato_zombie_head_block_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ZOMBIE_HEAD_BLOCK_TOP = registerBlock("poisonous_potato_zombie_head_block_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ZOMBIE_HEAD_HAT = registerBlock("poisonous_potato_zombie_head_hat",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISON_FARMLAND = registerBlock("poison_farmland",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISON_FARMLAND_MOIST = registerBlock("poison_farmland_moist",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISON_PATH_SIDE = registerBlock("poison_path_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISON_PATH_TOP = registerBlock("poison_path_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATOES_STAGE0 = registerBlock("potatoes_stage0",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATOES_STAGE1 = registerBlock("potatoes_stage1",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATOES_STAGE2 = registerBlock("potatoes_stage2",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATOES_STAGE3 = registerBlock("potatoes_stage3",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BATTERY_INVERTED_TOP = registerBlock("potato_battery_inverted_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BATTERY_SIDE = registerBlock("potato_battery_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BATTERY_TOP = registerBlock("potato_battery_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_DOWN_BASE = registerBlock("potato_bud_down_base",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_DOWN_FRUSTUM = registerBlock("potato_bud_down_frustum",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_DOWN_MIDDLE = registerBlock("potato_bud_down_middle",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_DOWN_TIP = registerBlock("potato_bud_down_tip",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_DOWN_TIP_MERGE = registerBlock("potato_bud_down_tip_merge",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_UP_BASE = registerBlock("potato_bud_up_base",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_UP_FRUSTUM = registerBlock("potato_bud_up_frustum",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_UP_MIDDLE = registerBlock("potato_bud_up_middle",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_UP_TIP = registerBlock("potato_bud_up_tip",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BUD_UP_TIP_MERGE = registerBlock("potato_bud_up_tip_merge",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_CUTTER_BOTTOM = registerBlock("potato_cutter_bottom",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_CUTTER_SAW = registerBlock("potato_cutter_saw",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_CUTTER_SIDE = registerBlock("potato_cutter_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_CUTTER_TOP = registerBlock("potato_cutter_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_DOOR_BOTTOM = registerBlock("potato_door_bottom",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_DOOR_TOP = registerBlock("potato_door_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_FLOWER = registerBlock("potato_flower",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_FRUIT_BOTTOM = registerBlock("potato_fruit_bottom",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_FRUIT_SIDE = registerBlock("potato_fruit_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_FRUIT_TOP = registerBlock("potato_fruit_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_LEAVES = registerBlock("potato_leaves",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PEDICULE = registerBlock("potato_pedicule",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PEELS_BLOCK = registerBlock("potato_peels_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PLANKS = registerBlock("potato_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PORTAL = registerBlock("potato_portal",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_REFINERY_FRONT = registerBlock("potato_refinery_front",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_REFINERY_FRONT_ON = registerBlock("potato_refinery_front_on",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_REFINERY_SIDE = registerBlock("potato_refinery_side",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_REFINERY_TOP = registerBlock("potato_refinery_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_SPROUTS = registerBlock("potato_sprouts",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_STEM = registerBlock("potato_stem",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_STEM_TOP = registerBlock("potato_stem_top",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_TRAPDOOR = registerBlock("potato_trapdoor",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE = registerBlock("potone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE_COPPER_ORE = registerBlock("potone_copper_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE_DIAMOND_ORE = registerBlock("potone_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE_GOLD_ORE = registerBlock("potone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE_IRON_ORE = registerBlock("potone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE_LAPIS_ORE = registerBlock("potone_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTONE_REDSTONE_ORE = registerBlock("potone_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> QUADRUPLE_COMPRESSED_POISONOUS_POTATO_BLOCK = registerBlock("quadruple_compressed_poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> RESIN_ORE = registerBlock("resin_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> STRONG_ROOTS = registerBlock("strong_roots",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TATER = registerBlock("tater",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TATERSTONE = registerBlock("taterstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TERREDEPOMME = registerBlock("terredepomme",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIPLE_COMPRESSED_POISONOUS_POTATO_BLOCK = registerBlock("triple_compressed_poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> VICIOUS_POTATO = registerBlock("vicious_potato",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> VICIOUS_POTATO_ENABLED = registerBlock("vicious_potato_enabled",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WEAK_ROOTS = registerBlock("weak_roots",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return PotatoItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
