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
package org.spongepowered.api.effect.particle;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class ParticleTypes {

    // SORTFIELDS:ON

    public static final Supplier<ParticleType> AMBIENT_ENTITY_EFFECT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("ambient_entity_effect"));

    public static final Supplier<ParticleType> ANGRY_VILLAGER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("angry_villager"));

    public static final Supplier<ParticleType> BARRIER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("barrier"));

    public static final Supplier<ParticleType> BLOCK = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("block"));

    /**
     * This particle type will play the effect of a block that
     * is being broken and it's break sound.
     *
     * <p>This type has limited {@link ParticleOption}s, only
     * {@link ParticleOptions#BLOCK_STATE} and
     * {@link ParticleOptions#ITEM_STACK_SNAPSHOT} are supported.</p>
     */
    public static final Supplier<ParticleType> BREAK_BLOCK = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("break_block"));

    public static final Supplier<ParticleType> BREAK_EYE_OF_ENDER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("break_eye_of_ender"));

    public static final Supplier<ParticleType> BREAK_SPLASH_POTION = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("break_splash_potion"));

    public static final Supplier<ParticleType> BUBBLE = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("bubble"));

    public static final Supplier<ParticleType> BUBBLE_COLUMN_UP = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("bubble_column_up"));

    public static final Supplier<ParticleType> BUBBLE_POP = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("squid_ink"));

    public static final Supplier<ParticleType> CLOUD = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("cloud"));

    public static final Supplier<ParticleType> CRITICAL_HIT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("critical_hit"));

    public static final Supplier<ParticleType> CURRENT_DOWN = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("current_down"));

    public static final Supplier<ParticleType> DAMAGE_INDICATOR = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("damage_indicator"));

    public static final Supplier<ParticleType> DOLPHIN_SPEED = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dolphin_speed"));

    public static final Supplier<ParticleType> DRAGON_BREATH = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dragon_breath"));

    public static final Supplier<ParticleType> DRAGON_BREATH_ATTACK = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dragon_breath_attack"));

    public static final Supplier<ParticleType> DRIPPING_HONEY = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dripping_honey"));

    public static final Supplier<ParticleType> DRIPPING_LAVA = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dripping_lava"));

    public static final Supplier<ParticleType> DRIPPING_WATER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dripping_water"));

    /**
     * While this particle type the option {@link ParticleOptions#SCALE} supports, the maximum value
     * that is supported is {@code 4.0} and higher values will be limited to this maximum.
     */
    public static final Supplier<ParticleType> DUST = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("dust"));

    /**
     * While this particle type the option {@link ParticleOptions#VELOCITY} supports, this
     * will only affect the velocity in the y direction.
     */
    public static final Supplier<ParticleType> EFFECT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("effect"));

    public static final Supplier<ParticleType> ELDER_GUARDIAN = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("elder_guardian"));

    public static final Supplier<ParticleType> ENCHANTED_HIT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("enchanted_hit"));

    public static final Supplier<ParticleType> ENCHANTING_GLYPHS = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("enchanting_glyphs"));

    public static final Supplier<ParticleType> END_ROD = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("end_rod"));

    public static final Supplier<ParticleType> ENTITY_EFFECT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("entity_effect"));

    public static final Supplier<ParticleType> EXPLOSION = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("explosion"));

    public static final Supplier<ParticleType> EXPLOSION_EMITTER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("explosion_emitter"));

    public static final Supplier<ParticleType> FALLING_DUST = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("falling_dust"));

    public static final Supplier<ParticleType> FALLING_HONEY = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("falling_honey"));

    public static final Supplier<ParticleType> FALLING_NECTAR = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("falling_nectar"));

    /**
     * This particle type will play the effect that will occur when
     * a {@link Player} uses bone meal on a plant to boost the growth,
     * this can only be played at a block location that isn't {@link BlockTypes#AIR}.
     * <p>This type has limited {@link ParticleOption}s, only
     * {@link ParticleOptions#QUANTITY} is supported.</p>
     *
     * <p>This type can no longer be spawned on air blocks. It will only
     * show up if spawned at the location of solid blocks.</p>
     */
    public static final Supplier<ParticleType> FERTILIZER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("fertilizer"));

    /**
     * This particle type will play a fireworks effect.
     *
     * <p>This type has limited {@link ParticleOption}s, only
     * {@link ParticleOptions#FIREWORK_EFFECTS} is supported.</p>
     */
    public static final Supplier<ParticleType> FIREWORKS = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("fireworks"));

    public static final Supplier<ParticleType> FIREWORKS_SPARK = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("fireworks_spark"));

    /**
     * This particle type will play the smoke particles of a fire.
     * <p>This type has limited {@link ParticleOption}s, only
     * {@link ParticleOptions#DIRECTION} is supported.</p>
     */
    public static final Supplier<ParticleType> FIRE_SMOKE = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("fire_smoke"));

    public static final Supplier<ParticleType> FISHING = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("fishing"));

    public static final Supplier<ParticleType> FLAME = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("flame"));

    public static final Supplier<ParticleType> HAPPY_VILLAGER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("happy_villager"));

    public static final Supplier<ParticleType> HEART = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("heart"));

    /**
     * While this particle type the option {@link ParticleOptions#VELOCITY}
     * supports, this will only affect the velocity in the y direction.
     */
    public static final Supplier<ParticleType> INSTANT_EFFECT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("instant_effect"));

    public static final Supplier<ParticleType> ITEM = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("item"));

    public static final Supplier<ParticleType> ITEM_SLIME = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("item_slime"));

    public static final Supplier<ParticleType> ITEM_SNOWBALL = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("item_snowball"));

    public static final Supplier<ParticleType> LANDING_HONEY = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("landing_honey"));

    public static final Supplier<ParticleType> LARGE_SMOKE = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("large_smoke"));

    public static final Supplier<ParticleType> LAVA = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("lava"));

    public static final Supplier<ParticleType> MOBSPAWNER_FLAMES = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("mobspawner_flames"));

    public static final Supplier<ParticleType> MYCELIUM = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("mycelium"));

    public static final Supplier<ParticleType> NAUTILUS = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("nautilus"));

    public static final Supplier<ParticleType> NOTE = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("note"));

    public static final Supplier<ParticleType> PORTAL = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("portal"));

    public static final Supplier<ParticleType> RAIN_SPLASH = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("rain_splash"));

    public static final Supplier<ParticleType> SMOKE = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("smoke"));

    public static final Supplier<ParticleType> SNOWBALL_POOF = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("snowball_poof"));

    public static final Supplier<ParticleType> SPIT = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("spit"));

    public static final Supplier<ParticleType> SQUID_INK = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("squid_ink"));

    public static final Supplier<ParticleType> SWEEP_ATTACK = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("sweep_attack"));

    public static final Supplier<ParticleType> TOTEM_OF_UNDYING = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("totem_of_undying"));

    public static final Supplier<ParticleType> UNDERWATER = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("underwater"));

    public static final Supplier<ParticleType> WATER_SPLASH = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("water_splash"));

    /**
     * While this particle type the option {@link ParticleOptions#VELOCITY}
     * supports, this will only affect the velocity in the y direction.
     */
    public static final Supplier<ParticleType> WITCH_MAGIC = Registries.PARTICLE_TYPE.getSupplier(ResourceKey.minecraft("witch_magic"));

    // SORTFIELDS:OFF

    private ParticleTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
