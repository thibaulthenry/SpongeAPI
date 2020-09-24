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
package org.spongepowered.api.entity;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.entity.explosive.EnderCrystal;
import org.spongepowered.api.entity.explosive.fused.PrimedTNT;
import org.spongepowered.api.entity.hanging.ItemFrame;
import org.spongepowered.api.entity.hanging.LeashKnot;
import org.spongepowered.api.entity.hanging.Painting;
import org.spongepowered.api.entity.living.ArmorStand;
import org.spongepowered.api.entity.living.Bat;
import org.spongepowered.api.entity.living.Human;
import org.spongepowered.api.entity.living.animal.Bee;
import org.spongepowered.api.entity.living.animal.Cat;
import org.spongepowered.api.entity.living.animal.Chicken;
import org.spongepowered.api.entity.living.animal.Fox;
import org.spongepowered.api.entity.living.animal.Ocelot;
import org.spongepowered.api.entity.living.animal.Panda;
import org.spongepowered.api.entity.living.animal.Parrot;
import org.spongepowered.api.entity.living.animal.Pig;
import org.spongepowered.api.entity.living.animal.PolarBear;
import org.spongepowered.api.entity.living.animal.Rabbit;
import org.spongepowered.api.entity.living.animal.Sheep;
import org.spongepowered.api.entity.living.animal.Turtle;
import org.spongepowered.api.entity.living.animal.Wolf;
import org.spongepowered.api.entity.living.animal.cow.Cow;
import org.spongepowered.api.entity.living.animal.cow.Mooshroom;
import org.spongepowered.api.entity.living.animal.horse.Donkey;
import org.spongepowered.api.entity.living.animal.horse.Horse;
import org.spongepowered.api.entity.living.animal.horse.Mule;
import org.spongepowered.api.entity.living.animal.horse.SkeletonHorse;
import org.spongepowered.api.entity.living.animal.horse.ZombieHorse;
import org.spongepowered.api.entity.living.animal.horse.llama.Llama;
import org.spongepowered.api.entity.living.animal.horse.llama.TraderLlama;
import org.spongepowered.api.entity.living.aquatic.Dolphin;
import org.spongepowered.api.entity.living.aquatic.Squid;
import org.spongepowered.api.entity.living.aquatic.fish.Pufferfish;
import org.spongepowered.api.entity.living.aquatic.fish.school.Cod;
import org.spongepowered.api.entity.living.aquatic.fish.school.Salmon;
import org.spongepowered.api.entity.living.aquatic.fish.school.TropicalFish;
import org.spongepowered.api.entity.living.golem.IronGolem;
import org.spongepowered.api.entity.living.golem.Shulker;
import org.spongepowered.api.entity.living.golem.SnowGolem;
import org.spongepowered.api.entity.living.monster.Blaze;
import org.spongepowered.api.entity.living.monster.Creeper;
import org.spongepowered.api.entity.living.monster.Enderman;
import org.spongepowered.api.entity.living.monster.Endermite;
import org.spongepowered.api.entity.living.monster.Ghast;
import org.spongepowered.api.entity.living.monster.Giant;
import org.spongepowered.api.entity.living.monster.Phantom;
import org.spongepowered.api.entity.living.monster.Silverfish;
import org.spongepowered.api.entity.living.monster.Vex;
import org.spongepowered.api.entity.living.monster.boss.Wither;
import org.spongepowered.api.entity.living.monster.boss.dragon.EnderDragon;
import org.spongepowered.api.entity.living.monster.guardian.ElderGuardian;
import org.spongepowered.api.entity.living.monster.guardian.Guardian;
import org.spongepowered.api.entity.living.monster.raider.Ravager;
import org.spongepowered.api.entity.living.monster.raider.Witch;
import org.spongepowered.api.entity.living.monster.raider.illager.Pillager;
import org.spongepowered.api.entity.living.monster.raider.illager.Vindicator;
import org.spongepowered.api.entity.living.monster.raider.illager.spellcaster.Evoker;
import org.spongepowered.api.entity.living.monster.raider.illager.spellcaster.Illusioner;
import org.spongepowered.api.entity.living.monster.skeleton.Skeleton;
import org.spongepowered.api.entity.living.monster.skeleton.Stray;
import org.spongepowered.api.entity.living.monster.skeleton.WitherSkeleton;
import org.spongepowered.api.entity.living.monster.slime.MagmaCube;
import org.spongepowered.api.entity.living.monster.slime.Slime;
import org.spongepowered.api.entity.living.monster.spider.CaveSpider;
import org.spongepowered.api.entity.living.monster.spider.Spider;
import org.spongepowered.api.entity.living.monster.zombie.Drowned;
import org.spongepowered.api.entity.living.monster.zombie.Husk;
import org.spongepowered.api.entity.living.monster.zombie.Zombie;
import org.spongepowered.api.entity.living.monster.zombie.ZombiePigman;
import org.spongepowered.api.entity.living.monster.zombie.ZombieVillager;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.living.trader.Villager;
import org.spongepowered.api.entity.living.trader.WanderingTrader;
import org.spongepowered.api.entity.projectile.Egg;
import org.spongepowered.api.entity.projectile.EnderPearl;
import org.spongepowered.api.entity.projectile.EvokerFangs;
import org.spongepowered.api.entity.projectile.ExperienceBottle;
import org.spongepowered.api.entity.projectile.EyeOfEnder;
import org.spongepowered.api.entity.projectile.FishingBobber;
import org.spongepowered.api.entity.projectile.LlamaSpit;
import org.spongepowered.api.entity.projectile.Potion;
import org.spongepowered.api.entity.projectile.ShulkerBullet;
import org.spongepowered.api.entity.projectile.Snowball;
import org.spongepowered.api.entity.projectile.arrow.Arrow;
import org.spongepowered.api.entity.projectile.arrow.SpectralArrow;
import org.spongepowered.api.entity.projectile.arrow.Trident;
import org.spongepowered.api.entity.projectile.explosive.FireworkRocket;
import org.spongepowered.api.entity.projectile.explosive.WitherSkull;
import org.spongepowered.api.entity.projectile.explosive.fireball.DragonFireball;
import org.spongepowered.api.entity.projectile.explosive.fireball.ExplosiveFireball;
import org.spongepowered.api.entity.projectile.explosive.fireball.SmallFireball;
import org.spongepowered.api.entity.vehicle.Boat;
import org.spongepowered.api.entity.vehicle.minecart.CommandBlockMinecart;
import org.spongepowered.api.entity.vehicle.minecart.FurnaceMinecart;
import org.spongepowered.api.entity.vehicle.minecart.Minecart;
import org.spongepowered.api.entity.vehicle.minecart.SpawnerMinecart;
import org.spongepowered.api.entity.vehicle.minecart.TNTMinecart;
import org.spongepowered.api.entity.vehicle.minecart.carrier.ChestMinecart;
import org.spongepowered.api.entity.vehicle.minecart.carrier.HopperMinecart;
import org.spongepowered.api.entity.weather.LightningBolt;
import org.spongepowered.api.registry.Registries;

import java.util.function.Supplier;

public final class EntityTypes {

    // SORTFIELDS:ON

    public static final Supplier<EntityType<AreaEffectCloud>> AREA_EFFECT_CLOUD = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("area_effect_cloud"));

    public static final Supplier<EntityType<ArmorStand>> ARMOR_STAND = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("armor_stand"));

    public static final Supplier<EntityType<Arrow>> ARROW = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("arrow"));

    public static final Supplier<EntityType<Bat>> BAT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("bat"));

    public static final Supplier<EntityType<Bee>> BEE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("bee"));

    public static final Supplier<EntityType<Blaze>> BLAZE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("blaze"));

    public static final Supplier<EntityType<Boat>> BOAT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("boat"));

    public static final Supplier<EntityType<Cat>> CAT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("cat"));

    public static final Supplier<EntityType<CaveSpider>> CAVE_SPIDER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("cave_spider"));

    public static final Supplier<EntityType<ChestMinecart>> CHEST_MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("chest_minecart"));

    public static final Supplier<EntityType<Chicken>> CHICKEN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("chicken"));

    public static final Supplier<EntityType<Cod>> COD = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("cod"));

    public static final Supplier<EntityType<CommandBlockMinecart>> COMMAND_BLOCK_MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("command_block_minecart"));

    public static final Supplier<EntityType<Cow>> COW = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("cow"));

    public static final Supplier<EntityType<Creeper>> CREEPER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("creeper"));

    public static final Supplier<EntityType<Dolphin>> DOLPHIN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("dolphin"));

    public static final Supplier<EntityType<Donkey>> DONKEY = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("donkey"));

    public static final Supplier<EntityType<DragonFireball>> DRAGON_FIREBALL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("dragon_fireball"));

    public static final Supplier<EntityType<Drowned>> DROWNED = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("drowned"));

    public static final Supplier<EntityType<Egg>> EGG = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("egg"));

    public static final Supplier<EntityType<ElderGuardian>> ELDER_GUARDIAN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("elder_guardian"));

    public static final Supplier<EntityType<Enderman>> ENDERMAN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("enderman"));

    public static final Supplier<EntityType<Endermite>> ENDERMITE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("endermite"));

    public static final Supplier<EntityType<EnderDragon>> ENDER_DRAGON = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("ender_dragon"));

    public static final Supplier<EntityType<EnderPearl>> ENDER_PEARL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("ender_pearl"));

    public static final Supplier<EntityType<EnderCrystal>> END_CRYSTAL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("end_crystal"));

    public static final Supplier<EntityType<Evoker>> EVOKER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("evoker"));

    public static final Supplier<EntityType<EvokerFangs>> EVOKER_FANGS = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("evoker_fangs"));

    public static final Supplier<EntityType<ExperienceBottle>> EXPERIENCE_BOTTLE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("experience_bottle"));

    public static final Supplier<EntityType<ExperienceOrb>> EXPERIENCE_ORB = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("experience_orb"));

    public static final Supplier<EntityType<EyeOfEnder>> EYE_OF_ENDER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("eye_of_ender"));

    public static final Supplier<EntityType<FallingBlock>> FALLING_BLOCK = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("falling_block"));

    public static final Supplier<EntityType<ExplosiveFireball>> FIREBALL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("fireball"));

    public static final Supplier<EntityType<FireworkRocket>> FIREWORK_ROCKET = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("firework_rocket"));

    public static final Supplier<EntityType<FishingBobber>> FISHING_BOBBER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("fishing_bobber"));

    public static final Supplier<EntityType<Fox>> FOX = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("fox"));

    public static final Supplier<EntityType<FurnaceMinecart>> FURNACE_MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("furnace_minecart"));

    public static final Supplier<EntityType<Ghast>> GHAST = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("ghast"));

    public static final Supplier<EntityType<Giant>> GIANT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("giant"));

    public static final Supplier<EntityType<Guardian>> GUARDIAN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("guardian"));

    public static final Supplier<EntityType<HopperMinecart>> HOPPER_MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("hopper_minecart"));

    public static final Supplier<EntityType<Horse>> HORSE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("horse"));

    public static final Supplier<EntityType<Husk>> HUSK = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("husk"));

    public static final Supplier<EntityType<Illusioner>> ILLUSIONER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("illusioner"));

    public static final Supplier<EntityType<IronGolem>> IRON_GOLEM = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("iron_golem"));

    public static final Supplier<EntityType<Item>> ITEM = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("item"));

    public static final Supplier<EntityType<ItemFrame>> ITEM_FRAME = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("item_frame"));

    public static final Supplier<EntityType<LeashKnot>> LEASH_KNOT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("leash_knot"));

    public static final Supplier<EntityType<LightningBolt>> LIGHTNING_BOLT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("lightning_bolt"));

    public static final Supplier<EntityType<Llama>> LLAMA = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("llama"));

    public static final Supplier<EntityType<LlamaSpit>> LLAMA_SPIT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("llama_spit"));

    public static final Supplier<EntityType<MagmaCube>> MAGMA_CUBE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("magma_cube"));

    public static final Supplier<EntityType<Minecart>> MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("minecart"));

    public static final Supplier<EntityType<Mooshroom>> MOOSHROOM = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("mooshroom"));

    public static final Supplier<EntityType<Mule>> MULE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("mule"));

    public static final Supplier<EntityType<Ocelot>> OCELOT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("ocelot"));

    public static final Supplier<EntityType<Painting>> PAINTING = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("painting"));

    public static final Supplier<EntityType<Panda>> PANDA = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("panda"));

    public static final Supplier<EntityType<Parrot>> PARROT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("parrot"));

    public static final Supplier<EntityType<Phantom>> PHANTOM = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("phantom"));

    public static final Supplier<EntityType<Pig>> PIG = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("pig"));

    public static final Supplier<EntityType<Pillager>> PILLAGER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("pillager"));

    public static final Supplier<EntityType<Player>> PLAYER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("player"));

    public static final Supplier<EntityType<PolarBear>> POLAR_BEAR = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("polar_bear"));

    public static final Supplier<EntityType<Potion>> POTION = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("potion"));

    public static final Supplier<EntityType<Pufferfish>> PUFFERFISH = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("pufferfish"));

    public static final Supplier<EntityType<Rabbit>> RABBIT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("rabbit"));

    public static final Supplier<EntityType<Ravager>> RAVAGER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("ravager"));

    public static final Supplier<EntityType<Salmon>> SALMON = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("salmon"));

    public static final Supplier<EntityType<Sheep>> SHEEP = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("sheep"));

    public static final Supplier<EntityType<Shulker>> SHULKER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("shulker"));

    public static final Supplier<EntityType<ShulkerBullet>> SHULKER_BULLET = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("shulker_bullet"));

    public static final Supplier<EntityType<Silverfish>> SILVERFISH = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("silverfish"));

    public static final Supplier<EntityType<Skeleton>> SKELETON = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("skeleton"));

    public static final Supplier<EntityType<SkeletonHorse>> SKELETON_HORSE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("skeleton_horse"));

    public static final Supplier<EntityType<Slime>> SLIME = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("slime"));

    public static final Supplier<EntityType<SmallFireball>> SMALL_FIREBALL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("small_fireball"));

    public static final Supplier<EntityType<Snowball>> SNOWBALL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("snowball"));

    public static final Supplier<EntityType<SnowGolem>> SNOW_GOLEM = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("snow_golem"));

    public static final Supplier<EntityType<SpawnerMinecart>> SPAWNER_MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("spawner_minecart"));

    public static final Supplier<EntityType<SpectralArrow>> SPECTRAL_ARROW = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("spectral_arrow"));

    public static final Supplier<EntityType<Spider>> SPIDER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("spider"));

    public static final Supplier<EntityType<Squid>> SQUID = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("squid"));

    public static final Supplier<EntityType<Stray>> STRAY = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("stray"));

    public static final Supplier<EntityType<PrimedTNT>> TNT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("tnt"));

    public static final Supplier<EntityType<TNTMinecart>> TNT_MINECART = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("tnt_minecart"));

    public static final Supplier<EntityType<TraderLlama>> TRADER_LLAMA = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("trader_llama"));

    public static final Supplier<EntityType<Trident>> TRIDENT = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("trident"));

    public static final Supplier<EntityType<TropicalFish>> TROPICAL_FISH = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("tropical_fish"));

    public static final Supplier<EntityType<Turtle>> TURTLE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("turtle"));

    public static final Supplier<EntityType<Vex>> VEX = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("vex"));

    public static final Supplier<EntityType<Villager>> VILLAGER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("villager"));

    public static final Supplier<EntityType<Vindicator>> VINDICATOR = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("vindicator"));

    public static final Supplier<EntityType<WanderingTrader>> WANDERING_TRADER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("wandering_trader"));

    public static final Supplier<EntityType<Witch>> WITCH = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("witch"));

    public static final Supplier<EntityType<Wither>> WITHER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("wither"));

    public static final Supplier<EntityType<WitherSkeleton>> WITHER_SKELETON = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("wither_skeleton"));

    public static final Supplier<EntityType<WitherSkull>> WITHER_SKULL = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("wither_skull"));

    public static final Supplier<EntityType<Wolf>> WOLF = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("wolf"));

    public static final Supplier<EntityType<Zombie>> ZOMBIE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("zombie"));

    public static final Supplier<EntityType<ZombieHorse>> ZOMBIE_HORSE = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("zombie_horse"));

    public static final Supplier<EntityType<ZombiePigman>> ZOMBIE_PIGMAN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("zombie_pigman"));

    public static final Supplier<EntityType<ZombieVillager>> ZOMBIE_VILLAGER = Registries.ENTITY_TYPE.getSupplier(ResourceKey.minecraft("zombie_villager"));

    // SORTFIELDS:OFF

    public static final Supplier<EntityType<Human>> HUMAN = Registries.ENTITY_TYPE.getSupplier(ResourceKey.sponge("human"));

    private EntityTypes() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
