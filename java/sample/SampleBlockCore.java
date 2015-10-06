package sample;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = "testmod", name = "ぱいちもっど")
public class SampleBlockCore
{
	public static Block blockSample;
	public static Block rawAmpmHead;
	public static Item anan;
	public static Item korochan;
 
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//ブロックのインスタンス生成
		blockSample = new SampleBlock();
		rawAmpmHead = new RawAmpmHead();
		//ブロックの登録。登録文字列はMOD内で被らなければ何でも良い。
		GameRegistry.registerBlock(blockSample, "あんぱんヘッド");
		GameRegistry.registerBlock(rawAmpmHead, "生あんぱんヘッド");
		
		anan = new Item()
				.setUnlocalizedName("anan")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setTextureName("testmod:anan");
		GameRegistry.registerItem(anan, "anan");
		korochan = new Item()
				.setUnlocalizedName("korochan")
				.setCreativeTab(CreativeTabs.tabMaterials)
				.setTextureName("testmod:korochan");
		GameRegistry.registerItem(korochan, "ころちゃん");
		
		
		GameRegistry.addRecipe(new ItemStack(rawAmpmHead),
                "###",
                "#X#",
                "###",
                '#', Items.bread,
                'X', anan
                
        );
		
		
		GameRegistry.addSmelting(korochan,new ItemStack(anan),1.0f);
		
		GameRegistry.addSmelting(rawAmpmHead,new ItemStack(blockSample),1.0f);
 
	}
	
}
