
package net.mcreator.assorteditems.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Random;

@ElementsAssortedItemsMod.ModElement.Tag
public class BiomeExtremeIceBiome extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:extreme_ice_biome")
	public static final BiomeGenCustom biome = null;
	public BiomeExtremeIceBiome(ElementsAssortedItemsMod instance) {
		super(instance, 289);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(biome, 10));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("extreme_ice_biome").setRainfall(0.3F).setBaseHeight(0.1F).setWaterColor(-16724788)
					.setHeightVariation(0.2F).setTemperature(-1F));
			setRegistryName("extreme_ice_biome");
			topBlock = Blocks.FROSTED_ICE.getDefaultState();
			fillerBlock = Blocks.PACKED_ICE.getDefaultState();
			decorator.generateFalls = true;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 2;
			decorator.grassPerChunk = 5;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
