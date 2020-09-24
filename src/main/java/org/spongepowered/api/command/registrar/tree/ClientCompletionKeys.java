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
package org.spongepowered.api.command.registrar.tree;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.Registry;

import java.util.function.Supplier;

public final class ClientCompletionKeys {

    @SuppressWarnings("rawtypes")
    public static Registry<ClientCompletionKey> REGISTRY = Sponge.getRegistryManager().get(ClientCompletionKey.class);
    
    // SORTFIELDS: ON

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> BLOCK_STATE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("block_state"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> BLOCK_PREDICATE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("block_predicate"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> BOOL = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("bool"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> COLOR = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("color"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> COMPONENT = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("component"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> DIMENSION = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("dimension"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> DOUBLE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("double"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.EntitySelection>> ENTITY = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("entity"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> ENTITY_ANCHOR = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("entity_anchor"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> ENTITY_SUMMON = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("entity_summon"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> FLOAT = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("float"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> FUNCTION = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("function"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> GAME_PROFILE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("game_profile"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> INTEGER = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("integer"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> ITEM_ENCHANTMENT = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("item_enchantment"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> ITEM_SLOT = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("item_slot"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> LONG = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("long"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> MESSAGE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("message"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> MOB_EFFECT = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("mob_effect"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> NBT_COMPOUND_TAG = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("nbt_compound_tag"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> NBT_PATH = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("nbt_path"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> NBT_TAG = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("nbt_tag"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> OBJECTIVE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("objective"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> OBJECTIVE_CRITERIA = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("objective_criteria"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> OPERATION = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("operation"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> PARTICLE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("particle"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> RESOURCE_LOCATION = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("resource_location"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> ROTATION = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("rotation"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Amount>> SCORE_HOLDER = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("score_holder"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> SCOREBOARD_SLOT = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("scoreboard_slot"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.StringParser>> STRING = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("string"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> SWIZZLE = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("swizzle"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> TEAM = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("team"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> TIME = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("time"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> VEC2 = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("vec2"));

    public static final Supplier<ClientCompletionKey<CommandTreeNode.Basic>> VEC3 = ClientCompletionKeys.REGISTRY.getSupplier(ResourceKey.minecraft("vec3"));

    // SORTFIELDS: OFF

    private ClientCompletionKeys() {
        throw new AssertionError("This cannot be instantiated.");
    }

}
