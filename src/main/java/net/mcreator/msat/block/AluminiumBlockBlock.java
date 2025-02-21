
package net.mcreator.msat.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AluminiumBlockBlock extends Block {
	public AluminiumBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}