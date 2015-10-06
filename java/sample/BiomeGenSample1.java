package sample;
 
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenDesert;
 
public class BiomeGenSample1 extends BiomeGenDesert {
    public BiomeGenSample1(int p_i1986_1_) {
        super(p_i1986_1_);
        this.topBlock = Blocks.glass;
        this.fillerBlock = Blocks.crafting_table;
    }
}
