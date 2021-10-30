package agorasim20.apples.nuggets;

import agorasim20.apples.ApplesAndCarrots;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NuggetsRegistry {

    public static final Item COAL_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP));
    public static final Item COPPER_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP));
    public static final Item EMERALD_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP));
    public static final Item LAPIS_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP));
    public static final Item OBSIDIAN_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP));
    public static final Item DIAMOND_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP));
    public static final Item NETHERITE_NUGGET = new Item(new Item.Settings().group(ApplesAndCarrots.ITEM_GROUP).fireproof());
    
    public static void init(){
        Registry.register(Registry.ITEM, new Identifier("apples", "coal_nugget"), COAL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("apples", "copper_nugget"), COPPER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("apples", "emerald_nugget"), EMERALD_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("apples", "lapis_nugget"), LAPIS_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("apples", "obsidian_nugget"), OBSIDIAN_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("apples", "diamond_nugget"), DIAMOND_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("apples", "netherite_nugget"), NETHERITE_NUGGET);

        FuelRegistry.INSTANCE.add(COAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(COPPER_NUGGET, 50);
        FuelRegistry.INSTANCE.add(EMERALD_NUGGET, 50);
        FuelRegistry.INSTANCE.add(LAPIS_NUGGET, 50);
        FuelRegistry.INSTANCE.add(OBSIDIAN_NUGGET, 50);
        FuelRegistry.INSTANCE.add(DIAMOND_NUGGET, 100);
        FuelRegistry.INSTANCE.add(NETHERITE_NUGGET, 150);
    }
}
