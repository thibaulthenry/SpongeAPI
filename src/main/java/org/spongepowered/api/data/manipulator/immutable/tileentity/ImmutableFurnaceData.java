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
package org.spongepowered.api.data.manipulator.immutable.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Furnace;
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.manipulator.mutable.tileentity.FurnaceData;
import org.spongepowered.api.data.value.immutable.ImmutableBoundedValue;
import org.spongepowered.api.entity.Item;

/**
 * An {@link ImmutableDataManipulator} representing the {@link Furnace}
 * information such as the {@link #remainingBurnTime()} and
 * {@link #remainingCookTime()}.
 */
public interface ImmutableFurnaceData extends ImmutableDataManipulator<ImmutableFurnaceData, FurnaceData> {

    /**
     * Gets the {@link ImmutableBoundedValue} for the remaining burn time of the
     * {@link Furnace}.
     *
     * @return The immutable value for the remaining burn time
     */
    ImmutableBoundedValue<Integer> remainingBurnTime();

    /**
     * Gets the {@link ImmutableBoundedValue} for the remaining cook time of the
     * {@link Furnace}.
     *
     * <p>The {@link #remainingCookTime()} is the difference of {@link #maxCookTime()} and
     * the time the item has already been cooked.</p>
     *
     * @return The immutable value for the remaining cook time
     */
    ImmutableBoundedValue<Integer> remainingCookTime();

    /**
     * Gets the {@link ImmutableBoundedValue} for the cook time of the
     * {@link Item} that should be cooked.
     *
     * <p>This is called "maxCookTime" because the client calculates
     * {@link #remainingCookTime()} from the "maxCookTime" minus the
     * time the item cooked already.</p>
     *
     * <p>This is the maximum of {@link #remainingCookTime()}.</p>
     *
     * @return The immutable value for the maximum cook time
     */
    ImmutableBoundedValue<Integer> maxCookTime();

}
