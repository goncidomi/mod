
package net.mcreator.moreweapons.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.moreweapons.itemgroup.MoreWeaponsItemGroup;
import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class MusicItem extends MoreWeaponsModElements.ModElement {
	@ObjectHolder("more_weapons_:music")
	public static final Item block = null;
	public MusicItem(MoreWeaponsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MoreWeaponsModElements.sounds.get(new ResourceLocation("more_weapons_:music_disc")),
					new Item.Properties().group(MoreWeaponsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
