package me.fallinganvils.peacefulskeletons.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(AbstractSkeletonEntity.class)
public class PeacefulSkeletonsMixin {
	@Overwrite
	public void attack(LivingEntity target, float pullProgress) {
		return;
	}
}
