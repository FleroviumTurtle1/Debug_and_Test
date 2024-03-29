package fleroviumturtle1.debugandtest;

import fleroviumturtle1.debugandtest.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DebugAndTest.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab DTTAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        DTTAB = event.registerCreativeModeTab(new ResourceLocation(DebugAndTest.MODID, "dttab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.DEBUGGING_WAND.get()))
                        .title(Component.translatable("creativemodetab.dttab")));
    }
}
