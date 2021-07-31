package net.mcreator.guns.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.guns.GunsModElements;
import net.mcreator.guns.GunsMod;

import java.util.Map;

@GunsModElements.ModElement.Tag
public class SpellbookBulletHitsLivingEntityProcedure extends GunsModElements.ModElement {
	public SpellbookBulletHitsLivingEntityProcedure(GunsModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GunsMod.LOGGER.warn("Failed to load dependency entity for procedure SpellbookBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 5);
	}
}
