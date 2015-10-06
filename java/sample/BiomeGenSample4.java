package sample;
 
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenDesert;
 
public class BiomeGenSample4 extends BiomeGenDesert {
    public BiomeGenSample4(int p_i1986_1_) {
        super(p_i1986_1_);
        this.topBlock = Blocks.melon_block;
        this.fillerBlock = Blocks.clay;
    }
}