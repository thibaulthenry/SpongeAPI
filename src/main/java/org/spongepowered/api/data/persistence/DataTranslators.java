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
package org.spongepowered.api.data.persistence;

import net.kyori.adventure.text.Component;
import ninja.leaping.configurate.ConfigurationNode;
import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;
import org.spongepowered.api.world.schematic.Schematic;
import org.spongepowered.math.imaginary.Complexd;
import org.spongepowered.math.imaginary.Complexf;
import org.spongepowered.math.imaginary.Quaterniond;
import org.spongepowered.math.imaginary.Quaternionf;
import org.spongepowered.math.vector.Vector2d;
import org.spongepowered.math.vector.Vector2f;
import org.spongepowered.math.vector.Vector2i;
import org.spongepowered.math.vector.Vector2l;
import org.spongepowered.math.vector.Vector3d;
import org.spongepowered.math.vector.Vector3f;
import org.spongepowered.math.vector.Vector3i;
import org.spongepowered.math.vector.Vector3l;
import org.spongepowered.math.vector.Vector4d;
import org.spongepowered.math.vector.Vector4f;
import org.spongepowered.math.vector.Vector4i;
import org.spongepowered.math.vector.Vector4l;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.function.Supplier;

public final class DataTranslators {

    // SORTFIELDS:ON

    public static final Supplier<DataTranslator<Complexd>> COMPLEXD = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("complexd"));

    public static final Supplier<DataTranslator<Complexf>> COMPLEXF = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("complexf"));

    public static final Supplier<DataTranslator<Component>> COMPONENT = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("component"));

    public static final Supplier<DataTranslator<ConfigurationNode>> CONFIGURATION_NODE = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("configuration_node"));

    public static final Supplier<DataTranslator<Instant>> INSTANT = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("instant"));

    public static final Supplier<DataTranslator<Schematic>> LEGACY_SCHEMATIC = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("legacy_schematic"));

    public static final Supplier<DataTranslator<LocalDate>> LOCAL_DATE = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("local_date"));

    public static final Supplier<DataTranslator<LocalDateTime>> LOCAL_DATE_TIME = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("local_date_time"));

    public static final Supplier<DataTranslator<LocalTime>> LOCAL_TIME = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("local_time"));

    public static final Supplier<DataTranslator<Schematic>> MOJANG_TEMPLATE = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("mojang_template"));

    public static final Supplier<DataTranslator<Quaterniond>> QUATERNIOND = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("quaterniond"));

    public static final Supplier<DataTranslator<Quaternionf>> QUATERNIONF = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("quaternionf"));

    public static final Supplier<DataTranslator<Schematic>> SCHEMATIC = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("schematic"));

    public static final Supplier<DataTranslator<UUID>> UUID = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("uuid"));

    public static final Supplier<DataTranslator<Vector2d>> VECTOR_2_D = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_2_D"));

    public static final Supplier<DataTranslator<Vector2f>> VECTOR_2_F = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_2_F"));

    public static final Supplier<DataTranslator<Vector2i>> VECTOR_2_I = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_2_I"));

    public static final Supplier<DataTranslator<Vector2l>> VECTOR_2_L = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_2_L"));

    public static final Supplier<DataTranslator<Vector3d>> VECTOR_3_D = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_3_D"));

    public static final Supplier<DataTranslator<Vector3f>> VECTOR_3_F = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_3_F"));

    public static final Supplier<DataTranslator<Vector3i>> VECTOR_3_I = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_3_I"));

    public static final Supplier<DataTranslator<Vector3l>> VECTOR_3_L = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_3_L"));

    public static final Supplier<DataTranslator<Vector4d>> VECTOR_4_D = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_4_D"));

    public static final Supplier<DataTranslator<Vector4f>> VECTOR_4_F = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_4_F"));

    public static final Supplier<DataTranslator<Vector4i>> VECTOR_4_I = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_4_I"));

    public static final Supplier<DataTranslator<Vector4l>> VECTOR_4_L = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("VECTOR_4_L"));

    public static final Supplier<DataTranslator<ZonedDateTime>> ZONED_DATE_TIME = Registries.DATA_TRANSLATOR.getSupplier(ResourceKey.minecraft("zoned_date_time"));

    // SORTFIELDS:OFF

    private DataTranslators() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
