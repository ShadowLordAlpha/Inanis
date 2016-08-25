package shadowlordalpha.inanis.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import shadowlordalpha.inanis.common.item.InanisItem;
import shadowlordalpha.shadowcore.proxy.IProxy;

@Mod(modid = InanisConfig.MODID, version = InanisConfig.VERSION)
public class Inanis {

	@Instance(InanisConfig.MODID)
	public static Inanis instance;
	
	@SidedProxy(modId = InanisConfig.MODID, clientSide = "shadowlordalpha.shadowcore.proxy.ClientProxy", serverSide = "shadowlordalpha.shadowcore.proxy.ServerProxy")
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		InanisItem.createItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
