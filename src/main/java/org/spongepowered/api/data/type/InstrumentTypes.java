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

public final class InstrumentTypes {

    // SORTFIELDS:ON

    public static final Supplier<InstrumentType> BANJO = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("banjo"));

    public static final Supplier<InstrumentType> BASS = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("bass"));

    public static final Supplier<InstrumentType> BASE_DRUM = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("basedrum"));

    public static final Supplier<InstrumentType> BELL = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("bell"));

    public static final Supplier<InstrumentType> BIT = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("bit"));

    public static final Supplier<InstrumentType> CHIME = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("chime"));

    public static final Supplier<InstrumentType> COW_BELL = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("cow_bell"));

    public static final Supplier<InstrumentType> DIDGERIDOO = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("didgeridoo"));

    public static final Supplier<InstrumentType> FLUTE = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("flute"));

    public static final Supplier<InstrumentType> GUITAR = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("guitar"));

    public static final Supplier<InstrumentType> HARP = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("harp"));

    public static final Supplier<InstrumentType> HAT = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("hat"));

    public static final Supplier<InstrumentType> IRON_XYLOPHONE = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("iron_xylophone"));

    public static final Supplier<InstrumentType> PLING = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("pling"));

    public static final Supplier<InstrumentType> SNARE = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("snare"));

    public static final Supplier<InstrumentType> XYLOPHONE = Registries.INSTRUMENT_TYPE.getSupplier(ResourceKey.minecraft("xylophone"));

    // SORTFIELDS:OFF

    private InstrumentTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
