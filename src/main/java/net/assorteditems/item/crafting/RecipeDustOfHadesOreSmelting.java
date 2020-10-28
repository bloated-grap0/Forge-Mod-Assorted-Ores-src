
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemDustOfHadesDust;
import net.mcreator.assorteditems.block.BlockDustOfHadesOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeDustOfHadesOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeDustOfHadesOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 349);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDustOfHadesOre.block, (int) (1)), new ItemStack(ItemDustOfHadesDust.block, (int) (1)),
				1.0499999999999998F);
	}
}
