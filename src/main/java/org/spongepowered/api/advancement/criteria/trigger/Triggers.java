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
package org.spongepowered.api.advancement.criteria.trigger;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

@SuppressWarnings("rawtypes")
public final class Triggers {

    // SORTFIELDS:ON

    public static final Supplier<Trigger> BRED_ANIMALS = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("bred_animals"));

    public static final Supplier<Trigger> BREWED_POTION = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("brewed_potion"));

    public static final Supplier<Trigger> CHANGED_DIMENSION = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("changed_dimension"));

    public static final Supplier<Trigger> CONSTRUCT_BEACON = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("construct_beacon"));

    public static final Supplier<Trigger> CONSUME_ITEM = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("consume_item"));

    public static final Supplier<Trigger> CURED_ZOMBIE_VILLAGER = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("cured_zombie_villager"));

    public static final Supplier<Trigger> ENCHANTED_ITEM = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("enchanted_item"));

    public static final Supplier<Trigger> ENTER_BLOCK = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("enter_block"));

    public static final Supplier<Trigger> ENTITY_HURT_PLAYER = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("entity_hurt_player"));

    public static final Supplier<Trigger> ENTITY_KILLED_PLAYER = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("entity_killed_player"));

    public static final Supplier<Trigger> IMPOSSIBLE = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("impossible"));

    public static final Supplier<Trigger> INVENTORY_CHANGED = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("inventory_changed"));

    public static final Supplier<Trigger> ITEM_DURABILITY_CHANGED = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("item_durability_changed"));

    public static final Supplier<Trigger> LEVITATION = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("levitation"));

    public static final Supplier<Trigger> LOCATION = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("location"));

    public static final Supplier<Trigger> NETHER_TRAVEL = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("nether_travel"));

    public static final Supplier<Trigger> PLACED_BLOCK = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("placed_block"));

    public static final Supplier<Trigger> PLAYER_HURT_ENTITY = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("player_hurt_entity"));

    public static final Supplier<Trigger> PLAYER_KILLED_ENTITY = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("player_killed_entity"));

    public static final Supplier<Trigger> RECIPE_UNLOCKED = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("recipe_unlocked"));

    public static final Supplier<Trigger> SLEPT_IN_BED = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("slept_in_bed"));

    public static final Supplier<Trigger> SUMMONED_ENTITY = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("summoned_entity"));

    public static final Supplier<Trigger> TAME_ANIMAL = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("tame_animal"));

    public static final Supplier<Trigger> TICK = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("tick"));

    public static final Supplier<Trigger> USED_ENDER_EYE = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("used_ender_eye"));

    public static final Supplier<Trigger> USED_TOTEM = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("used_totem"));

    public static final Supplier<Trigger> VILLAGER_TRADE = Registries.TRIGGER.getSupplier(ResourceKey.minecraft("villager_trade"));

    // SORTFIELDS:OFF

    private Triggers() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
