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
package org.spongepowered.api.event.cause.entity.damage;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class DamageTypes {

    // SORTFIELDS:ON

    public static final Supplier<DamageType> ATTACK = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("attack"));

    public static final Supplier<DamageType> CONTACT = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("contact"));

    public static final Supplier<DamageType> CUSTOM = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("custom"));

    public static final Supplier<DamageType> DROWN = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("drown"));

    public static final Supplier<DamageType> DRYOUT = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("dryout"));

    public static final Supplier<DamageType> EXPLOSIVE = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("explosive"));

    public static final Supplier<DamageType> FALL = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("fall"));

    public static final Supplier<DamageType> FIRE = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("fire"));

    public static final Supplier<DamageType> GENERIC = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("generic"));

    public static final Supplier<DamageType> HUNGER = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("hunger"));

    public static final Supplier<DamageType> MAGIC = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("magic"));

    public static final Supplier<DamageType> MAGMA = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("magma"));

    public static final Supplier<DamageType> PROJECTILE = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("projectile"));

    public static final Supplier<DamageType> SUFFOCATE = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("suffocate"));

    public static final Supplier<DamageType> SWEEPING_ATTACK = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("sweeping_attack"));

    public static final Supplier<DamageType> VOID = Registries.DAMAGE_TYPE.getSupplier(ResourceKey.minecraft("void"));

    // SORTFIELDS:OFF

    private DamageTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
