
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.msat.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.msat.MsatMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MsatModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MsatMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MsatModItems.COPPER_SWORD.get());
			tabData.accept(MsatModItems.RED_DIAMOND_SWORDS.get());
			tabData.accept(MsatModItems.RED_DIAMOND_PICKAXE.get());
			tabData.accept(MsatModItems.RED_DIAMOND_AXE.get());
			tabData.accept(MsatModItems.RED_DIAMONDHOE.get());
			tabData.accept(MsatModItems.RED_DIAMONDSHOVEL.get());
			tabData.accept(MsatModItems.COPPER_SHOVEL.get());
			tabData.accept(MsatModItems.COPPER_AXE.get());
			tabData.accept(MsatModItems.COPPER_PICKAXE.get());
			tabData.accept(MsatModItems.COPPER_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MsatModItems.RED_DIAMOND.get());
		}
	}
}
