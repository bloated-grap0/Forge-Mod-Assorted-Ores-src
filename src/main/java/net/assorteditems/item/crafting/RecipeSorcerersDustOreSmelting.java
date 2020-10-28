
package net.mcreator.assorteditems.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.assorteditems.item.ItemSorcerersDustDust;
import net.mcreator.assorteditems.block.BlockSorcerersDustOre;
import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class RecipeSorcerersDustOreSmelting extends ElementsAssortedItemsMod.ModElement {
	public RecipeSorcerersDustOreSmelting(ElementsAssortedItemsMod instance) {
		super(instance, 273);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSorcerersDustOre.block, (int) (1)), new ItemStack(ItemSorcerersDustDust.block, (int) (1)),
				1.0499999999999998F);
	}
}
