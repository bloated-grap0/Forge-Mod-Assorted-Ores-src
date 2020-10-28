
package net.mcreator.assorteditems.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.block.BlockMagnetiteConcentrate;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class FuelMagnetiteConcentration extends ElementsAssortedItemsMod.ModElement {
	public FuelMagnetiteConcentration(ElementsAssortedItemsMod instance) {
		super(instance, 91);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockMagnetiteConcentrate.block, (int) (1)).getItem())
			return 3000;
		return 0;
	}
}
