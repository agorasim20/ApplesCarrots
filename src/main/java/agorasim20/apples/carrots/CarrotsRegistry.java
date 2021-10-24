package agorasim20.apples.carrots;

import agorasim20.apples.ApplesAndCarrots;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item.Settings;

public class CarrotsRegistry {
    
    public static final Item COAL_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.COAL_CARROT));
    public static final Item COPPER_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.COPPER_CARROT));
    public static final Item EMERALD_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.EMERALD_CARROT));
    public static final Item LAPIS_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.LAPIS_CARROT));
    public static final Item OBSIDIAN_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.OBSIDIAN_CARROT));
    public static final Item DIAMOND_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.DIAMOND_CARROT));
    public static final Item NETHERITE_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.NETHERITE_CARROT));
    public static final Item IRON_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.IRON_CARROT));
    public static final Item CREATIVE_CARROT = new Item(new Settings().group(ApplesAndCarrots.ITEM_GROUP).food(Carrots.CREATIVE_CARROT));
    
    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("apples", "coal_carrot"), COAL_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "copper_carrot"), COPPER_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "emerald_carrot"), EMERALD_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "lapis_carrot"), LAPIS_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "obsidian_carrot"), OBSIDIAN_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "diamond_carrot"), DIAMOND_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "netherite_carrot"), NETHERITE_CARROT);  
        Registry.register(Registry.ITEM, new Identifier("apples", "iron_carrot"), IRON_CARROT);
        Registry.register(Registry.ITEM, new Identifier("apples", "creative_carrot"), CREATIVE_CARROT);
    }
}
