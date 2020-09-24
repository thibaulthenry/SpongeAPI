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

public final class ProfessionTypes {

    // SORTFIELDS:ON

    public static final Supplier<ProfessionType> ARMORER = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("armorer"));

    public static final Supplier<ProfessionType> BUTCHER = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("butcher"));

    public static final Supplier<ProfessionType> CARTOGRAPHER = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("cartographer"));

    public static final Supplier<ProfessionType> CLERIC = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("cleric"));

    public static final Supplier<ProfessionType> FARMER = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("farmer"));

    public static final Supplier<ProfessionType> FISHERMAN = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("fisherman"));

    public static final Supplier<ProfessionType> FLETCHER = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("fletcher"));

    public static final Supplier<ProfessionType> LEATHERWORKER = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("leatherworker"));

    public static final Supplier<ProfessionType> LIBRARIAN = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("librarian"));

    public static final Supplier<ProfessionType> MASON = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("mason"));

    public static final Supplier<ProfessionType> NITWIT = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("nitwit"));

    public static final Supplier<ProfessionType> NONE = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("none"));

    public static final Supplier<ProfessionType> SHEPHERD = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("shepherd"));

    public static final Supplier<ProfessionType> TOOLSMITH = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("toolsmith"));

    public static final Supplier<ProfessionType> WEAPONSMITH = Registries.PROFESSION_TYPE.getSupplier(ResourceKey.minecraft("weaponsmith"));

    // SORTFIELDS:OFF

    private ProfessionTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
