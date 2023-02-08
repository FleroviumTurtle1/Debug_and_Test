package fleroviumturtle1.debugandtest.item;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Objects;

public class DebuggingWandItem extends Item {
    public DebuggingWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext useon) {
        Level LEVEL = useon.getLevel();
        BlockPos POSI = useon.getClickedPos();
        BlockState BS = LEVEL.getBlockState(POSI);

        String BLPT = "Block Position: "+Float.toString(POSI.getX())+", "+Float.toString(POSI.getY())+", "+Float.toString(POSI.getZ());
        Objects.requireNonNull(useon.getPlayer()).sendSystemMessage(Component.translatable("chat.dat.blockpos",BLPT));
        return super.useOn(useon);
    }
}
