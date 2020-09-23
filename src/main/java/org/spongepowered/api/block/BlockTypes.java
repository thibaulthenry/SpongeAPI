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
package org.spongepowered.api.block;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.Registry;

import java.util.function.Supplier;

public final class BlockTypes {

    public static Registry<BlockType> REGISTRY = Sponge.getRegistryManager().get(BlockType.class);
    
    // SORTFIELDS:ON

    public static final Supplier<BlockType> ACACIA_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_button"));

    public static final Supplier<BlockType> ACACIA_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_door"));

    public static final Supplier<BlockType> ACACIA_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_fence"));

    public static final Supplier<BlockType> ACACIA_FENCE_GATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_fence_gate"));

    public static final Supplier<BlockType> ACACIA_LEAVES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_leaves"));

    public static final Supplier<BlockType> ACACIA_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_log"));

    public static final Supplier<BlockType> ACACIA_PLANKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_planks"));

    public static final Supplier<BlockType> ACACIA_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_pressure_plate"));

    public static final Supplier<BlockType> ACACIA_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_sapling"));

    public static final Supplier<BlockType> ACACIA_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_sign"));

    public static final Supplier<BlockType> ACACIA_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_slab"));

    public static final Supplier<BlockType> ACACIA_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_stairs"));

    public static final Supplier<BlockType> ACACIA_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_trapdoor"));

    public static final Supplier<BlockType> ACACIA_WALL_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_wall_sign"));

    public static final Supplier<BlockType> ACACIA_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("acacia_wood"));

    public static final Supplier<BlockType> ACTIVATOR_RAIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("activator_rail"));

    public static final Supplier<BlockType> AIR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("air"));

    public static final Supplier<BlockType> ALLIUM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("allium"));

    public static final Supplier<BlockType> ANDESITE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("andesite"));

    public static final Supplier<BlockType> ANDESITE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("andesite_slab"));

    public static final Supplier<BlockType> ANDESITE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("andesite_stairs"));

    public static final Supplier<BlockType> ANDESITE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("andesite_wall"));

    public static final Supplier<BlockType> ANVIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("anvil"));

    public static final Supplier<BlockType> ATTACHED_MELON_STEM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("attached_melon_stem"));

    public static final Supplier<BlockType> ATTACHED_PUMPKIN_STEM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("attached_pumpkin_stem"));

    public static final Supplier<BlockType> AZURE_BLUET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("azure_bluet"));

    public static final Supplier<BlockType> BAMBOO = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bamboo"));

    public static final Supplier<BlockType> BAMBOO_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bamboo_sapling"));

    public static final Supplier<BlockType> BARREL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("barrel"));

    public static final Supplier<BlockType> BARRIER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("barrier"));

    public static final Supplier<BlockType> BEACON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("beacon"));

    public static final Supplier<BlockType> BEDROCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bedrock"));

    public static final Supplier<BlockType> BEE_NEST = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bee_nest"));

    public static final Supplier<BlockType> BEEHIVE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("beehive"));

    public static final Supplier<BlockType> BEETROOTS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("beetroots"));

    public static final Supplier<BlockType> BELL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bell"));

    public static final Supplier<BlockType> BIRCH_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_button"));

    public static final Supplier<BlockType> BIRCH_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_door"));

    public static final Supplier<BlockType> BIRCH_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_fence"));

    public static final Supplier<BlockType> BIRCH_FENCE_GATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_fence_gate"));

    public static final Supplier<BlockType> BIRCH_LEAVES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_leaves"));

    public static final Supplier<BlockType> BIRCH_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_log"));

    public static final Supplier<BlockType> BIRCH_PLANKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_planks"));

    public static final Supplier<BlockType> BIRCH_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_pressure_plate"));

    public static final Supplier<BlockType> BIRCH_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_sapling"));

    public static final Supplier<BlockType> BIRCH_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_sign"));

    public static final Supplier<BlockType> BIRCH_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_slab"));

    public static final Supplier<BlockType> BIRCH_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_stairs"));

    public static final Supplier<BlockType> BIRCH_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_trapdoor"));

    public static final Supplier<BlockType> BIRCH_WALL_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_wall_sign"));

    public static final Supplier<BlockType> BIRCH_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("birch_wood"));

    public static final Supplier<BlockType> BLACK_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_banner"));

    public static final Supplier<BlockType> BLACK_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_bed"));

    public static final Supplier<BlockType> BLACK_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_carpet"));

    public static final Supplier<BlockType> BLACK_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_concrete"));

    public static final Supplier<BlockType> BLACK_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_concrete_powder"));

    public static final Supplier<BlockType> BLACK_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_glazed_terracotta"));

    public static final Supplier<BlockType> BLACK_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_shulker_box"));

    public static final Supplier<BlockType> BLACK_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_stained_glass"));

    public static final Supplier<BlockType> BLACK_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_stained_glass_pane"));

    public static final Supplier<BlockType> BLACK_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_terracotta"));

    public static final Supplier<BlockType> BLACK_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_wall_banner"));

    public static final Supplier<BlockType> BLACK_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("black_wool"));

    public static final Supplier<BlockType> BLAST_FURNACE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blast_furnace"));

    public static final Supplier<BlockType> BLUE_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_banner"));

    public static final Supplier<BlockType> BLUE_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_bed"));

    public static final Supplier<BlockType> BLUE_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_carpet"));

    public static final Supplier<BlockType> BLUE_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_concrete"));

    public static final Supplier<BlockType> BLUE_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_concrete_powder"));

    public static final Supplier<BlockType> BLUE_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_glazed_terracotta"));

    public static final Supplier<BlockType> BLUE_ICE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_ice"));

    public static final Supplier<BlockType> BLUE_ORCHID = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_orchid"));

    public static final Supplier<BlockType> BLUE_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_shulker_box"));

    public static final Supplier<BlockType> BLUE_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_stained_glass"));

    public static final Supplier<BlockType> BLUE_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_stained_glass_pane"));

    public static final Supplier<BlockType> BLUE_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_terracotta"));

    public static final Supplier<BlockType> BLUE_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_wall_banner"));

    public static final Supplier<BlockType> BLUE_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("blue_wool"));

    public static final Supplier<BlockType> BONE_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bone_block"));

    public static final Supplier<BlockType> BOOKSHELF = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bookshelf"));

    public static final Supplier<BlockType> BRAIN_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brain_coral"));

    public static final Supplier<BlockType> BRAIN_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brain_coral_block"));

    public static final Supplier<BlockType> BRAIN_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brain_coral_fan"));

    public static final Supplier<BlockType> BRAIN_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brain_coral_wall_fan"));

    public static final Supplier<BlockType> BREWING_STAND = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brewing_stand"));

    public static final Supplier<BlockType> BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bricks"));

    public static final Supplier<BlockType> BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brick_slab"));

    public static final Supplier<BlockType> BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brick_stairs"));

    public static final Supplier<BlockType> BRICK_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brick_wall"));

    public static final Supplier<BlockType> BROWN_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_banner"));

    public static final Supplier<BlockType> BROWN_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_bed"));

    public static final Supplier<BlockType> BROWN_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_carpet"));

    public static final Supplier<BlockType> BROWN_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_concrete"));

    public static final Supplier<BlockType> BROWN_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_concrete_powder"));

    public static final Supplier<BlockType> BROWN_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_glazed_terracotta"));

    public static final Supplier<BlockType> BROWN_MUSHROOM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_mushroom"));

    public static final Supplier<BlockType> BROWN_MUSHROOM_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_mushroom_block"));

    public static final Supplier<BlockType> BROWN_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_shulker_box"));

    public static final Supplier<BlockType> BROWN_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_stained_glass"));

    public static final Supplier<BlockType> BROWN_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_stained_glass_pane"));

    public static final Supplier<BlockType> BROWN_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_terracotta"));

    public static final Supplier<BlockType> BROWN_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_wall_banner"));

    public static final Supplier<BlockType> BROWN_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("brown_wool"));

    public static final Supplier<BlockType> BUBBLE_COLUMN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bubble_column"));

    public static final Supplier<BlockType> BUBBLE_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bubble_coral"));

    public static final Supplier<BlockType> BUBBLE_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bubble_coral_block"));

    public static final Supplier<BlockType> BUBBLE_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bubble_coral_fan"));

    public static final Supplier<BlockType> BUBBLE_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("bubble_coral_wall_fan"));

    public static final Supplier<BlockType> CACTUS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cactus"));

    public static final Supplier<BlockType> CAKE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cake"));

    public static final Supplier<BlockType> CAMPFIRE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("campfire"));

    public static final Supplier<BlockType> CARROTS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("carrots"));

    public static final Supplier<BlockType> CARTOGRAPHY_TABLE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cartography_table"));

    public static final Supplier<BlockType> CARVED_PUMPKIN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("carved_pumpkin"));

    public static final Supplier<BlockType> CAULDRON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cauldron"));

    public static final Supplier<BlockType> CAVE_AIR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cave_air"));

    public static final Supplier<BlockType> CHAIN_COMMAND_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chain_command_block"));

    public static final Supplier<BlockType> CHEST = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chest"));

    public static final Supplier<BlockType> CHIPPED_ANVIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chipped_anvil"));

    public static final Supplier<BlockType> CHISELED_QUARTZ_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chiseled_quartz_block"));

    public static final Supplier<BlockType> CHISELED_RED_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chiseled_red_sandstone"));

    public static final Supplier<BlockType> CHISELED_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chiseled_sandstone"));

    public static final Supplier<BlockType> CHISELED_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chiseled_stone_bricks"));

    public static final Supplier<BlockType> CHORUS_FLOWER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chorus_flower"));

    public static final Supplier<BlockType> CHORUS_PLANT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("chorus_plant"));

    public static final Supplier<BlockType> CLAY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("clay"));

    public static final Supplier<BlockType> COAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("coal_block"));

    public static final Supplier<BlockType> COAL_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("coal_ore"));

    public static final Supplier<BlockType> COARSE_DIRT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("coarse_dirt"));

    public static final Supplier<BlockType> COBBLESTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cobblestone"));

    public static final Supplier<BlockType> COBBLESTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cobblestone_slab"));

    public static final Supplier<BlockType> COBBLESTONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cobblestone_stairs"));

    public static final Supplier<BlockType> COBBLESTONE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cobblestone_wall"));

    public static final Supplier<BlockType> COBWEB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cobweb"));

    public static final Supplier<BlockType> COCOA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cocoa"));

    public static final Supplier<BlockType> COMMAND_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("command_block"));

    public static final Supplier<BlockType> COMPARATOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("comparator"));

    public static final Supplier<BlockType> COMPOSTER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("composter"));

    public static final Supplier<BlockType> CONDUIT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("conduit"));

    public static final Supplier<BlockType> CORNFLOWER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cornflower"));

    public static final Supplier<BlockType> CRACKED_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cracked_stone_bricks"));

    public static final Supplier<BlockType> CRAFTING_TABLE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("crafting_table"));

    public static final Supplier<BlockType> CREEPER_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("creeper_head"));

    public static final Supplier<BlockType> CREEPER_WALL_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("creeper_wall_head"));

    public static final Supplier<BlockType> CUT_RED_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cut_red_sandstone"));

    public static final Supplier<BlockType> CUT_RED_SANDSTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cut_red_sandstone_slab"));

    public static final Supplier<BlockType> CUT_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cut_sandstone"));

    public static final Supplier<BlockType> CUT_SANDSTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cut_sandstone_slab"));

    public static final Supplier<BlockType> CYAN_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_banner"));

    public static final Supplier<BlockType> CYAN_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_bed"));

    public static final Supplier<BlockType> CYAN_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_carpet"));

    public static final Supplier<BlockType> CYAN_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_concrete"));

    public static final Supplier<BlockType> CYAN_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_concrete_powder"));

    public static final Supplier<BlockType> CYAN_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_glazed_terracotta"));

    public static final Supplier<BlockType> CYAN_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_shulker_box"));

    public static final Supplier<BlockType> CYAN_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_stained_glass"));

    public static final Supplier<BlockType> CYAN_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_stained_glass_pane"));

    public static final Supplier<BlockType> CYAN_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_terracotta"));

    public static final Supplier<BlockType> CYAN_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_wall_banner"));

    public static final Supplier<BlockType> CYAN_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("cyan_wool"));

    public static final Supplier<BlockType> DAMAGED_ANVIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("damaged_anvil"));

    public static final Supplier<BlockType> DANDELION = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dandelion"));

    public static final Supplier<BlockType> DARK_OAK_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_button"));

    public static final Supplier<BlockType> DARK_OAK_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_door"));

    public static final Supplier<BlockType> DARK_OAK_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_fence"));

    public static final Supplier<BlockType> DARK_OAK_FENCE_GATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_fence_gate"));

    public static final Supplier<BlockType> DARK_OAK_LEAVES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_leaves"));

    public static final Supplier<BlockType> DARK_OAK_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_log"));

    public static final Supplier<BlockType> DARK_OAK_PLANKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_planks"));

    public static final Supplier<BlockType> DARK_OAK_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_pressure_plate"));

    public static final Supplier<BlockType> DARK_OAK_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_sapling"));

    public static final Supplier<BlockType> DARK_OAK_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_sign"));

    public static final Supplier<BlockType> DARK_OAK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_slab"));

    public static final Supplier<BlockType> DARK_OAK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_stairs"));

    public static final Supplier<BlockType> DARK_OAK_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_trapdoor"));

    public static final Supplier<BlockType> DARK_OAK_WALL_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_wall_sign"));

    public static final Supplier<BlockType> DARK_OAK_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_oak_wood"));

    public static final Supplier<BlockType> DARK_PRISMARINE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_prismarine"));

    public static final Supplier<BlockType> DARK_PRISMARINE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_prismarine_slab"));

    public static final Supplier<BlockType> DARK_PRISMARINE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dark_prismarine_stairs"));

    public static final Supplier<BlockType> DAYLIGHT_DETECTOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("daylight_detector"));

    public static final Supplier<BlockType> DEAD_BRAIN_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_brain_coral"));

    public static final Supplier<BlockType> DEAD_BRAIN_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_brain_coral_block"));

    public static final Supplier<BlockType> DEAD_BRAIN_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_brain_coral_fan"));

    public static final Supplier<BlockType> DEAD_BRAIN_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_brain_coral_wall_fan"));

    public static final Supplier<BlockType> DEAD_BUBBLE_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_bubble_coral"));

    public static final Supplier<BlockType> DEAD_BUBBLE_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_bubble_coral_block"));

    public static final Supplier<BlockType> DEAD_BUBBLE_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_bubble_coral_fan"));

    public static final Supplier<BlockType> DEAD_BUBBLE_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_bubble_coral_wall_fan"));

    public static final Supplier<BlockType> DEAD_BUSH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_bush"));

    public static final Supplier<BlockType> DEAD_FIRE_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_fire_coral"));

    public static final Supplier<BlockType> DEAD_FIRE_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_fire_coral_block"));

    public static final Supplier<BlockType> DEAD_FIRE_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_fire_coral_fan"));

    public static final Supplier<BlockType> DEAD_FIRE_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_fire_coral_wall_fan"));

    public static final Supplier<BlockType> DEAD_HORN_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_horn_coral"));

    public static final Supplier<BlockType> DEAD_HORN_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_horn_coral_block"));

    public static final Supplier<BlockType> DEAD_HORN_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_horn_coral_fan"));

    public static final Supplier<BlockType> DEAD_HORN_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_horn_coral_wall_fan"));

    public static final Supplier<BlockType> DEAD_TUBE_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_tube_coral"));

    public static final Supplier<BlockType> DEAD_TUBE_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_tube_coral_block"));

    public static final Supplier<BlockType> DEAD_TUBE_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_tube_coral_fan"));

    public static final Supplier<BlockType> DEAD_TUBE_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dead_tube_coral_wall_fan"));

    public static final Supplier<BlockType> DETECTOR_RAIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("detector_rail"));

    public static final Supplier<BlockType> DIAMOND_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("diamond_block"));

    public static final Supplier<BlockType> DIAMOND_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("diamond_ore"));

    public static final Supplier<BlockType> DIORITE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("diorite"));

    public static final Supplier<BlockType> DIORITE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("diorite_slab"));

    public static final Supplier<BlockType> DIORITE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("diorite_stairs"));

    public static final Supplier<BlockType> DIORITE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("diorite_wall"));

    public static final Supplier<BlockType> DIRT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dirt"));

    public static final Supplier<BlockType> DISPENSER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dispenser"));

    public static final Supplier<BlockType> DRAGON_EGG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dragon_egg"));

    public static final Supplier<BlockType> DRAGON_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dragon_head"));

    public static final Supplier<BlockType> DRAGON_WALL_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dragon_wall_head"));

    public static final Supplier<BlockType> DRIED_KELP_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dried_kelp_block"));

    public static final Supplier<BlockType> DROPPER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("dropper"));

    public static final Supplier<BlockType> EMERALD_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("emerald_block"));

    public static final Supplier<BlockType> EMERALD_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("emerald_ore"));

    public static final Supplier<BlockType> ENCHANTING_TABLE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("enchanting_table"));

    public static final Supplier<BlockType> ENDER_CHEST = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("ender_chest"));

    public static final Supplier<BlockType> END_GATEWAY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_gateway"));

    public static final Supplier<BlockType> END_PORTAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_portal"));

    public static final Supplier<BlockType> END_PORTAL_FRAME = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_portal_frame"));

    public static final Supplier<BlockType> END_ROD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_rod"));

    public static final Supplier<BlockType> END_STONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_stone"));

    public static final Supplier<BlockType> END_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_stone_bricks"));

    public static final Supplier<BlockType> END_STONE_BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_stone_brick_slab"));

    public static final Supplier<BlockType> END_STONE_BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_stone_brick_stairs"));

    public static final Supplier<BlockType> END_STONE_BRICK_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall"));

    public static final Supplier<BlockType> FARMLAND = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("farmland"));

    public static final Supplier<BlockType> FERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fern"));

    public static final Supplier<BlockType> FIRE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fire"));

    public static final Supplier<BlockType> FIRE_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fire_coral"));

    public static final Supplier<BlockType> FIRE_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fire_coral_block"));

    public static final Supplier<BlockType> FIRE_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fire_coral_fan"));

    public static final Supplier<BlockType> FIRE_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fire_coral_wall_fan"));

    public static final Supplier<BlockType> FLETCHING_TABLE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("fletching_table"));

    public static final Supplier<BlockType> FLOWER_POT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("flower_pot"));

    public static final Supplier<BlockType> FROSTED_ICE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("frosted_ice"));

    public static final Supplier<BlockType> FURNACE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("furnace"));

    public static final Supplier<BlockType> GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("glass"));

    public static final Supplier<BlockType> GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("glass_pane"));

    public static final Supplier<BlockType> GLOWSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("glowstone"));

    public static final Supplier<BlockType> GOLD_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gold_block"));

    public static final Supplier<BlockType> GOLD_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gold_ore"));

    public static final Supplier<BlockType> GRANITE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("granite"));

    public static final Supplier<BlockType> GRANITE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("granite_slab"));

    public static final Supplier<BlockType> GRANITE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("granite_stairs"));

    public static final Supplier<BlockType> GRANITE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("granite_wall"));

    public static final Supplier<BlockType> GRASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("grass"));

    public static final Supplier<BlockType> GRASS_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("grass_block"));

    public static final Supplier<BlockType> GRASS_PATH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("grass_path"));

    public static final Supplier<BlockType> GRAVEL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gravel"));

    public static final Supplier<BlockType> GRAY_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_banner"));

    public static final Supplier<BlockType> GRAY_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_bed"));

    public static final Supplier<BlockType> GRAY_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_carpet"));

    public static final Supplier<BlockType> GRAY_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_concrete"));

    public static final Supplier<BlockType> GRAY_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_concrete_powder"));

    public static final Supplier<BlockType> GRAY_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_glazed_terracotta"));

    public static final Supplier<BlockType> GRAY_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_shulker_box"));

    public static final Supplier<BlockType> GRAY_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_stained_glass"));

    public static final Supplier<BlockType> GRAY_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_stained_glass_pane"));

    public static final Supplier<BlockType> GRAY_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_terracotta"));

    public static final Supplier<BlockType> GRAY_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_wall_banner"));

    public static final Supplier<BlockType> GRAY_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("gray_wool"));

    public static final Supplier<BlockType> GREEN_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_banner"));

    public static final Supplier<BlockType> GREEN_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_bed"));

    public static final Supplier<BlockType> GREEN_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_carpet"));

    public static final Supplier<BlockType> GREEN_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_concrete"));

    public static final Supplier<BlockType> GREEN_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_concrete_powder"));

    public static final Supplier<BlockType> GREEN_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_glazed_terracotta"));

    public static final Supplier<BlockType> GREEN_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_shulker_box"));

    public static final Supplier<BlockType> GREEN_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_stained_glass"));

    public static final Supplier<BlockType> GREEN_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_stained_glass_pane"));

    public static final Supplier<BlockType> GREEN_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_terracotta"));

    public static final Supplier<BlockType> GREEN_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_wall_banner"));

    public static final Supplier<BlockType> GREEN_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("green_wool"));

    public static final Supplier<BlockType> GRINDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("grindstone"));

    public static final Supplier<BlockType> HAY_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("hay_block"));

    public static final Supplier<BlockType> HEAVY_WEIGHTED_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("heavy_weighted_pressure_plate"));

    public static final Supplier<BlockType> HONEY_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("honey_block"));

    public static final Supplier<BlockType> HONEYCOMB_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("honeycomb_block"));

    public static final Supplier<BlockType> HOPPER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("hopper"));

    public static final Supplier<BlockType> HORN_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("horn_coral"));

    public static final Supplier<BlockType> HORN_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("horn_coral_block"));

    public static final Supplier<BlockType> HORN_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("horn_coral_fan"));

    public static final Supplier<BlockType> HORN_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("horn_coral_wall_fan"));

    public static final Supplier<BlockType> ICE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("ice"));

    public static final Supplier<BlockType> INFESTED_CHISELED_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("infested_chiseled_stone_bricks"));

    public static final Supplier<BlockType> INFESTED_COBBLESTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("infested_cobblestone"));

    public static final Supplier<BlockType> INFESTED_CRACKED_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("infested_cracked_stone_bricks"));

    public static final Supplier<BlockType> INFESTED_MOSSY_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("infested_mossy_stone_bricks"));

    public static final Supplier<BlockType> INFESTED_STONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("infested_stone"));

    public static final Supplier<BlockType> INFESTED_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("infested_stone_bricks"));

    public static final Supplier<BlockType> IRON_BARS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("iron_bars"));

    public static final Supplier<BlockType> IRON_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("iron_block"));

    public static final Supplier<BlockType> IRON_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("iron_door"));

    public static final Supplier<BlockType> IRON_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("iron_ore"));

    public static final Supplier<BlockType> IRON_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("iron_trapdoor"));

    public static final Supplier<BlockType> JACK_O_LANTERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jack_o_lantern"));

    public static final Supplier<BlockType> JIGSAW = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jigsaw"));

    public static final Supplier<BlockType> JUKEBOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jukebox"));

    public static final Supplier<BlockType> JUNGLE_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_button"));

    public static final Supplier<BlockType> JUNGLE_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_door"));

    public static final Supplier<BlockType> JUNGLE_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_fence"));

    public static final Supplier<BlockType> JUNGLE_FENCE_GATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_fence_gate"));

    public static final Supplier<BlockType> JUNGLE_LEAVES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_leaves"));

    public static final Supplier<BlockType> JUNGLE_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_log"));

    public static final Supplier<BlockType> JUNGLE_PLANKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_planks"));

    public static final Supplier<BlockType> JUNGLE_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_pressure_plate"));

    public static final Supplier<BlockType> JUNGLE_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_sapling"));

    public static final Supplier<BlockType> JUNGLE_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_sign"));

    public static final Supplier<BlockType> JUNGLE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_slab"));

    public static final Supplier<BlockType> JUNGLE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_stairs"));

    public static final Supplier<BlockType> JUNGLE_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_trapdoor"));

    public static final Supplier<BlockType> JUNGLE_WALL_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_wall_sign"));

    public static final Supplier<BlockType> JUNGLE_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("jungle_wood"));

    public static final Supplier<BlockType> KELP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("kelp"));

    public static final Supplier<BlockType> KELP_PLANT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("kelp_plant"));

    public static final Supplier<BlockType> LADDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("ladder"));

    public static final Supplier<BlockType> LANTERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lantern"));

    public static final Supplier<BlockType> LAPIS_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lapis_block"));

    public static final Supplier<BlockType> LAPIS_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lapis_ore"));

    public static final Supplier<BlockType> LARGE_FERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("large_fern"));

    public static final Supplier<BlockType> LAVA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lava"));

    public static final Supplier<BlockType> LECTERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lectern"));

    public static final Supplier<BlockType> LEVER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lever"));

    public static final Supplier<BlockType> LIGHT_BLUE_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_banner"));

    public static final Supplier<BlockType> LIGHT_BLUE_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_bed"));

    public static final Supplier<BlockType> LIGHT_BLUE_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_carpet"));

    public static final Supplier<BlockType> LIGHT_BLUE_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_concrete"));

    public static final Supplier<BlockType> LIGHT_BLUE_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_concrete_powder"));

    public static final Supplier<BlockType> LIGHT_BLUE_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_glazed_terracotta"));

    public static final Supplier<BlockType> LIGHT_BLUE_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_shulker_box"));

    public static final Supplier<BlockType> LIGHT_BLUE_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass"));

    public static final Supplier<BlockType> LIGHT_BLUE_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass_pane"));

    public static final Supplier<BlockType> LIGHT_BLUE_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_terracotta"));

    public static final Supplier<BlockType> LIGHT_BLUE_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_wall_banner"));

    public static final Supplier<BlockType> LIGHT_BLUE_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_blue_wool"));

    public static final Supplier<BlockType> LIGHT_GRAY_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_banner"));

    public static final Supplier<BlockType> LIGHT_GRAY_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_bed"));

    public static final Supplier<BlockType> LIGHT_GRAY_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_carpet"));

    public static final Supplier<BlockType> LIGHT_GRAY_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_concrete"));

    public static final Supplier<BlockType> LIGHT_GRAY_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_concrete_powder"));

    public static final Supplier<BlockType> LIGHT_GRAY_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_glazed_terracotta"));

    public static final Supplier<BlockType> LIGHT_GRAY_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_shulker_box"));

    public static final Supplier<BlockType> LIGHT_GRAY_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass"));

    public static final Supplier<BlockType> LIGHT_GRAY_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass_pane"));

    public static final Supplier<BlockType> LIGHT_GRAY_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_terracotta"));

    public static final Supplier<BlockType> LIGHT_GRAY_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_wall_banner"));

    public static final Supplier<BlockType> LIGHT_GRAY_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_gray_wool"));

    public static final Supplier<BlockType> LIGHT_WEIGHTED_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("light_weighted_pressure_plate"));

    public static final Supplier<BlockType> LILAC = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lilac"));

    public static final Supplier<BlockType> LILY_OF_THE_VALLEY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lily_of_the_valley"));

    public static final Supplier<BlockType> LILY_PAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lily_pad"));

    public static final Supplier<BlockType> LIME_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_banner"));

    public static final Supplier<BlockType> LIME_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_bed"));

    public static final Supplier<BlockType> LIME_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_carpet"));

    public static final Supplier<BlockType> LIME_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_concrete"));

    public static final Supplier<BlockType> LIME_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_concrete_powder"));

    public static final Supplier<BlockType> LIME_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_glazed_terracotta"));

    public static final Supplier<BlockType> LIME_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_shulker_box"));

    public static final Supplier<BlockType> LIME_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_stained_glass"));

    public static final Supplier<BlockType> LIME_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_stained_glass_pane"));

    public static final Supplier<BlockType> LIME_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_terracotta"));

    public static final Supplier<BlockType> LIME_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_wall_banner"));

    public static final Supplier<BlockType> LIME_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("lime_wool"));

    public static final Supplier<BlockType> LOOM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("loom"));

    public static final Supplier<BlockType> MAGENTA_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_banner"));

    public static final Supplier<BlockType> MAGENTA_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_bed"));

    public static final Supplier<BlockType> MAGENTA_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_carpet"));

    public static final Supplier<BlockType> MAGENTA_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_concrete"));

    public static final Supplier<BlockType> MAGENTA_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_concrete_powder"));

    public static final Supplier<BlockType> MAGENTA_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_glazed_terracotta"));

    public static final Supplier<BlockType> MAGENTA_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_shulker_box"));

    public static final Supplier<BlockType> MAGENTA_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_stained_glass"));

    public static final Supplier<BlockType> MAGENTA_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_stained_glass_pane"));

    public static final Supplier<BlockType> MAGENTA_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_terracotta"));

    public static final Supplier<BlockType> MAGENTA_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_wall_banner"));

    public static final Supplier<BlockType> MAGENTA_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magenta_wool"));

    public static final Supplier<BlockType> MAGMA_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("magma_block"));

    public static final Supplier<BlockType> MELON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("melon"));

    public static final Supplier<BlockType> MELON_STEM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("melon_stem"));

    public static final Supplier<BlockType> MOSSY_COBBLESTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_cobblestone"));

    public static final Supplier<BlockType> MOSSY_COBBLESTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_slab"));

    public static final Supplier<BlockType> MOSSY_COBBLESTONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_stairs"));

    public static final Supplier<BlockType> MOSSY_COBBLESTONE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall"));

    public static final Supplier<BlockType> MOSSY_STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_stone_bricks"));

    public static final Supplier<BlockType> MOSSY_STONE_BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_slab"));

    public static final Supplier<BlockType> MOSSY_STONE_BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_stairs"));

    public static final Supplier<BlockType> MOSSY_STONE_BRICK_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall"));

    public static final Supplier<BlockType> MOVING_PISTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("moving_piston"));

    public static final Supplier<BlockType> MUSHROOM_STEM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mushroom_stem"));

    public static final Supplier<BlockType> MYCELIUM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("mycelium"));

    public static final Supplier<BlockType> NETHERRACK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("netherrack"));

    public static final Supplier<BlockType> NETHER_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_bricks"));

    public static final Supplier<BlockType> NETHER_BRICK_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_brick_fence"));

    public static final Supplier<BlockType> NETHER_BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_brick_slab"));

    public static final Supplier<BlockType> NETHER_BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_brick_stairs"));

    public static final Supplier<BlockType> NETHER_BRICK_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_brick_wall"));

    public static final Supplier<BlockType> NETHER_PORTAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_portal"));

    public static final Supplier<BlockType> NETHER_QUARTZ_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_quartz_ore"));

    public static final Supplier<BlockType> NETHER_WART = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_wart"));

    public static final Supplier<BlockType> NETHER_WART_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("nether_wart_block"));

    public static final Supplier<BlockType> NOTE_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("note_block"));

    public static final Supplier<BlockType> OAK_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_button"));

    public static final Supplier<BlockType> OAK_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_door"));

    public static final Supplier<BlockType> OAK_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_fence"));

    public static final Supplier<BlockType> OAK_FENCE_GATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_fence_gate"));

    public static final Supplier<BlockType> OAK_LEAVES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_leaves"));

    public static final Supplier<BlockType> OAK_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_log"));

    public static final Supplier<BlockType> OAK_PLANKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_planks"));

    public static final Supplier<BlockType> OAK_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_pressure_plate"));

    public static final Supplier<BlockType> OAK_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_sapling"));

    public static final Supplier<BlockType> OAK_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_sign"));

    public static final Supplier<BlockType> OAK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_slab"));

    public static final Supplier<BlockType> OAK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_stairs"));

    public static final Supplier<BlockType> OAK_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_trapdoor"));

    public static final Supplier<BlockType> OAK_WALL_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_wall_sign"));

    public static final Supplier<BlockType> OAK_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oak_wood"));

    public static final Supplier<BlockType> OBSERVER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("observer"));

    public static final Supplier<BlockType> OBSIDIAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("obsidian"));

    public static final Supplier<BlockType> ORANGE_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_banner"));

    public static final Supplier<BlockType> ORANGE_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_bed"));

    public static final Supplier<BlockType> ORANGE_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_carpet"));

    public static final Supplier<BlockType> ORANGE_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_concrete"));

    public static final Supplier<BlockType> ORANGE_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_concrete_powder"));

    public static final Supplier<BlockType> ORANGE_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_glazed_terracotta"));

    public static final Supplier<BlockType> ORANGE_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_shulker_box"));

    public static final Supplier<BlockType> ORANGE_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_stained_glass"));

    public static final Supplier<BlockType> ORANGE_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_stained_glass_pane"));

    public static final Supplier<BlockType> ORANGE_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_terracotta"));

    public static final Supplier<BlockType> ORANGE_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_tulip"));

    public static final Supplier<BlockType> ORANGE_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_wall_banner"));

    public static final Supplier<BlockType> ORANGE_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("orange_wool"));

    public static final Supplier<BlockType> OXEYE_DAISY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("oxeye_daisy"));

    public static final Supplier<BlockType> PACKED_ICE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("packed_ice"));

    public static final Supplier<BlockType> PEONY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("peony"));

    public static final Supplier<BlockType> PETRIFIED_OAK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("petrified_oak_slab"));

    public static final Supplier<BlockType> PINK_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_banner"));

    public static final Supplier<BlockType> PINK_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_bed"));

    public static final Supplier<BlockType> PINK_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_carpet"));

    public static final Supplier<BlockType> PINK_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_concrete"));

    public static final Supplier<BlockType> PINK_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_concrete_powder"));

    public static final Supplier<BlockType> PINK_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_glazed_terracotta"));

    public static final Supplier<BlockType> PINK_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_shulker_box"));

    public static final Supplier<BlockType> PINK_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_stained_glass"));

    public static final Supplier<BlockType> PINK_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_stained_glass_pane"));

    public static final Supplier<BlockType> PINK_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_terracotta"));

    public static final Supplier<BlockType> PINK_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_tulip"));

    public static final Supplier<BlockType> PINK_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_wall_banner"));

    public static final Supplier<BlockType> PINK_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pink_wool"));

    public static final Supplier<BlockType> PISTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("piston"));

    public static final Supplier<BlockType> PISTON_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("piston_head"));

    public static final Supplier<BlockType> PLAYER_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("player_head"));

    public static final Supplier<BlockType> PLAYER_WALL_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("player_wall_head"));

    public static final Supplier<BlockType> PODZOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("podzol"));

    public static final Supplier<BlockType> POLISHED_ANDESITE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_andesite"));

    public static final Supplier<BlockType> POLISHED_ANDESITE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_andesite_slab"));

    public static final Supplier<BlockType> POLISHED_ANDESITE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_andesite_stairs"));

    public static final Supplier<BlockType> POLISHED_DIORITE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_diorite"));

    public static final Supplier<BlockType> POLISHED_DIORITE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_diorite_slab"));

    public static final Supplier<BlockType> POLISHED_DIORITE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_diorite_stairs"));

    public static final Supplier<BlockType> POLISHED_GRANITE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_granite"));

    public static final Supplier<BlockType> POLISHED_GRANITE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_granite_slab"));

    public static final Supplier<BlockType> POLISHED_GRANITE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("polished_granite_stairs"));

    public static final Supplier<BlockType> POPPY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("poppy"));

    public static final Supplier<BlockType> POTATOES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potatoes"));

    public static final Supplier<BlockType> POTTED_ACACIA_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_acacia_sapling"));

    public static final Supplier<BlockType> POTTED_ALLIUM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_allium"));

    public static final Supplier<BlockType> POTTED_AZURE_BLUET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_azure_bluet"));

    public static final Supplier<BlockType> POTTED_BAMBOO = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_bamboo"));

    public static final Supplier<BlockType> POTTED_BIRCH_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_birch_sapling"));

    public static final Supplier<BlockType> POTTED_BLUE_ORCHID = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_blue_orchid"));

    public static final Supplier<BlockType> POTTED_BROWN_MUSHROOM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_brown_mushroom"));

    public static final Supplier<BlockType> POTTED_CACTUS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_cactus"));

    public static final Supplier<BlockType> POTTED_CORNFLOWER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_cornflower"));

    public static final Supplier<BlockType> POTTED_DANDELION = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_dandelion"));

    public static final Supplier<BlockType> POTTED_DARK_OAK_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_dark_oak_sapling"));

    public static final Supplier<BlockType> POTTED_DEAD_BUSH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_dead_bush"));

    public static final Supplier<BlockType> POTTED_FERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_fern"));

    public static final Supplier<BlockType> POTTED_JUNGLE_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_jungle_sapling"));

    public static final Supplier<BlockType> POTTED_LILY_OF_THE_VALLEY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_lily_of_the_valley"));

    public static final Supplier<BlockType> POTTED_OAK_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_oak_sapling"));

    public static final Supplier<BlockType> POTTED_ORANGE_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_orange_tulip"));

    public static final Supplier<BlockType> POTTED_OXEYE_DAISY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_oxeye_daisy"));

    public static final Supplier<BlockType> POTTED_PINK_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_pink_tulip"));

    public static final Supplier<BlockType> POTTED_POPPY = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_poppy"));

    public static final Supplier<BlockType> POTTED_RED_MUSHROOM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_red_mushroom"));

    public static final Supplier<BlockType> POTTED_RED_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_red_tulip"));

    public static final Supplier<BlockType> POTTED_SPRUCE_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_spruce_sapling"));

    public static final Supplier<BlockType> POTTED_WHITE_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_white_tulip"));

    public static final Supplier<BlockType> POTTED_WITHER_ROSE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("potted_wither_rose"));

    public static final Supplier<BlockType> POWERED_RAIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("powered_rail"));

    public static final Supplier<BlockType> PRISMARINE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine"));

    public static final Supplier<BlockType> PRISMARINE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine_bricks"));

    public static final Supplier<BlockType> PRISMARINE_BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine_brick_slab"));

    public static final Supplier<BlockType> PRISMARINE_BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine_brick_stairs"));

    public static final Supplier<BlockType> PRISMARINE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine_slab"));

    public static final Supplier<BlockType> PRISMARINE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine_stairs"));

    public static final Supplier<BlockType> PRISMARINE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("prismarine_wall"));

    public static final Supplier<BlockType> PUMPKIN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pumpkin"));

    public static final Supplier<BlockType> PUMPKIN_STEM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("pumpkin_stem"));

    public static final Supplier<BlockType> PURPLE_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_banner"));

    public static final Supplier<BlockType> PURPLE_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_bed"));

    public static final Supplier<BlockType> PURPLE_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_carpet"));

    public static final Supplier<BlockType> PURPLE_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_concrete"));

    public static final Supplier<BlockType> PURPLE_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_concrete_powder"));

    public static final Supplier<BlockType> PURPLE_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_glazed_terracotta"));

    public static final Supplier<BlockType> PURPLE_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_shulker_box"));

    public static final Supplier<BlockType> PURPLE_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_stained_glass"));

    public static final Supplier<BlockType> PURPLE_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_stained_glass_pane"));

    public static final Supplier<BlockType> PURPLE_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_terracotta"));

    public static final Supplier<BlockType> PURPLE_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_wall_banner"));

    public static final Supplier<BlockType> PURPLE_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purple_wool"));

    public static final Supplier<BlockType> PURPUR_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purpur_block"));

    public static final Supplier<BlockType> PURPUR_PILLAR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purpur_pillar"));

    public static final Supplier<BlockType> PURPUR_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purpur_slab"));

    public static final Supplier<BlockType> PURPUR_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("purpur_stairs"));

    public static final Supplier<BlockType> QUARTZ_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("quartz_block"));

    public static final Supplier<BlockType> QUARTZ_PILLAR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("quartz_pillar"));

    public static final Supplier<BlockType> QUARTZ_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("quartz_slab"));

    public static final Supplier<BlockType> QUARTZ_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("quartz_stairs"));

    public static final Supplier<BlockType> RAIL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("rail"));

    public static final Supplier<BlockType> REDSTONE_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("redstone_block"));

    public static final Supplier<BlockType> REDSTONE_LAMP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("redstone_lamp"));

    public static final Supplier<BlockType> REDSTONE_ORE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("redstone_ore"));

    public static final Supplier<BlockType> REDSTONE_TORCH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("redstone_torch"));

    public static final Supplier<BlockType> REDSTONE_WALL_TORCH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("redstone_wall_torch"));

    public static final Supplier<BlockType> REDSTONE_WIRE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("redstone_wire"));

    public static final Supplier<BlockType> RED_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_banner"));

    public static final Supplier<BlockType> RED_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_bed"));

    public static final Supplier<BlockType> RED_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_carpet"));

    public static final Supplier<BlockType> RED_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_concrete"));

    public static final Supplier<BlockType> RED_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_concrete_powder"));

    public static final Supplier<BlockType> RED_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_glazed_terracotta"));

    public static final Supplier<BlockType> RED_MUSHROOM = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_mushroom"));

    public static final Supplier<BlockType> RED_MUSHROOM_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_mushroom_block"));

    public static final Supplier<BlockType> RED_NETHER_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_nether_bricks"));

    public static final Supplier<BlockType> RED_NETHER_BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_nether_brick_slab"));

    public static final Supplier<BlockType> RED_NETHER_BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_nether_brick_stairs"));

    public static final Supplier<BlockType> RED_NETHER_BRICK_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall"));

    public static final Supplier<BlockType> RED_SAND = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_sand"));

    public static final Supplier<BlockType> RED_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_sandstone"));

    public static final Supplier<BlockType> RED_SANDSTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_sandstone_slab"));

    public static final Supplier<BlockType> RED_SANDSTONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_sandstone_stairs"));

    public static final Supplier<BlockType> RED_SANDSTONE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_sandstone_wall"));

    public static final Supplier<BlockType> RED_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_shulker_box"));

    public static final Supplier<BlockType> RED_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_stained_glass"));

    public static final Supplier<BlockType> RED_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_stained_glass_pane"));

    public static final Supplier<BlockType> RED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_terracotta"));

    public static final Supplier<BlockType> RED_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_tulip"));

    public static final Supplier<BlockType> RED_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_wall_banner"));

    public static final Supplier<BlockType> RED_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("red_wool"));

    public static final Supplier<BlockType> REPEATER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("repeater"));

    public static final Supplier<BlockType> REPEATING_COMMAND_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("repeating_command_block"));

    public static final Supplier<BlockType> ROSE_BUSH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("rose_bush"));

    public static final Supplier<BlockType> SAND = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sand"));

    public static final Supplier<BlockType> SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sandstone"));

    public static final Supplier<BlockType> SANDSTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sandstone_slab"));

    public static final Supplier<BlockType> SANDSTONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sandstone_stairs"));

    public static final Supplier<BlockType> SANDSTONE_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sandstone_wall"));

    public static final Supplier<BlockType> SCAFFOLDING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("scaffolding"));

    public static final Supplier<BlockType> SEAGRASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("seagrass"));

    public static final Supplier<BlockType> SEA_LANTERN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sea_lantern"));

    public static final Supplier<BlockType> SEA_PICKLE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sea_pickle"));

    public static final Supplier<BlockType> SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("shulker_box"));

    public static final Supplier<BlockType> SKELETON_SKULL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("skeleton_skull"));

    public static final Supplier<BlockType> SKELETON_WALL_SKULL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("skeleton_wall_skull"));

    public static final Supplier<BlockType> SLIME_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("slime_block"));

    public static final Supplier<BlockType> SMITHING_TABLE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smithing_table"));

    public static final Supplier<BlockType> SMOKER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smoker"));

    public static final Supplier<BlockType> SMOOTH_QUARTZ = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_quartz"));

    public static final Supplier<BlockType> SMOOTH_QUARTZ_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_quartz_slab"));

    public static final Supplier<BlockType> SMOOTH_QUARTZ_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_quartz_stairs"));

    public static final Supplier<BlockType> SMOOTH_RED_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_red_sandstone"));

    public static final Supplier<BlockType> SMOOTH_RED_SANDSTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_red_sandstone_slab"));

    public static final Supplier<BlockType> SMOOTH_RED_SANDSTONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_red_sandstone_stairs"));

    public static final Supplier<BlockType> SMOOTH_SANDSTONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_sandstone"));

    public static final Supplier<BlockType> SMOOTH_SANDSTONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_sandstone_slab"));

    public static final Supplier<BlockType> SMOOTH_SANDSTONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_sandstone_stairs"));

    public static final Supplier<BlockType> SMOOTH_STONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_stone"));

    public static final Supplier<BlockType> SMOOTH_STONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("smooth_stone_slab"));

    public static final Supplier<BlockType> SNOW = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("snow"));

    public static final Supplier<BlockType> SNOW_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("snow_block"));

    public static final Supplier<BlockType> SOUL_SAND = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("soul_sand"));

    public static final Supplier<BlockType> SPAWNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spawner"));

    public static final Supplier<BlockType> SPONGE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sponge"));

    public static final Supplier<BlockType> SPRUCE_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_button"));

    public static final Supplier<BlockType> SPRUCE_DOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_door"));

    public static final Supplier<BlockType> SPRUCE_FENCE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_fence"));

    public static final Supplier<BlockType> SPRUCE_FENCE_GATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_fence_gate"));

    public static final Supplier<BlockType> SPRUCE_LEAVES = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_leaves"));

    public static final Supplier<BlockType> SPRUCE_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_log"));

    public static final Supplier<BlockType> SPRUCE_PLANKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_planks"));

    public static final Supplier<BlockType> SPRUCE_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_pressure_plate"));

    public static final Supplier<BlockType> SPRUCE_SAPLING = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_sapling"));

    public static final Supplier<BlockType> SPRUCE_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_sign"));

    public static final Supplier<BlockType> SPRUCE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_slab"));

    public static final Supplier<BlockType> SPRUCE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_stairs"));

    public static final Supplier<BlockType> SPRUCE_TRAPDOOR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_trapdoor"));

    public static final Supplier<BlockType> SPRUCE_WALL_SIGN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_wall_sign"));

    public static final Supplier<BlockType> SPRUCE_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("spruce_wood"));

    public static final Supplier<BlockType> STICKY_PISTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sticky_piston"));

    public static final Supplier<BlockType> STONE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone"));

    public static final Supplier<BlockType> STONECUTTER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stonecutter"));

    public static final Supplier<BlockType> STONE_BRICKS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_bricks"));

    public static final Supplier<BlockType> STONE_BRICK_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_brick_slab"));

    public static final Supplier<BlockType> STONE_BRICK_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_brick_stairs"));

    public static final Supplier<BlockType> STONE_BRICK_WALL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_brick_wall"));

    public static final Supplier<BlockType> STONE_BUTTON = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_button"));

    public static final Supplier<BlockType> STONE_PRESSURE_PLATE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_pressure_plate"));

    public static final Supplier<BlockType> STONE_SLAB = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_slab"));

    public static final Supplier<BlockType> STONE_STAIRS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stone_stairs"));

    public static final Supplier<BlockType> STRIPPED_ACACIA_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_acacia_log"));

    public static final Supplier<BlockType> STRIPPED_ACACIA_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_acacia_wood"));

    public static final Supplier<BlockType> STRIPPED_BIRCH_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_birch_log"));

    public static final Supplier<BlockType> STRIPPED_BIRCH_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_birch_wood"));

    public static final Supplier<BlockType> STRIPPED_DARK_OAK_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_dark_oak_log"));

    public static final Supplier<BlockType> STRIPPED_DARK_OAK_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_dark_oak_wood"));

    public static final Supplier<BlockType> STRIPPED_JUNGLE_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_jungle_log"));

    public static final Supplier<BlockType> STRIPPED_JUNGLE_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_jungle_wood"));

    public static final Supplier<BlockType> STRIPPED_OAK_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_oak_log"));

    public static final Supplier<BlockType> STRIPPED_OAK_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_oak_wood"));

    public static final Supplier<BlockType> STRIPPED_SPRUCE_LOG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_spruce_log"));

    public static final Supplier<BlockType> STRIPPED_SPRUCE_WOOD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("stripped_spruce_wood"));

    public static final Supplier<BlockType> STRUCTURE_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("structure_block"));

    public static final Supplier<BlockType> STRUCTURE_VOID = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("structure_void"));

    public static final Supplier<BlockType> SUGAR_CANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sugar_cane"));

    public static final Supplier<BlockType> SUNFLOWER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sunflower"));

    public static final Supplier<BlockType> SWEET_BERRY_BUSH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("sweet_berry_bush"));

    public static final Supplier<BlockType> TALL_GRASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tall_grass"));

    public static final Supplier<BlockType> TALL_SEAGRASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tall_seagrass"));

    public static final Supplier<BlockType> TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("terracotta"));

    public static final Supplier<BlockType> TNT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tnt"));

    public static final Supplier<BlockType> TORCH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("torch"));

    public static final Supplier<BlockType> TRAPPED_CHEST = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("trapped_chest"));

    public static final Supplier<BlockType> TRIPWIRE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tripwire"));

    public static final Supplier<BlockType> TRIPWIRE_HOOK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tripwire_hook"));

    public static final Supplier<BlockType> TUBE_CORAL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tube_coral"));

    public static final Supplier<BlockType> TUBE_CORAL_BLOCK = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tube_coral_block"));

    public static final Supplier<BlockType> TUBE_CORAL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tube_coral_fan"));

    public static final Supplier<BlockType> TUBE_CORAL_WALL_FAN = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("tube_coral_wall_fan"));

    public static final Supplier<BlockType> TURTLE_EGG = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("turtle_egg"));

    public static final Supplier<BlockType> VINE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("vine"));

    public static final Supplier<BlockType> VOID_AIR = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("void_air"));

    public static final Supplier<BlockType> WALL_TORCH = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("wall_torch"));

    public static final Supplier<BlockType> WATER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("water"));

    public static final Supplier<BlockType> WET_SPONGE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("wet_sponge"));

    public static final Supplier<BlockType> WHEAT = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("wheat"));

    public static final Supplier<BlockType> WHITE_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_banner"));

    public static final Supplier<BlockType> WHITE_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_bed"));

    public static final Supplier<BlockType> WHITE_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_carpet"));

    public static final Supplier<BlockType> WHITE_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_concrete"));

    public static final Supplier<BlockType> WHITE_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_concrete_powder"));

    public static final Supplier<BlockType> WHITE_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_glazed_terracotta"));

    public static final Supplier<BlockType> WHITE_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_shulker_box"));

    public static final Supplier<BlockType> WHITE_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_stained_glass"));

    public static final Supplier<BlockType> WHITE_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_stained_glass_pane"));

    public static final Supplier<BlockType> WHITE_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_terracotta"));

    public static final Supplier<BlockType> WHITE_TULIP = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_tulip"));

    public static final Supplier<BlockType> WHITE_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_wall_banner"));

    public static final Supplier<BlockType> WHITE_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("white_wool"));

    public static final Supplier<BlockType> WITHER_ROSE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("wither_rose"));

    public static final Supplier<BlockType> WITHER_SKELETON_SKULL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("wither_skeleton_skull"));

    public static final Supplier<BlockType> WITHER_SKELETON_WALL_SKULL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("wither_skeleton_wall_skull"));

    public static final Supplier<BlockType> YELLOW_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_banner"));

    public static final Supplier<BlockType> YELLOW_BED = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_bed"));

    public static final Supplier<BlockType> YELLOW_CARPET = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_carpet"));

    public static final Supplier<BlockType> YELLOW_CONCRETE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_concrete"));

    public static final Supplier<BlockType> YELLOW_CONCRETE_POWDER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_concrete_powder"));

    public static final Supplier<BlockType> YELLOW_GLAZED_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_glazed_terracotta"));

    public static final Supplier<BlockType> YELLOW_SHULKER_BOX = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_shulker_box"));

    public static final Supplier<BlockType> YELLOW_STAINED_GLASS = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_stained_glass"));

    public static final Supplier<BlockType> YELLOW_STAINED_GLASS_PANE = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_stained_glass_pane"));

    public static final Supplier<BlockType> YELLOW_TERRACOTTA = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_terracotta"));

    public static final Supplier<BlockType> YELLOW_WALL_BANNER = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_wall_banner"));

    public static final Supplier<BlockType> YELLOW_WOOL = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("yellow_wool"));

    public static final Supplier<BlockType> ZOMBIE_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("zombie_head"));

    public static final Supplier<BlockType> ZOMBIE_WALL_HEAD = BlockTypes.REGISTRY.getSupplier(ResourceKey.minecraft("zombie_wall_head"));

    // SORTFIELDS:OFF

    private BlockTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
