package me.eliq.disabletraintrapdoor.mixin;

import com.simibubi.create.content.contraptions.components.structureMovement.Contraption;
import com.simibubi.create.content.contraptions.components.structureMovement.interaction.TrapdoorMovingInteraction;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TrapdoorMovingInteraction.class)
public abstract class TrainTrapdoorDisabler {
    /**
     * @author EliConstructor
     * @reason How do I use mixin? I'm sure there's a better way to do this, but mixin is too complicated for my ape brain.
     */
    @Overwrite
    protected BlockState handle(PlayerEntity player, Contraption contraption, BlockPos pos, BlockState currentState) {
        return currentState;
    }
}
