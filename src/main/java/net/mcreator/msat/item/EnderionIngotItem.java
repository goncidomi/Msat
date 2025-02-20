
package net.mcreator.msat.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderionIngotItem extends Item {
	public EnderionIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
