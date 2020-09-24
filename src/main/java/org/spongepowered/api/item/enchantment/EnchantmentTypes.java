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
package org.spongepowered.api.item.enchantment;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class EnchantmentTypes {

    // SORTFIELDS:ON

    /**
     * Increases regular underwater mining speed.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> AQUA_AFFINITY = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("aqua_affinity"));

    /**
     * Increases damages and causes slowness for a variable amount of time
     * depending on the level to "arthropod" mobs. In vanilla this includes
     * spiders, cave spiders, silverfish, and endermites.
     *
     * <p>In vanilla the maximum level is 5.</p>
     */
    public static final Supplier<EnchantmentType> BANE_OF_ARTHROPODS = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("bane_of_arthropods"));

    /**
     * Prevents removal of the cursed items that reside in the armor slots.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> BINDING_CURSE = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("binding_curse"));

    /**
     * Reduces explosion damage.
     *
     * <p>In vanilla the maximum level is 4.</p>
     */
    public static final Supplier<EnchantmentType> BLAST_PROTECTION = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("blast_protection"));

    /**
     * Increases underwater movement speed.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> DEPTH_STRIDER = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("depth_strider"));

    /**
     * Increases mining speed.
     *
     * <p>In vanilla the maximum level is 5.</p>
     */
    public static final Supplier<EnchantmentType> EFFICIENCY = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("efficiency"));

    /**
     * Reduces fall damage.
     *
     * <p>In vanilla the maximum level is 4.</p>
     */
    public static final Supplier<EnchantmentType> FEATHER_FALLING = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("feather_falling"));

    /**
     * Sets the target on fire.
     *
     * <p>In vanilla the maximum level is 2.</p>
     */
    public static final Supplier<EnchantmentType> FIRE_ASPECT = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("fire_aspect"));

    /**
     * Reduces fire damage.
     *
     * <p>In vanilla the maximum level is 4.</p>
     */
    public static final Supplier<EnchantmentType> FIRE_PROTECTION = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("fire_protection"));

    /**
     * Sets your shot arrows on fire.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> FLAME = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("flame"));

    /**
     * Increases block drops.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> FORTUNE = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("fortune"));

    /**
     * Creates frosted ice blocks when walking over water.
     *
     * <p>In vanilla the maximum level is 2.</p>
     */
    public static final Supplier<EnchantmentType> FROST_WALKER = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("frost_walker"));

    /**
     * Causing shooting arrows to not consume regular arrows.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> INFINITY = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("infinity"));

    /**
     * Increases attack knockback.
     *
     * <p>In vanilla the maximum level is 2.</p>
     */
    public static final Supplier<EnchantmentType> KNOCKBACK = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("knockback"));

    /**
     * Causes mobs drop more loot.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> LOOTING = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("looting"));

    /**
     * Increases luck while fishing.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> LUCK_OF_THE_SEA = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("luck_of_the_sea"));

    /**
     * Increases rate of fish biting your hook while fishing.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> LURE = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("lure"));

    /**
     * Repair item durability with experience.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> MENDING = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("mending"));

    /**
     * Increases shot arrow damage.
     *
     * <p>In vanilla the maximum level is 5.</p>
     */
    public static final Supplier<EnchantmentType> POWER = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("power"));

    /**
     * Reduces projectile damage you take, for example from arrows, ghasts,
     * blaze fire charges, and similar in vanilla.
     *
     * <p>In vanilla the maximum level is 4.</p>
     */
    public static final Supplier<EnchantmentType> PROJECTILE_PROTECTION = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("projectile_protection"));

    /**
     * Reduces all damage, outside of a few sources that bypass armor, such as
     * the void, the kill command, and hunger damage in vanilla.
     *
     * <p>In vanilla the maximum level is 4.</p>
     */
    public static final Supplier<EnchantmentType> PROTECTION = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("protection"));

    /**
     * Increases knockback by shot arrows.
     *
     * <p>In vanilla the maximum level is 2.</p>
     */
    public static final Supplier<EnchantmentType> PUNCH = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("punch"));

    /**
     * Extends underwater breathing time.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> RESPIRATION = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("respiration"));

    /**
     * Increases melee damage.
     *
     * <p>In vanilla the maximum level is 5.</p>
     */
    public static final Supplier<EnchantmentType> SHARPNESS = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("sharpness"));

    /**
     * Allows collection of blocks that are normally unobtainable, such as
     * diamond ore, cocoa, mycelium, and similar in vanilla.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> SILK_TOUCH = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("silk_touch"));

    /**
     * Increases damage to "undead" mobs. In vanilla this includes skeletons,
     * skeletons, zombies, withers, wither skeletons, zombie pigmen,
     * skeleton horses and zombie horses.
     *
     * <p>In vanilla the maximum level is 5.</p>
     */
    public static final Supplier<EnchantmentType> SMITE = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("smite"));

    /**
     * Increases the damage of the sweeping attack.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> SWEEPING = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("sweeping"));

    /**
     * Attackers are damaged when they deal damage to the wearer.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> THORNS = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("thorns"));

    /**
     * Increases effective durability.
     *
     * <p>In vanilla the maximum level is 3.</p>
     */
    public static final Supplier<EnchantmentType> UNBREAKING = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("unbreaking"));

    /**
     * Causes the item to disappear on death.
     *
     * <p>In vanilla the maximum level is 1.</p>
     */
    public static final Supplier<EnchantmentType> VANISHING_CURSE = Registries.ENCHANTMENT_TYPE.getSupplier(ResourceKey.minecraft("vanishing_curse"));

    // SORTFIELDS:OFF

    private EnchantmentTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
    
}
