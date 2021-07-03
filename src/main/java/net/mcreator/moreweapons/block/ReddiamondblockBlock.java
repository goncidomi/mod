
package net.mcreator.moreweapons.block;

import net.minecraft.block.material.Material;

@MoreWeaponsModElements.ModElement.Tag
public class ReddiamondblockBlock extends MoreWeaponsModElements.ModElement {

	@ObjectHolder("more_weapons_:reddiamondblock")
	public static final Block block = null;

	public ReddiamondblockBlock(MoreWeaponsModElements instance) {
		super(instance, 58);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MoreWeaponsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("reddiamondblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
