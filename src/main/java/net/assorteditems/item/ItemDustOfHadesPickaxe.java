
package net.mcreator.assorteditems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsAssortedItemsMod.ModElement.Tag
public class ItemDustOfHadesPickaxe extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:dust_of_hades_pickaxe")
	public static final Item block = null;
	public ItemDustOfHadesPickaxe(ElementsAssortedItemsMod instance) {
		super(instance, 350);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("DUST_OF_HADES_PICKAXE", 3, 441, 8f, -1f, 21)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("dust_of_hades_pickaxe").setRegistryName("dust_of_hades_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("assorted_items:dust_of_hades_pickaxe", "inventory"));
	}
}
