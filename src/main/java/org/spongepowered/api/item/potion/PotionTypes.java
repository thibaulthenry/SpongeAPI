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
package org.spongepowered.api.item.potion;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class PotionTypes {

    // SORTFIELDS:ON

    public static final Supplier<PotionType> AWKWARD = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("awkward"));

    public static final Supplier<PotionType> EMPTY = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("empty"));

    public static final Supplier<PotionType> FIRE_RESISTANCE = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("fire_resistance"));

    public static final Supplier<PotionType> HARMING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("harming"));

    public static final Supplier<PotionType> HEALING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("healing"));

    public static final Supplier<PotionType> INVISIBILITY = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("invisibility"));

    public static final Supplier<PotionType> LEAPING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("leaping"));

    public static final Supplier<PotionType> LONG_FIRE_RESISTANCE = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_fire_resistance"));

    public static final Supplier<PotionType> LONG_INVISIBILITY = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_invisibility"));

    public static final Supplier<PotionType> LONG_LEAPING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_leaping"));

    public static final Supplier<PotionType> LONG_NIGHT_VISION = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_night_vision"));

    public static final Supplier<PotionType> LONG_POISON = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_poison"));

    public static final Supplier<PotionType> LONG_REGENERATION = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_regeneration"));

    public static final Supplier<PotionType> LONG_SLOWNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_slowness"));

    public static final Supplier<PotionType> LONG_SLOW_FALLING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_slow_falling"));

    public static final Supplier<PotionType> LONG_STRENGTH = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_strength"));

    public static final Supplier<PotionType> LONG_SWIFTNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_swiftness"));

    public static final Supplier<PotionType> LONG_TURTLE_MASTER = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_turtle_master"));

    public static final Supplier<PotionType> LONG_WATER_BREATHING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_water_breathing"));

    public static final Supplier<PotionType> LONG_WEAKNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("long_weakness"));

    public static final Supplier<PotionType> LUCK = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("luck"));

    public static final Supplier<PotionType> MUNDANE = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("mundane"));

    public static final Supplier<PotionType> NIGHT_VISION = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("night_vision"));

    public static final Supplier<PotionType> POISON = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("poison"));

    public static final Supplier<PotionType> REGENERATION = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("regeneration"));

    public static final Supplier<PotionType> SLOWNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("slowness"));

    public static final Supplier<PotionType> SLOW_FALLING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("slow_falling"));

    public static final Supplier<PotionType> STRENGTH = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strength"));

    public static final Supplier<PotionType> STRONG_HARMING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_harming"));

    public static final Supplier<PotionType> STRONG_HEALING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_healing"));

    public static final Supplier<PotionType> STRONG_LEAPING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_leaping"));

    public static final Supplier<PotionType> STRONG_POISON = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_poison"));

    public static final Supplier<PotionType> STRONG_REGENERATION = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_regeneration"));

    public static final Supplier<PotionType> STRONG_SLOWNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_slowness"));

    public static final Supplier<PotionType> STRONG_STRENGTH = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_strength"));

    public static final Supplier<PotionType> STRONG_SWIFTNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_swiftness"));

    public static final Supplier<PotionType> STRONG_TURTLE_MASTER = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("strong_turtle_master"));

    public static final Supplier<PotionType> SWIFTNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("swiftness"));

    public static final Supplier<PotionType> THICK = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("thick"));

    public static final Supplier<PotionType> TURTLE_MASTER = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("turtle_master"));

    public static final Supplier<PotionType> WATER = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("water"));

    public static final Supplier<PotionType> WATER_BREATHING = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("water_breathing"));

    public static final Supplier<PotionType> WEAKNESS = Registries.POTION_TYPE.getSupplier(ResourceKey.minecraft("weakness"));

    // SORTFIELDS:OFF

    private PotionTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
