package net.tropicraft.registry;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tropicraft.Tropicraft;
import net.tropicraft.item.ItemTropicsOre;

public class ItemRegistry extends TropicraftRegistry {

	// Ore gems
	public static Item azurite, eudialyte, zircon;
	/**
	 * Register items in preInit
	 */
	public static void init() {
		azurite = registerItem(new ItemTropicsOre(), "azurite");
		eudialyte = registerItem(new ItemTropicsOre(), "eudialyte");
		zircon = registerItem(new ItemTropicsOre(), "zircon");
	}
	
	private static Item registerItem(Item item, String name) {
		item.setUnlocalizedName(getNamePrefixed(name));
		
		GameRegistry.registerItem(item, name);
		Tropicraft.proxy.registerItemVariantModel(item, name, 0);
		
		return item;
	}
}
