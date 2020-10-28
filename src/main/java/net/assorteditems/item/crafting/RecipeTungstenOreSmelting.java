
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemTungstenIngot;
import net.mcreator.assorteditems.block.BlockTungstenOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeTungstenOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeTungstenOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 27);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTungstenOre.block, (int) (1)), new ItemStack(ItemTungstenIngot.block, (int) (1)),
				0.8400000000000001F);
	}
}
