
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemSilverIngot;
import net.mcreator.assorteditems.block.BlockSilverOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeSilverOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeSilverOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 234);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSilverOre.block, (int) (1)), new ItemStack(ItemSilverIngot.block, (int) (1)),
				0.5599999999999999F);
	}
}
