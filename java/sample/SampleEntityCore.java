package sample;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

//みるくぷろていん
@Mod(modid = "SampleEntity", name = "SampleEntity", version = "1.0.0")
public class SampleEntityCore {
    @EventHandler
    public void init(FMLInitializationEvent event) {
        EntityRegistry.registerModEntity(EntitySample.class, "SampleEntity", 0, this, 250, 1, false);
        EntityRegistry.addSpawn(EntitySample.class, 20, 1, 4, EnumCreatureType.creature, BiomeGenBase.plains);
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
		RenderingRegistry.registerEntityRenderingHandler(EntitySample.class, new RenderSample());
        }
    }
}