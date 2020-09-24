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
package org.spongepowered.api.data.type;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class ArtTypes {
    
    // SORTFIELDS:ON

    public static final Supplier<ArtType> ALBAN = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("alban"));

    public static final Supplier<ArtType> AZTEC = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("aztec"));

    public static final Supplier<ArtType> AZTEC2 = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("aztec2"));

    public static final Supplier<ArtType> BOMB = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("bomb"));

    public static final Supplier<ArtType> BURNING_SKULL = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("burning_skull"));

    public static final Supplier<ArtType> BUST = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("bust"));

    public static final Supplier<ArtType> COURBET = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("courbet"));

    public static final Supplier<ArtType> CREEBET = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("creebet"));

    public static final Supplier<ArtType> DONKEY_KONG = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("donkey_kong"));

    public static final Supplier<ArtType> FIGHTERS = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("fighters"));

    public static final Supplier<ArtType> GRAHAM = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("graham"));

    public static final Supplier<ArtType> KEBAB = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("kebab"));

    public static final Supplier<ArtType> MATCH = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("match"));

    public static final Supplier<ArtType> PIGSCENE = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("pigscene"));

    public static final Supplier<ArtType> PLANT = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("plant"));

    public static final Supplier<ArtType> POINTER = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("pointer"));

    public static final Supplier<ArtType> POOL = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("pool"));

    public static final Supplier<ArtType> SEA = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("sea"));

    public static final Supplier<ArtType> SKELETON = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("skeleton"));

    public static final Supplier<ArtType> SKULL_AND_ROSES = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("skull_and_roses"));

    public static final Supplier<ArtType> STAGE = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("stage"));

    public static final Supplier<ArtType> SUNSET = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("sunset"));

    public static final Supplier<ArtType> VOID = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("void"));

    public static final Supplier<ArtType> WANDERER = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("wanderer"));

    public static final Supplier<ArtType> WASTELAND = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("wasteland"));

    public static final Supplier<ArtType> WITHER = Registries.ART_TYPE.getSupplier(ResourceKey.minecraft("wither"));

    // SORTFIELDS:OFF

    private ArtTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
