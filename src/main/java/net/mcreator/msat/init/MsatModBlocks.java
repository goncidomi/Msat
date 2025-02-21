
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.msat.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.msat.block.RedDiamondOreBlock;
import net.mcreator.msat.block.RedDiamondBlockBlock;
import net.mcreator.msat.block.DeepslateRedDiamondOreBlock;
import net.mcreator.msat.block.DeepslateBauxiteOreBlock;
import net.mcreator.msat.block.BauxiteoreBlock;
import net.mcreator.msat.MsatMod;

public class MsatModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MsatMod.MODID);
	public static final DeferredBlock<Block> RED_DIAMOND_ORE = REGISTRY.register("red_diamond_ore", RedDiamondOreBlock::new);
	public static final DeferredBlock<Block> RED_DIAMOND_BLOCK = REGISTRY.register("red_diamond_block", RedDiamondBlockBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_RED_DIAMOND_ORE = REGISTRY.register("deepslate_red_diamond_ore", DeepslateRedDiamondOreBlock::new);
	public static final DeferredBlock<Block> BAUXITE_ORE = REGISTRY.register("bauxite_ore", BauxiteoreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_ORE = REGISTRY.register("deepslate_bauxite_ore", DeepslateBauxiteOreBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
