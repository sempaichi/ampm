package sample;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
 
public class ModelSample extends ModelBase {
    // モデルの直方体を代入する変数
    ModelRenderer bottom;
    ModelRenderer base;
    ModelRenderer top;
 
    public ModelSample() {
        super();
        // テクスチャの縦と横のサイズ
        textureWidth = 32;
        textureHeight = 64;
        // モデルの形を作る
        base = new ModelRenderer(this, 0, 14);
        base.addBox(0F, 0F, 0F, 10, 8, 10);
 
        bottom = new ModelRenderer(this, 32, 2);
        bottom.addBox(1F, 8F, 1F, 8, 8, 8);
 
        top = new ModelRenderer(this, 40, 18);
        top.addBox(2F, 16F, 2F, 6, 8, 6);
    }
 
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        // 描画
        base.render(f5);
        bottom.render(f5);
        top.render(f5);
    }
}