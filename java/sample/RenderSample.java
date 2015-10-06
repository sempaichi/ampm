package sample;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;


public class RenderSample extends Render {
    public static final ResourceLocation texture = new ResourceLocation("testmod:textures/entity/sample.png");
    public RenderSample() {
        // 引数:(ModelBase以降を継承したクラスのインスタンス、影の大きさ)
        
    }
 
    public ResourceLocation getEntityTexture(EntityLiving entity) { return texture; }

	@Override
	public void doRender(Entity arg0, double arg1, double arg2, double arg3, float arg4, float arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}