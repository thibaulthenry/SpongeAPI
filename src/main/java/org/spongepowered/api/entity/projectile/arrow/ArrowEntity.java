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
package org.spongepowered.api.entity.projectile.arrow;

import org.spongepowered.api.data.Keys;
import org.spongepowered.api.data.type.PickupRule;
import org.spongepowered.api.data.value.BoundedValue;
import org.spongepowered.api.data.value.Value;
import org.spongepowered.api.entity.projectile.DamagingProjectile;

/**
 * Represents an Arrow.
 */
public interface ArrowEntity extends DamagingProjectile {

    /**
     * {@link Keys#PICKUP_RULE}
     * @return The pickup rule
     * @see org.spongepowered.api.data.type.PickupRules
     */
    default Value.Mutable<PickupRule> pickupRule() {
        return this.getValue(Keys.PICKUP_RULE).get().asMutable();
    }

    /**
     * {@link Keys#KNOCKBACK_STRENGTH}
     * @return The knockback strength
     */
    default BoundedValue.Mutable<Integer> knockbackStrength() {
        return this.getValue(Keys.KNOCKBACK_STRENGTH).get().asMutable();
    }
}
