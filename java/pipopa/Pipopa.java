package pipopa;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Pipopa{
	public static Item pipopa;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		pipopa = new Item()
				.setUnlocalizedName("pipopa")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setTextureName("testmod:pipopa");
		GameRegistry.registerItem(pipopa, "ぴぽぱ");
	}
}