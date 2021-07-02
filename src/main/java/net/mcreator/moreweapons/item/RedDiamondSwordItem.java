
package net.mcreator.moreweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreweapons.itemgroup.MoreWeaponsItemGroup;
import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class RedDiamondSwordItem extends MoreWeaponsModElements.ModElement {
	@ObjectHolder("more_weapons_:red_diamond_sword")
	public static final Item block = null;
	public RedDiamondSwordItem(MoreWeaponsModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ReddiamonItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(MoreWeaponsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("red_diamond_sword"));
	}
}
