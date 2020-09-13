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
package org.spongepowered.api.adventure;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.placeholder.PlaceholderContext;
import org.spongepowered.api.placeholder.PlaceholderParser;

import java.util.Map;

/**
 * A template that enables a MiniMessage string to be parsed into a
 * {@link Component}, enabling the inclusion of {@link PlaceholderParser} based
 * messages.
 *
 * <p>A placeholder parser may be included by including a tag of one of the
 * following forms:</p>
 *
 * <ul>
 *      <li>{@code <pl:namespace:id>} - if the placeholder does not have an
 *      argument string.</li>
 *      <li>{@code <pl:namespace:id_argumentstring>} - if the placeholder does
 *      have an argument string.</li>
 * </ul>
 *
 * <p>If an argument string is included it will be passed to the
 * {@link PlaceholderContext} supplied to the parsers.</p>
 */
public interface ComponentTemplate {

    /**
     * Creates a ComponentTemplate from the given template string.
     *
     * @param template The template string to parse.
     * @return The ComponentTemplate
     */
    static ComponentTemplate of(final String template) {
        return Sponge.getRegistry().getFactoryRegistry().provideFactory(Factory.class).fromString(template);
    }

    /**
     * Creates a ComponentTemplate from the given {@link Component}.
     *
     * @param component The component to turn into a templating string.
     * @return The ComponentTemplate
     */
    static ComponentTemplate of(final Component component) {
        return Sponge.getRegistry().getFactoryRegistry().provideFactory(Factory.class).fromComponent(component);
    }

    /**
     * Gets the template {@link String} that can be used in {@link #of(String)}
     * to re-create this template.
     *
     * @return The template string.
     */
    String templateString();

    /**
     * Parses this template, supplying the associated object to any
     * {@link PlaceholderParser}s referenced in the template, and replacing any
     * named template arguments with components as defined in the supplied
     * replacements map.
     *
     * <p>Any arguments that do not have a replacement will be replaced with
     * {@link TextComponent#empty()}.</p>
     *
     * @param associatedObject The {@link Object} to pass to any
     *          {@link PlaceholderParser}s that are referenced in the template.
     * @param replacements Any named argument replacements to make.
     * @return A parsed {@link Component}.
     */
    Component parse(@Nullable Object associatedObject, Map<String, Component> replacements);

    /**
     * Creates {@link ComponentTemplate}s.
     */
    interface Factory {

        ComponentTemplate fromString(String template);

        ComponentTemplate fromComponent(Component component);

    }

}
