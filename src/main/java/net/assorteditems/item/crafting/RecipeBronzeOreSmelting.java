
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemBronzeIngot;
import net.mcreator.assorteditems.block.BlockBronzeOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeBronzeOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeBronzeOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 213);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBronzeOre.block, (int) (1)), new ItemStack(ItemBronzeIngot.block, (int) (1)), 0.35F);
	}
}
