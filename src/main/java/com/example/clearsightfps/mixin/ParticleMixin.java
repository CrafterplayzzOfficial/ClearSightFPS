package com.example.clearsightfps.mixin;

import com.example.clearsightfps.config.ModConfig;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientWorld.class)
public abstract class ParticleMixin {
    @Inject(method = "addParticle", at = @At("HEAD"), cancellable = true)
    private void disableParticles(CallbackInfo ci) {
        if (ModConfig.disableParticles) ci.cancel();
    }
}
