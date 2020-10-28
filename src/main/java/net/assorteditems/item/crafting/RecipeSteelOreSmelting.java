
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemSteelIngot;
import net.mcreator.assorteditems.block.BlockSteelOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeSteelOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeSteelOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 296);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSteelOre.block, (int) (1)), new ItemStack(ItemSteelIngot.block, (int) (1)), 0.7F);
	}
}
