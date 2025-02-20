
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.msat.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.msat.item.RedDiamondshovelItem;
import net.mcreator.msat.item.RedDiamondhoeItem;
import net.mcreator.msat.item.RedDiamondSwordsItem;
import net.mcreator.msat.item.RedDiamondPickaxeItem;
import net.mcreator.msat.item.RedDiamondItem;
import net.mcreator.msat.item.RedDiamondAxeItem;
import net.mcreator.msat.item.RawBauxiteItem;
import net.mcreator.msat.item.EnderionShardItem;
import net.mcreator.msat.item.EnderionIngotItem;
import net.mcreator.msat.item.CopperpickaxeItem;
import net.mcreator.msat.item.CopperhoeItem;
import net.mcreator.msat.item.CopperSwordItem;
import net.mcreator.msat.item.CopperShovelItem;
import net.mcreator.msat.item.CopperAxeItem;
import net.mcreator.msat.item.AluminiumSwordItem;
import net.mcreator.msat.item.AluminiumShovelItem;
import net.mcreator.msat.item.AluminiumPickaxeItem;
import net.mcreator.msat.item.AluminiumIngotItem;
import net.mcreator.msat.item.AluminiumHoeItem;
import net.mcreator.msat.item.AluminiumAxeItem;
import net.mcreator.msat.MsatMod;

public class MsatModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MsatMod.MODID);
	public static final DeferredItem<Item> COPPER_SWORD = REGISTRY.register("copper_sword", CopperSwordItem::new);
	public static final DeferredItem<Item> RED_DIAMOND_SWORDS = REGISTRY.register("red_diamond_swords", RedDiamondSwordsItem::new);
	public static final DeferredItem<Item> RED_DIAMOND_ORE = block(MsatModBlocks.RED_DIAMOND_ORE);
	public static final DeferredItem<Item> RED_DIAMOND_BLOCK = block(MsatModBlocks.RED_DIAMOND_BLOCK);
	public static final DeferredItem<Item> RED_DIAMOND = REGISTRY.register("red_diamond", RedDiamondItem::new);
	public static final DeferredItem<Item> DEEPSLATE_RED_DIAMOND_ORE = block(MsatModBlocks.DEEPSLATE_RED_DIAMOND_ORE);
	public static final DeferredItem<Item> RED_DIAMOND_PICKAXE = REGISTRY.register("red_diamond_pickaxe", RedDiamondPickaxeItem::new);
	public static final DeferredItem<Item> RED_DIAMOND_AXE = REGISTRY.register("red_diamond_axe", RedDiamondAxeItem::new);
	public static final DeferredItem<Item> RED_DIAMONDHOE = REGISTRY.register("red_diamondhoe", RedDiamondhoeItem::new);
	public static final DeferredItem<Item> RED_DIAMONDSHOVEL = REGISTRY.register("red_diamondshovel", RedDiamondshovelItem::new);
	public static final DeferredItem<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", CopperShovelItem::new);
	public static final DeferredItem<Item> COPPER_AXE = REGISTRY.register("copper_axe", CopperAxeItem::new);
	public static final DeferredItem<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", CopperpickaxeItem::new);
	public static final DeferredItem<Item> COPPER_HOE = REGISTRY.register("copper_hoe", CopperhoeItem::new);
	public static final DeferredItem<Item> BAUXITE_ORE = block(MsatModBlocks.BAUXITE_ORE);
	public static final DeferredItem<Item> DEEPSLATE_BAUXITE_ORE = block(MsatModBlocks.DEEPSLATE_BAUXITE_ORE);
	public static final DeferredItem<Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", AluminiumIngotItem::new);
	public static final DeferredItem<Item> RAW_BAUXITE = REGISTRY.register("raw_bauxite", RawBauxiteItem::new);
	public static final DeferredItem<Item> ALUMINIUM_SWORD = REGISTRY.register("aluminium_sword", AluminiumSwordItem::new);
	public static final DeferredItem<Item> RAW_BAUXITE_BLOCK = block(MsatModBlocks.RAW_BAUXITE_BLOCK);
	public static final DeferredItem<Item> ALUMINIUM_PICKAXE = REGISTRY.register("aluminium_pickaxe", AluminiumPickaxeItem::new);
	public static final DeferredItem<Item> ALUMINIUM_SHOVEL = REGISTRY.register("aluminium_shovel", AluminiumShovelItem::new);
	public static final DeferredItem<Item> ALUMINIUM_AXE = REGISTRY.register("aluminium_axe", AluminiumAxeItem::new);
	public static final DeferredItem<Item> ALUMINIUM_HOE = REGISTRY.register("aluminium_hoe", AluminiumHoeItem::new);
	public static final DeferredItem<Item> ALUMINIUM_BLOCK = block(MsatModBlocks.ALUMINIUM_BLOCK);
	public static final DeferredItem<Item> ENDERION_ORE = block(MsatModBlocks.ENDERION_ORE);
	public static final DeferredItem<Item> ENDERION_SHARD = REGISTRY.register("enderion_shard", EnderionShardItem::new);
	public static final DeferredItem<Item> ENDERION_INGOT = REGISTRY.register("enderion_ingot", EnderionIngotItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
