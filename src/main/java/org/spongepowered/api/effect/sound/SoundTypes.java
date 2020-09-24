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
package org.spongepowered.api.effect.sound;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class SoundTypes {

    // SORTFIELDS:ON

    public static final Supplier<SoundType> AMBIENT_CAVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_cave"));

    public static final Supplier<SoundType> AMBIENT_UNDERWATER_ENTER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_underwater_enter"));

    public static final Supplier<SoundType> AMBIENT_UNDERWATER_EXIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_underwater_exit"));

    public static final Supplier<SoundType> AMBIENT_UNDERWATER_LOOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_underwater_loop"));

    public static final Supplier<SoundType> AMBIENT_UNDERWATER_LOOP_ADDITIONS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_underwater_loop_additions"));

    public static final Supplier<SoundType> AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_underwater_loop_additions_rare"));

    public static final Supplier<SoundType> AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ambient_underwater_loop_additions_ultra_rare"));

    public static final Supplier<SoundType> BLOCK_ANVIL_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_break"));

    public static final Supplier<SoundType> BLOCK_ANVIL_DESTROY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_destroy"));

    public static final Supplier<SoundType> BLOCK_ANVIL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_fall"));

    public static final Supplier<SoundType> BLOCK_ANVIL_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_hit"));

    public static final Supplier<SoundType> BLOCK_ANVIL_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_land"));

    public static final Supplier<SoundType> BLOCK_ANVIL_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_place"));

    public static final Supplier<SoundType> BLOCK_ANVIL_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_step"));

    public static final Supplier<SoundType> BLOCK_ANVIL_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_anvil_use"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_break"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_fall"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_hit"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_place"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_SAPLING_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_sapling_break"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_SAPLING_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_sapling_hit"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_SAPLING_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_sapling_place"));

    public static final Supplier<SoundType> BLOCK_BAMBOO_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bamboo_step"));

    public static final Supplier<SoundType> BLOCK_BARREL_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_barrel_close"));

    public static final Supplier<SoundType> BLOCK_BARREL_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_barrel_open"));

    public static final Supplier<SoundType> BLOCK_BEACON_ACTIVATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beacon_activate"));

    public static final Supplier<SoundType> BLOCK_BEACON_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beacon_ambient"));

    public static final Supplier<SoundType> BLOCK_BEACON_DEACTIVATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beacon_deactivate"));

    public static final Supplier<SoundType> BLOCK_BEACON_POWER_SELECT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beacon_power_select"));

    public static final Supplier<SoundType> BLOCK_BEEHIVE_DROP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beehive_drop"));

    public static final Supplier<SoundType> BLOCK_BEEHIVE_ENTER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beehive_enter"));

    public static final Supplier<SoundType> BLOCK_BEEHIVE_EXIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beehive_exit"));

    public static final Supplier<SoundType> BLOCK_BEEHIVE_SHEAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beehive_shear"));

    public static final Supplier<SoundType> BLOCK_BEEHIVE_WORK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_beehive_work"));

    public static final Supplier<SoundType> BLOCK_BELL_RESONATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bell_resonate"));

    public static final Supplier<SoundType> BLOCK_BELL_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bell_use"));

    public static final Supplier<SoundType> BLOCK_BLASTFURNACE_FIRE_CRACKLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_blastfurnace_fire_crackle"));

    public static final Supplier<SoundType> BLOCK_BREWING_STAND_BREW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_brewing_stand_brew"));

    public static final Supplier<SoundType> BLOCK_BUBBLE_COLUMN_BUBBLE_POP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bubble_column_bubble_pop"));

    public static final Supplier<SoundType> BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bubble_column_upwards_ambient"));

    public static final Supplier<SoundType> BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bubble_column_upwards_inside"));

    public static final Supplier<SoundType> BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bubble_column_whirlpool_ambient"));

    public static final Supplier<SoundType> BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_bubble_column_whirlpool_inside"));

    public static final Supplier<SoundType> BLOCK_CAMPFIRE_CRACKLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_campfire_crackle"));

    public static final Supplier<SoundType> BLOCK_CHEST_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_chest_close"));

    public static final Supplier<SoundType> BLOCK_CHEST_LOCKED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_chest_locked"));

    public static final Supplier<SoundType> BLOCK_CHEST_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_chest_open"));

    public static final Supplier<SoundType> BLOCK_CHORUS_FLOWER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_chorus_flower_death"));

    public static final Supplier<SoundType> BLOCK_CHORUS_FLOWER_GROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_chorus_flower_grow"));

    public static final Supplier<SoundType> BLOCK_COMPARATOR_CLICK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_comparator_click"));

    public static final Supplier<SoundType> BLOCK_COMPOSTER_EMPTY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_composter_empty"));

    public static final Supplier<SoundType> BLOCK_COMPOSTER_FILL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_composter_fill"));

    public static final Supplier<SoundType> BLOCK_COMPOSTER_FILL_SUCCESS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_composter_fill_success"));

    public static final Supplier<SoundType> BLOCK_COMPOSTER_READY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_composter_ready"));

    public static final Supplier<SoundType> BLOCK_CONDUIT_ACTIVATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_conduit_activate"));

    public static final Supplier<SoundType> BLOCK_CONDUIT_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_conduit_ambient"));

    public static final Supplier<SoundType> BLOCK_CONDUIT_AMBIENT_SHORT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_conduit_ambient_short"));

    public static final Supplier<SoundType> BLOCK_CONDUIT_ATTACK_TARGET = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_conduit_attack_target"));

    public static final Supplier<SoundType> BLOCK_CONDUIT_DEACTIVATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_conduit_deactivate"));

    public static final Supplier<SoundType> BLOCK_CORAL_BLOCK_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_coral_block_break"));

    public static final Supplier<SoundType> BLOCK_CORAL_BLOCK_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_coral_block_fall"));

    public static final Supplier<SoundType> BLOCK_CORAL_BLOCK_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_coral_block_hit"));

    public static final Supplier<SoundType> BLOCK_CORAL_BLOCK_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_coral_block_place"));

    public static final Supplier<SoundType> BLOCK_CORAL_BLOCK_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_coral_block_step"));

    public static final Supplier<SoundType> BLOCK_CROP_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_crop_break"));

    public static final Supplier<SoundType> BLOCK_DISPENSER_DISPENSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_dispenser_dispense"));

    public static final Supplier<SoundType> BLOCK_DISPENSER_FAIL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_dispenser_fail"));

    public static final Supplier<SoundType> BLOCK_DISPENSER_LAUNCH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_dispenser_launch"));

    public static final Supplier<SoundType> BLOCK_ENCHANTMENT_TABLE_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_enchantment_table_use"));

    public static final Supplier<SoundType> BLOCK_ENDER_CHEST_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ender_chest_close"));

    public static final Supplier<SoundType> BLOCK_ENDER_CHEST_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ender_chest_open"));

    public static final Supplier<SoundType> BLOCK_END_GATEWAY_SPAWN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_end_gateway_spawn"));

    public static final Supplier<SoundType> BLOCK_END_PORTAL_FRAME_FILL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_end_portal_frame_fill"));

    public static final Supplier<SoundType> BLOCK_END_PORTAL_SPAWN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_end_portal_spawn"));

    public static final Supplier<SoundType> BLOCK_FENCE_GATE_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_fence_gate_close"));

    public static final Supplier<SoundType> BLOCK_FENCE_GATE_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_fence_gate_open"));

    public static final Supplier<SoundType> BLOCK_FIRE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_fire_ambient"));

    public static final Supplier<SoundType> BLOCK_FIRE_EXTINGUISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_fire_extinguish"));

    public static final Supplier<SoundType> BLOCK_FURNACE_FIRE_CRACKLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_furnace_fire_crackle"));

    public static final Supplier<SoundType> BLOCK_GLASS_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_glass_break"));

    public static final Supplier<SoundType> BLOCK_GLASS_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_glass_fall"));

    public static final Supplier<SoundType> BLOCK_GLASS_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_glass_hit"));

    public static final Supplier<SoundType> BLOCK_GLASS_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_glass_place"));

    public static final Supplier<SoundType> BLOCK_GLASS_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_glass_step"));

    public static final Supplier<SoundType> BLOCK_GRASS_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_grass_break"));

    public static final Supplier<SoundType> BLOCK_GRASS_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_grass_fall"));

    public static final Supplier<SoundType> BLOCK_GRASS_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_grass_hit"));

    public static final Supplier<SoundType> BLOCK_GRASS_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_grass_place"));

    public static final Supplier<SoundType> BLOCK_GRASS_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_grass_step"));

    public static final Supplier<SoundType> BLOCK_GRAVEL_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_gravel_break"));

    public static final Supplier<SoundType> BLOCK_GRAVEL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_gravel_fall"));

    public static final Supplier<SoundType> BLOCK_GRAVEL_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_gravel_hit"));

    public static final Supplier<SoundType> BLOCK_GRAVEL_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_gravel_place"));

    public static final Supplier<SoundType> BLOCK_GRAVEL_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_gravel_step"));

    public static final Supplier<SoundType> BLOCK_GRINDSTONE_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_grindstone_use"));

    public static final Supplier<SoundType> BLOCK_IRON_DOOR_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_iron_door_close"));

    public static final Supplier<SoundType> BLOCK_IRON_DOOR_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_iron_door_open"));

    public static final Supplier<SoundType> BLOCK_IRON_TRAPDOOR_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_iron_trapdoor_close"));

    public static final Supplier<SoundType> BLOCK_IRON_TRAPDOOR_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_iron_trapdoor_open"));

    public static final Supplier<SoundType> BLOCK_LADDER_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ladder_break"));

    public static final Supplier<SoundType> BLOCK_LADDER_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ladder_fall"));

    public static final Supplier<SoundType> BLOCK_LADDER_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ladder_hit"));

    public static final Supplier<SoundType> BLOCK_LADDER_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ladder_place"));

    public static final Supplier<SoundType> BLOCK_LADDER_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_ladder_step"));

    public static final Supplier<SoundType> BLOCK_LANTERN_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lantern_break"));

    public static final Supplier<SoundType> BLOCK_LANTERN_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lantern_fall"));

    public static final Supplier<SoundType> BLOCK_LANTERN_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lantern_hit"));

    public static final Supplier<SoundType> BLOCK_LANTERN_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lantern_place"));

    public static final Supplier<SoundType> BLOCK_LANTERN_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lantern_step"));

    public static final Supplier<SoundType> BLOCK_LAVA_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lava_ambient"));

    public static final Supplier<SoundType> BLOCK_LAVA_EXTINGUISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lava_extinguish"));

    public static final Supplier<SoundType> BLOCK_LAVA_POP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lava_pop"));

    public static final Supplier<SoundType> BLOCK_LEVER_CLICK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lever_click"));

    public static final Supplier<SoundType> BLOCK_LILY_PAD_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_lily_pad_place"));

    public static final Supplier<SoundType> BLOCK_METAL_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_break"));

    public static final Supplier<SoundType> BLOCK_METAL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_fall"));

    public static final Supplier<SoundType> BLOCK_METAL_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_hit"));

    public static final Supplier<SoundType> BLOCK_METAL_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_place"));

    public static final Supplier<SoundType> BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_pressure_plate_click_off"));

    public static final Supplier<SoundType> BLOCK_METAL_PRESSURE_PLATE_CLICK_ON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_pressure_plate_click_on"));

    public static final Supplier<SoundType> BLOCK_METAL_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_metal_step"));

    public static final Supplier<SoundType> BLOCK_NETHER_WART_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_nether_wart_break"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_BANJO = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_banjo"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_BASEDRUM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_basedrum"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_BASS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_bass"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_BELL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_bell"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_BIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_bit"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_CHIME = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_chime"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_COW_BELL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_cow_bell"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_DIDGERIDOO = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_didgeridoo"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_FLUTE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_flute"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_GUITAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_guitar"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_HARP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_harp"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_HAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_hat"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_IRON_XYLOPHONE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_iron_xylophone"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_PLING = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_pling"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_SNARE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_snare"));

    public static final Supplier<SoundType> BLOCK_NOTE_BLOCK_XYLOPHONE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_note_block_xylophone"));

    public static final Supplier<SoundType> BLOCK_PISTON_CONTRACT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_piston_contract"));

    public static final Supplier<SoundType> BLOCK_PISTON_EXTEND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_piston_extend"));

    public static final Supplier<SoundType> BLOCK_PORTAL_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_portal_ambient"));

    public static final Supplier<SoundType> BLOCK_PORTAL_TRAVEL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_portal_travel"));

    public static final Supplier<SoundType> BLOCK_PORTAL_TRIGGER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_portal_trigger"));

    public static final Supplier<SoundType> BLOCK_PUMPKIN_CARVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_pumpkin_carve"));

    public static final Supplier<SoundType> BLOCK_REDSTONE_TORCH_BURNOUT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_redstone_torch_burnout"));

    public static final Supplier<SoundType> BLOCK_SAND_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sand_break"));

    public static final Supplier<SoundType> BLOCK_SAND_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sand_fall"));

    public static final Supplier<SoundType> BLOCK_SAND_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sand_hit"));

    public static final Supplier<SoundType> BLOCK_SAND_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sand_place"));

    public static final Supplier<SoundType> BLOCK_SAND_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sand_step"));

    public static final Supplier<SoundType> BLOCK_SCAFFOLDING_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_scaffolding_break"));

    public static final Supplier<SoundType> BLOCK_SCAFFOLDING_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_scaffolding_fall"));

    public static final Supplier<SoundType> BLOCK_SCAFFOLDING_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_scaffolding_hit"));

    public static final Supplier<SoundType> BLOCK_SCAFFOLDING_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_scaffolding_place"));

    public static final Supplier<SoundType> BLOCK_SCAFFOLDING_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_scaffolding_step"));

    public static final Supplier<SoundType> BLOCK_SHULKER_BOX_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_shulker_box_close"));

    public static final Supplier<SoundType> BLOCK_SHULKER_BOX_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_shulker_box_open"));

    public static final Supplier<SoundType> BLOCK_SLIME_BLOCK_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_slime_block_break"));

    public static final Supplier<SoundType> BLOCK_SLIME_BLOCK_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_slime_block_fall"));

    public static final Supplier<SoundType> BLOCK_SLIME_BLOCK_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_slime_block_hit"));

    public static final Supplier<SoundType> BLOCK_SLIME_BLOCK_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_slime_block_place"));

    public static final Supplier<SoundType> BLOCK_SLIME_BLOCK_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_slime_block_step"));

    public static final Supplier<SoundType> BLOCK_SMOKER_SMOKE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_smoker_smoke"));

    public static final Supplier<SoundType> BLOCK_SNOW_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_snow_break"));

    public static final Supplier<SoundType> BLOCK_SNOW_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_snow_fall"));

    public static final Supplier<SoundType> BLOCK_SNOW_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_snow_hit"));

    public static final Supplier<SoundType> BLOCK_SNOW_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_snow_place"));

    public static final Supplier<SoundType> BLOCK_SNOW_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_snow_step"));

    public static final Supplier<SoundType> BLOCK_STONE_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_break"));

    public static final Supplier<SoundType> BLOCK_STONE_BUTTON_CLICK_OFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_button_click_off"));

    public static final Supplier<SoundType> BLOCK_STONE_BUTTON_CLICK_ON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_button_click_on"));

    public static final Supplier<SoundType> BLOCK_STONE_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_fall"));

    public static final Supplier<SoundType> BLOCK_STONE_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_hit"));

    public static final Supplier<SoundType> BLOCK_STONE_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_place"));

    public static final Supplier<SoundType> BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_pressure_plate_click_off"));

    public static final Supplier<SoundType> BLOCK_STONE_PRESSURE_PLATE_CLICK_ON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_pressure_plate_click_on"));

    public static final Supplier<SoundType> BLOCK_STONE_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_stone_step"));

    public static final Supplier<SoundType> BLOCK_SWEET_BERRY_BUSH_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sweet_berry_bush_break"));

    public static final Supplier<SoundType> BLOCK_SWEET_BERRY_BUSH_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_sweet_berry_bush_place"));

    public static final Supplier<SoundType> BLOCK_TRIPWIRE_ATTACH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_tripwire_attach"));

    public static final Supplier<SoundType> BLOCK_TRIPWIRE_CLICK_OFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_tripwire_click_off"));

    public static final Supplier<SoundType> BLOCK_TRIPWIRE_CLICK_ON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_tripwire_click_on"));

    public static final Supplier<SoundType> BLOCK_TRIPWIRE_DETACH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_tripwire_detach"));

    public static final Supplier<SoundType> BLOCK_WATER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_water_ambient"));

    public static final Supplier<SoundType> BLOCK_WET_GRASS_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wet_grass_break"));

    public static final Supplier<SoundType> BLOCK_WET_GRASS_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wet_grass_fall"));

    public static final Supplier<SoundType> BLOCK_WET_GRASS_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wet_grass_hit"));

    public static final Supplier<SoundType> BLOCK_WET_GRASS_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wet_grass_place"));

    public static final Supplier<SoundType> BLOCK_WET_GRASS_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wet_grass_step"));

    public static final Supplier<SoundType> BLOCK_WOODEN_BUTTON_CLICK_OFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_button_click_off"));

    public static final Supplier<SoundType> BLOCK_WOODEN_BUTTON_CLICK_ON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_button_click_on"));

    public static final Supplier<SoundType> BLOCK_WOODEN_DOOR_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_door_close"));

    public static final Supplier<SoundType> BLOCK_WOODEN_DOOR_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_door_open"));

    public static final Supplier<SoundType> BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_pressure_plate_click_off"));

    public static final Supplier<SoundType> BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_pressure_plate_click_on"));

    public static final Supplier<SoundType> BLOCK_WOODEN_TRAPDOOR_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_trapdoor_close"));

    public static final Supplier<SoundType> BLOCK_WOODEN_TRAPDOOR_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wooden_trapdoor_open"));

    public static final Supplier<SoundType> BLOCK_WOOD_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wood_break"));

    public static final Supplier<SoundType> BLOCK_WOOD_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wood_fall"));

    public static final Supplier<SoundType> BLOCK_WOOD_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wood_hit"));

    public static final Supplier<SoundType> BLOCK_WOOD_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wood_place"));

    public static final Supplier<SoundType> BLOCK_WOOD_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wood_step"));

    public static final Supplier<SoundType> BLOCK_WOOL_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wool_break"));

    public static final Supplier<SoundType> BLOCK_WOOL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wool_fall"));

    public static final Supplier<SoundType> BLOCK_WOOL_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wool_hit"));

    public static final Supplier<SoundType> BLOCK_WOOL_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wool_place"));

    public static final Supplier<SoundType> BLOCK_WOOL_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("block_wool_step"));

    public static final Supplier<SoundType> ENCHANT_THORNS_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("enchant_thorns_hit"));

    public static final Supplier<SoundType> ENTITY_ARMOR_STAND_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_armor_stand_break"));

    public static final Supplier<SoundType> ENTITY_ARMOR_STAND_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_armor_stand_fall"));

    public static final Supplier<SoundType> ENTITY_ARMOR_STAND_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_armor_stand_hit"));

    public static final Supplier<SoundType> ENTITY_ARMOR_STAND_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_armor_stand_place"));

    public static final Supplier<SoundType> ENTITY_ARROW_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_arrow_hit"));

    public static final Supplier<SoundType> ENTITY_ARROW_HIT_PLAYER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_arrow_hit_player"));

    public static final Supplier<SoundType> ENTITY_ARROW_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_arrow_shoot"));

    public static final Supplier<SoundType> ENTITY_BAT_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bat_ambient"));

    public static final Supplier<SoundType> ENTITY_BAT_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bat_death"));

    public static final Supplier<SoundType> ENTITY_BAT_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bat_hurt"));

    public static final Supplier<SoundType> ENTITY_BAT_LOOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bat_loop"));

    public static final Supplier<SoundType> ENTITY_BAT_TAKEOFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bat_takeoff"));

    public static final Supplier<SoundType> ENTITY_BEE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bee_death"));

    public static final Supplier<SoundType> ENTITY_BEE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bee_hurt"));

    public static final Supplier<SoundType> ENTITY_BEE_LOOP_AGGRESSIVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bee_loop_aggressive"));

    public static final Supplier<SoundType> ENTITY_BEE_LOOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bee_loop"));

    public static final Supplier<SoundType> ENTITY_BEE_STING = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bee_string"));

    public static final Supplier<SoundType> ENTITY_BEE_POLLINATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_bee_pollinate"));

    public static final Supplier<SoundType> ENTITY_BLAZE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_blaze_ambient"));

    public static final Supplier<SoundType> ENTITY_BLAZE_BURN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_blaze_burn"));

    public static final Supplier<SoundType> ENTITY_BLAZE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_blaze_death"));

    public static final Supplier<SoundType> ENTITY_BLAZE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_blaze_hurt"));

    public static final Supplier<SoundType> ENTITY_BLAZE_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_blaze_shoot"));

    public static final Supplier<SoundType> ENTITY_BOAT_PADDLE_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_boat_paddle_land"));

    public static final Supplier<SoundType> ENTITY_BOAT_PADDLE_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_boat_paddle_water"));

    public static final Supplier<SoundType> ENTITY_CAT_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_ambient"));

    public static final Supplier<SoundType> ENTITY_CAT_BEG_FOR_FOOD = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_beg_for_food"));

    public static final Supplier<SoundType> ENTITY_CAT_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_death"));

    public static final Supplier<SoundType> ENTITY_CAT_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_eat"));

    public static final Supplier<SoundType> ENTITY_CAT_HISS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_hiss"));

    public static final Supplier<SoundType> ENTITY_CAT_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_hurt"));

    public static final Supplier<SoundType> ENTITY_CAT_PURR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_purr"));

    public static final Supplier<SoundType> ENTITY_CAT_PURREOW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_purreow"));

    public static final Supplier<SoundType> ENTITY_CAT_STRAY_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cat_stray_ambient"));

    public static final Supplier<SoundType> ENTITY_CHICKEN_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_chicken_ambient"));

    public static final Supplier<SoundType> ENTITY_CHICKEN_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_chicken_death"));

    public static final Supplier<SoundType> ENTITY_CHICKEN_EGG = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_chicken_egg"));

    public static final Supplier<SoundType> ENTITY_CHICKEN_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_chicken_hurt"));

    public static final Supplier<SoundType> ENTITY_CHICKEN_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_chicken_step"));

    public static final Supplier<SoundType> ENTITY_COD_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cod_ambient"));

    public static final Supplier<SoundType> ENTITY_COD_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cod_death"));

    public static final Supplier<SoundType> ENTITY_COD_FLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cod_flop"));

    public static final Supplier<SoundType> ENTITY_COD_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cod_hurt"));

    public static final Supplier<SoundType> ENTITY_COW_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cow_ambient"));

    public static final Supplier<SoundType> ENTITY_COW_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cow_death"));

    public static final Supplier<SoundType> ENTITY_COW_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cow_hurt"));

    public static final Supplier<SoundType> ENTITY_COW_MILK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cow_milk"));

    public static final Supplier<SoundType> ENTITY_COW_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_cow_step"));

    public static final Supplier<SoundType> ENTITY_CREEPER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_creeper_death"));

    public static final Supplier<SoundType> ENTITY_CREEPER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_creeper_hurt"));

    public static final Supplier<SoundType> ENTITY_CREEPER_PRIMED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_creeper_primed"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_ambient"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_AMBIENT_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_ambient_water"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_attack"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_death"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_eat"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_hurt"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_JUMP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_jump"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_PLAY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_play"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_SPLASH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_splash"));

    public static final Supplier<SoundType> ENTITY_DOLPHIN_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dolphin_swim"));

    public static final Supplier<SoundType> ENTITY_DONKEY_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_donkey_ambient"));

    public static final Supplier<SoundType> ENTITY_DONKEY_ANGRY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_donkey_angry"));

    public static final Supplier<SoundType> ENTITY_DONKEY_CHEST = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_donkey_chest"));

    public static final Supplier<SoundType> ENTITY_DONKEY_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_donkey_death"));

    public static final Supplier<SoundType> ENTITY_DONKEY_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_donkey_hurt"));

    public static final Supplier<SoundType> ENTITY_DRAGON_FIREBALL_EXPLODE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_dragon_fireball_explode"));

    public static final Supplier<SoundType> ENTITY_DROWNED_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_ambient"));

    public static final Supplier<SoundType> ENTITY_DROWNED_AMBIENT_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_ambient_water"));

    public static final Supplier<SoundType> ENTITY_DROWNED_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_death"));

    public static final Supplier<SoundType> ENTITY_DROWNED_DEATH_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_death_water"));

    public static final Supplier<SoundType> ENTITY_DROWNED_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_hurt"));

    public static final Supplier<SoundType> ENTITY_DROWNED_HURT_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_hurt_water"));

    public static final Supplier<SoundType> ENTITY_DROWNED_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_shoot"));

    public static final Supplier<SoundType> ENTITY_DROWNED_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_step"));

    public static final Supplier<SoundType> ENTITY_DROWNED_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_drowned_swim"));

    public static final Supplier<SoundType> ENTITY_EGG_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_egg_throw"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_ambient"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_AMBIENT_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_ambient_land"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_CURSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_curse"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_death"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_DEATH_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_death_land"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_FLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_flop"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_hurt"));

    public static final Supplier<SoundType> ENTITY_ELDER_GUARDIAN_HURT_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_elder_guardian_hurt_land"));

    public static final Supplier<SoundType> ENTITY_ENDERMAN_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_enderman_ambient"));

    public static final Supplier<SoundType> ENTITY_ENDERMAN_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_enderman_death"));

    public static final Supplier<SoundType> ENTITY_ENDERMAN_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_enderman_hurt"));

    public static final Supplier<SoundType> ENTITY_ENDERMAN_SCREAM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_enderman_scream"));

    public static final Supplier<SoundType> ENTITY_ENDERMAN_STARE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_enderman_stare"));

    public static final Supplier<SoundType> ENTITY_ENDERMAN_TELEPORT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_enderman_teleport"));

    public static final Supplier<SoundType> ENTITY_ENDERMITE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_endermite_ambient"));

    public static final Supplier<SoundType> ENTITY_ENDERMITE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_endermite_death"));

    public static final Supplier<SoundType> ENTITY_ENDERMITE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_endermite_hurt"));

    public static final Supplier<SoundType> ENTITY_ENDERMITE_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_endermite_step"));

    public static final Supplier<SoundType> ENTITY_ENDER_DRAGON_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_dragon_ambient"));

    public static final Supplier<SoundType> ENTITY_ENDER_DRAGON_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_dragon_death"));

    public static final Supplier<SoundType> ENTITY_ENDER_DRAGON_FLAP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_dragon_flap"));

    public static final Supplier<SoundType> ENTITY_ENDER_DRAGON_GROWL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_dragon_growl"));

    public static final Supplier<SoundType> ENTITY_ENDER_DRAGON_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_dragon_hurt"));

    public static final Supplier<SoundType> ENTITY_ENDER_DRAGON_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_dragon_shoot"));

    public static final Supplier<SoundType> ENTITY_ENDER_EYE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_eye_death"));

    public static final Supplier<SoundType> ENTITY_ENDER_EYE_LAUNCH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_eye_launch"));

    public static final Supplier<SoundType> ENTITY_ENDER_PEARL_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ender_pearl_throw"));

    public static final Supplier<SoundType> ENTITY_EVOKER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_ambient"));

    public static final Supplier<SoundType> ENTITY_EVOKER_CAST_SPELL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_cast_spell"));

    public static final Supplier<SoundType> ENTITY_EVOKER_CELEBRATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_celebrate"));

    public static final Supplier<SoundType> ENTITY_EVOKER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_death"));

    public static final Supplier<SoundType> ENTITY_EVOKER_FANGS_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_fangs_attack"));

    public static final Supplier<SoundType> ENTITY_EVOKER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_hurt"));

    public static final Supplier<SoundType> ENTITY_EVOKER_PREPARE_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_prepare_attack"));

    public static final Supplier<SoundType> ENTITY_EVOKER_PREPARE_SUMMON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_prepare_summon"));

    public static final Supplier<SoundType> ENTITY_EVOKER_PREPARE_WOLOLO = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_evoker_prepare_wololo"));

    public static final Supplier<SoundType> ENTITY_EXPERIENCE_BOTTLE_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_experience_bottle_throw"));

    public static final Supplier<SoundType> ENTITY_EXPERIENCE_ORB_PICKUP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_experience_orb_pickup"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_BLAST = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_blast"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_BLAST_FAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_blast_far"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_LARGE_BLAST = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_large_blast"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_large_blast_far"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_LAUNCH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_launch"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_shoot"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_TWINKLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_twinkle"));

    public static final Supplier<SoundType> ENTITY_FIREWORK_ROCKET_TWINKLE_FAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_firework_rocket_twinkle_far"));

    public static final Supplier<SoundType> ENTITY_FISHING_BOBBER_RETRIEVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fishing_bobber_retrieve"));

    public static final Supplier<SoundType> ENTITY_FISHING_BOBBER_SPLASH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fishing_bobber_splash"));

    public static final Supplier<SoundType> ENTITY_FISHING_BOBBER_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fishing_bobber_throw"));

    public static final Supplier<SoundType> ENTITY_FISH_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fish_swim"));

    public static final Supplier<SoundType> ENTITY_FOX_AGGRO = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_aggro"));

    public static final Supplier<SoundType> ENTITY_FOX_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_ambient"));

    public static final Supplier<SoundType> ENTITY_FOX_BITE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_bite"));

    public static final Supplier<SoundType> ENTITY_FOX_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_death"));

    public static final Supplier<SoundType> ENTITY_FOX_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_eat"));

    public static final Supplier<SoundType> ENTITY_FOX_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_hurt"));

    public static final Supplier<SoundType> ENTITY_FOX_SCREECH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_screech"));

    public static final Supplier<SoundType> ENTITY_FOX_SLEEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_sleep"));

    public static final Supplier<SoundType> ENTITY_FOX_SNIFF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_sniff"));

    public static final Supplier<SoundType> ENTITY_FOX_SPIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_fox_spit"));

    public static final Supplier<SoundType> ENTITY_GENERIC_BIG_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_big_fall"));

    public static final Supplier<SoundType> ENTITY_GENERIC_BURN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_burn"));

    public static final Supplier<SoundType> ENTITY_GENERIC_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_death"));

    public static final Supplier<SoundType> ENTITY_GENERIC_DRINK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_drink"));

    public static final Supplier<SoundType> ENTITY_GENERIC_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_eat"));

    public static final Supplier<SoundType> ENTITY_GENERIC_EXPLODE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_explode"));

    public static final Supplier<SoundType> ENTITY_GENERIC_EXTINGUISH_FIRE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_extinguish_fire"));

    public static final Supplier<SoundType> ENTITY_GENERIC_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_hurt"));

    public static final Supplier<SoundType> ENTITY_GENERIC_SMALL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_small_fall"));

    public static final Supplier<SoundType> ENTITY_GENERIC_SPLASH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_splash"));

    public static final Supplier<SoundType> ENTITY_GENERIC_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_generic_swim"));

    public static final Supplier<SoundType> ENTITY_GHAST_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ghast_ambient"));

    public static final Supplier<SoundType> ENTITY_GHAST_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ghast_death"));

    public static final Supplier<SoundType> ENTITY_GHAST_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ghast_hurt"));

    public static final Supplier<SoundType> ENTITY_GHAST_SCREAM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ghast_scream"));

    public static final Supplier<SoundType> ENTITY_GHAST_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ghast_shoot"));

    public static final Supplier<SoundType> ENTITY_GHAST_WARN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ghast_warn"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_ambient"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_AMBIENT_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_ambient_land"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_attack"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_death"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_DEATH_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_death_land"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_FLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_flop"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_hurt"));

    public static final Supplier<SoundType> ENTITY_GUARDIAN_HURT_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_guardian_hurt_land"));

    public static final Supplier<SoundType> ENTITY_HORSE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_ambient"));

    public static final Supplier<SoundType> ENTITY_HORSE_ANGRY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_angry"));

    public static final Supplier<SoundType> ENTITY_HORSE_ARMOR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_armor"));

    public static final Supplier<SoundType> ENTITY_HORSE_BREATHE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_breathe"));

    public static final Supplier<SoundType> ENTITY_HORSE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_death"));

    public static final Supplier<SoundType> ENTITY_HORSE_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_eat"));

    public static final Supplier<SoundType> ENTITY_HORSE_GALLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_gallop"));

    public static final Supplier<SoundType> ENTITY_HORSE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_hurt"));

    public static final Supplier<SoundType> ENTITY_HORSE_JUMP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_jump"));

    public static final Supplier<SoundType> ENTITY_HORSE_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_land"));

    public static final Supplier<SoundType> ENTITY_HORSE_SADDLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_saddle"));

    public static final Supplier<SoundType> ENTITY_HORSE_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_step"));

    public static final Supplier<SoundType> ENTITY_HORSE_STEP_WOOD = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_horse_step_wood"));

    public static final Supplier<SoundType> ENTITY_HOSTILE_BIG_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_hostile_big_fall"));

    public static final Supplier<SoundType> ENTITY_HOSTILE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_hostile_death"));

    public static final Supplier<SoundType> ENTITY_HOSTILE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_hostile_hurt"));

    public static final Supplier<SoundType> ENTITY_HOSTILE_SMALL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_hostile_small_fall"));

    public static final Supplier<SoundType> ENTITY_HOSTILE_SPLASH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_hostile_splash"));

    public static final Supplier<SoundType> ENTITY_HOSTILE_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_hostile_swim"));

    public static final Supplier<SoundType> ENTITY_HUSK_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_husk_ambient"));

    public static final Supplier<SoundType> ENTITY_HUSK_CONVERTED_TO_ZOMBIE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_husk_converted_to_zombie"));

    public static final Supplier<SoundType> ENTITY_HUSK_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_husk_death"));

    public static final Supplier<SoundType> ENTITY_HUSK_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_husk_hurt"));

    public static final Supplier<SoundType> ENTITY_HUSK_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_husk_step"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_ambient"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_CAST_SPELL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_cast_spell"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_death"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_hurt"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_MIRROR_MOVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_mirror_move"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_PREPARE_BLINDNESS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_prepare_blindness"));

    public static final Supplier<SoundType> ENTITY_ILLUSIONER_PREPARE_MIRROR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_illusioner_prepare_mirror"));

    public static final Supplier<SoundType> ENTITY_IRON_GOLEM_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_iron_golem_attack"));

    public static final Supplier<SoundType> ENTITY_IRON_GOLEM_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_iron_golem_death"));

    public static final Supplier<SoundType> ENTITY_IRON_GOLEM_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_iron_golem_hurt"));

    public static final Supplier<SoundType> ENTITY_IRON_GOLEM_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_iron_golem_step"));

    public static final Supplier<SoundType> ENTITY_ITEM_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_break"));

    public static final Supplier<SoundType> ENTITY_ITEM_FRAME_ADD_ITEM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_frame_add_item"));

    public static final Supplier<SoundType> ENTITY_ITEM_FRAME_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_frame_break"));

    public static final Supplier<SoundType> ENTITY_ITEM_FRAME_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_frame_place"));

    public static final Supplier<SoundType> ENTITY_ITEM_FRAME_REMOVE_ITEM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_frame_remove_item"));

    public static final Supplier<SoundType> ENTITY_ITEM_FRAME_ROTATE_ITEM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_frame_rotate_item"));

    public static final Supplier<SoundType> ENTITY_ITEM_PICKUP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_item_pickup"));

    public static final Supplier<SoundType> ENTITY_LEASH_KNOT_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_leash_knot_break"));

    public static final Supplier<SoundType> ENTITY_LEASH_KNOT_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_leash_knot_place"));

    public static final Supplier<SoundType> ENTITY_LIGHTNING_BOLT_IMPACT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_lightning_bolt_impact"));

    public static final Supplier<SoundType> ENTITY_LIGHTNING_BOLT_THUNDER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_lightning_bolt_thunder"));

    public static final Supplier<SoundType> ENTITY_LINGERING_POTION_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_lingering_potion_throw"));

    public static final Supplier<SoundType> ENTITY_LLAMA_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_ambient"));

    public static final Supplier<SoundType> ENTITY_LLAMA_ANGRY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_angry"));

    public static final Supplier<SoundType> ENTITY_LLAMA_CHEST = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_chest"));

    public static final Supplier<SoundType> ENTITY_LLAMA_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_death"));

    public static final Supplier<SoundType> ENTITY_LLAMA_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_eat"));

    public static final Supplier<SoundType> ENTITY_LLAMA_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_hurt"));

    public static final Supplier<SoundType> ENTITY_LLAMA_SPIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_spit"));

    public static final Supplier<SoundType> ENTITY_LLAMA_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_step"));

    public static final Supplier<SoundType> ENTITY_LLAMA_SWAG = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_llama_swag"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_death"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_DEATH_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_death_small"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_hurt"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_HURT_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_hurt_small"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_JUMP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_jump"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_SQUISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_squish"));

    public static final Supplier<SoundType> ENTITY_MAGMA_CUBE_SQUISH_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_magma_cube_squish_small"));

    public static final Supplier<SoundType> ENTITY_MINECART_INSIDE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_minecart_inside"));

    public static final Supplier<SoundType> ENTITY_MINECART_RIDING = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_minecart_riding"));

    public static final Supplier<SoundType> ENTITY_MOOSHROOM_CONVERT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mooshroom_convert"));

    public static final Supplier<SoundType> ENTITY_MOOSHROOM_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mooshroom_eat"));

    public static final Supplier<SoundType> ENTITY_MOOSHROOM_MILK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mooshroom_milk"));

    public static final Supplier<SoundType> ENTITY_MOOSHROOM_SHEAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mooshroom_shear"));

    public static final Supplier<SoundType> ENTITY_MOOSHROOM_SUSPICIOUS_MILK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mooshroom_suspicious_milk"));

    public static final Supplier<SoundType> ENTITY_MULE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mule_ambient"));

    public static final Supplier<SoundType> ENTITY_MULE_CHEST = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mule_chest"));

    public static final Supplier<SoundType> ENTITY_MULE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mule_death"));

    public static final Supplier<SoundType> ENTITY_MULE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_mule_hurt"));

    public static final Supplier<SoundType> ENTITY_OCELOT_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ocelot_ambient"));

    public static final Supplier<SoundType> ENTITY_OCELOT_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ocelot_death"));

    public static final Supplier<SoundType> ENTITY_OCELOT_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ocelot_hurt"));

    public static final Supplier<SoundType> ENTITY_PAINTING_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_painting_break"));

    public static final Supplier<SoundType> ENTITY_PAINTING_PLACE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_painting_place"));

    public static final Supplier<SoundType> ENTITY_PANDA_AGGRESSIVE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_aggressive_ambient"));

    public static final Supplier<SoundType> ENTITY_PANDA_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_ambient"));

    public static final Supplier<SoundType> ENTITY_PANDA_BITE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_bite"));

    public static final Supplier<SoundType> ENTITY_PANDA_CANT_BREED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_cant_breed"));

    public static final Supplier<SoundType> ENTITY_PANDA_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_death"));

    public static final Supplier<SoundType> ENTITY_PANDA_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_eat"));

    public static final Supplier<SoundType> ENTITY_PANDA_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_hurt"));

    public static final Supplier<SoundType> ENTITY_PANDA_PRE_SNEEZE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_pre_sneeze"));

    public static final Supplier<SoundType> ENTITY_PANDA_SNEEZE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_sneeze"));

    public static final Supplier<SoundType> ENTITY_PANDA_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_step"));

    public static final Supplier<SoundType> ENTITY_PANDA_WORRIED_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_panda_worried_ambient"));

    public static final Supplier<SoundType> ENTITY_PARROT_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_ambient"));

    public static final Supplier<SoundType> ENTITY_PARROT_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_death"));

    public static final Supplier<SoundType> ENTITY_PARROT_EAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_eat"));

    public static final Supplier<SoundType> ENTITY_PARROT_FLY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_fly"));

    public static final Supplier<SoundType> ENTITY_PARROT_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_hurt"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_BLAZE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_blaze"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_CREEPER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_creeper"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_DROWNED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_drowned"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ELDER_GUARDIAN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_elder_guardian"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ENDERMAN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_enderman"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ENDERMITE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_endermite"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ENDER_DRAGON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_ender_dragon"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_EVOKER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_evoker"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_GHAST = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_ghast"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_GUARDIAN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_guardian"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_HUSK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_husk"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ILLUSIONER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_illusioner"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_MAGMA_CUBE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_magma_cube"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_PANDA = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_panda"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_PHANTOM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_phantom"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_PILLAGER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_pillager"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_POLAR_BEAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_polar_bear"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_RAVAGER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_ravager"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_SHULKER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_shulker"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_SILVERFISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_silverfish"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_SKELETON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_skeleton"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_SLIME = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_slime"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_SPIDER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_spider"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_STRAY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_stray"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_VEX = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_vex"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_VINDICATOR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_vindicator"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_WITCH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_witch"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_WITHER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_wither"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_WITHER_SKELETON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_wither_skeleton"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_WOLF = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_wolf"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ZOMBIE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_zombie"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ZOMBIE_PIGMAN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_zombie_pigman"));

    public static final Supplier<SoundType> ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_imitate_zombie_villager"));

    public static final Supplier<SoundType> ENTITY_PARROT_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_parrot_step"));

    public static final Supplier<SoundType> ENTITY_PHANTOM_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_phantom_ambient"));

    public static final Supplier<SoundType> ENTITY_PHANTOM_BITE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_phantom_bite"));

    public static final Supplier<SoundType> ENTITY_PHANTOM_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_phantom_death"));

    public static final Supplier<SoundType> ENTITY_PHANTOM_FLAP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_phantom_flap"));

    public static final Supplier<SoundType> ENTITY_PHANTOM_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_phantom_hurt"));

    public static final Supplier<SoundType> ENTITY_PHANTOM_SWOOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_phantom_swoop"));

    public static final Supplier<SoundType> ENTITY_PIG_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pig_ambient"));

    public static final Supplier<SoundType> ENTITY_PIG_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pig_death"));

    public static final Supplier<SoundType> ENTITY_PIG_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pig_hurt"));

    public static final Supplier<SoundType> ENTITY_PIG_SADDLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pig_saddle"));

    public static final Supplier<SoundType> ENTITY_PIG_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pig_step"));

    public static final Supplier<SoundType> ENTITY_PILLAGER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pillager_ambient"));

    public static final Supplier<SoundType> ENTITY_PILLAGER_CELEBRATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pillager_celebrate"));

    public static final Supplier<SoundType> ENTITY_PILLAGER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pillager_death"));

    public static final Supplier<SoundType> ENTITY_PILLAGER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_pillager_hurt"));

    public static final Supplier<SoundType> ENTITY_PLAYER_ATTACK_CRIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_attack_crit"));

    public static final Supplier<SoundType> ENTITY_PLAYER_ATTACK_KNOCKBACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_attack_knockback"));

    public static final Supplier<SoundType> ENTITY_PLAYER_ATTACK_NODAMAGE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_attack_nodamage"));

    public static final Supplier<SoundType> ENTITY_PLAYER_ATTACK_STRONG = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_attack_strong"));

    public static final Supplier<SoundType> ENTITY_PLAYER_ATTACK_SWEEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_attack_sweep"));

    public static final Supplier<SoundType> ENTITY_PLAYER_ATTACK_WEAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_attack_weak"));

    public static final Supplier<SoundType> ENTITY_PLAYER_BIG_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_big_fall"));

    public static final Supplier<SoundType> ENTITY_PLAYER_BREATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_breath"));

    public static final Supplier<SoundType> ENTITY_PLAYER_BURP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_burp"));

    public static final Supplier<SoundType> ENTITY_PLAYER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_death"));

    public static final Supplier<SoundType> ENTITY_PLAYER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_hurt"));

    public static final Supplier<SoundType> ENTITY_PLAYER_HURT_DROWN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_hurt_drown"));

    public static final Supplier<SoundType> ENTITY_PLAYER_HURT_ON_FIRE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_hurt_on_fire"));

    public static final Supplier<SoundType> ENTITY_PLAYER_HURT_SWEET_BERRY_BUSH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_hurt_sweet_berry_bush"));

    public static final Supplier<SoundType> ENTITY_PLAYER_LEVELUP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_levelup"));

    public static final Supplier<SoundType> ENTITY_PLAYER_SMALL_FALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_small_fall"));

    public static final Supplier<SoundType> ENTITY_PLAYER_SPLASH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_splash"));

    public static final Supplier<SoundType> ENTITY_PLAYER_SPLASH_HIGH_SPEED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_splash_high_speed"));

    public static final Supplier<SoundType> ENTITY_PLAYER_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_player_swim"));

    public static final Supplier<SoundType> ENTITY_POLAR_BEAR_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_polar_bear_ambient"));

    public static final Supplier<SoundType> ENTITY_POLAR_BEAR_AMBIENT_BABY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_polar_bear_ambient_baby"));

    public static final Supplier<SoundType> ENTITY_POLAR_BEAR_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_polar_bear_death"));

    public static final Supplier<SoundType> ENTITY_POLAR_BEAR_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_polar_bear_hurt"));

    public static final Supplier<SoundType> ENTITY_POLAR_BEAR_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_polar_bear_step"));

    public static final Supplier<SoundType> ENTITY_POLAR_BEAR_WARNING = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_polar_bear_warning"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_ambient"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_BLOW_OUT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_blow_out"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_BLOW_UP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_blow_up"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_death"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_FLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_flop"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_hurt"));

    public static final Supplier<SoundType> ENTITY_PUFFER_FISH_STING = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_puffer_fish_sting"));

    public static final Supplier<SoundType> ENTITY_RABBIT_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_rabbit_ambient"));

    public static final Supplier<SoundType> ENTITY_RABBIT_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_rabbit_attack"));

    public static final Supplier<SoundType> ENTITY_RABBIT_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_rabbit_death"));

    public static final Supplier<SoundType> ENTITY_RABBIT_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_rabbit_hurt"));

    public static final Supplier<SoundType> ENTITY_RABBIT_JUMP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_rabbit_jump"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_ambient"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_attack"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_CELEBRATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_celebrate"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_death"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_hurt"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_ROAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_roar"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_step"));

    public static final Supplier<SoundType> ENTITY_RAVAGER_STUNNED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_ravager_stunned"));

    public static final Supplier<SoundType> ENTITY_SALMON_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_salmon_ambient"));

    public static final Supplier<SoundType> ENTITY_SALMON_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_salmon_death"));

    public static final Supplier<SoundType> ENTITY_SALMON_FLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_salmon_flop"));

    public static final Supplier<SoundType> ENTITY_SALMON_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_salmon_hurt"));

    public static final Supplier<SoundType> ENTITY_SHEEP_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_sheep_ambient"));

    public static final Supplier<SoundType> ENTITY_SHEEP_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_sheep_death"));

    public static final Supplier<SoundType> ENTITY_SHEEP_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_sheep_hurt"));

    public static final Supplier<SoundType> ENTITY_SHEEP_SHEAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_sheep_shear"));

    public static final Supplier<SoundType> ENTITY_SHEEP_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_sheep_step"));

    public static final Supplier<SoundType> ENTITY_SHULKER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_ambient"));

    public static final Supplier<SoundType> ENTITY_SHULKER_BULLET_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_bullet_hit"));

    public static final Supplier<SoundType> ENTITY_SHULKER_BULLET_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_bullet_hurt"));

    public static final Supplier<SoundType> ENTITY_SHULKER_CLOSE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_close"));

    public static final Supplier<SoundType> ENTITY_SHULKER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_death"));

    public static final Supplier<SoundType> ENTITY_SHULKER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_hurt"));

    public static final Supplier<SoundType> ENTITY_SHULKER_HURT_CLOSED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_hurt_closed"));

    public static final Supplier<SoundType> ENTITY_SHULKER_OPEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_open"));

    public static final Supplier<SoundType> ENTITY_SHULKER_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_shoot"));

    public static final Supplier<SoundType> ENTITY_SHULKER_TELEPORT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_shulker_teleport"));

    public static final Supplier<SoundType> ENTITY_SILVERFISH_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_silverfish_ambient"));

    public static final Supplier<SoundType> ENTITY_SILVERFISH_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_silverfish_death"));

    public static final Supplier<SoundType> ENTITY_SILVERFISH_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_silverfish_hurt"));

    public static final Supplier<SoundType> ENTITY_SILVERFISH_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_silverfish_step"));

    public static final Supplier<SoundType> ENTITY_SKELETON_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_ambient"));

    public static final Supplier<SoundType> ENTITY_SKELETON_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_death"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_ambient"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_AMBIENT_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_ambient_water"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_death"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_GALLOP_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_gallop_water"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_hurt"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_JUMP_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_jump_water"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_STEP_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_step_water"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HORSE_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_horse_swim"));

    public static final Supplier<SoundType> ENTITY_SKELETON_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_hurt"));

    public static final Supplier<SoundType> ENTITY_SKELETON_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_shoot"));

    public static final Supplier<SoundType> ENTITY_SKELETON_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_skeleton_step"));

    public static final Supplier<SoundType> ENTITY_SLIME_ATTACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_attack"));

    public static final Supplier<SoundType> ENTITY_SLIME_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_death"));

    public static final Supplier<SoundType> ENTITY_SLIME_DEATH_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_death_small"));

    public static final Supplier<SoundType> ENTITY_SLIME_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_hurt"));

    public static final Supplier<SoundType> ENTITY_SLIME_HURT_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_hurt_small"));

    public static final Supplier<SoundType> ENTITY_SLIME_JUMP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_jump"));

    public static final Supplier<SoundType> ENTITY_SLIME_JUMP_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_jump_small"));

    public static final Supplier<SoundType> ENTITY_SLIME_SQUISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_squish"));

    public static final Supplier<SoundType> ENTITY_SLIME_SQUISH_SMALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_slime_squish_small"));

    public static final Supplier<SoundType> ENTITY_SNOWBALL_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_snowball_throw"));

    public static final Supplier<SoundType> ENTITY_SNOW_GOLEM_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_snow_golem_ambient"));

    public static final Supplier<SoundType> ENTITY_SNOW_GOLEM_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_snow_golem_death"));

    public static final Supplier<SoundType> ENTITY_SNOW_GOLEM_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_snow_golem_hurt"));

    public static final Supplier<SoundType> ENTITY_SNOW_GOLEM_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_snow_golem_shoot"));

    public static final Supplier<SoundType> ENTITY_SPIDER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_spider_ambient"));

    public static final Supplier<SoundType> ENTITY_SPIDER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_spider_death"));

    public static final Supplier<SoundType> ENTITY_SPIDER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_spider_hurt"));

    public static final Supplier<SoundType> ENTITY_SPIDER_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_spider_step"));

    public static final Supplier<SoundType> ENTITY_SPLASH_POTION_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_splash_potion_break"));

    public static final Supplier<SoundType> ENTITY_SPLASH_POTION_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_splash_potion_throw"));

    public static final Supplier<SoundType> ENTITY_SQUID_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_squid_ambient"));

    public static final Supplier<SoundType> ENTITY_SQUID_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_squid_death"));

    public static final Supplier<SoundType> ENTITY_SQUID_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_squid_hurt"));

    public static final Supplier<SoundType> ENTITY_SQUID_SQUIRT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_squid_squirt"));

    public static final Supplier<SoundType> ENTITY_STRAY_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_stray_ambient"));

    public static final Supplier<SoundType> ENTITY_STRAY_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_stray_death"));

    public static final Supplier<SoundType> ENTITY_STRAY_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_stray_hurt"));

    public static final Supplier<SoundType> ENTITY_STRAY_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_stray_step"));

    public static final Supplier<SoundType> ENTITY_TNT_PRIMED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_tnt_primed"));

    public static final Supplier<SoundType> ENTITY_TROPICAL_FISH_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_tropical_fish_ambient"));

    public static final Supplier<SoundType> ENTITY_TROPICAL_FISH_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_tropical_fish_death"));

    public static final Supplier<SoundType> ENTITY_TROPICAL_FISH_FLOP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_tropical_fish_flop"));

    public static final Supplier<SoundType> ENTITY_TROPICAL_FISH_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_tropical_fish_hurt"));

    public static final Supplier<SoundType> ENTITY_TURTLE_AMBIENT_LAND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_ambient_land"));

    public static final Supplier<SoundType> ENTITY_TURTLE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_death"));

    public static final Supplier<SoundType> ENTITY_TURTLE_DEATH_BABY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_death_baby"));

    public static final Supplier<SoundType> ENTITY_TURTLE_EGG_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_egg_break"));

    public static final Supplier<SoundType> ENTITY_TURTLE_EGG_CRACK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_egg_crack"));

    public static final Supplier<SoundType> ENTITY_TURTLE_EGG_HATCH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_egg_hatch"));

    public static final Supplier<SoundType> ENTITY_TURTLE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_hurt"));

    public static final Supplier<SoundType> ENTITY_TURTLE_HURT_BABY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_hurt_baby"));

    public static final Supplier<SoundType> ENTITY_TURTLE_LAY_EGG = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_lay_egg"));

    public static final Supplier<SoundType> ENTITY_TURTLE_SHAMBLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_shamble"));

    public static final Supplier<SoundType> ENTITY_TURTLE_SHAMBLE_BABY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_shamble_baby"));

    public static final Supplier<SoundType> ENTITY_TURTLE_SWIM = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_turtle_swim"));

    public static final Supplier<SoundType> ENTITY_VEX_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vex_ambient"));

    public static final Supplier<SoundType> ENTITY_VEX_CHARGE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vex_charge"));

    public static final Supplier<SoundType> ENTITY_VEX_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vex_death"));

    public static final Supplier<SoundType> ENTITY_VEX_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vex_hurt"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_ambient"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_CELEBRATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_celebrate"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_death"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_hurt"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_NO = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_no"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_TRADE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_trade"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_ARMORER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_armorer"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_BUTCHER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_butcher"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_CARTOGRAPHER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_cartographer"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_CLERIC = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_cleric"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_FARMER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_farmer"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_FISHERMAN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_fisherman"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_FLETCHER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_fletcher"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_LEATHERWORKER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_leatherworker"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_LIBRARIAN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_librarian"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_MASON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_mason"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_SHEPHERD = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_shepherd"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_TOOLSMITH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_toolsmith"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_WORK_WEAPONSMITH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_work_weaponsmith"));

    public static final Supplier<SoundType> ENTITY_VILLAGER_YES = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_villager_yes"));

    public static final Supplier<SoundType> ENTITY_VINDICATOR_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vindicator_ambient"));

    public static final Supplier<SoundType> ENTITY_VINDICATOR_CELEBRATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vindicator_celebrate"));

    public static final Supplier<SoundType> ENTITY_VINDICATOR_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vindicator_death"));

    public static final Supplier<SoundType> ENTITY_VINDICATOR_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_vindicator_hurt"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_ambient"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_death"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_DISAPPEARED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_disappeared"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_DRINK_MILK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_drink_milk"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_DRINK_POTION = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_drink_potion"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_hurt"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_NO = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_no"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_REAPPEARED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_reappeared"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_TRADE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_trade"));

    public static final Supplier<SoundType> ENTITY_WANDERING_TRADER_YES = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wandering_trader_yes"));

    public static final Supplier<SoundType> ENTITY_WITCH_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_witch_ambient"));

    public static final Supplier<SoundType> ENTITY_WITCH_CELEBRATE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_witch_celebrate"));

    public static final Supplier<SoundType> ENTITY_WITCH_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_witch_death"));

    public static final Supplier<SoundType> ENTITY_WITCH_DRINK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_witch_drink"));

    public static final Supplier<SoundType> ENTITY_WITCH_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_witch_hurt"));

    public static final Supplier<SoundType> ENTITY_WITCH_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_witch_throw"));

    public static final Supplier<SoundType> ENTITY_WITHER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_ambient"));

    public static final Supplier<SoundType> ENTITY_WITHER_BREAK_BLOCK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_break_block"));

    public static final Supplier<SoundType> ENTITY_WITHER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_death"));

    public static final Supplier<SoundType> ENTITY_WITHER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_hurt"));

    public static final Supplier<SoundType> ENTITY_WITHER_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_shoot"));

    public static final Supplier<SoundType> ENTITY_WITHER_SKELETON_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_skeleton_ambient"));

    public static final Supplier<SoundType> ENTITY_WITHER_SKELETON_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_skeleton_death"));

    public static final Supplier<SoundType> ENTITY_WITHER_SKELETON_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_skeleton_hurt"));

    public static final Supplier<SoundType> ENTITY_WITHER_SKELETON_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_skeleton_step"));

    public static final Supplier<SoundType> ENTITY_WITHER_SPAWN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wither_spawn"));

    public static final Supplier<SoundType> ENTITY_WOLF_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_ambient"));

    public static final Supplier<SoundType> ENTITY_WOLF_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_death"));

    public static final Supplier<SoundType> ENTITY_WOLF_GROWL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_growl"));

    public static final Supplier<SoundType> ENTITY_WOLF_HOWL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_howl"));

    public static final Supplier<SoundType> ENTITY_WOLF_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_hurt"));

    public static final Supplier<SoundType> ENTITY_WOLF_PANT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_pant"));

    public static final Supplier<SoundType> ENTITY_WOLF_SHAKE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_shake"));

    public static final Supplier<SoundType> ENTITY_WOLF_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_step"));

    public static final Supplier<SoundType> ENTITY_WOLF_WHINE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_wolf_whine"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_ambient"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_ATTACK_IRON_DOOR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_attack_iron_door"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_attack_wooden_door"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_BREAK_WOODEN_DOOR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_break_wooden_door"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_CONVERTED_TO_DROWNED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_converted_to_drowned"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_death"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_DESTROY_EGG = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_destroy_egg"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_HORSE_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_horse_ambient"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_HORSE_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_horse_death"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_HORSE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_horse_hurt"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_hurt"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_INFECT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_infect"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_PIGMAN_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_pigman_ambient"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_PIGMAN_ANGRY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_pigman_angry"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_PIGMAN_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_pigman_death"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_PIGMAN_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_pigman_hurt"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_step"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_VILLAGER_AMBIENT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_villager_ambient"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_VILLAGER_CONVERTED = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_villager_converted"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_VILLAGER_CURE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_villager_cure"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_VILLAGER_DEATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_villager_death"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_VILLAGER_HURT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_villager_hurt"));

    public static final Supplier<SoundType> ENTITY_ZOMBIE_VILLAGER_STEP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("entity_zombie_villager_step"));

    public static final Supplier<SoundType> EVENT_RAID_HORN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("event_raid_horn"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_CHAIN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_chain"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_DIAMOND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_diamond"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_ELYTRA = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_elytra"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_GENERIC = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_generic"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_GOLD = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_gold"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_IRON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_iron"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_LEATHER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_leather"));

    public static final Supplier<SoundType> ITEM_ARMOR_EQUIP_TURTLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_armor_equip_turtle"));

    public static final Supplier<SoundType> ITEM_AXE_STRIP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_axe_strip"));

    public static final Supplier<SoundType> ITEM_BOOK_PAGE_TURN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_book_page_turn"));

    public static final Supplier<SoundType> ITEM_BOOK_PUT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_book_put"));

    public static final Supplier<SoundType> ITEM_BOTTLE_EMPTY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bottle_empty"));

    public static final Supplier<SoundType> ITEM_BOTTLE_FILL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bottle_fill"));

    public static final Supplier<SoundType> ITEM_BOTTLE_FILL_DRAGONBREATH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bottle_fill_dragonbreath"));

    public static final Supplier<SoundType> ITEM_BUCKET_EMPTY = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bucket_empty"));

    public static final Supplier<SoundType> ITEM_BUCKET_EMPTY_FISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bucket_empty_fish"));

    public static final Supplier<SoundType> ITEM_BUCKET_EMPTY_LAVA = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bucket_empty_lava"));

    public static final Supplier<SoundType> ITEM_BUCKET_FILL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bucket_fill"));

    public static final Supplier<SoundType> ITEM_BUCKET_FILL_FISH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bucket_fill_fish"));

    public static final Supplier<SoundType> ITEM_BUCKET_FILL_LAVA = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_bucket_fill_lava"));

    public static final Supplier<SoundType> ITEM_CHORUS_FRUIT_TELEPORT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_chorus_fruit_teleport"));

    public static final Supplier<SoundType> ITEM_CROP_PLANT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_crop_plant"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_crossbow_hit"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_LOADING_END = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_crossbow_loading_end"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_LOADING_MIDDLE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_crossbow_loading_middle"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_LOADING_START = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_crossbow_loading_start"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_QUICK_CHARGE_1 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ITEM_CROSSBOW_QUICK_CHARGE_1"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_QUICK_CHARGE_2 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ITEM_CROSSBOW_QUICK_CHARGE_2"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_QUICK_CHARGE_3 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ITEM_CROSSBOW_QUICK_CHARGE_3"));

    public static final Supplier<SoundType> ITEM_CROSSBOW_SHOOT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_crossbow_shoot"));

    public static final Supplier<SoundType> ITEM_ELYTRA_FLYING = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_elytra_flying"));

    public static final Supplier<SoundType> ITEM_FIRECHARGE_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_firecharge_use"));

    public static final Supplier<SoundType> ITEM_FLINTANDSTEEL_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_flintandsteel_use"));

    public static final Supplier<SoundType> ITEM_HOE_TILL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_hoe_till"));

    public static final Supplier<SoundType> ITEM_NETHER_WART_PLANT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_nether_wart_plant"));

    public static final Supplier<SoundType> ITEM_SHIELD_BLOCK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_shield_block"));

    public static final Supplier<SoundType> ITEM_SHIELD_BREAK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_shield_break"));

    public static final Supplier<SoundType> ITEM_SHOVEL_FLATTEN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_shovel_flatten"));

    public static final Supplier<SoundType> ITEM_SWEET_BERRIES_PICK_FROM_BUSH = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_sweet_berries_pick_from_bush"));

    public static final Supplier<SoundType> ITEM_TOTEM_USE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_totem_use"));

    public static final Supplier<SoundType> ITEM_TRIDENT_HIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_trident_hit"));

    public static final Supplier<SoundType> ITEM_TRIDENT_HIT_GROUND = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_trident_hit_ground"));

    public static final Supplier<SoundType> ITEM_TRIDENT_RETURN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_trident_return"));

    public static final Supplier<SoundType> ITEM_TRIDENT_RIPTIDE_1 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ITEM_TRIDENT_RIPTIDE_1"));

    public static final Supplier<SoundType> ITEM_TRIDENT_RIPTIDE_2 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ITEM_TRIDENT_RIPTIDE_2"));

    public static final Supplier<SoundType> ITEM_TRIDENT_RIPTIDE_3 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ITEM_TRIDENT_RIPTIDE_3"));

    public static final Supplier<SoundType> ITEM_TRIDENT_THROW = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_trident_throw"));

    public static final Supplier<SoundType> ITEM_TRIDENT_THUNDER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("item_trident_thunder"));

    public static final Supplier<SoundType> MUSIC_CREATIVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_creative"));

    public static final Supplier<SoundType> MUSIC_CREDITS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_credits"));

    public static final Supplier<SoundType> MUSIC_DISC_11 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("MUSIC_DISC_11"));

    public static final Supplier<SoundType> MUSIC_DISC_13 = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("MUSIC_DISC_13"));

    public static final Supplier<SoundType> MUSIC_DISC_BLOCKS = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_blocks"));

    public static final Supplier<SoundType> MUSIC_DISC_CAT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_cat"));

    public static final Supplier<SoundType> MUSIC_DISC_CHIRP = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_chirp"));

    public static final Supplier<SoundType> MUSIC_DISC_FAR = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_far"));

    public static final Supplier<SoundType> MUSIC_DISC_MALL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_mall"));

    public static final Supplier<SoundType> MUSIC_DISC_MELLOHI = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_mellohi"));

    public static final Supplier<SoundType> MUSIC_DISC_STAL = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_stal"));

    public static final Supplier<SoundType> MUSIC_DISC_STRAD = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_strad"));

    public static final Supplier<SoundType> MUSIC_DISC_WAIT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_wait"));

    public static final Supplier<SoundType> MUSIC_DISC_WARD = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_disc_ward"));

    public static final Supplier<SoundType> MUSIC_DRAGON = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_dragon"));

    public static final Supplier<SoundType> MUSIC_END = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_end"));

    public static final Supplier<SoundType> MUSIC_GAME = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_game"));

    public static final Supplier<SoundType> MUSIC_MENU = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_menu"));

    public static final Supplier<SoundType> MUSIC_NETHER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_nether"));

    public static final Supplier<SoundType> MUSIC_UNDER_WATER = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("music_under_water"));

    public static final Supplier<SoundType> UI_BUTTON_CLICK = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_button_click"));

    public static final Supplier<SoundType> UI_CARTOGRAPHY_TABLE_TAKE_RESULT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_cartography_table_take_result"));

    public static final Supplier<SoundType> UI_LOOM_SELECT_PATTERN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_loom_select_pattern"));

    public static final Supplier<SoundType> UI_LOOM_TAKE_RESULT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_loom_take_result"));

    public static final Supplier<SoundType> UI_STONECUTTER_SELECT_RECIPE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_stonecutter_select_recipe"));

    public static final Supplier<SoundType> UI_STONECUTTER_TAKE_RESULT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_stonecutter_take_result"));

    public static final Supplier<SoundType> UI_TOAST_CHALLENGE_COMPLETE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_toast_challenge_complete"));

    public static final Supplier<SoundType> UI_TOAST_IN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_toast_in"));

    public static final Supplier<SoundType> UI_TOAST_OUT = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("ui_toast_out"));

    public static final Supplier<SoundType> WEATHER_RAIN = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("weather_rain"));

    public static final Supplier<SoundType> WEATHER_RAIN_ABOVE = Registries.SOUND_TYPE.getSupplier(ResourceKey.minecraft("weather_rain_above"));

    // SORTFIELDS:OFF

    private SoundTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
