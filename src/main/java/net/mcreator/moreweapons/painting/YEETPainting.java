
package net.mcreator.moreweapons.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class YEETPainting extends MoreWeaponsModElements.ModElement {
	public YEETPainting(MoreWeaponsModElements instance) {
		super(instance, 55);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("yeet"));
	}
}
