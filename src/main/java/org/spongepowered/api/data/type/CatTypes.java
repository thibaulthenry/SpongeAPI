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

public final class CatTypes {

    // SORTFIELDS:ON

    public static final Supplier<CatType> ALL_BLACK = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "all_black"));

    public static final Supplier<CatType> BLACK = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "black"));

    public static final Supplier<CatType> BRITISH_SHORTHAIR = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "british_shorthair"));

    public static final Supplier<CatType> CALICO = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "calico"));

    public static final Supplier<CatType> JELLIE = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "jellie"));

    public static final Supplier<CatType> PERSIAN = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "persian"));

    public static final Supplier<CatType> RAGDOLL = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "ragdoll"));

    public static final Supplier<CatType> RED = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "red"));

    public static final Supplier<CatType> SIAMESE = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "siamese"));

    public static final Supplier<CatType> WHITE = Registries.CAT_TYPE.getSupplier(ResourceKey.minecraft( "white"));

    // SORTFIELDS:OFF

    private CatTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
