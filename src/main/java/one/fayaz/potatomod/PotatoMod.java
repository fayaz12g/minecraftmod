package one.fayaz.potatomod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import one.fayaz.potatomod.item.PotatoItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PotatoMod.MOD_ID)
public class PotatoMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "potatomod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public PotatoMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PotatoItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(PotatoItems.AMBER_GEM);
            event.accept(PotatoItems.CORRUPTED_POTATO_PEELS);
            event.accept(PotatoItems.DENT);
            event.accept(PotatoItems.GOLDEN_POISONOUS_POTATO);
            event.accept(PotatoItems.HASH_BROWNS);
            event.accept(PotatoItems.HOT_POTATO);
            event.accept(PotatoItems.LASHING_POTATO);
            event.accept(PotatoItems.LASHING_POTATO_EXTENDED);
            event.accept(PotatoItems.POISONOUS_POLYTRA);
            event.accept(PotatoItems.POISONOUS_POTATO);
            event.accept(PotatoItems.POISONOUS_POTATO_CHESTPLATE);
            event.accept(PotatoItems.POISONOUS_POTATO_CHIPS);
            event.accept(PotatoItems.POISONOUS_POTATO_FRIES);
            event.accept(PotatoItems.POISONOUS_POTATO_SLICES);
            event.accept(PotatoItems.POISONOUS_POTATO_STICKS);
            event.accept(PotatoItems.POISONOUS_POTA_TOES);
            event.accept(PotatoItems.POTATO);
            event.accept(PotatoItems.POTATO_BUD);
            event.accept(PotatoItems.POTATO_DOOR);
            event.accept(PotatoItems.POTATO_EYE);
            event.accept(PotatoItems.POTATO_HAMMER);
            event.accept(PotatoItems.POTATO_HANGING_SIGN);
            event.accept(PotatoItems.POTATO_OF_KNOWLEDGE);
            event.accept(PotatoItems.POTATO_PEDICULE);
            event.accept(PotatoItems.POTATO_PEELER);
            event.accept(PotatoItems.POTATO_PEELS);
            event.accept(PotatoItems.POTATO_SIGN);
            event.accept(PotatoItems.POTATO_STAFF);
            event.accept(PotatoItems.TOXIC_BEAM);
            event.accept(PotatoItems.TOXIC_RESIN);
            event.accept(PotatoItems.VENOMOUS_POTATO);

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
