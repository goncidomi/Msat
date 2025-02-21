
package net.mcreator.msat.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RawBauxiteBlockBlock extends Block {
	public RawBauxiteBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(2f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}