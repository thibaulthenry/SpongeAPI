/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.world.biome;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class BiomeTypes {
    
    // SORTFIELDS:ON

    public static final Supplier<BiomeType> BEACH = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("beach"));

    public static final Supplier<BiomeType> BIRCH_FOREST = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("birch_forest"));

    public static final Supplier<BiomeType> BIRCH_FOREST_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("birch_forest_hills"));

    public static final Supplier<BiomeType> COLD_BEACH = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("cold_beach"));

    public static final Supplier<BiomeType> COLD_TAIGA = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("cold_taiga"));

    public static final Supplier<BiomeType> COLD_TAIGA_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("cold_taiga_hills"));

    public static final Supplier<BiomeType> DEEP_OCEAN = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("deep_ocean"));

    public static final Supplier<BiomeType> DESERT = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("desert"));

    public static final Supplier<BiomeType> DESERT_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("desert_hills"));

    public static final Supplier<BiomeType> EXTREME_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("extreme_hills"));

    public static final Supplier<BiomeType> EXTREME_HILLS_EDGE = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("extreme_hills_edge"));

    public static final Supplier<BiomeType> EXTREME_HILLS_PLUS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("extreme_hills_plus"));

    public static final Supplier<BiomeType> FOREST = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("forest"));

    public static final Supplier<BiomeType> FOREST_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("forest_hills"));

    public static final Supplier<BiomeType> FROZEN_OCEAN = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("frozen_ocean"));

    public static final Supplier<BiomeType> FROZEN_RIVER = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("frozen_river"));

    public static final Supplier<BiomeType> HELL = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("hell"));

    public static final Supplier<BiomeType> ICE_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("ice_mountains"));

    public static final Supplier<BiomeType> ICE_PLAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("ice_plains"));

    public static final Supplier<BiomeType> JUNGLE = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("jungle"));

    public static final Supplier<BiomeType> JUNGLE_EDGE = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("jungle_edge"));

    public static final Supplier<BiomeType> JUNGLE_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("jungle_hills"));

    public static final Supplier<BiomeType> MEGA_TAIGA = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mega_taiga"));

    public static final Supplier<BiomeType> MEGA_TAIGA_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mega_taiga_hills"));

    public static final Supplier<BiomeType> MESA = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mesa"));

    public static final Supplier<BiomeType> MESA_PLATEAU = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mesa_plateau"));

    public static final Supplier<BiomeType> MESA_PLATEAU_FOREST = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mesa_plateau_forest"));

    public static final Supplier<BiomeType> MUSHROOM_ISLAND = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mushroom_island"));

    public static final Supplier<BiomeType> MUSHROOM_ISLAND_SHORE = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mushroom_island_shore"));

    public static final Supplier<BiomeType> OCEAN = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("ocean"));

    public static final Supplier<BiomeType> PLAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("plains"));

    public static final Supplier<BiomeType> RIVER = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("river"));

    public static final Supplier<BiomeType> ROOFED_FOREST = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("roofed_forest"));

    public static final Supplier<BiomeType> SAVANNA = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("savanna"));

    public static final Supplier<BiomeType> SAVANNA_PLATEAU = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("savanna_plateau"));

    public static final Supplier<BiomeType> SKY = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("sky"));

    public static final Supplier<BiomeType> STONE_BEACH = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("stone_beach"));

    public static final Supplier<BiomeType> SWAMPLAND = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("swampland"));

    public static final Supplier<BiomeType> TAIGA = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("taiga"));

    public static final Supplier<BiomeType> TAIGA_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("taiga_hills"));

    public static final Supplier<BiomeType> BIRCH_FOREST_HILLS_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("birch_forest_hills_mountains"));

    public static final Supplier<BiomeType> BIRCH_FOREST_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("birch_forest_mountains"));

    public static final Supplier<BiomeType> COLD_TAIGA_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("cold_taiga_mountains"));

    public static final Supplier<BiomeType> DESERT_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("desert_mountains"));

    public static final Supplier<BiomeType> EXTREME_HILLS_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("extreme_hills_mountains"));

    public static final Supplier<BiomeType> EXTREME_HILLS_PLUS_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("extreme_hills_plus_mountains"));

    public static final Supplier<BiomeType> FLOWER_FOREST = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("flower_forest"));

    public static final Supplier<BiomeType> ICE_PLAINS_SPIKES = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("ice_plains_spikes"));

    public static final Supplier<BiomeType> JUNGLE_EDGE_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("jungle_edge_mountains"));

    public static final Supplier<BiomeType> JUNGLE_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("jungle_mountains"));

    public static final Supplier<BiomeType> MEGA_SPRUCE_TAIGA = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mega_spruce_taiga"));

    public static final Supplier<BiomeType> MEGA_SPRUCE_TAIGA_HILLS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mega_spruce_taiga_hills"));

    public static final Supplier<BiomeType> MESA_BRYCE = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mesa_bryce"));

    public static final Supplier<BiomeType> MESA_PLATEAU_FOREST_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mesa_plateau_forest_mountains"));

    public static final Supplier<BiomeType> MESA_PLATEAU_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("mesa_plateau_mountains"));

    public static final Supplier<BiomeType> ROOFED_FOREST_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("roofed_forest_mountains"));

    public static final Supplier<BiomeType> SAVANNA_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("savanna_mountains"));

    public static final Supplier<BiomeType> SAVANNA_PLATEAU_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("savanna_plateau_mountains"));

    public static final Supplier<BiomeType> SUNFLOWER_PLAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("sunflower_plains"));

    public static final Supplier<BiomeType> SWAMPLAND_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("swampland_mountains"));

    public static final Supplier<BiomeType> TAIGA_MOUNTAINS = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("taiga_mountains"));

    public static final Supplier<BiomeType> VOID = Registries.BIOME_TYPE.getSupplier(ResourceKey.minecraft("void"));

    // SORTFIELDS:OFF

    private BiomeTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
