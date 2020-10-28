
package net.mcreator.assorteditems.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;
import net.minecraft.entity.passive.EntityAnimal;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Random;

@ElementsAssortedItemsMod.ModElement.Tag
public class BiomeFlowerFields extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:flower_fields")
	public static final BiomeGenCustom biome = null;
	public BiomeFlowerFields(ElementsAssortedItemsMod instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("flower_fields").setRainfall(0.4F).setBaseHeight(0.1F).setHeightVariation(0.2F).setTemperature(0.4F));
			setRegistryName("flower_fields");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 30;
			decorator.grassPerChunk = 5;
			decorator.mushroomsPerChunk = 3;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 6;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAnimal.class, 23, 1, 2));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
