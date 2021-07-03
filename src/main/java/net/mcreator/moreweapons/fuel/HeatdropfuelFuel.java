
package net.mcreator.moreweapons.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.moreweapons.item.HeatdropItem;
import net.mcreator.moreweapons.MoreWeaponsModElements;

@MoreWeaponsModElements.ModElement.Tag
public class HeatdropfuelFuel extends MoreWeaponsModElements.ModElement {
	public HeatdropfuelFuel(MoreWeaponsModElements instance) {
		super(instance, 70);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(HeatdropItem.block, (int) (1)).getItem())
			event.setBurnTime(1606);
	}
}
