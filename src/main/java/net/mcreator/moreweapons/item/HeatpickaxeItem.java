
package net.mcreator.moreweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class HeatpickaxeItem extends MoreWeaponsModElements.ModElement {
	@ObjectHolder("more_weapons_:heatpickaxe")
	public static final Item block = null;
	public HeatpickaxeItem(MoreWeaponsModElements instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ReddiamonItem.block, (int) (1)));
			}
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("heatpickaxe"));
	}
}
