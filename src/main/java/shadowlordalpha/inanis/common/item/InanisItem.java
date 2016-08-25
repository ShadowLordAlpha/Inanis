package shadowlordalpha.inanis.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InanisItem {

	public static Item shardVoid;

	private InanisItem() {

	}

	public static void createItems() {
		shardVoid = new Item().setUnlocalizedName("shardVoid").setRegistryName("shardVoid").setCreativeTab(CreativeTabs.MATERIALS);
		
		GameRegistry.register(shardVoid);
	}

}
