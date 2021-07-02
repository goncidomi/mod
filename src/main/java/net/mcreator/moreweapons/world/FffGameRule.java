package net.mcreator.moreweapons.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.moreweapons.MoreWeaponsModElements;

import java.lang.reflect.Method;

@MoreWeaponsModElements.ModElement.Tag
public class FffGameRule extends MoreWeaponsModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("fff", GameRules.Category.SPAWNING, create(0));
	public FffGameRule(MoreWeaponsModElements instance) {
		super(instance, 12);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
