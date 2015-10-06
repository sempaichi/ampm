package sample;
 
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenDesert;
 
public class BiomeGenSample2 extends BiomeGenDesert {
    public BiomeGenSample2(int p_i1986_1_) {
        super(p_i1986_1_);
        this.topBlock = Blocks.pumpkin;
        this.fillerBlock = Blocks.dirt;
    }
}