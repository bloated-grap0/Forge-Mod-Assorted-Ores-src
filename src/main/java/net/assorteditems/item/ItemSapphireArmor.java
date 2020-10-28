
package net.mcreator.assorteditems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

@ElementsAssortedItemsMod.ModElement.Tag
public class ItemSapphireArmor extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:sapphire_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("assorted_items:sapphire_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("assorted_items:sapphire_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("assorted_items:sapphire_armorboots")
	public static final Item boots = null;
	public ItemSapphireArmor(ElementsAssortedItemsMod instance) {
		super(instance, 199);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SAPPHIRE_ARMOR", "assorted_items:sapphire", 23, new int[]{3, 9, 8, 3}, 14,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("sapphire_armorhelmet")
				.setRegistryName("sapphire_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("sapphire_armorbody")
				.setRegistryName("sapphire_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("sapphire_armorlegs")
				.setRegistryName("sapphire_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("sapphire_armorboots")
				.setRegistryName("sapphire_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("assorted_items:sapphire_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("assorted_items:sapphire_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("assorted_items:sapphire_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("assorted_items:sapphire_armorboots", "inventory"));
	}
}
