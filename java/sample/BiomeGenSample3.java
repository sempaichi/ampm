package sample;
 
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenDesert;
 
public class BiomeGenSample3 extends BiomeGenDesert {
    public BiomeGenSample3(int p_i1986_1_) {
        super(p_i1986_1_);
        this.topBlock = Blocks.nether_brick;
        this.fillerBlock = Blocks.netherrack;
    }
}