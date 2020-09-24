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

public final class DyeColors {

    // SORTFIELDS:ON

    public static final Supplier<DyeColor> BLACK = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("black"));

    public static final Supplier<DyeColor> BLUE = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("blue"));

    public static final Supplier<DyeColor> BROWN = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("brown"));

    public static final Supplier<DyeColor> CYAN = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("cyan"));

    public static final Supplier<DyeColor> GRAY = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("gray"));

    public static final Supplier<DyeColor> GREEN = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("green"));

    public static final Supplier<DyeColor> LIGHT_BLUE = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("light_blue"));

    public static final Supplier<DyeColor> LIGHT_GRAY = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("light_gray"));

    public static final Supplier<DyeColor> LIME = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("lime"));

    public static final Supplier<DyeColor> MAGENTA = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("magenta"));

    public static final Supplier<DyeColor> ORANGE = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("orange"));

    public static final Supplier<DyeColor> PINK = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("pink"));

    public static final Supplier<DyeColor> PURPLE = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("purple"));

    public static final Supplier<DyeColor> RED = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("red"));

    public static final Supplier<DyeColor> WHITE = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("white"));

    public static final Supplier<DyeColor> YELLOW = Registries.DYE_COLOR.getSupplier(ResourceKey.minecraft("yellow"));

    // SORTFIELDS:OFF

    private DyeColors() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
