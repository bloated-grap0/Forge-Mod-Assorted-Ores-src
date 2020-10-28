
package net.mcreator.assorteditems.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.block.BlockCondensedoil;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class FuelOil extends ElementsAssortedItemsMod.ModElement {
	public FuelOil(ElementsAssortedItemsMod instance) {
		super(instance, 204);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockCondensedoil.block, (int) (1)).getItem())
			return 10000;
		return 0;
	}
}
