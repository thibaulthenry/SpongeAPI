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
package org.spongepowered.api.world.gen;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class GeneratorModifierTypes {

    // SORTFIELDS:ON

    public static final Supplier<GeneratorModifierType> AMPLIFIED = Registries.GENERATOR_MODIFIER_TYPE.getSupplier(ResourceKey.minecraft("amplified"));

    public static final Supplier<GeneratorModifierType> DEBUG = Registries.GENERATOR_MODIFIER_TYPE.getSupplier(ResourceKey.minecraft("debug"));

    public static final Supplier<GeneratorModifierType> NONE = Registries.GENERATOR_MODIFIER_TYPE.getSupplier(ResourceKey.minecraft("none"));

    public static final Supplier<GeneratorModifierType> FLAT = Registries.GENERATOR_MODIFIER_TYPE.getSupplier(ResourceKey.minecraft("flat"));

    public static final Supplier<GeneratorModifierType> LARGE_BIOMES = Registries.GENERATOR_MODIFIER_TYPE.getSupplier(ResourceKey.minecraft("large_biomes"));

    // SORTFIELDS:OFF

    private GeneratorModifierTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
