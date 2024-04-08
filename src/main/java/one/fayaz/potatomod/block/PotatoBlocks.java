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
    public static final RegistryObject<Block> BIG_BRAIN = registerBlock("big_brain",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CHARRED_BAKED_POTATO_BRICKS = registerBlock("charred_baked_potato_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> COMPRESSED_POISONOUS_POTATO_BLOCK = registerBlock("compressed_poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORRUPTED_PEELGRASS_BLOCK = registerBlock("corrupted_peelgrass_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORRUPTED_POTATO_PEELS_BLOCK = registerBlock("corrupted_potato_peels_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DOUBLE_COMPRESSED_POISONOUS_POTATO_BLOCK = registerBlock("double_compressed_poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> EXPIRED_BAKED_POTATO_BRICKS = registerBlock("expired_baked_potato_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATER = registerBlock("floatater",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FLOATATO = registerBlock("floatato",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FRYING_TABLE = registerBlock("frying_table",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAVTATER = registerBlock("gravtater",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEDESTAL = registerBlock("pedestal",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEELGRASS_BLOCK = registerBlock("peelgrass_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_MASHED_POTATO = registerBlock("poisonous_mashed_potato",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ORE = registerBlock("poisonous_potato_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ZOMBIE_HEAD_BLOCK = registerBlock("poisonous_potato_zombie_head_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_ZOMBIE_HEAD_HAT = registerBlock("poisonous_potato_zombie_head_hat",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISON_FARMLAND = registerBlock("poison_farmland",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISON_PATH = registerBlock("poison_path",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATOES = registerBlock("potatoes",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_BATTERY = registerBlock("potato_battery",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
//    public static final RegistryObject<Block> POTATO_BUD = registerBlock("potato_bud",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POISONOUS_POTATO_CUTTER = registerBlock("poisonous_potato_cutter",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
//    public static final RegistryObject<Block> POTATO_DOOR = registerBlock("potato_door",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_FLOWER = registerBlock("potato_flower",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_FRUIT = registerBlock("potato_fruit",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_LEAVES = registerBlock("potato_leaves",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    // The Potato Pedicule causes the mod not to load...
//    public static final RegistryObject<Block> POTATO_PEDICULE = registerBlock("potato_pedicule",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PEELS_BLOCK = registerBlock("potato_peels_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PLANKS = registerBlock("potato_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_PORTAL = registerBlock("potato_portal",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_REFINERY = registerBlock("potato_refinery",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_SPROUTS = registerBlock("potato_sprouts",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> POTATO_STEM = registerBlock("potato_stem",
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
