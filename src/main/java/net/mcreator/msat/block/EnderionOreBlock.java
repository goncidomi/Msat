
package net.mcreator.msat.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EnderionOreBlock extends Block {
	public EnderionOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}