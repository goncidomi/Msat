
package net.mcreator.msat.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderionShardItem extends Item {
	public EnderionShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
