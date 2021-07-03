
package net.mcreator.moreweapons.item;

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
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("heatpickaxe"));
	}

}
