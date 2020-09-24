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
package org.spongepowered.api.item.inventory;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.entity.living.trader.Villager;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class ContainerTypes {

    // Containers backed by an inventory.

    // TODO check container creation in 1.14 code especially merchant/horse


    // TODO add new inventories

    // SORTFIELDS:ON

    public static final Supplier<ContainerType> BLAST_FURNACE = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("blast_furnace"));

    /**
     * Size 5.
     */
    public static final Supplier<ContainerType> BREWING_STAND = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("brewing_stand"));

    /**
     * Size 3.
     */
    public static final Supplier<ContainerType> FURNACE = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("furnace"));

    /**
     * Size 9 (3x3 grid). (Dispenser)
     */
    public static final Supplier<ContainerType> GENERIC_3x3 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_3x3"));

    public static final Supplier<ContainerType> GENERIC_9x1 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_9x1"));

    public static final Supplier<ContainerType> GENERIC_9x2 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_9x2"));

    /**
     * Size 27 (3x9 grid)
     */
    public static final Supplier<ContainerType> GENERIC_9x3 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_9x3"));

    public static final Supplier<ContainerType> GENERIC_9x4 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_9x4"));

    public static final Supplier<ContainerType> GENERIC_9x5 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_9x5"));

    /**
     * Size 54 (6x9 grid)
     */
    public static final Supplier<ContainerType> GENERIC_9x6 = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("generic_9x6"));

    /**
     * Size 5 (1x5 grid).
     */
    public static final Supplier<ContainerType> HOPPER = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("hopper"));

    public static final Supplier<ContainerType> LECTERN = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("lectern"));

    /**
     * Size 27 (3x9 grid). Shulker boxes are not allowed in shulker boxes.
     */
    public static final Supplier<ContainerType> SHULKER_BOX = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("shulker_box"));

    public static final Supplier<ContainerType> SMOKER = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("smoker"));

    // SORTFIELDS:OFF

    // Containers with internal Inventory.

    // SORTFIELDS:ON

    /**
     * Size 0. All slots present in the container only: 3.
     */
    public static final Supplier<ContainerType> ANVIL = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("anvil"));

    /**
     * Size 0. All slots present in the container only: 1.
     */
    public static final Supplier<ContainerType> BEACON = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("beacon"));

    public static final Supplier<ContainerType> CARTOGRAPHY_TABLE = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("cartography_table"));

    /**
     * Size 0. All slots present in the container only: 10 (3x3+1).
     */
    public static final Supplier<ContainerType> CRAFTING = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("crafting"));

    /**
     * Size 0. All slots present in the container only 2.
     */
    public static final Supplier<ContainerType> ENCHANTMENT = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("enchantment"));

    public static final Supplier<ContainerType> GRINDSTONE = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("grindstone"));

    public static final Supplier<ContainerType> LOOM = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("loom"));

    public static final Supplier<ContainerType> STONECUTTER = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("stonecutter"));

    // SORTFIELDS:OFF

    // Containers that cannot be opened on their own. Create an Entity to open the container instead.

    // SORTFIELDS:ON

    /**
     * Create a {@link Villager} Entity instead of using this ContainerType.
     */
    public static final Supplier<ContainerType> MERCHANT = Registries.CONTAINER_TYPE.getSupplier(ResourceKey.minecraft("merchant"));

    // SORTFIELDS:OFF

    private ContainerTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}


