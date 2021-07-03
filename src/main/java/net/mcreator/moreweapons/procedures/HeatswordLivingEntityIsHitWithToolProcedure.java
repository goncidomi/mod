package net.mcreator.moreweapons.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.moreweapons.MoreWeaponsModElements;
import net.mcreator.moreweapons.MoreWeaponsMod;

import java.util.Map;

@MoreWeaponsModElements.ModElement.Tag
public class HeatswordLivingEntityIsHitWithToolProcedure extends MoreWeaponsModElements.ModElement {
	public HeatswordLivingEntityIsHitWithToolProcedure(MoreWeaponsModElements instance) {
		super(instance, 65);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoreWeaponsMod.LOGGER.warn("Failed to load dependency entity for procedure HeatswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 5);
	}
}
