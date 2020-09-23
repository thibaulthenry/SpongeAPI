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
package org.spongepowered.api;


import com.google.inject.Inject;
import org.spongepowered.api.asset.AssetManager;
import org.spongepowered.api.command.manager.CommandManager;
import org.spongepowered.api.config.ConfigManager;
import org.spongepowered.api.data.DataManager;
import org.spongepowered.api.event.EventManager;
import org.spongepowered.api.network.channel.ChannelRegistry;
import org.spongepowered.api.plugin.PluginManager;
import org.spongepowered.api.registry.RegistryManager;
import org.spongepowered.api.scheduler.Scheduler;
import org.spongepowered.api.service.ServiceProvider;
import org.spongepowered.api.sql.SqlManager;
import org.spongepowered.api.util.metric.MetricsConfigManager;

import java.util.Objects;

/**
 * A utility class for accessing the various systems of the API
 */
public final class Sponge {

    @Inject private static Game game;

    /**
     * Gets the {@link Game} instance. There is ever only going to be a single game
     * instance at any given time.
     *
     * @return The game instance
     */
    public static Game getGame() {
        Objects.requireNonNull(Sponge.game, "Sponge has not been initialized!");
        return Sponge.game;
    }

    /**
     * {@link Game#getPlatform()}
     */
    public static Platform getPlatform() {
        return Sponge.getGame().getPlatform();
    }

    /**
     * {@link Game#getAssetManager()}
     */
    public static AssetManager getAssetManager() {
        return Sponge.getGame().getAssetManager();
    }

    /**
     * {@link Game#getCommandManager()}
     */
    public static CommandManager getCommandManager() {
        return Sponge.getGame().getCommandManager();
    }

    /**
     * {@link Game#getConfigManager()}
     */
    public static ConfigManager getConfigManager() {
        return Sponge.getGame().getConfigManager();
    }

    /**
     * {@link Game#getDataManager()}
     */
    public static DataManager getDataManager() {
        return Sponge.getGame().getDataManager();
    }

    /**
     * {@link Game#getEventManager()}
     */
    public static EventManager getEventManager() {
        return Sponge.getGame().getEventManager();
    }

    /**
     * {@link Game#getMetricsConfigManager()}
     */
    public static MetricsConfigManager getMetricsConfigManager() {
        return Sponge.getGame().getMetricsConfigManager();
    }

    /**
     * {@link Game#getPluginManager()}
     */
    public static PluginManager getPluginManager() {
        return Sponge.getGame().getPluginManager();
    }

    /**
     * {@link Game#getRegistryManager()}
     */
    public static RegistryManager getRegistryManager() {
        return Sponge.getGame().getRegistryManager();
    }

    /**
     * {@link Game#getSqlManager()}
     */
    public static SqlManager getSqlManager() {
        return Sponge.getGame().getSqlManager();
    }

    /**
     * {@link Game#getChannelRegistry()}
     */
    public static ChannelRegistry getChannelRegistry() {
        return Sponge.getGame().getChannelRegistry();
    }

    /**
     * {@link Game#isServerAvailable()}
     */
    public static boolean isServerAvailable() {
        return Sponge.getGame().isServerAvailable();
    }

    /**
     * {@link Game#getServer()}
     */
    public static Server getServer() {
        return Sponge.getGame().getServer();
    }

    /**
     * {@link Game#isClientAvailable()}
     */
    public static boolean isClientAvailable() {
        return Sponge.getGame().isClientAvailable();
    }

    /**
     * {@link Game#getClient()}
     */
    public static Client getClient() {
        return Sponge.getGame().getClient();
    }

    /**
     * {@link Game#getSystemSubject()}
     */
    public static SystemSubject getSystemSubject() {
        return Sponge.getGame().getSystemSubject();
    }

    /**
     * {@link Game#getAsyncScheduler()}
     */
    public static Scheduler getAsyncScheduler() {
        return Sponge.getGame().getAsyncScheduler();
    }

    /**
     * {@link Game#getBuilderProvider()}
     */
    public static BuilderProvider getBuilderProvider() {
        return Sponge.getGame().getBuilderProvider();
    }

    /**
     * {@link Game#getFactoryProvider()}
     */
    public static FactoryProvider getFactoryProvider() {
        return Sponge.getGame().getFactoryProvider();
    }

    /**
     * {@link Game#getServiceProvider()}
     */
    public static ServiceProvider.GameScoped getServiceProvider() {
        return Sponge.getGame().getServiceProvider();
    }
}
