package fleroviumturtle1.debugandtest.item;

import fleroviumturtle1.debugandtest.DebugAndTest;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DebugAndTest.MODID);

    public static final RegistryObject<Item> DEBUGGING_WAND = ITEMS.register("debugging_wand",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
