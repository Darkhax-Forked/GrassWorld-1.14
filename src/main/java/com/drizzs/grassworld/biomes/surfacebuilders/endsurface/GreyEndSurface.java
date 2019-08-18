package com.drizzs.grassworld.biomes.surfacebuilders.endsurface;


import com.drizzs.grassworld.biomes.surfacebuilders.GrassSurfaces;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class GreyEndSurface extends SurfaceBuilder<SurfaceBuilderConfig>
{
    public GreyEndSurface()
    {
        super(SurfaceBuilderConfig ::deserialize);
    }

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config)
    {
        if (noise > 1.9D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, GrassSurfaces.GREYEND);
        } else {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, SurfaceBuilder.END_STONE_CONFIG);
        }
    }
}