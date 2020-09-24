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

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class PotionEffectTypes {

    // SORTFIELDS:ON

    public static final Supplier<PotionEffectType> ABSORPTION = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("absorption"));

    public static final Supplier<PotionEffectType> BAD_OMEN = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("bad_omen"));

    public static final Supplier<PotionEffectType> BLINDNESS = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("blindness"));

    public static final Supplier<PotionEffectType> CONDUIT_POWER = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("conduit_power"));

    public static final Supplier<PotionEffectType> DOLPHINS_GRACE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("dolphins_grace"));

    public static final Supplier<PotionEffectType> FIRE_RESISTANCE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("fire_resistance"));

    public static final Supplier<PotionEffectType> GLOWING = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("glowing"));

    public static final Supplier<PotionEffectType> HASTE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("haste"));

    public static final Supplier<PotionEffectType> HEALTH_BOOST = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("health_boost"));

    public static final Supplier<PotionEffectType> HERO_OF_THE_VILLAGE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("hero_of_the_village"));

    public static final Supplier<PotionEffectType> HUNGER = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("hunger"));

    public static final Supplier<PotionEffectType> INSTANT_DAMAGE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("instant_damage"));

    public static final Supplier<PotionEffectType> INSTANT_HEALTH = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("instant_health"));

    public static final Supplier<PotionEffectType> INVISIBILITY = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("invisibility"));

    public static final Supplier<PotionEffectType> JUMP_BOOST = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("jump_boost"));

    public static final Supplier<PotionEffectType> LEVITATION = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("levitation"));

    public static final Supplier<PotionEffectType> LUCK = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("luck"));

    public static final Supplier<PotionEffectType> MINING_FATIGUE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("mining_fatigue"));

    public static final Supplier<PotionEffectType> NAUSEA = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("nausea"));

    public static final Supplier<PotionEffectType> NIGHT_VISION = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("night_vision"));

    public static final Supplier<PotionEffectType> POISON = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("poison"));

    public static final Supplier<PotionEffectType> REGENERATION = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("regeneration"));

    public static final Supplier<PotionEffectType> RESISTANCE = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("resistance"));

    public static final Supplier<PotionEffectType> SATURATION = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("saturation"));

    public static final Supplier<PotionEffectType> SLOWNESS = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("slowness"));

    public static final Supplier<PotionEffectType> SLOW_FALLING = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("slow_falling"));

    public static final Supplier<PotionEffectType> SPEED = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("speed"));

    public static final Supplier<PotionEffectType> STRENGTH = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("strength"));

    public static final Supplier<PotionEffectType> UNLUCK = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("unluck"));

    public static final Supplier<PotionEffectType> WATER_BREATHING = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("water_breathing"));

    public static final Supplier<PotionEffectType> WEAKNESS = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("weakness"));

    public static final Supplier<PotionEffectType> WITHER = Registries.POTION_EFFECT_TYPE.getSupplier(ResourceKey.minecraft("wither"));

    // SORTFIELDS:OFF

    private PotionEffectTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
