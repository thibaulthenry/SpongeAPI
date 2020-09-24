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
package org.spongepowered.api.world;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class HeightTypes {

    // SORTFIELDS:ON

    public static final Supplier<HeightType> LIGHT_BLOCKING = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("light_blocking"));

    public static final Supplier<HeightType> MOTION_BLOCKING = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("motion_blocking"));

    public static final Supplier<HeightType> MOTION_BLOCKING_NO_LEAVES = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("motion_blocking_no_leaves"));

    public static final Supplier<HeightType> OCEAN_FLOOR = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("ocean_floor"));

    public static final Supplier<HeightType> OCEAN_FLOOR_WG = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("ocean_floor_wg"));

    public static final Supplier<HeightType> WORLD_SURFACE = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("world_surface"));

    public static final Supplier<HeightType> WORLD_SURFACE_WG = Registries.HEIGHT_TYPE.getSupplier(ResourceKey.minecraft("world_surface_wg"));

    // SORTFIELDS:OFF

    private HeightTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
