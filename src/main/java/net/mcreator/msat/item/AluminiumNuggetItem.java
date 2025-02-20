
package net.mcreator.msat.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AluminiumNuggetItem extends Item {
	public AluminiumNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
