package com.example.instantcrystalremover.mixin;

import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiPlayerGameMode.class)
public class InstantCrystalRemoverMixin {

    @Inject(method = "attack", at = @At("HEAD"))
    private void instantcrystalremover$onAttack(Player player, Entity target, CallbackInfo ci) {
        if (target instanceof EndCrystal && target.isAlive()
                && player.level() instanceof ClientLevel level) {
            level.removeEntity(target.getId(), Entity.RemovalReason.DISCARDED);
        }
    }
}
