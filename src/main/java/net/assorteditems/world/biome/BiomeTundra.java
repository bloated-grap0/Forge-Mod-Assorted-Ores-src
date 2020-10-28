
package net.mcreator.assorteditems.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityAgeable;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Random;

@ElementsAssortedItemsMod.ModElement.Tag
public class BiomeTundra extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:tundra")
	public static final BiomeGenCustom biome = null;
	public BiomeTundra(ElementsAssortedItemsMod instance) {
		super(instance, 340);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 6));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("tundra").setRainfall(0.3F).setBaseHeight(0.4F).setHeightVariation(0.3F).setTemperature(-0.2F));
			setRegistryName("tundra");
			topBlock = Blocks.SNOW_LAYER.getDefaultState();
			fillerBlock = Blocks.ICE.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 1;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 1;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAgeable.class, 20, 4, 4));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAgeable.class, 10, 1, 2));
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
