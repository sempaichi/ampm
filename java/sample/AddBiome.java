package sample;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
 
@Mod(modid = AddBiome.MODID, name = AddBiome.MODNAME, version = AddBiome.VERSION)
public class AddBiome {
    public static final String MODID = "AddBiome";
    public static final String MODNAME = "AddBiome";
    public static final String VERSION = "1.0.0";
 
    // バイオームIDを指定
    // ここでは決め打ちにしているが、他MODが追加するバイオームとIDが重複する可能性があるので、
    // 設定ファイルで変更できるようにするか、自動的に割り振るようにするとよい
    public static int biome1ID = 40;
    public static int biome2ID = 41;
    public static int biome3ID = 42;
    public static int biome4ID = 43;
 
    // 独自のバイオーム。地表ブロックと地中ブロックがバニラとは異なる
    public static final BiomeGenBase biome1 = (new BiomeGenSample1(biome1ID)).setColor(0xff0000).setBiomeName("Sample1");
    public static final BiomeGenBase biome2 = (new BiomeGenSample2(biome2ID)).setColor(0x00ff00).setBiomeName("Sample2");
    public static final BiomeGenBase biome3 = (new BiomeGenSample3(biome3ID)).setColor(0x00ff00).setBiomeName("Sample3");
    public static final BiomeGenBase biome4 = (new BiomeGenSample4(biome4ID)).setColor(0xffff00).setBiomeName("Sample4");
 
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
 
    @EventHandler
    public void init(FMLInitializationEvent event) {
        // 各種バイオームリストにバイオームを追加
        // 2つ目の引数はバイオーム発生頻度の重み付け。大きいほど頻繁
        BiomeManager.desertBiomes.add(new BiomeManager.BiomeEntry(biome1, 100));
        BiomeManager.icyBiomes.add(new BiomeManager.BiomeEntry(biome2, 100));
        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(biome3, 10));
        BiomeManager.coolBiomes.add(new BiomeManager.BiomeEntry(biome4, 10));
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
