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
package org.spongepowered.api.registry;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.advancement.AdvancementType;
import org.spongepowered.api.advancement.criteria.trigger.Trigger;
import org.spongepowered.api.block.entity.BlockEntityType;
import org.spongepowered.api.command.parameter.managed.clientcompletion.ClientCompletionType;
import org.spongepowered.api.command.parameter.managed.standard.CatalogedValueParameter;
import org.spongepowered.api.command.selector.SelectorSortAlgorithm;
import org.spongepowered.api.command.selector.SelectorType;
import org.spongepowered.api.data.Key;
import org.spongepowered.api.data.persistence.DataFormat;
import org.spongepowered.api.data.persistence.DataTranslator;
import org.spongepowered.api.data.type.ArmorMaterial;
import org.spongepowered.api.data.type.ArtType;
import org.spongepowered.api.data.type.AttachmentSurface;
import org.spongepowered.api.data.type.BannerPatternShape;
import org.spongepowered.api.data.type.BoatType;
import org.spongepowered.api.data.type.BodyPart;
import org.spongepowered.api.data.type.CatType;
import org.spongepowered.api.data.type.ChestAttachmentType;
import org.spongepowered.api.data.type.ComparatorMode;
import org.spongepowered.api.data.type.DoorHinge;
import org.spongepowered.api.data.type.DyeColor;
import org.spongepowered.api.data.type.FoxType;
import org.spongepowered.api.data.type.HandPreference;
import org.spongepowered.api.data.type.HandType;
import org.spongepowered.api.data.type.HorseColor;
import org.spongepowered.api.data.type.HorseStyle;
import org.spongepowered.api.data.type.InstrumentType;
import org.spongepowered.api.data.type.LlamaType;
import org.spongepowered.api.data.type.MatterState;
import org.spongepowered.api.data.type.MooshroomType;
import org.spongepowered.api.data.type.NotePitch;
import org.spongepowered.api.data.type.PandaGene;
import org.spongepowered.api.data.type.ParrotType;
import org.spongepowered.api.data.type.PhantomPhase;
import org.spongepowered.api.data.type.PickupRule;
import org.spongepowered.api.data.type.PistonType;
import org.spongepowered.api.data.type.PortionType;
import org.spongepowered.api.data.type.ProfessionType;
import org.spongepowered.api.data.type.RabbitType;
import org.spongepowered.api.data.type.RaidStatus;
import org.spongepowered.api.data.type.RailDirection;
import org.spongepowered.api.data.type.SkinPart;
import org.spongepowered.api.data.type.SlabPortion;
import org.spongepowered.api.data.type.SpellType;
import org.spongepowered.api.data.type.StairShape;
import org.spongepowered.api.data.type.StructureMode;
import org.spongepowered.api.data.type.ToolType;
import org.spongepowered.api.data.type.TropicalFishShape;
import org.spongepowered.api.data.type.VillagerType;
import org.spongepowered.api.data.type.WireAttachmentType;
import org.spongepowered.api.data.type.WoodType;
import org.spongepowered.api.effect.particle.ParticleOption;
import org.spongepowered.api.effect.particle.ParticleType;
import org.spongepowered.api.effect.potion.PotionEffectType;
import org.spongepowered.api.effect.sound.SoundType;
import org.spongepowered.api.effect.sound.music.MusicDisc;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.ai.goal.GoalExecutorType;
import org.spongepowered.api.entity.ai.goal.GoalType;
import org.spongepowered.api.entity.attribute.AttributeOperation;
import org.spongepowered.api.entity.attribute.type.AttributeType;
import org.spongepowered.api.entity.living.monster.boss.dragon.phase.DragonPhaseType;
import org.spongepowered.api.entity.living.player.chat.ChatVisibility;
import org.spongepowered.api.entity.living.player.gamemode.GameMode;
import org.spongepowered.api.event.EventContextKey;
import org.spongepowered.api.event.cause.entity.DismountType;
import org.spongepowered.api.event.cause.entity.MovementType;
import org.spongepowered.api.event.cause.entity.SpawnType;
import org.spongepowered.api.event.cause.entity.damage.DamageModifierType;
import org.spongepowered.api.event.cause.entity.damage.DamageType;
import org.spongepowered.api.fluid.FluidType;
import org.spongepowered.api.item.FireworkShape;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.enchantment.EnchantmentType;
import org.spongepowered.api.item.inventory.ContainerType;
import org.spongepowered.api.item.inventory.equipment.EquipmentGroup;
import org.spongepowered.api.item.inventory.equipment.EquipmentType;
import org.spongepowered.api.item.inventory.menu.ClickType;
import org.spongepowered.api.item.inventory.query.QueryType;
import org.spongepowered.api.item.potion.PotionType;
import org.spongepowered.api.item.recipe.RecipeType;
import org.spongepowered.api.placeholder.PlaceholderParser;
import org.spongepowered.api.scheduler.TaskPriority;
import org.spongepowered.api.scoreboard.CollisionRule;
import org.spongepowered.api.scoreboard.Visibility;
import org.spongepowered.api.scoreboard.criteria.Criterion;
import org.spongepowered.api.scoreboard.displayslot.DisplaySlot;
import org.spongepowered.api.scoreboard.objective.displaymode.ObjectiveDisplayMode;
import org.spongepowered.api.service.ban.BanType;
import org.spongepowered.api.service.economy.Currency;
import org.spongepowered.api.service.economy.account.AccountDeletionResult;
import org.spongepowered.api.service.economy.transaction.EconomyTransactionType;
import org.spongepowered.api.state.BooleanStateProperty;
import org.spongepowered.api.state.EnumStateProperty;
import org.spongepowered.api.state.IntegerStateProperty;
import org.spongepowered.api.statistic.Statistic;
import org.spongepowered.api.statistic.StatisticCategory;
import org.spongepowered.api.util.rotation.Rotation;
import org.spongepowered.api.world.HeightType;
import org.spongepowered.api.world.LightType;
import org.spongepowered.api.world.SerializationBehavior;
import org.spongepowered.api.world.WorldArchetype;
import org.spongepowered.api.world.biome.BiomeType;
import org.spongepowered.api.world.biome.VirtualBiomeType;
import org.spongepowered.api.world.chunk.ChunkState;
import org.spongepowered.api.world.difficulty.Difficulty;
import org.spongepowered.api.world.dimension.DimensionType;
import org.spongepowered.api.world.gamerule.GameRule;
import org.spongepowered.api.world.gen.GeneratorModifierType;
import org.spongepowered.api.world.portal.PortalType;
import org.spongepowered.api.world.schematic.PaletteType;
import org.spongepowered.api.world.teleport.TeleportHelperFilter;
import org.spongepowered.api.world.weather.Weather;

@SuppressWarnings("rawtypes")
public final class Registries {

    // SORTFIELDS:ON

    public static Registry<AccountDeletionResult> ACCOUNT_DELETION_RESULT = Sponge.getRegistryManager().get(AccountDeletionResult.class);

    public static Registry<AdvancementType> ADVANCEMENT_TYPE = Sponge.getRegistryManager().get(AdvancementType.class);

    public static Registry<ArmorMaterial> ARMOR_MATERIAL = Sponge.getRegistryManager().get(ArmorMaterial.class);

    public static Registry<ArtType> ART_TYPE = Sponge.getRegistryManager().get(ArtType.class);

    public static Registry<AttachmentSurface> ATTACHMENT_SURFACE = Sponge.getRegistryManager().get(AttachmentSurface.class);

    public static Registry<AttributeOperation> ATTRIBUTE_OPERATION = Sponge.getRegistryManager().get(AttributeOperation.class);

    public static Registry<AttributeType> ATTRIBUTE_TYPE = Sponge.getRegistryManager().get(AttributeType.class);

    public static Registry<BannerPatternShape> BANNER_PATTERN_SHAPE = Sponge.getRegistryManager().get(BannerPatternShape.class);

    public static Registry<BanType> BAN_TYPE = Sponge.getRegistryManager().get(BanType.class);

    public static Registry<BiomeType> BIOME_TYPE = Sponge.getRegistryManager().get(BiomeType.class);

    public static Registry<BlockEntityType> BLOCK_ENTITY_TYPE = Sponge.getRegistryManager().get(BlockEntityType.class);

    public static Registry<BoatType> BOAT_TYPE = Sponge.getRegistryManager().get(BoatType.class);

    public static Registry<BodyPart> BODY_PART = Sponge.getRegistryManager().get(BodyPart.class);

    public static Registry<BooleanStateProperty> BOOLEAN_STATE_PROPERTY = Sponge.getRegistryManager().get(BooleanStateProperty.class);

    public static Registry<CatType> CAT_TYPE = Sponge.getRegistryManager().get(CatType.class);

    public static Registry<CatalogedValueParameter> CATALOGED_VALUE_PARAMETER = Sponge.getRegistryManager().get(CatalogedValueParameter.class);

    public static Registry<ChatVisibility> CHAT_VISIBILITY = Sponge.getRegistryManager().get(ChatVisibility.class);

    public static Registry<ChestAttachmentType> CHEST_ATTACHMENT_TYPE = Sponge.getRegistryManager().get(ChestAttachmentType.class);

    public static Registry<ChunkState> CHUNK_STATE = Sponge.getRegistryManager().get(ChunkState.class);

    public static Registry<ClientCompletionType> CLIENT_COMPLETION_TYPE = Sponge.getRegistryManager().get(ClientCompletionType.class);

    public static Registry<ClickType> CLICK_TYPE = Sponge.getRegistryManager().get(ClickType.class);

    public static Registry<CollisionRule> COLLISION_RULE = Sponge.getRegistryManager().get(CollisionRule.class);

    public static Registry<ComparatorMode> COMPARATOR_MODE = Sponge.getRegistryManager().get(ComparatorMode.class);

    public static Registry<ContainerType> CONTAINER_TYPE = Sponge.getRegistryManager().get(ContainerType.class);

    public static Registry<Criterion> CRITERION = Sponge.getRegistryManager().get(Criterion.class);

    public static Registry<Currency> CURRENCY = Sponge.getRegistryManager().get(Currency.class);

    public static Registry<DamageModifierType> DAMAGE_MODIFIER_TYPE = Sponge.getRegistryManager().get(DamageModifierType.class);

    public static Registry<DamageType> DAMAGE_TYPE = Sponge.getRegistryManager().get(DamageType.class);

    public static Registry<DataFormat> DATA_FORMAT = Sponge.getRegistryManager().get(DataFormat.class);

    public static Registry<DataTranslator> DATA_TRANSLATOR = Sponge.getRegistryManager().get(DataTranslator.class);

    public static Registry<Difficulty> DIFFICULTY = Sponge.getRegistryManager().get(Difficulty.class);

    public static Registry<DimensionType> DIMENSION_TYPE = Sponge.getRegistryManager().get(DimensionType.class);

    public static Registry<DismountType> DISMOUNT_TYPE = Sponge.getRegistryManager().get(DismountType.class);

    public static Registry<DisplaySlot> DISPLAY_SLOT = Sponge.getRegistryManager().get(DisplaySlot.class);

    public static Registry<DoorHinge> DOOR_HINGE = Sponge.getRegistryManager().get(DoorHinge.class);

    public static Registry<DragonPhaseType> DRAGON_PHASE_TYPE = Sponge.getRegistryManager().get(DragonPhaseType.class);

    public static Registry<DyeColor> DYE_COLOR = Sponge.getRegistryManager().get(DyeColor.class);

    public static Registry<EconomyTransactionType> ECONOMY_TRANSACTION_TYPE = Sponge.getRegistryManager().get(EconomyTransactionType.class);

    public static Registry<EnchantmentType> ENCHANTMENT_TYPE = Sponge.getRegistryManager().get(EnchantmentType.class);

    public static Registry<EntityType> ENTITY_TYPE = Sponge.getRegistryManager().get(EntityType.class);

    public static Registry<EnumStateProperty> ENUM_STATE_PROPERTY = Sponge.getRegistryManager().get(EnumStateProperty.class);

    public static Registry<EquipmentGroup> EQUIPMENT_GROUP = Sponge.getRegistryManager().get(EquipmentGroup.class);

    public static Registry<EquipmentType> EQUIPMENT_TYPE = Sponge.getRegistryManager().get(EquipmentType.class);

    public static Registry<EventContextKey> EVENT_CONTEXT_KEY = Sponge.getRegistryManager().get(EventContextKey.class);

    public static Registry<FireworkShape> FIREWORK_SHAPE = Sponge.getRegistryManager().get(FireworkShape.class);

    public static Registry<FluidType> FLUID_TYPE = Sponge.getRegistryManager().get(FluidType.class);

    public static Registry<FoxType> FOX_TYPE = Sponge.getRegistryManager().get(FoxType.class);

    public static Registry<GameMode> GAME_MODE = Sponge.getRegistryManager().get(GameMode.class);

    public static Registry<GameRule> GAME_RULE = Sponge.getRegistryManager().get(GameRule.class);

    public static Registry<GeneratorModifierType> GENERATOR_MODIFIER_TYPE = Sponge.getRegistryManager().get(GeneratorModifierType.class);

    public static Registry<GoalExecutorType> GOAL_EXECUTOR_TYPE = Sponge.getRegistryManager().get(GoalExecutorType.class);

    public static Registry<GoalType> GOAL_TYPE = Sponge.getRegistryManager().get(GoalType.class);

    public static Registry<HandPreference> HAND_PREFERENCE = Sponge.getRegistryManager().get(HandPreference.class);

    public static Registry<HandType> HAND_TYPE = Sponge.getRegistryManager().get(HandType.class);

    public static Registry<HeightType> HEIGHT_TYPE = Sponge.getRegistryManager().get(HeightType.class);

    public static Registry<HorseColor> HORSE_COLOR = Sponge.getRegistryManager().get(HorseColor.class);

    public static Registry<HorseStyle> HORSE_STYLE = Sponge.getRegistryManager().get(HorseStyle.class);

    public static Registry<InstrumentType> INSTRUMENT_TYPE = Sponge.getRegistryManager().get(InstrumentType.class);

    public static Registry<IntegerStateProperty> INTEGER_STATE_PROPERTY = Sponge.getRegistryManager().get(IntegerStateProperty.class);

    public static Registry<ItemType> ITEM_TYPE = Sponge.getRegistryManager().get(ItemType.class);

    public static Registry<Key> KEY = Sponge.getRegistryManager().get(Key.class);

    public static Registry<LightType> LIGHT_TYPE = Sponge.getRegistryManager().get(LightType.class);

    public static Registry<LlamaType> LLAMA_TYPE = Sponge.getRegistryManager().get(LlamaType.class);

    public static Registry<MatterState> MATTER_STATE = Sponge.getRegistryManager().get(MatterState.class);

    public static Registry<MooshroomType> MOOSHROOM_TYPE = Sponge.getRegistryManager().get(MooshroomType.class);

    public static Registry<MovementType> MOVEMENT_TYPE = Sponge.getRegistryManager().get(MovementType.class);

    public static Registry<MusicDisc> MUSIC_DISC = Sponge.getRegistryManager().get(MusicDisc.class);

    public static Registry<NotePitch> NOTE_PITCH = Sponge.getRegistryManager().get(NotePitch.class);

    public static Registry<ObjectiveDisplayMode> OBJECTIVE_DISPLAY_MODE = Sponge.getRegistryManager().get(ObjectiveDisplayMode.class);

    public static Registry<PaletteType> PALETTE_TYPE = Sponge.getRegistryManager().get(PaletteType.class);

    public static Registry<PandaGene> PANDA_GENE = Sponge.getRegistryManager().get(PandaGene.class);

    public static Registry<ParrotType> PARROT_TYPE = Sponge.getRegistryManager().get(ParrotType.class);

    public static Registry<ParticleOption> PARTICLE_OPTION = Sponge.getRegistryManager().get(ParticleOption.class);

    public static Registry<ParticleType> PARTICLE_TYPE = Sponge.getRegistryManager().get(ParticleType.class);

    public static Registry<PhantomPhase> PHANTOM_PHASE = Sponge.getRegistryManager().get(PhantomPhase.class);

    public static Registry<PickupRule> PICKUP_RULE = Sponge.getRegistryManager().get(PickupRule.class);

    public static Registry<PistonType> PISTON_TYPE = Sponge.getRegistryManager().get(PistonType.class);

    public static Registry<PlaceholderParser> PLACEHOLDER_PARSER = Sponge.getRegistryManager().get(PlaceholderParser.class);

    public static Registry<PortalType> PORTAL_TYPE = Sponge.getRegistryManager().get(PortalType.class);

    public static Registry<PortionType> PORTION_TYPE = Sponge.getRegistryManager().get(PortionType.class);

    public static Registry<PotionEffectType> POTION_EFFECT_TYPE = Sponge.getRegistryManager().get(PotionEffectType.class);

    public static Registry<PotionType> POTION_TYPE = Sponge.getRegistryManager().get(PotionType.class);

    public static Registry<ProfessionType> PROFESSION_TYPE = Sponge.getRegistryManager().get(ProfessionType.class);

    public static Registry<QueryType> QUERY_TYPE = Sponge.getRegistryManager().get(QueryType.class);

    public static Registry<Rotation> ROTATION = Sponge.getRegistryManager().get(Rotation.class);

    public static Registry<RabbitType> RABBIT_TYPE = Sponge.getRegistryManager().get(RabbitType.class);

    public static Registry<RaidStatus> RAID_STATUS = Sponge.getRegistryManager().get(RaidStatus.class);

    public static Registry<RailDirection> RAIL_DIRECTION = Sponge.getRegistryManager().get(RailDirection.class);

    public static Registry<RecipeType> RECIPE_TYPE = Sponge.getRegistryManager().get(RecipeType.class);

    public static Registry<SelectorSortAlgorithm> SELECTOR_SORT_ALGORITHM = Sponge.getRegistryManager().get(SelectorSortAlgorithm.class);

    public static Registry<SelectorType> SELECTOR_TYPE = Sponge.getRegistryManager().get(SelectorType.class);

    public static Registry<SerializationBehavior> SERIALIZATION_BEHAVIOR = Sponge.getRegistryManager().get(SerializationBehavior.class);

    public static Registry<SkinPart> SKIN_PART = Sponge.getRegistryManager().get(SkinPart.class);

    public static Registry<SlabPortion> SLAB_PORTION = Sponge.getRegistryManager().get(SlabPortion.class);

    public static Registry<SoundType> SOUND_TYPE = Sponge.getRegistryManager().get(SoundType.class);

    public static Registry<SpawnType> SPAWN_TYPE = Sponge.getRegistryManager().get(SpawnType.class);

    public static Registry<SpellType> SPELL_TYPE = Sponge.getRegistryManager().get(SpellType.class);

    public static Registry<Statistic> STATISTIC = Sponge.getRegistryManager().get(Statistic.class);

    public static Registry<StatisticCategory> STATISTIC_CATEGORY = Sponge.getRegistryManager().get(StatisticCategory.class);

    public static Registry<StairShape> STAIR_SHAPE = Sponge.getRegistryManager().get(StairShape.class);

    public static Registry<StructureMode> STRUCTURE_MODE = Sponge.getRegistryManager().get(StructureMode.class);

    public static Registry<TaskPriority> TASK_PRIORITY = Sponge.getRegistryManager().get(TaskPriority.class);

    public static Registry<TeleportHelperFilter> TELEPORT_HELPER_FILTER = Sponge.getRegistryManager().get(TeleportHelperFilter.class);

    public static Registry<ToolType> TOOL_TYPE = Sponge.getRegistryManager().get(ToolType.class);

    public static Registry<Trigger> TRIGGER = Sponge.getRegistryManager().get(Trigger.class);

    public static Registry<TropicalFishShape> TROPICAL_FISH_SHAPE = Sponge.getRegistryManager().get(TropicalFishShape.class);

    public static Registry<VillagerType> VILLAGER_TYPE = Sponge.getRegistryManager().get(VillagerType.class);

    public static Registry<VirtualBiomeType> VIRTUAL_BIOME_TYPE = Sponge.getRegistryManager().get(VirtualBiomeType.class);

    public static Registry<Visibility> VISIBILITY = Sponge.getRegistryManager().get(Visibility.class);

    public static Registry<Weather> WEATHER = Sponge.getRegistryManager().get(Weather.class);

    public static Registry<WireAttachmentType> WIRE_ATTACHMENT_TYPE = Sponge.getRegistryManager().get(WireAttachmentType.class);

    public static Registry<WoodType> WOOD_TYPE = Sponge.getRegistryManager().get(WoodType.class);

    public static Registry<WorldArchetype> WORLD_ARCHETYPE = Sponge.getRegistryManager().get(WorldArchetype.class);

    // SORTFIELDS:OFF

    private Registries() {
        throw new AssertionError("You should not be attempting to instantiate this class.");
    }

}
