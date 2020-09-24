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
package org.spongepowered.api.statistic;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class Statistics {

    // SORTFIELDS:ON

    public static final Supplier<Statistic> ANIMALS_BRED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("animals_bred"));

    public static final Supplier<Statistic> ARMOR_CLEANED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("armor_cleaned"));

    public static final Supplier<Statistic> AVIATE_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("aviate_one_cm"));

    public static final Supplier<Statistic> BANNER_CLEANED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("banner_cleaned"));

    public static final Supplier<Statistic> BEACON_INTERACTION = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("beacon_interaction"));

    public static final Supplier<Statistic> BOAT_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("boat_one_cm"));

    public static final Supplier<Statistic> BREWINGSTAND_INTERACTION = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("brewingstand_interaction"));

    public static final Supplier<Statistic> CAKE_SLICES_EATEN = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("cake_slices_eaten"));

    public static final Supplier<Statistic> CAULDRON_FILLED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("cauldron_filled"));

    public static final Supplier<Statistic> CAULDRON_USED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("cauldron_used"));

    public static final Supplier<Statistic> CHEST_OPENED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("chest_opened"));

    public static final Supplier<Statistic> CLIMB_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("climb_one_cm"));

    public static final Supplier<Statistic> CRAFTING_TABLE_INTERACTION = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("crafting_table_interaction"));

    public static final Supplier<Statistic> CROUCH_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("crouch_one_cm"));

    public static final Supplier<Statistic> DAMAGE_DEALT = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("damage_dealt"));

    public static final Supplier<Statistic> DAMAGE_TAKEN = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("damage_taken"));

    public static final Supplier<Statistic> DEATHS = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("deaths"));

    public static final Supplier<Statistic> DISPENSER_INSPECTED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("dispenser_inspected"));

    public static final Supplier<Statistic> DIVE_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("dive_one_cm"));

    public static final Supplier<Statistic> DROP = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("drop"));

    public static final Supplier<Statistic> DROPPER_INSPECTED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("dropper_inspected"));

    public static final Supplier<Statistic> ENDERCHEST_OPENED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("enderchest_opened"));

    public static final Supplier<Statistic> FALL_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("fall_one_cm"));

    public static final Supplier<Statistic> FISH_CAUGHT = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("fish_caught"));

    public static final Supplier<Statistic> FLOWER_POTTED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("flower_potted"));

    public static final Supplier<Statistic> FURNACE_INTERACTION = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("furnace_interaction"));

    public static final Supplier<Statistic> HOPPER_INSPECTED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("hopper_inspected"));

    public static final Supplier<Statistic> HORSE_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("horse_one_cm"));

    public static final Supplier<Statistic> ITEM_ENCHANTED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("item_enchanted"));

    public static final Supplier<Statistic> JUMP = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("jump"));

    public static final Supplier<Statistic> LEAVE_GAME = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("leave_game"));

    public static final Supplier<Statistic> MINECART_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("minecart_one_cm"));

    public static final Supplier<Statistic> MOB_KILLS = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("mob_kills"));

    public static final Supplier<Statistic> NOTEBLOCK_PLAYED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("noteblock_played"));

    public static final Supplier<Statistic> NOTEBLOCK_TUNED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("noteblock_tuned"));

    public static final Supplier<Statistic> OPEN_SHULKER_BOX = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("open_shulker_box"));

    public static final Supplier<Statistic> PIG_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("pig_one_cm"));

    public static final Supplier<Statistic> PLAYER_KILLS = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("player_kills"));

    public static final Supplier<Statistic> RECORD_PLAYED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("record_played"));

    public static final Supplier<Statistic> SLEEP_IN_BED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("sleep_in_bed"));

    public static final Supplier<Statistic> SNEAK_TIME = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("sneak_time"));

    public static final Supplier<Statistic> SPRINT_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("sprint_one_cm"));

    public static final Supplier<Statistic> SWIM_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("swim_one_cm"));

    public static final Supplier<Statistic> TALKED_TO_VILLAGER = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("talked_to_villager"));

    public static final Supplier<Statistic> TIME_PLAYED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("time_played"));

    public static final Supplier<Statistic> TIME_SINCE_DEATH = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("time_since_death"));

    public static final Supplier<Statistic> TRADED_WITH_VILLAGER = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("traded_with_villager"));

    public static final Supplier<Statistic> TRAPPED_CHEST_TRIGGERED = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("trapped_chest_triggered"));

    public static final Supplier<Statistic> WALK_ONE_CM = Registries.STATISTIC.getSupplier(ResourceKey.minecraft("walk_one_cm"));

    // SORTFIELDS:OFF

    private Statistics() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
