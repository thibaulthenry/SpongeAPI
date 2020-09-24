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
package org.spongepowered.api.effect.potion;

import org.spongepowered.api.Sponge;

import java.util.function.Supplier;

/**
 * An enumeration of all possible {@link PotionEffectType}s in vanilla Minecraft.
 */
public final class PotionEffectTypes {

    // SORTFIELDS:ON

    public static final Supplier<PotionEffectType> ABSORPTION = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "absorption");

    public static final Supplier<PotionEffectType> BAD_OMEN = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "bad_omen");

    public static final Supplier<PotionEffectType> BLINDNESS = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "blindness");

    public static final Supplier<PotionEffectType> CONDUIT_POWER = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "conduit_power");

    public static final Supplier<PotionEffectType> DOLPHINS_GRACE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "dolphins_grace");

    public static final Supplier<PotionEffectType> FIRE_RESISTANCE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "fire_resistance");

    public static final Supplier<PotionEffectType> GLOWING = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "glowing");

    public static final Supplier<PotionEffectType> HASTE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "haste");

    public static final Supplier<PotionEffectType> HEALTH_BOOST = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "health_boost");

    public static final Supplier<PotionEffectType> HERO_OF_THE_VILLAGE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "hero_of_the_village");

    public static final Supplier<PotionEffectType> HUNGER = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "hunger");

    public static final Supplier<PotionEffectType> INSTANT_DAMAGE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "instant_damage");

    public static final Supplier<PotionEffectType> INSTANT_HEALTH = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "instant_health");

    public static final Supplier<PotionEffectType> INVISIBILITY = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "invisibility");

    public static final Supplier<PotionEffectType> JUMP_BOOST = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "jump_boost");

    public static final Supplier<PotionEffectType> LEVITATION = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "levitation");

    public static final Supplier<PotionEffectType> LUCK = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "luck");

    public static final Supplier<PotionEffectType> MINING_FATIGUE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "mining_fatigue");

    public static final Supplier<PotionEffectType> NAUSEA = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "nausea");

    public static final Supplier<PotionEffectType> NIGHT_VISION = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "night_vision");

    public static final Supplier<PotionEffectType> POISON = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "poison");

    public static final Supplier<PotionEffectType> REGENERATION = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "regeneration");

    public static final Supplier<PotionEffectType> RESISTANCE = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "resistance");

    public static final Supplier<PotionEffectType> SATURATION = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "saturation");

    public static final Supplier<PotionEffectType> SLOWNESS = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "slowness");

    public static final Supplier<PotionEffectType> SLOW_FALLING = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "slow_falling");

    public static final Supplier<PotionEffectType> SPEED = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "speed");

    public static final Supplier<PotionEffectType> STRENGTH = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "strength");

    public static final Supplier<PotionEffectType> UNLUCK = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "unluck");

    public static final Supplier<PotionEffectType> WATER_BREATHING = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "water_breathing");

    public static final Supplier<PotionEffectType> WEAKNESS = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "weakness");

    public static final Supplier<PotionEffectType> WITHER = Sponge.getRegistry().getCatalogRegistry().getSupplier(PotionEffectType.class, "wither");

    // SORTFIELDS:OFF

    // Suppress default constructor to ensure non-instantiability.
    private PotionEffectTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
