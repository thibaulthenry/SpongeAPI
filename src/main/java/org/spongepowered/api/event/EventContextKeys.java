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
package org.spongepowered.api.event;

import net.kyori.adventure.audience.Audience;
import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.type.HandType;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.player.User;
import org.spongepowered.api.event.block.ChangeBlockEvent;
import org.spongepowered.api.event.cause.entity.damage.DamageType;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.DismountType;
import org.spongepowered.api.event.cause.entity.SpawnType;
import org.spongepowered.api.event.cause.entity.MovementType;
import org.spongepowered.api.item.inventory.ItemStackSnapshot;
import org.spongepowered.api.profile.GameProfile;
import org.spongepowered.api.projectile.source.ProjectileSource;
import org.spongepowered.api.registry.Registries;
import org.spongepowered.api.service.permission.Subject;
import org.spongepowered.api.world.LocatableBlock;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.ServerLocation;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.explosion.Explosion;
import org.spongepowered.api.world.server.ServerWorld;
import org.spongepowered.math.vector.Vector3d;
import org.spongepowered.plugin.PluginContainer;

import java.util.function.Supplier;

public final class EventContextKeys {

    // SORTFIELDS:ON

    /**
     * Used during command execution, indicates the {@link Audience} to
     * send any messages to.
     */
    public static final Supplier<EventContextKey<Audience>> AUDIENCE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("audience"));

    /**
     * Used when a {@link World} block event is being processed.
     * 
     * For example, a piston head retracting and extending.
     * 
     * Note: This represents vanilla's block event.
     * Note: This occurs at the end of a world tick after
     *  {@link #BLOCK_EVENT_QUEUE}.
     */
    public static final Supplier<EventContextKey<LocatableBlock>> BLOCK_EVENT_PROCESS = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("block_event_process"));

    /**
     * Used to queue a block event to be processed in a {@link World}.
     * 
     * For example, a piston will queue retract/extend movements using this
     * event.
     * 
     * Note: This represents vanilla's block event.
     */
    public static final Supplier<EventContextKey<LocatableBlock>> BLOCK_EVENT_QUEUE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("block_event_queue"));

    /**
     * Used when an {@link Entity} interacts with a block.
     */
    public static final Supplier<EventContextKey<BlockSnapshot>> BLOCK_HIT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("block_hit"));

    /**
     * Used during command execution, indicates the {@link BlockSnapshot} that
     * is the target of the invocation.
     */
    public static final Supplier<EventContextKey<BlockSnapshot>> BLOCK_TARGET = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("block_target"));

    /**
     * Used for {@link org.spongepowered.api.event.block.ChangeBlockEvent.Post} to provide
     * the block event without relying on existing in the {@link Cause} stack.
     */
    public static final Supplier<EventContextKey<ChangeBlockEvent.Break>> BREAK_EVENT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("break_event"));

    /**
     * Represents the command string that was provided to the command processor.
     */
    public static final Supplier<EventContextKey<String>> COMMAND = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("command"));

    /**
     * Represents the creator of an {@link Entity} or a {@link BlockState} at a {@link Location}
     */
    public static final Supplier<EventContextKey<User>> CREATOR = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("creator"));

    /**
     * Represents the {@link DamageType} to an entity.
     */
    public static final Supplier<EventContextKey<DamageType>> DAMAGE_TYPE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("damage_type"));

    /**
     * Used for {@link org.spongepowered.api.event.block.ChangeBlockEvent.Post} to provide
     * the block event without relying on existing in the {@link Cause} stack.
     */
    public static final Supplier<EventContextKey<ChangeBlockEvent.Decay>> DECAY_EVENT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("decay_event"));

    /**
     * Used when a {@link Player} dismounts from an {@link Entity}.
     */
    public static final Supplier<EventContextKey<DismountType>> DISMOUNT_TYPE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("dismount_type"));

    /**
     * Represents the target {@link Entity}.
     * 
     * Used when an entity, such as a Player, targets an entity via an
     * interaction.
     */
    public static final Supplier<EventContextKey<Entity>> ENTITY_HIT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("entity_hit"));

    /**
     * Represents a fake player responsible for an action.
     * 
     * Note: This is normally only used with mods.
     */
    public static final Supplier<EventContextKey<Player>> FAKE_PLAYER = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("fake_player"));

    /**
     * Used when fire spreads to other blocks.
     */
    public static final Supplier<EventContextKey<ServerWorld>> FIRE_SPREAD = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("fire_spread"));

    /**
     * Used for {@link org.spongepowered.api.event.block.ChangeBlockEvent.Grow} to provide
     * the origin {@link BlockSnapshot} that is doing the "growing".
     */
    public static final Supplier<EventContextKey<BlockSnapshot>> GROWTH_ORIGIN = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("growth_origin"));

    /**
     * Used for {@link org.spongepowered.api.event.block.ChangeBlockEvent.Post} to provide
     * the block event without relying on existing in the {@link Cause} stack.
     */
    public static final Supplier<EventContextKey<ChangeBlockEvent.Grow>> GROW_EVENT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("grow_event"));

    /**
     * Used when an {@link Living} ignites causing an {@link Explosion}.
     */
    public static final Supplier<EventContextKey<Living>> IGNITER = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("igniter"));

    /**
     * Represents the last {@link DamageSource} to an {@link Entity}.
     */
    public static final Supplier<EventContextKey<DamageSource>> LAST_DAMAGE_SOURCE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("last_damage_source"));

    /**
     * Used when leaves decay.
     */
    public static final Supplier<EventContextKey<ServerWorld>> LEAVES_DECAY = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("leaves_decay"));

    /**
     * Used when flowing liquid causing another block to break.
     */
    public static final Supplier<EventContextKey<ServerWorld>> LIQUID_BREAK = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("liquid_break"));

    /**
     * Used when flowing liquid moves to another location.
     */
    public static final Supplier<EventContextKey<ServerWorld>> LIQUID_FLOW = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("liquid_flow"));

    /**
     * Used when liquid changes state.
     */
    public static final Supplier<EventContextKey<ServerWorld>> LIQUID_MIX = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("liquid_mix"));

    /**
     * Used during command execution, indicates the {@link ServerLocation} that the
     * command is centered around.
     */
    public static final Supplier<EventContextKey<ServerLocation>> LOCATION = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("location"));

    /**
     * Used for {@link org.spongepowered.api.event.block.ChangeBlockEvent.Post} to provide
     * the block event without relying on existing in the {@link Cause} stack.
     */
    public static final Supplier<EventContextKey<ChangeBlockEvent.Modify>> MODIFY_EVENT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("modify_event"));

    /**
     * Represents the {@link MovementType} when an entity moves.
     */
    public static final Supplier<EventContextKey<MovementType>> MOVEMENT_TYPE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("movement_type"));

    /**
     * Represents the source {@link BlockSnapshot} of a block notification.
     */
    public static final Supplier<EventContextKey<BlockSnapshot>> NEIGHBOR_NOTIFY_SOURCE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("neighbor_notify_source"));

    /**
     * Represents the {@link User} that notified a block.
     */
    public static final Supplier<EventContextKey<User>> NOTIFIER = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("notifier"));

    /**
     * Used when a {@link BlockTypes#PISTON_HEAD} extends.
     */
    public static final Supplier<EventContextKey<ServerWorld>> PISTON_EXTEND = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("piston_extend"));

    /**
     * Used when a {@link BlockTypes#PISTON_HEAD} retracts.
     */
    public static final Supplier<EventContextKey<ServerWorld>> PISTON_RETRACT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("piston_retract"));

    /**
     * Used for {@link org.spongepowered.api.event.block.ChangeBlockEvent.Post} to provide
     * the block event without relying on existing in the {@link Cause} stack.
     */
    public static final Supplier<EventContextKey<ChangeBlockEvent.Place>> PLACE_EVENT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("place_event"));

    /**
     * Represents a {@link Player}.
     */
    public static final Supplier<EventContextKey<Player>> PLAYER = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("player"));

    /**
     * Used when a {@link Player} breaks a block.
     */
    public static final Supplier<EventContextKey<ServerWorld>> PLAYER_BREAK = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("player_break"));

    /**
     * Used when a {@link Player} places a block.
     */
    public static final Supplier<EventContextKey<ServerWorld>> PLAYER_PLACE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("player_place"));

    /**
     * Represents a {@link PluginContainer}.
     */
    public static final Supplier<EventContextKey<PluginContainer>> PLUGIN = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("plugin"));

    /**
     * Represents a {@link ProjectileSource}.
     */
    public static final Supplier<EventContextKey<ProjectileSource>> PROJECTILE_SOURCE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("projectile_source"));

    /**
     * Represents a rotation as a {@link Vector3d}, for use with commands.
     */
    public static final Supplier<EventContextKey<Vector3d>> ROTATION = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("rotation"));

    /**
     * Represents a simulated {@link Player}.
     */
    public static final Supplier<EventContextKey<GameProfile>> SIMULATED_PLAYER = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("simulated_player"));

    /**
     * Represents the {@link SpawnType} of an entity spawn.
     */
    public static final Supplier<EventContextKey<SpawnType>> SPAWN_TYPE = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("spawn_type"));

    /**
     * Used during command invocation, indicates the {@link Subject} that
     * permission checks should be performed against.
     */
    public static final Supplier<EventContextKey<Subject>> SUBJECT = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("subject"));

    /**
     * Represents a {@link HandType}.
     */
    public static final Supplier<EventContextKey<HandType>> USED_HAND = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("used_hand"));

    /**
     * Represents an {@link ItemStackSnapshot} of used item.
     */
    public static final Supplier<EventContextKey<ItemStackSnapshot>> USED_ITEM = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("used_item"));

    /**
     * Represents an {@link ItemStackSnapshot} of a weapon.
     */
    public static final Supplier<EventContextKey<ItemStackSnapshot>> WEAPON = Registries.EVENT_CONTEXT_KEY.getSupplier(ResourceKey.minecraft("weapon"));

    // SORTFIELDS:OFF

    private EventContextKeys() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
