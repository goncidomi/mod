
package net.mcreator.moreweapons.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.moreweapons.procedures.SwordlItemIsCraftedsmeltedProcedure;
import net.mcreator.moreweapons.itemgroup.MoreWeaponsItemGroup;
import net.mcreator.moreweapons.MoreWeaponsModElements;

import java.util.Map;
import java.util.HashMap;

@MoreWeaponsModElements.ModElement.Tag
public class SwordlItem extends MoreWeaponsModElements.ModElement {
	@ObjectHolder("more_weapons_:swordl")
	public static final Item block = null;
	public SwordlItem(MoreWeaponsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1912;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT, (int) (1)), new ItemStack(Items.DIAMOND, (int) (1)));
			}
		}, 3, -2.2f, new Item.Properties().group(MoreWeaponsItemGroup.tab).isImmuneToFire()) {
			@Override
			public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onCreated(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					SwordlItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
				}
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("swordl"));
	}
}
