
package net.mcreator.moreweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class HeataxeItem extends MoreWeaponsModElements.ModElement {
	@ObjectHolder("more_weapons_:heataxe")
	public static final Item block = null;
	public HeataxeItem(MoreWeaponsModElements instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HeatcrystalItem.block, (int) (1)), new ItemStack(HeatdropItem.block, (int) (1)));
			}
		}, 1, -2.7f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("heataxe"));
	}
}
