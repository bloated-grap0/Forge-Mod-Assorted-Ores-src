
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemTitaniumIngot;
import net.mcreator.assorteditems.block.BlockTitaniumOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeTitaniumOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeTitaniumOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 323);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaniumOre.block, (int) (1)), new ItemStack(ItemTitaniumIngot.block, (int) (1)),
				1.0499999999999998F);
	}
}
