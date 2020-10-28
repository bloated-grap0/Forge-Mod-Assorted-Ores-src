
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.block.BlockCrudeOil;
import net.mcreator.assorteditems.block.BlockCondensedoil;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeCondensedoilrecipe extends ElementsAssortedItemsMod.ModElement {
	public RecipeCondensedoilrecipe(ElementsAssortedItemsMod instance) {
		super(instance, 207);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCrudeOil.block, (int) (1)), new ItemStack(BlockCondensedoil.block, (int) (1)), 1F);
	}
}
