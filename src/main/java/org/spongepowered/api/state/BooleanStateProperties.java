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
package org.spongepowered.api.state;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class BooleanStateProperties {

    // SORTFIELDS:ON

    public static final Supplier<BooleanStateProperty> ACACIA_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_button_powered"));

    public static final Supplier<BooleanStateProperty> ACACIA_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_door_open"));

    public static final Supplier<BooleanStateProperty> ACACIA_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_door_powered"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_east"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_GATE_IN_WALL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_gate_in_wall"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_GATE_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_gate_open"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_GATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_gate_powered"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_north"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_south"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> ACACIA_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_fence_west"));

    public static final Supplier<BooleanStateProperty> ACACIA_LEAVES_PERSISTENT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_leaves_persistent"));

    public static final Supplier<BooleanStateProperty> ACACIA_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> ACACIA_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> ACACIA_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> ACACIA_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> ACACIA_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> ACACIA_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> ACACIA_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> ACACIA_WALL_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("acacia_wall_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> ACTIVATOR_RAIL_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("activator_rail_powered"));

    public static final Supplier<BooleanStateProperty> ANDESITE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> ANDESITE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> ANDESITE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_wall_east"));

    public static final Supplier<BooleanStateProperty> ANDESITE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_wall_north"));

    public static final Supplier<BooleanStateProperty> ANDESITE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_wall_south"));

    public static final Supplier<BooleanStateProperty> ANDESITE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_wall_up"));

    public static final Supplier<BooleanStateProperty> ANDESITE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> ANDESITE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("andesite_wall_west"));

    public static final Supplier<BooleanStateProperty> BARREL_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("barrel_open"));

    public static final Supplier<BooleanStateProperty> BIRCH_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_button_powered"));

    public static final Supplier<BooleanStateProperty> BIRCH_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_door_open"));

    public static final Supplier<BooleanStateProperty> BIRCH_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_door_powered"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_east"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_GATE_IN_WALL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_gate_in_wall"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_GATE_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_gate_open"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_GATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_gate_powered"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_north"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_south"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> BIRCH_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_fence_west"));

    public static final Supplier<BooleanStateProperty> BIRCH_LEAVES_PERSISTENT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_leaves_persistent"));

    public static final Supplier<BooleanStateProperty> BIRCH_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> BIRCH_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> BIRCH_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> BIRCH_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> BIRCH_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> BIRCH_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> BIRCH_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> BIRCH_WALL_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("birch_wall_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> BLACK_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("black_bed_occupied"));

    public static final Supplier<BooleanStateProperty> BLACK_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("black_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> BLACK_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("black_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> BLACK_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("black_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> BLACK_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("black_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> BLACK_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("black_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> BLAST_FURNACE_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blast_furnace_lit"));

    public static final Supplier<BooleanStateProperty> BLUE_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blue_bed_occupied"));

    public static final Supplier<BooleanStateProperty> BLUE_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blue_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> BLUE_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blue_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> BLUE_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blue_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> BLUE_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blue_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> BLUE_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("blue_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> BRAIN_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brain_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> BRAIN_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brain_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> BRAIN_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brain_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> BREWING_STAND_HAS_BOTTLE_0 = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("BREWING_STAND_HAS_BOTTLE_0"));

    public static final Supplier<BooleanStateProperty> BREWING_STAND_HAS_BOTTLE_1 = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("BREWING_STAND_HAS_BOTTLE_1"));

    public static final Supplier<BooleanStateProperty> BREWING_STAND_HAS_BOTTLE_2 = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("BREWING_STAND_HAS_BOTTLE_2"));

    public static final Supplier<BooleanStateProperty> BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> BRICK_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_wall_east"));

    public static final Supplier<BooleanStateProperty> BRICK_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_wall_north"));

    public static final Supplier<BooleanStateProperty> BRICK_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_wall_south"));

    public static final Supplier<BooleanStateProperty> BRICK_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_wall_up"));

    public static final Supplier<BooleanStateProperty> BRICK_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> BRICK_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brick_wall_west"));

    public static final Supplier<BooleanStateProperty> BROWN_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_bed_occupied"));

    public static final Supplier<BooleanStateProperty> BROWN_MUSHROOM_BLOCK_DOWN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_mushroom_block_down"));

    public static final Supplier<BooleanStateProperty> BROWN_MUSHROOM_BLOCK_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_mushroom_block_east"));

    public static final Supplier<BooleanStateProperty> BROWN_MUSHROOM_BLOCK_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_mushroom_block_north"));

    public static final Supplier<BooleanStateProperty> BROWN_MUSHROOM_BLOCK_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_mushroom_block_south"));

    public static final Supplier<BooleanStateProperty> BROWN_MUSHROOM_BLOCK_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_mushroom_block_up"));

    public static final Supplier<BooleanStateProperty> BROWN_MUSHROOM_BLOCK_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_mushroom_block_west"));

    public static final Supplier<BooleanStateProperty> BROWN_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> BROWN_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> BROWN_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> BROWN_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> BROWN_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("brown_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> BUBBLE_COLUMN_DRAG = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("bubble_column_drag"));

    public static final Supplier<BooleanStateProperty> BUBBLE_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("bubble_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> BUBBLE_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("bubble_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> BUBBLE_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("bubble_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> CAMPFIRE_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("campfire_lit"));

    public static final Supplier<BooleanStateProperty> CAMPFIRE_SIGNAL_FIRE = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("campfire_signal_fire"));

    public static final Supplier<BooleanStateProperty> CAMPFIRE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("campfire_waterlogged"));

    public static final Supplier<BooleanStateProperty> CHAIN_COMMAND_BLOCK_CONDITIONAL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chain_command_block_conditional"));

    public static final Supplier<BooleanStateProperty> CHEST_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chest_waterlogged"));

    public static final Supplier<BooleanStateProperty> CHORUS_PLANT_DOWN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chorus_plant_down"));

    public static final Supplier<BooleanStateProperty> CHORUS_PLANT_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chorus_plant_east"));

    public static final Supplier<BooleanStateProperty> CHORUS_PLANT_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chorus_plant_north"));

    public static final Supplier<BooleanStateProperty> CHORUS_PLANT_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chorus_plant_south"));

    public static final Supplier<BooleanStateProperty> CHORUS_PLANT_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chorus_plant_up"));

    public static final Supplier<BooleanStateProperty> CHORUS_PLANT_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("chorus_plant_west"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_wall_east"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_wall_north"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_wall_south"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_wall_up"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> COBBLESTONE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cobblestone_wall_west"));

    public static final Supplier<BooleanStateProperty> COMMAND_BLOCK_CONDITIONAL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("command_block_conditional"));

    public static final Supplier<BooleanStateProperty> COMPARATOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("comparator_powered"));

    public static final Supplier<BooleanStateProperty> CONDUIT_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("conduit_waterlogged"));

    public static final Supplier<BooleanStateProperty> CUT_RED_SANDSTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cut_red_sandstone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> CUT_SANDSTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cut_sandstone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> CYAN_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cyan_bed_occupied"));

    public static final Supplier<BooleanStateProperty> CYAN_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cyan_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> CYAN_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cyan_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> CYAN_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cyan_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> CYAN_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cyan_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> CYAN_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("cyan_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_button_powered"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_door_open"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_door_powered"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_east"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_GATE_IN_WALL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_gate_in_wall"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_GATE_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_gate_open"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_GATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_gate_powered"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_north"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_south"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_fence_west"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_LEAVES_PERSISTENT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_leaves_persistent"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_OAK_WALL_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_oak_wall_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_PRISMARINE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_prismarine_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> DARK_PRISMARINE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dark_prismarine_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> DAYLIGHT_DETECTOR_INVERTED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("daylight_detector_inverted"));

    public static final Supplier<BooleanStateProperty> DEAD_BRAIN_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_brain_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_BRAIN_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_brain_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_BRAIN_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_brain_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_BUBBLE_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_bubble_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_BUBBLE_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_bubble_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_BUBBLE_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_bubble_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_FIRE_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_fire_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_FIRE_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_fire_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_FIRE_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_fire_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_HORN_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_horn_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_HORN_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_horn_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_HORN_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_horn_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_TUBE_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_tube_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_TUBE_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_tube_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> DEAD_TUBE_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dead_tube_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> DETECTOR_RAIL_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("detector_rail_powered"));

    public static final Supplier<BooleanStateProperty> DIORITE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> DIORITE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> DIORITE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_wall_east"));

    public static final Supplier<BooleanStateProperty> DIORITE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_wall_north"));

    public static final Supplier<BooleanStateProperty> DIORITE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_wall_south"));

    public static final Supplier<BooleanStateProperty> DIORITE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_wall_up"));

    public static final Supplier<BooleanStateProperty> DIORITE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> DIORITE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("diorite_wall_west"));

    public static final Supplier<BooleanStateProperty> DISPENSER_TRIGGERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dispenser_triggered"));

    public static final Supplier<BooleanStateProperty> DROPPER_TRIGGERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("dropper_triggered"));

    public static final Supplier<BooleanStateProperty> ENDER_CHEST_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("ender_chest_waterlogged"));

    public static final Supplier<BooleanStateProperty> END_PORTAL_FRAME_EYE = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_portal_frame_eye"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall_east"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall_north"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall_south"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall_up"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> END_STONE_BRICK_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("end_stone_brick_wall_west"));

    public static final Supplier<BooleanStateProperty> FIRE_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> FIRE_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> FIRE_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> FIRE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_east"));

    public static final Supplier<BooleanStateProperty> FIRE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_north"));

    public static final Supplier<BooleanStateProperty> FIRE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_south"));

    public static final Supplier<BooleanStateProperty> FIRE_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_up"));

    public static final Supplier<BooleanStateProperty> FIRE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("fire_west"));

    public static final Supplier<BooleanStateProperty> FURNACE_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("furnace_lit"));

    public static final Supplier<BooleanStateProperty> GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("glass_pane_east"));

    public static final Supplier<BooleanStateProperty> GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("glass_pane_north"));

    public static final Supplier<BooleanStateProperty> GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("glass_pane_south"));

    public static final Supplier<BooleanStateProperty> GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("glass_pane_west"));

    public static final Supplier<BooleanStateProperty> GRANITE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> GRANITE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> GRANITE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_wall_east"));

    public static final Supplier<BooleanStateProperty> GRANITE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_wall_north"));

    public static final Supplier<BooleanStateProperty> GRANITE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_wall_south"));

    public static final Supplier<BooleanStateProperty> GRANITE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_wall_up"));

    public static final Supplier<BooleanStateProperty> GRANITE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> GRANITE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("granite_wall_west"));

    public static final Supplier<BooleanStateProperty> GRASS_BLOCK_SNOWY = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("grass_block_snowy"));

    public static final Supplier<BooleanStateProperty> GRAY_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("gray_bed_occupied"));

    public static final Supplier<BooleanStateProperty> GRAY_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("gray_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> GRAY_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("gray_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> GRAY_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("gray_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> GRAY_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("gray_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> GRAY_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("gray_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> GREEN_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("green_bed_occupied"));

    public static final Supplier<BooleanStateProperty> GREEN_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("green_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> GREEN_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("green_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> GREEN_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("green_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> GREEN_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("green_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> GREEN_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("green_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> HOPPER_ENABLED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("hopper_enabled"));

    public static final Supplier<BooleanStateProperty> HORN_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("horn_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> HORN_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("horn_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> HORN_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("horn_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> IRON_BARS_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_bars_east"));

    public static final Supplier<BooleanStateProperty> IRON_BARS_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_bars_north"));

    public static final Supplier<BooleanStateProperty> IRON_BARS_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_bars_south"));

    public static final Supplier<BooleanStateProperty> IRON_BARS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_bars_waterlogged"));

    public static final Supplier<BooleanStateProperty> IRON_BARS_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_bars_west"));

    public static final Supplier<BooleanStateProperty> IRON_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_door_open"));

    public static final Supplier<BooleanStateProperty> IRON_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_door_powered"));

    public static final Supplier<BooleanStateProperty> IRON_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> IRON_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> IRON_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("iron_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> JUKEBOX_HAS_RECORD = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jukebox_has_record"));

    public static final Supplier<BooleanStateProperty> JUNGLE_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_button_powered"));

    public static final Supplier<BooleanStateProperty> JUNGLE_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_door_open"));

    public static final Supplier<BooleanStateProperty> JUNGLE_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_door_powered"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_east"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_GATE_IN_WALL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_gate_in_wall"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_GATE_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_gate_open"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_GATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_gate_powered"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_north"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_south"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> JUNGLE_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_fence_west"));

    public static final Supplier<BooleanStateProperty> JUNGLE_LEAVES_PERSISTENT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_leaves_persistent"));

    public static final Supplier<BooleanStateProperty> JUNGLE_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> JUNGLE_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> JUNGLE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> JUNGLE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> JUNGLE_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> JUNGLE_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> JUNGLE_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> JUNGLE_WALL_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("jungle_wall_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> LADDER_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("ladder_waterlogged"));

    public static final Supplier<BooleanStateProperty> LANTERN_HANGING = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lantern_hanging"));

    public static final Supplier<BooleanStateProperty> LECTERN_HAS_BOOK = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lectern_has_book"));

    public static final Supplier<BooleanStateProperty> LECTERN_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lectern_powered"));

    public static final Supplier<BooleanStateProperty> LEVER_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lever_powered"));

    public static final Supplier<BooleanStateProperty> LIGHT_BLUE_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_blue_bed_occupied"));

    public static final Supplier<BooleanStateProperty> LIGHT_BLUE_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> LIGHT_BLUE_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> LIGHT_BLUE_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> LIGHT_BLUE_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> LIGHT_BLUE_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_blue_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> LIGHT_GRAY_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_gray_bed_occupied"));

    public static final Supplier<BooleanStateProperty> LIGHT_GRAY_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> LIGHT_GRAY_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> LIGHT_GRAY_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> LIGHT_GRAY_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> LIGHT_GRAY_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("light_gray_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> LIME_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lime_bed_occupied"));

    public static final Supplier<BooleanStateProperty> LIME_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lime_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> LIME_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lime_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> LIME_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lime_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> LIME_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lime_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> LIME_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("lime_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> MAGENTA_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("magenta_bed_occupied"));

    public static final Supplier<BooleanStateProperty> MAGENTA_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("magenta_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> MAGENTA_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("magenta_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> MAGENTA_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("magenta_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> MAGENTA_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("magenta_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> MAGENTA_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("magenta_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall_east"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall_north"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall_south"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall_up"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> MOSSY_COBBLESTONE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_cobblestone_wall_west"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall_east"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall_north"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall_south"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall_up"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> MOSSY_STONE_BRICK_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mossy_stone_brick_wall_west"));

    public static final Supplier<BooleanStateProperty> MUSHROOM_STEM_DOWN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mushroom_stem_down"));

    public static final Supplier<BooleanStateProperty> MUSHROOM_STEM_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mushroom_stem_east"));

    public static final Supplier<BooleanStateProperty> MUSHROOM_STEM_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mushroom_stem_north"));

    public static final Supplier<BooleanStateProperty> MUSHROOM_STEM_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mushroom_stem_south"));

    public static final Supplier<BooleanStateProperty> MUSHROOM_STEM_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mushroom_stem_up"));

    public static final Supplier<BooleanStateProperty> MUSHROOM_STEM_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mushroom_stem_west"));

    public static final Supplier<BooleanStateProperty> MYCELIUM_SNOWY = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("mycelium_snowy"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_fence_east"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_fence_north"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_fence_south"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_fence_west"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_wall_east"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_wall_north"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_wall_south"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_wall_up"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> NETHER_BRICK_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("nether_brick_wall_west"));

    public static final Supplier<BooleanStateProperty> NOTE_BLOCK_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("note_block_powered"));

    public static final Supplier<BooleanStateProperty> OAK_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_button_powered"));

    public static final Supplier<BooleanStateProperty> OAK_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_door_open"));

    public static final Supplier<BooleanStateProperty> OAK_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_door_powered"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_east"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_GATE_IN_WALL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_gate_in_wall"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_GATE_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_gate_open"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_GATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_gate_powered"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_north"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_south"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> OAK_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_fence_west"));

    public static final Supplier<BooleanStateProperty> OAK_LEAVES_PERSISTENT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_leaves_persistent"));

    public static final Supplier<BooleanStateProperty> OAK_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> OAK_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> OAK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> OAK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> OAK_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> OAK_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> OAK_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> OAK_WALL_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("oak_wall_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> OBSERVER_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("observer_powered"));

    public static final Supplier<BooleanStateProperty> ORANGE_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("orange_bed_occupied"));

    public static final Supplier<BooleanStateProperty> ORANGE_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("orange_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> ORANGE_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("orange_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> ORANGE_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("orange_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> ORANGE_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("orange_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> ORANGE_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("orange_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> PETRIFIED_OAK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("petrified_oak_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> PINK_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("pink_bed_occupied"));

    public static final Supplier<BooleanStateProperty> PINK_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("pink_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> PINK_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("pink_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> PINK_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("pink_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> PINK_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("pink_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> PINK_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("pink_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> PISTON_EXTENDED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("piston_extended"));

    public static final Supplier<BooleanStateProperty> PISTON_HEAD_SHORT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("piston_head_short"));

    public static final Supplier<BooleanStateProperty> PODZOL_SNOWY = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("podzol_snowy"));

    public static final Supplier<BooleanStateProperty> POLISHED_ANDESITE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("polished_andesite_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> POLISHED_ANDESITE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("polished_andesite_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> POLISHED_DIORITE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("polished_diorite_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> POLISHED_DIORITE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("polished_diorite_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> POLISHED_GRANITE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("polished_granite_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> POLISHED_GRANITE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("polished_granite_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> POWERED_RAIL_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("powered_rail_powered"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_wall_east"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_wall_north"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_wall_south"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_wall_up"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> PRISMARINE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("prismarine_wall_west"));

    public static final Supplier<BooleanStateProperty> PURPLE_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purple_bed_occupied"));

    public static final Supplier<BooleanStateProperty> PURPLE_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purple_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> PURPLE_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purple_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> PURPLE_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purple_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> PURPLE_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purple_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> PURPLE_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purple_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> PURPUR_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purpur_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> PURPUR_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("purpur_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> QUARTZ_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("quartz_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> QUARTZ_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("quartz_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> REDSTONE_LAMP_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("redstone_lamp_lit"));

    public static final Supplier<BooleanStateProperty> REDSTONE_ORE_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("redstone_ore_lit"));

    public static final Supplier<BooleanStateProperty> REDSTONE_TORCH_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("redstone_torch_lit"));

    public static final Supplier<BooleanStateProperty> REDSTONE_WALL_TORCH_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("redstone_wall_torch_lit"));

    public static final Supplier<BooleanStateProperty> RED_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_bed_occupied"));

    public static final Supplier<BooleanStateProperty> RED_MUSHROOM_BLOCK_DOWN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_mushroom_block_down"));

    public static final Supplier<BooleanStateProperty> RED_MUSHROOM_BLOCK_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_mushroom_block_east"));

    public static final Supplier<BooleanStateProperty> RED_MUSHROOM_BLOCK_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_mushroom_block_north"));

    public static final Supplier<BooleanStateProperty> RED_MUSHROOM_BLOCK_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_mushroom_block_south"));

    public static final Supplier<BooleanStateProperty> RED_MUSHROOM_BLOCK_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_mushroom_block_up"));

    public static final Supplier<BooleanStateProperty> RED_MUSHROOM_BLOCK_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_mushroom_block_west"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall_east"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall_north"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall_south"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall_up"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_NETHER_BRICK_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_nether_brick_wall_west"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_wall_east"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_wall_north"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_wall_south"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_wall_up"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_SANDSTONE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_sandstone_wall_west"));

    public static final Supplier<BooleanStateProperty> RED_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> RED_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> RED_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> RED_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> RED_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("red_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> REPEATER_LOCKED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("repeater_locked"));

    public static final Supplier<BooleanStateProperty> REPEATER_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("repeater_powered"));

    public static final Supplier<BooleanStateProperty> REPEATING_COMMAND_BLOCK_CONDITIONAL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("repeating_command_block_conditional"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_wall_east"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_wall_north"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_wall_south"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_wall_up"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> SANDSTONE_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sandstone_wall_west"));

    public static final Supplier<BooleanStateProperty> SCAFFOLDING_BOTTOM = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("scaffolding_bottom"));

    public static final Supplier<BooleanStateProperty> SCAFFOLDING_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("scaffolding_waterlogged"));

    public static final Supplier<BooleanStateProperty> SEA_PICKLE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sea_pickle_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOKER_LIT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smoker_lit"));

    public static final Supplier<BooleanStateProperty> SMOOTH_QUARTZ_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_quartz_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOOTH_QUARTZ_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_quartz_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOOTH_RED_SANDSTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_red_sandstone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOOTH_RED_SANDSTONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_red_sandstone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOOTH_SANDSTONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_sandstone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOOTH_SANDSTONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_sandstone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> SMOOTH_STONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("smooth_stone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> SPRUCE_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_button_powered"));

    public static final Supplier<BooleanStateProperty> SPRUCE_DOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_door_open"));

    public static final Supplier<BooleanStateProperty> SPRUCE_DOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_door_powered"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_east"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_GATE_IN_WALL = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_gate_in_wall"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_GATE_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_gate_open"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_GATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_gate_powered"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_north"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_south"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_waterlogged"));

    public static final Supplier<BooleanStateProperty> SPRUCE_FENCE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_fence_west"));

    public static final Supplier<BooleanStateProperty> SPRUCE_LEAVES_PERSISTENT = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_leaves_persistent"));

    public static final Supplier<BooleanStateProperty> SPRUCE_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> SPRUCE_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> SPRUCE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> SPRUCE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> SPRUCE_TRAPDOOR_OPEN = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_trapdoor_open"));

    public static final Supplier<BooleanStateProperty> SPRUCE_TRAPDOOR_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_trapdoor_powered"));

    public static final Supplier<BooleanStateProperty> SPRUCE_TRAPDOOR_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_trapdoor_waterlogged"));

    public static final Supplier<BooleanStateProperty> SPRUCE_WALL_SIGN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("spruce_wall_sign_waterlogged"));

    public static final Supplier<BooleanStateProperty> STICKY_PISTON_EXTENDED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("sticky_piston_extended"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_WALL_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_wall_east"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_WALL_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_wall_north"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_WALL_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_wall_south"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_WALL_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_wall_up"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_WALL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_wall_waterlogged"));

    public static final Supplier<BooleanStateProperty> STONE_BRICK_WALL_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_brick_wall_west"));

    public static final Supplier<BooleanStateProperty> STONE_BUTTON_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_button_powered"));

    public static final Supplier<BooleanStateProperty> STONE_PRESSURE_PLATE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_pressure_plate_powered"));

    public static final Supplier<BooleanStateProperty> STONE_SLAB_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_slab_waterlogged"));

    public static final Supplier<BooleanStateProperty> STONE_STAIRS_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("stone_stairs_waterlogged"));

    public static final Supplier<BooleanStateProperty> TNT_UNSTABLE = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tnt_unstable"));

    public static final Supplier<BooleanStateProperty> TRAPPED_CHEST_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("trapped_chest_waterlogged"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_ATTACHED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_attached"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_DISARMED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_disarmed"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_east"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_HOOK_ATTACHED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_hook_attached"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_HOOK_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_hook_powered"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_north"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_POWERED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_powered"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_south"));

    public static final Supplier<BooleanStateProperty> TRIPWIRE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tripwire_west"));

    public static final Supplier<BooleanStateProperty> TUBE_CORAL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tube_coral_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> TUBE_CORAL_WALL_FAN_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tube_coral_wall_fan_waterlogged"));

    public static final Supplier<BooleanStateProperty> TUBE_CORAL_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("tube_coral_waterlogged"));

    public static final Supplier<BooleanStateProperty> VINE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("vine_east"));

    public static final Supplier<BooleanStateProperty> VINE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("vine_north"));

    public static final Supplier<BooleanStateProperty> VINE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("vine_south"));

    public static final Supplier<BooleanStateProperty> VINE_UP = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("vine_up"));

    public static final Supplier<BooleanStateProperty> VINE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("vine_west"));

    public static final Supplier<BooleanStateProperty> WHITE_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("white_bed_occupied"));

    public static final Supplier<BooleanStateProperty> WHITE_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("white_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> WHITE_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("white_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> WHITE_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("white_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> WHITE_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("white_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> WHITE_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("white_stained_glass_pane_west"));

    public static final Supplier<BooleanStateProperty> YELLOW_BED_OCCUPIED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("yellow_bed_occupied"));

    public static final Supplier<BooleanStateProperty> YELLOW_STAINED_GLASS_PANE_EAST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("yellow_stained_glass_pane_east"));

    public static final Supplier<BooleanStateProperty> YELLOW_STAINED_GLASS_PANE_NORTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("yellow_stained_glass_pane_north"));

    public static final Supplier<BooleanStateProperty> YELLOW_STAINED_GLASS_PANE_SOUTH = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("yellow_stained_glass_pane_south"));

    public static final Supplier<BooleanStateProperty> YELLOW_STAINED_GLASS_PANE_WATERLOGGED = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("yellow_stained_glass_pane_waterlogged"));

    public static final Supplier<BooleanStateProperty> YELLOW_STAINED_GLASS_PANE_WEST = Registries.BOOLEAN_STATE_PROPERTY.getSupplier(ResourceKey.minecraft("yellow_stained_glass_pane_west"));

    // SORTFIELDS:OFF

    private BooleanStateProperties() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
