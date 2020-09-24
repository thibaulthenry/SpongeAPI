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

public final class NotePitches {

    // SORTFIELDS:ON

    public static final Supplier<NotePitch> A1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("A1"));

    public static final Supplier<NotePitch> A2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("A2"));

    public static final Supplier<NotePitch> A_SHARP1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("A_SHARP1"));

    public static final Supplier<NotePitch> A_SHARP2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("A_SHARP2"));

    public static final Supplier<NotePitch> B1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("B1"));

    public static final Supplier<NotePitch> B2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("B2"));

    public static final Supplier<NotePitch> C1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("C1"));

    public static final Supplier<NotePitch> C2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("C2"));

    public static final Supplier<NotePitch> C_SHARP1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("C_SHARP1"));

    public static final Supplier<NotePitch> C_SHARP2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("C_SHARP2"));

    public static final Supplier<NotePitch> D1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("D1"));

    public static final Supplier<NotePitch> D2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("D2"));

    public static final Supplier<NotePitch> D_SHARP1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("D_SHARP1"));

    public static final Supplier<NotePitch> D_SHARP2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("D_SHARP2"));

    public static final Supplier<NotePitch> E1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("E1"));

    public static final Supplier<NotePitch> E2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("E2"));

    public static final Supplier<NotePitch> F1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("F1"));

    public static final Supplier<NotePitch> F2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("F2"));

    public static final Supplier<NotePitch> F_SHARP0 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("F_SHARP0"));

    public static final Supplier<NotePitch> F_SHARP1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("F_SHARP1"));

    public static final Supplier<NotePitch> F_SHARP2 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("F_SHARP2"));

    public static final Supplier<NotePitch> G0 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("G0"));

    public static final Supplier<NotePitch> G1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("G1"));

    public static final Supplier<NotePitch> G_SHARP0 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("G_SHARP0"));

    public static final Supplier<NotePitch> G_SHARP1 = Registries.NOTE_PITCH.getSupplier(ResourceKey.minecraft("G_SHARP1"));

    // SORTFIELDS:OFF

    private NotePitches() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
