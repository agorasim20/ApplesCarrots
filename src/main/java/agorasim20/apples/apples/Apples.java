package agorasim20.apples.apples;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Apples {
    public static final FoodComponent COAL_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.6F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 800, 2), 1).alwaysEdible().build();
    public static final FoodComponent COPPER_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.6F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 2), 1).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 0), 1).alwaysEdible().build();
    public static final FoodComponent EMERALD_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.8F).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 400, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 800, 0), 1).alwaysEdible().build();
    public static final FoodComponent LAPIS_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.8F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0), 1).alwaysEdible().build();
    public static final FoodComponent OBSIDIAN_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(2F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1), 1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 600, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600, 0), 1).alwaysEdible().build();
    public static final FoodComponent DIAMOND_APPLE = (new FoodComponent.Builder()).hunger(12).saturationModifier(2.5F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1800, 2), 1).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1), 1).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2400, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 4), 1).alwaysEdible().build();
    public static final FoodComponent NETHERITE_APPLE = (new FoodComponent.Builder()).hunger(20).saturationModifier(3F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 4), 1).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1800, 2), 1).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2400, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 2), 1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4800, 4), 1).alwaysEdible().build();
    public static final FoodComponent IRON_APPLE = (new FoodComponent.Builder()).hunger(7).saturationModifier(2F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 1), 1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 0), 1).alwaysEdible().build();
    public static final FoodComponent CREATIVE_APPLE = (new FoodComponent.Builder()).hunger(20).saturationModifier(4F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 4800, 9), 1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4800, 9), 1).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4800, 9), 1).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 4800, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 4800, 0), 1).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4800, 4), 1).alwaysEdible().build();
}