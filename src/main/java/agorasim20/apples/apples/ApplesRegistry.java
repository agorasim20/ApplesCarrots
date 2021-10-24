package agorasim20.apples.apples;

import agorasim20.apples.ApplesAndCarrots;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item.Settings;

public class ApplesRegistry {

    public static final Item COAL_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.COAL_APPLE));
    public static final Item COPPER_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.COPPER_APPLE));
    public static final Item EMERALD_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.EMERALD_APPLE));
    public static final Item LAPIS_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.LAPIS_APPLE));
    public static final Item OBSIDIAN_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.OBSIDIAN_APPLE));
    public static final Item DIAMOND_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.DIAMOND_APPLE));
    public static final Item NETHERITE_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.NETHERITE_APPLE));
    public static final Item IRON_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.IRON_APPLE));
    public static final Item CREATIVE_APPLE = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Apples.CREATIVE_APPLE));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("apples", "coal_apple"), COAL_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "copper_apple"), COPPER_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "emerald_apple"), EMERALD_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "lapis_apple"), LAPIS_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "obsidian_apple"), OBSIDIAN_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "diamond_apple"), DIAMOND_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "netherite_apple"), NETHERITE_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "iron_apple"), IRON_APPLE);
        Registry.register(Registry.ITEM, new Identifier("apples", "creative_apple"), CREATIVE_APPLE);
    }
}
