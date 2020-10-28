
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemCopperIngot;
import net.mcreator.assorteditems.block.BlockCopperOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeCopperOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeCopperOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 48);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCopperOre.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (1)), 0.7F);
	}
}
