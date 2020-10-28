
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemPainiteGem;
import net.mcreator.assorteditems.block.BlockPainiteOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipePainiteOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipePainiteOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 117);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPainiteOre.block, (int) (1)), new ItemStack(ItemPainiteGem.block, (int) (1)), 0.7F);
	}
}
