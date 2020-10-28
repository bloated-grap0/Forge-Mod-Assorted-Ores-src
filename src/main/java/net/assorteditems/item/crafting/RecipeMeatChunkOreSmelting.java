
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemMeatChunkIngot;
import net.mcreator.assorteditems.block.BlockMeatChunkOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeMeatChunkOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeMeatChunkOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 370);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMeatChunkOre.block, (int) (1)), new ItemStack(ItemMeatChunkIngot.block, (int) (1)),
				0.8400000000000001F);
	}
}
