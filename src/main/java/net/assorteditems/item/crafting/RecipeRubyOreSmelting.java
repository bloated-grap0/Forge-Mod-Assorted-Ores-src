
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemRubyGem;
import net.mcreator.assorteditems.block.BlockRubyOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeRubyOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeRubyOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRubyOre.block, (int) (1)), new ItemStack(ItemRubyGem.block, (int) (1)), 0.7F);
	}
}
