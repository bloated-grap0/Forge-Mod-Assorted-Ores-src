
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemSaltDust;
import net.mcreator.assorteditems.block.BlockSaltOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeSaltOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeSaltOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 104);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSaltOre.block, (int) (1)), new ItemStack(ItemSaltDust.block, (int) (1)), 0.42F);
	}
}
