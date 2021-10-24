package agorasim20.apples;

import agorasim20.apples.apples.ApplesRegistry;
import agorasim20.apples.carrots.CarrotsRegistry;
import agorasim20.apples.nuggets.NuggetsRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ApplesAndCarrots implements ModInitializer {
    //item group
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
			.build(new Identifier("apples", "general"), () -> new ItemStack(CarrotsRegistry.DIAMOND_CARROT));
 
	@Override
	public void onInitialize() {
        ApplesRegistry.init();
        CarrotsRegistry.init();
        NuggetsRegistry.init();
    }  
}
