
package net.mcreator.moreweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.moreweapons.itemgroup.MoreWeaponsItemGroup;
import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class KetchupItem extends MoreWeaponsModElements.ModElement {
	@ObjectHolder("more_weapons_:ketchup")
	public static final Item block = null;
	public KetchupItem(MoreWeaponsModElements instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreWeaponsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ketchup");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
