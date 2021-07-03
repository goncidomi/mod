
package net.mcreator.moreweapons.item;

@MoreWeaponsModElements.ModElement.Tag
public class HeatcrystalItem extends MoreWeaponsModElements.ModElement {

	@ObjectHolder("more_weapons_:heatcrystal")
	public static final Item block = null;

	public HeatcrystalItem(MoreWeaponsModElements instance) {
		super(instance, 62);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MoreWeaponsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("heatcrystal");
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
