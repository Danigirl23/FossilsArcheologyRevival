package mods.fossil.handler;

import java.util.Arrays;
import java.util.HashSet;

import mods.fossil.Fossil;
import mods.fossil.core.FossilPlants;
import mods.fossil.fossilEnums.EnumDinoType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EventFossilAchivements
{
	@SubscribeEvent
	public void onCraftEvent(PlayerEvent.ItemCraftedEvent event) {
		if(event.crafting.getItem() == Item.getItemFromBlock(Fossil.blockanalyzerIdle)) {
			event.player.addStat(FossilAchievementHandler.analyzer, 1);
		}
		if(event.crafting.getItem() == Item.getItemFromBlock(Fossil.blockcultivateIdle)) {
			event.player.addStat(FossilAchievementHandler.cultivate, 1);
		}
		if(event.crafting.getItem() == Item.getItemFromBlock(Fossil.blockSifterIdle)) {
			event.player.addStat(FossilAchievementHandler.sifter, 1);
		}
		if(event.crafting.getItem() == Item.getItemFromBlock(Fossil.blockworktableIdle)) {
			event.player.addStat(FossilAchievementHandler.arcWorkbench, 1);
		}
		if(event.crafting.getItem() == Fossil.AquaticScarabGem) {
			event.player.addStat(FossilAchievementHandler.blueScarab, 1);
		}
		if(event.crafting.getItem() == Fossil.gemAxe || event.crafting.getItem() == Fossil.gemHoe ||
				event.crafting.getItem() == Fossil.gemSword || event.crafting.getItem() == Fossil.gemPickaxe
				|| event.crafting.getItem() == Fossil.gemShovel) {
			event.player.addStat(FossilAchievementHandler.scarabTools, 1);
		}
	}
	@SubscribeEvent
	public void onItemEvent(PlayerEvent.ItemPickupEvent event) {
		
		if(event.pickedUp.getEntityItem().getItem() == Fossil.gem) {
			event.player.addStat(FossilAchievementHandler.scarab, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == Fossil.ancientKey) {
			event.player.addStat(FossilAchievementHandler.key, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == Fossil.ancientClock) {
			event.player.addStat(FossilAchievementHandler.clock, 1);
		}
	}
}
