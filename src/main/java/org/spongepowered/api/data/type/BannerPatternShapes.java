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

public final class BannerPatternShapes {

    // SORTFIELDS:ON

    public static final Supplier<BannerPatternShape> BASE = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("base"));

    public static final Supplier<BannerPatternShape> BORDER = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("border"));

    public static final Supplier<BannerPatternShape> BRICKS = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("bricks"));

    public static final Supplier<BannerPatternShape> CIRCLE = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("circle"));

    public static final Supplier<BannerPatternShape> CREEPER = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("creeper"));

    public static final Supplier<BannerPatternShape> CROSS = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("cross"));

    public static final Supplier<BannerPatternShape> CURLY_BORDER = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("curly_border"));

    public static final Supplier<BannerPatternShape> DIAGONAL_LEFT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("diagonal_left"));

    public static final Supplier<BannerPatternShape> DIAGONAL_UP_LEFT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("diagonal_up_left"));

    public static final Supplier<BannerPatternShape> DIAGONAL_RIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("diagonal_right"));

    public static final Supplier<BannerPatternShape> DIAGONAL_UP_RIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("diagonal_up_right"));

    public static final Supplier<BannerPatternShape> FLOWER = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("flower"));

    public static final Supplier<BannerPatternShape> GLOBE = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("globe"));

    public static final Supplier<BannerPatternShape> GRADIENT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("gradient"));

    public static final Supplier<BannerPatternShape> GRADIENT_UP = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("gradient_up"));

    public static final Supplier<BannerPatternShape> HALF_HORIZONTAL = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("half_horizontal"));

    public static final Supplier<BannerPatternShape> HALF_HORIZONTAL_BOTTOM = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("half_horizontal_bottom"));

    public static final Supplier<BannerPatternShape> HALF_VERTICAL = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("half_vertical"));

    public static final Supplier<BannerPatternShape> HALF_VERTICAL_RIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("half_vertical_right"));

    public static final Supplier<BannerPatternShape> MOJANG = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("mojang"));

    public static final Supplier<BannerPatternShape> RHOMBUS = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("rhombus"));

    public static final Supplier<BannerPatternShape> SKULL = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("skull"));

    public static final Supplier<BannerPatternShape> SQUARE_BOTTOM_LEFT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("square_bottom_left"));

    public static final Supplier<BannerPatternShape> SQUARE_BOTTOM_RIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("square_bottom_right"));

    public static final Supplier<BannerPatternShape> SQUARE_TOP_LEFT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("square_top_left"));

    public static final Supplier<BannerPatternShape> SQUARE_TOP_RIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("square_top_right"));

    public static final Supplier<BannerPatternShape> STRAIGHT_CROSS = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("straight_cross"));

    public static final Supplier<BannerPatternShape> STRIPE_BOTTOM = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_bottom"));

    public static final Supplier<BannerPatternShape> STRIPE_CENTER = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_center"));

    public static final Supplier<BannerPatternShape> STRIPE_DOWNLEFT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_downleft"));

    public static final Supplier<BannerPatternShape> STRIPE_DOWNRIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_downright"));

    public static final Supplier<BannerPatternShape> STRIPE_LEFT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_left"));

    public static final Supplier<BannerPatternShape> STRIPE_MIDDLE = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_middle"));

    public static final Supplier<BannerPatternShape> STRIPE_RIGHT = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_right"));

    public static final Supplier<BannerPatternShape> SMALL_STRIPES = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("small_stripes"));

    public static final Supplier<BannerPatternShape> STRIPE_TOP = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("stripe_top"));

    public static final Supplier<BannerPatternShape> TRIANGLES_BOTTOM = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("triangles_bottom"));

    public static final Supplier<BannerPatternShape> TRIANGLES_TOP = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("triangles_top"));

    public static final Supplier<BannerPatternShape> TRIANGLE_BOTTOM = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("triangle_bottom"));

    public static final Supplier<BannerPatternShape> TRIANGLE_TOP = Registries.BANNER_PATTERN_SHAPE.getSupplier(ResourceKey.minecraft("triangle_top"));

    // SORTFIELDS:OFF

    private BannerPatternShapes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
