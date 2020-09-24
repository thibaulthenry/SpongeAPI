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

public final class TropicalFishShapes {

    // SORTFIELDS:ON

    public static final Supplier<TropicalFishShape> BETTY = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("betty"));

    public static final Supplier<TropicalFishShape> BLOCKFISH = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("blockfish"));

    public static final Supplier<TropicalFishShape> BRINELY = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("brinely"));

    public static final Supplier<TropicalFishShape> CLAYFISH = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("clayfish"));

    public static final Supplier<TropicalFishShape> DASHER = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("dasher"));

    public static final Supplier<TropicalFishShape> FLOPPER = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("flopper"));

    public static final Supplier<TropicalFishShape> GLITTER = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("glitter"));

    public static final Supplier<TropicalFishShape> KOB = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("kob"));

    public static final Supplier<TropicalFishShape> SNOOPER = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("snooper"));

    public static final Supplier<TropicalFishShape> SPOTTY = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("spotty"));

    public static final Supplier<TropicalFishShape> STRIPEY = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("stripey"));

    public static final Supplier<TropicalFishShape> SUNSTREAK = Registries.TROPICAL_FISH_SHAPE.getSupplier(ResourceKey.minecraft("sunstreak"));

    // SORTFIELDS:OFF

    private TropicalFishShapes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
