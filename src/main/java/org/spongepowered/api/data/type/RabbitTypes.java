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

public final class RabbitTypes {

    // SORTFIELDS:ON

    public static final Supplier<RabbitType> BLACK = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("black"));

    public static final Supplier<RabbitType> BLACK_AND_WHITE = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("black_and_white"));

    public static final Supplier<RabbitType> BROWN = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("brown"));

    public static final Supplier<RabbitType> GOLD = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("gold"));

    public static final Supplier<RabbitType> KILLER = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("killer"));

    public static final Supplier<RabbitType> SALT_AND_PEPPER = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("salt_and_pepper"));

    public static final Supplier<RabbitType> WHITE = Registries.RABBIT_TYPE.getSupplier(ResourceKey.minecraft("white"));

    // SORTFIELDS:OFF

    private RabbitTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
