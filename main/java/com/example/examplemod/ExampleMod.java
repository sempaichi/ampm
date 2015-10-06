package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "helloMod";
    public static final String VERSION = "β1.0";
    public static Item pickaxeTutorial;
    public static final Item.ToolMaterial TUTORIALMATERIAL = EnumHelper
    		.addToolMaterial("TUTORIALMATERIAL", 3, 1561, 5.0F, 1.5F, 12);
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	// add レシピ
    	GameRegistry.addRecipe(new ItemStack(Items.diamond),
    			"X", 'X', Blocks.dirt
    	);
    	GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block),
    			"DSD",
    			"SDS",
    			"DSD",
    			'D', Blocks.dirt,
    			'S', Items.wheat_seeds
    	);
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_ore), 
    			Items.diamond,
    			Blocks.stone
    	);
    	GameRegistry.addSmelting(Items.wheat_seeds, new ItemStack(Items.cake), 0.2f);
    	
    	pickaxeTutorial = new CustomPickaxe(TUTORIALMATERIAL)
    			.setUnlocalizedName("pickaxeTutorial")
    			.setCreativeTab(CreativeTabs.tabMaterials)
    			.setTextureName("testmod:pipopa");
    	GameRegistry.registerItem(pickaxeTutorial, "pickaxeTutorial");
    }
}
