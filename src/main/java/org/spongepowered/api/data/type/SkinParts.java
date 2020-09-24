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

public final class SkinParts {

    // SORTFIELDS:ON

    public static final Supplier<SkinPart> CAPE = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("cape"));

    public static final Supplier<SkinPart> HAT = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("hat"));

    public static final Supplier<SkinPart> JACKET = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("jacket"));

    public static final Supplier<SkinPart> LEFT_PANTS_LEG = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("left_pants_leg"));

    public static final Supplier<SkinPart> LEFT_SLEEVE = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("left_sleeve"));

    public static final Supplier<SkinPart> RIGHT_PANTS_LEG = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("right_pants_leg"));

    public static final Supplier<SkinPart> RIGHT_SLEEVE = Registries.SKIN_PART.getSupplier(ResourceKey.minecraft("right_sleeve"));

    // SORTFIELDS:OFF

    private SkinParts() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
