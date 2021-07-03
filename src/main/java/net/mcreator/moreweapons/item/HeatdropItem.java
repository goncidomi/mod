
package net.mcreator.moreweapons.item;

@MoreWeaponsModElements.ModElement.Tag
public class HeatdropItem extends MoreWeaponsModElements.ModElement {

	@ObjectHolder("more_weapons_:heatdrop")
	public static final Item block = null;

	public HeatdropItem(MoreWeaponsModElements instance) {
		super(instance, 61);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(MoreWeaponsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("heatdrop");
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
