
package net.mcreator.assorteditems.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.EntityAgeable;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Random;

@ElementsAssortedItemsMod.ModElement.Tag
public class BiomeYellowForest extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:yellow_forest")
	public static final BiomeGenCustom biome = null;
	public BiomeYellowForest(ElementsAssortedItemsMod instance) {
		super(instance, 250);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 5));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("yellow_forest").setRainfall(0.3F).setBaseHeight(0.1F).setWaterColor(-3355648).setHeightVariation(0.2F)
					.setTemperature(0.7F));
			setRegistryName("yellow_forest");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.generateFalls = false;
			decorator.treesPerChunk = 4;
			decorator.flowersPerChunk = 2;
			decorator.grassPerChunk = 5;
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
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAgeable.class, 25, 4, 10));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityAnimal.class, 10, 2, 2));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -3355648;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -3355648;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return new WorldGenBirchTree(true, true);
		}
	}
}
