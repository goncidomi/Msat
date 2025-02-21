
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.msat.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.msat.client.gui.AlloyGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MsatModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MsatModMenus.ALLOY_GUI.get(), AlloyGUIScreen::new);
	}
}
