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
package org.spongepowered.api.block.entity;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class BlockEntityTypes {

    // SORTFIELDS:ON

    public static final Supplier<BlockEntityType> BANNER = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("banner"));

    public static final Supplier<BlockEntityType> BARREL = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("barrel"));

    public static final Supplier<BlockEntityType> BEACON = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("beacon"));

    public static final Supplier<BlockEntityType> BED = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("bed"));

    public static final Supplier<BlockEntityType> BEEHIVE = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("beehive"));

    public static final Supplier<BlockEntityType> BELL = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("bell"));

    public static final Supplier<BlockEntityType> BLAST_FURNACE = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("blast_furnace"));

    public static final Supplier<BlockEntityType> BREWING_STAND = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("brewing_stand"));

    public static final Supplier<BlockEntityType> CAMPFIRE = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("campfire"));

    public static final Supplier<BlockEntityType> CHEST = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("chest"));

    public static final Supplier<BlockEntityType> COMMAND_BLOCK = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("command_block"));

    public static final Supplier<BlockEntityType> COMPARATOR = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("comparator"));

    public static final Supplier<BlockEntityType> CONDUIT = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("conduit"));

    public static final Supplier<BlockEntityType> DAYLIGHT_DETECTOR = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("daylight_detector"));

    public static final Supplier<BlockEntityType> DISPENSER = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("dispenser"));

    public static final Supplier<BlockEntityType> DROPPER = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("dropper"));

    public static final Supplier<BlockEntityType> ENCHANTMENT_TABLE = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("enchantment_table"));

    public static final Supplier<BlockEntityType> ENDER_CHEST = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("ender_chest"));

    public static final Supplier<BlockEntityType> END_GATEWAY = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("end_gateway"));

    public static final Supplier<BlockEntityType> END_PORTAL = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("end_portal"));

    public static final Supplier<BlockEntityType> FURNACE = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("furnace"));

    public static final Supplier<BlockEntityType> HOPPER = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("hopper"));

    public static final Supplier<BlockEntityType> JIGSAW = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("jigsaw"));

    public static final Supplier<BlockEntityType> JUKEBOX = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("jukebox"));

    public static final Supplier<BlockEntityType> LECTERN = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("lectern"));

    public static final Supplier<BlockEntityType> MOB_SPAWNER = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("mob_spawner"));

    public static final Supplier<BlockEntityType> PISTON = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("piston"));

    public static final Supplier<BlockEntityType> SHULKER_BOX = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("shulker_box"));

    public static final Supplier<BlockEntityType> SIGN = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("sign"));

    public static final Supplier<BlockEntityType> SKULL = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("skull"));

    public static final Supplier<BlockEntityType> SMOKER = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("smoker"));

    public static final Supplier<BlockEntityType> STRUCTURE = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("structure"));

    public static final Supplier<BlockEntityType> TRAPPED_CHEST = Registries.BLOCK_ENTITY_TYPE.getSupplier(ResourceKey.minecraft("trapped_chest"));

    // SORTFIELDS:OFF

    private BlockEntityTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }
}
