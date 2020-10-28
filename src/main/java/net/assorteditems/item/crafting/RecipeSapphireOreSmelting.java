
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemSapphireGem;
import net.mcreator.assorteditems.block.BlockSapphireOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeSapphireOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeSapphireOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 188);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSapphireOre.block, (int) (1)), new ItemStack(ItemSapphireGem.block, (int) (1)),
				1.0499999999999998F);
	}
}
