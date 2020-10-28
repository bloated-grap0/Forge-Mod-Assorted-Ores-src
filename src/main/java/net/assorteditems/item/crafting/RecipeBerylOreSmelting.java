
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemBerylGem;
import net.mcreator.assorteditems.block.BlockBerylOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeBerylOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeBerylOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 69);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockBerylOre.block, (int) (1)), new ItemStack(ItemBerylGem.block, (int) (1)), 0.77F);
	}
}
