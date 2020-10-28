
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemMagnetiteDust;
import net.mcreator.assorteditems.block.BlockMagnetiteOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeMagnetiteOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeMagnetiteOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 90);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMagnetiteOre.block, (int) (1)), new ItemStack(ItemMagnetiteDust.block, (int) (1)), 0.7F);
	}
}
