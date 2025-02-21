
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.msat.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.msat.world.inventory.AlloyGUIMenu;
import net.mcreator.msat.MsatMod;

public class MsatModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, MsatMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<AlloyGUIMenu>> ALLOY_GUI = REGISTRY.register("alloy_gui", () -> IMenuTypeExtension.create(AlloyGUIMenu::new));
}
