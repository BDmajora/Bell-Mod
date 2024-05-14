//Date: 15/01/14 01:11:50
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX

package dabells.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BellModel extends ModelBase
{
//fields
 ModelRenderer Wood;
 ModelRenderer Shaft;
 ModelRenderer Top1;
 ModelRenderer Top2;
 ModelRenderer Front1A;
 ModelRenderer Front1B;
 ModelRenderer Front1C;
 ModelRenderer Front1D;
 ModelRenderer Front2A;
 ModelRenderer Front2B;
 ModelRenderer Front2C;
 ModelRenderer Front2D;
 ModelRenderer Front3A;
 ModelRenderer Front3B;
 ModelRenderer Front3C;
 ModelRenderer Front3D;
 ModelRenderer Clapper;
 ModelRenderer Crook1A;
 ModelRenderer Crook1B;
 ModelRenderer Crook1C;
 ModelRenderer Crook1D;
 ModelRenderer Crook2A;
 ModelRenderer Crook2B;
 ModelRenderer Crook2C;
 ModelRenderer Crook2D;
 ModelRenderer Crook3A;
 ModelRenderer Crook3B;
 ModelRenderer Crook3C;
 ModelRenderer Crook3D;
 ModelRenderer Bar1A;
 ModelRenderer Bar1B;
 ModelRenderer Bar1C;
 ModelRenderer Bar1D;
 ModelRenderer Bar2A;
 ModelRenderer Bar2B;
 ModelRenderer Bar2C;
 ModelRenderer Bar2D;
 ModelRenderer Bar3A;
 ModelRenderer Bar3B;
 ModelRenderer Bar3C;
 ModelRenderer Bar3D;

public BellModel()
{
 textureWidth = 128;
 textureHeight = 128;
 
   Wood = new ModelRenderer(this, 40, 0);
   Wood.addBox(0F, 0F, 0F, 6, 2, 6);
   Wood.setRotationPoint(-3F, 0F, -3F);
   Wood.setTextureSize(128, 128);
   Wood.mirror = true;
   setRotation(Wood, 0F, 0F, 0F);
   Shaft = new ModelRenderer(this, 42, 27);
   Shaft.addBox(0F, 0F, 0F, 1, 12, 1);
   Shaft.setRotationPoint(-0.5F, 2F, -0.5F);
   Shaft.setTextureSize(128, 128);
   Shaft.mirror = true;
   setRotation(Shaft, 0F, 0F, 0F);
   Top1 = new ModelRenderer(this, 40, 19);
   Top1.addBox(0F, 0F, 0F, 2, 1, 2);
   Top1.setRotationPoint(-1.5F, 4F, 0F);
   Top1.setTextureSize(128, 128);
   Top1.mirror = true;
   setRotation(Top1, 0F, 0.7853982F, 0F);
   Top2 = new ModelRenderer(this, 38, 22);
   Top2.addBox(-1.5F, 0F, -1.5F, 3, 2, 3);
   Top2.setRotationPoint(0F, 4.5F, 0F);
   Top2.setTextureSize(128, 128);
   Top2.mirror = true;
   setRotation(Top2, 0F, 0.7853982F, 0F);
   Front1A = new ModelRenderer(this, 50, 22);
   Front1A.addBox(-1.5F, 0F, -2.5F, 3, 4, 1);
   Front1A.setRotationPoint(0F, 5.5F, 0F);
   Front1A.setTextureSize(128, 128);
   Front1A.mirror = true;
   setRotation(Front1A, 0F, 0.7853982F, 0F);
   Front1B = new ModelRenderer(this, 50, 22);
   Front1B.addBox(-1.5F, 0F, -2.5F, 3, 4, 1);
   Front1B.setRotationPoint(0F, 5.5F, 0F);
   Front1B.setTextureSize(128, 128);
   Front1B.mirror = true;
   setRotation(Front1B, 0F, -0.7853982F, 0F);
   Front1C = new ModelRenderer(this, 50, 22);
   Front1C.addBox(-1.5F, 0F, -2.5F, 3, 4, 1);
   Front1C.setRotationPoint(0F, 5.5F, 0F);
   Front1C.setTextureSize(128, 128);
   Front1C.mirror = true;
   setRotation(Front1C, 0F, -2.373648F, 0F);
   Front1D = new ModelRenderer(this, 50, 22);
   Front1D.addBox(-1.5F, 0F, -2.5F, 3, 4, 1);
   Front1D.setRotationPoint(0F, 5.5F, 0F);
   Front1D.setTextureSize(128, 128);
   Front1D.mirror = true;
   setRotation(Front1D, 0F, 2.373648F, 0F);
   Front2A = new ModelRenderer(this, 49, 30);
   Front2A.addBox(-2F, 0F, -3F, 4, 4, 1);
   Front2A.setRotationPoint(0F, 9F, 0F);
   Front2A.setTextureSize(128, 128);
   Front2A.mirror = true;
   setRotation(Front2A, 0F, 0.7853982F, 0F);
   Front2B = new ModelRenderer(this, 49, 30);
   Front2B.addBox(-2F, 0F, -3F, 4, 4, 1);
   Front2B.setRotationPoint(0F, 9F, 0F);
   Front2B.setTextureSize(128, 128);
   Front2B.mirror = true;
   setRotation(Front2B, 0F, -0.7853982F, 0F);
   Front2C = new ModelRenderer(this, 49, 30);
   Front2C.addBox(-2F, 0F, -3F, 4, 4, 1);
   Front2C.setRotationPoint(0F, 9F, 0F);
   Front2C.setTextureSize(128, 128);
   Front2C.mirror = true;
   setRotation(Front2C, 0F, -2.373648F, 0F);
   Front2D = new ModelRenderer(this, 49, 30);
   Front2D.addBox(-2F, 0F, -3F, 4, 4, 1);
   Front2D.setRotationPoint(0F, 9F, 0F);
   Front2D.setTextureSize(128, 128);
   Front2D.mirror = true;
   setRotation(Front2D, 0F, 2.373648F, 0F);
   Front3A = new ModelRenderer(this, 49, 37);
   Front3A.addBox(-2F, 0F, -3.5F, 4, 1, 1);
   Front3A.setRotationPoint(0F, 13F, 0F);
   Front3A.setTextureSize(128, 128);
   Front3A.mirror = true;
   setRotation(Front3A, 0F, 0.7853982F, 0F);
   Front3B = new ModelRenderer(this, 49, 37);
   Front3B.addBox(-2F, 0F, -3.5F, 4, 1, 1);
   Front3B.setRotationPoint(0F, 13F, 0F);
   Front3B.setTextureSize(128, 128);
   Front3B.mirror = true;
   setRotation(Front3B, 0F, -0.7853982F, 0F);
   Front3C = new ModelRenderer(this, 49, 37);
   Front3C.addBox(-2F, 0F, -3.5F, 4, 1, 1);
   Front3C.setRotationPoint(0F, 13F, 0F);
   Front3C.setTextureSize(128, 128);
   Front3C.mirror = true;
   setRotation(Front3C, 0F, -2.373648F, 0F);
   Front3D = new ModelRenderer(this, 49, 37);
   Front3D.addBox(-2F, 0F, -3.5F, 4, 1, 1);
   Front3D.setRotationPoint(0F, 13F, 0F);
   Front3D.setTextureSize(128, 128);
   Front3D.mirror = true;
   setRotation(Front3D, 0F, 2.373648F, 0F);
   Clapper = new ModelRenderer(this, 40, 40);
   Clapper.addBox(-1F, 0F, -1F, 2, 1, 2);
   Clapper.setRotationPoint(0F, 14F, 0F);
   Clapper.setTextureSize(128, 128);
   Clapper.mirror = true;
   setRotation(Clapper, 0F, 0F, 0F);
   Crook1A = new ModelRenderer(this, 60, 27);
   Crook1A.addBox(-1F, 0F, -2.5F, 2, 2, 1);
   Crook1A.setRotationPoint(0F, 7F, 0F);
   Crook1A.setTextureSize(128, 128);
   Crook1A.mirror = true;
   setRotation(Crook1A, 0F, 0F, 0F);
   Crook1B = new ModelRenderer(this, 60, 27);
   Crook1B.addBox(-1F, 0F, -2.5F, 2, 2, 1);
   Crook1B.setRotationPoint(0F, 7F, 0F);
   Crook1B.setTextureSize(128, 128);
   Crook1B.mirror = true;
   setRotation(Crook1B, 0F, -1.570796F, 0F);
   Crook1C = new ModelRenderer(this, 60, 27);
   Crook1C.addBox(-1F, 0F, -2.5F, 2, 2, 1);
   Crook1C.setRotationPoint(0F, 7F, 0F);
   Crook1C.setTextureSize(128, 128);
   Crook1C.mirror = true;
   setRotation(Crook1C, 0F, 3.141593F, 0F);
   Crook1D = new ModelRenderer(this, 60, 27);
   Crook1D.addBox(-1F, 0F, -2.5F, 2, 2, 1);
   Crook1D.setRotationPoint(0F, 7F, 0F);
   Crook1D.setTextureSize(128, 128);
   Crook1D.mirror = true;
   setRotation(Crook1D, 0F, 1.570796F, 0F);
   Crook2A = new ModelRenderer(this, 61, 33);
   Crook2A.addBox(-0.5F, 0F, -3.5F, 1, 3, 1);
   Crook2A.setRotationPoint(0F, 10F, 0F);
   Crook2A.setTextureSize(128, 128);
   Crook2A.mirror = true;
   setRotation(Crook2A, 0F, 0F, 0F);
   Crook2B = new ModelRenderer(this, 61, 33);
   Crook2B.addBox(-0.5F, 0F, -3.5F, 1, 3, 1);
   Crook2B.setRotationPoint(0F, 10F, 0F);
   Crook2B.setTextureSize(128, 128);
   Crook2B.mirror = true;
   setRotation(Crook2B, 0F, -1.570796F, 0F);
   Crook2C = new ModelRenderer(this, 61, 33);
   Crook2C.addBox(-0.5F, 0F, -3.5F, 1, 3, 1);
   Crook2C.setRotationPoint(0F, 10F, 0F);
   Crook2C.setTextureSize(128, 128);
   Crook2C.mirror = true;
   setRotation(Crook2C, 0F, 3.141593F, 0F);
   Crook2D = new ModelRenderer(this, 61, 33);
   Crook2D.addBox(-0.5F, 0F, -3.5F, 1, 3, 1);
   Crook2D.setRotationPoint(0F, 10F, 0F);
   Crook2D.setTextureSize(128, 128);
   Crook2D.mirror = true;
   setRotation(Crook2D, 0F, 1.570796F, 0F);
   Crook3A = new ModelRenderer(this, 61, 30);
   Crook3A.addBox(-0.5F, 0F, -3F, 1, 1, 1);
   Crook3A.setRotationPoint(0F, 9F, 0F);
   Crook3A.setTextureSize(128, 128);
   Crook3A.mirror = true;
   setRotation(Crook3A, 0F, 0F, 0F);
   Crook3B = new ModelRenderer(this, 61, 30);
   Crook3B.addBox(-0.5F, 0F, -3F, 1, 1, 1);
   Crook3B.setRotationPoint(0F, 9F, 0F);
   Crook3B.setTextureSize(128, 128);
   Crook3B.mirror = true;
   setRotation(Crook3B, 0F, -1.570796F, 0F);
   Crook3C = new ModelRenderer(this, 61, 30);
   Crook3C.addBox(-0.5F, 0F, -3F, 1, 1, 1);
   Crook3C.setRotationPoint(0F, 9F, 0F);
   Crook3C.setTextureSize(128, 128);
   Crook3C.mirror = true;
   setRotation(Crook3C, 0F, 3.141593F, 0F);
   Crook3D = new ModelRenderer(this, 61, 30);
   Crook3D.addBox(-0.5F, 0F, -3F, 1, 1, 1);
   Crook3D.setRotationPoint(0F, 9F, 0F);
   Crook3D.setTextureSize(128, 128);
   Crook3D.mirror = true;
   setRotation(Crook3D, 0F, 1.570796F, 0F);
   Bar1A = new ModelRenderer(this, 51, 27);
   Bar1A.addBox(-1F, 0F, -3F, 2, 2, 1);
   Bar1A.setRotationPoint(0F, 7F, 0F);
   Bar1A.setTextureSize(128, 128);
   Bar1A.mirror = true;
   setRotation(Bar1A, 0F, 0.7853982F, 0F);
   Bar1B = new ModelRenderer(this, 51, 27);
   Bar1B.addBox(-1F, 0F, -3F, 2, 2, 1);
   Bar1B.setRotationPoint(0F, 7F, 0F);
   Bar1B.setTextureSize(128, 128);
   Bar1B.mirror = true;
   setRotation(Bar1B, 0F, -0.7853982F, 0F);
   Bar1C = new ModelRenderer(this, 51, 27);
   Bar1C.addBox(-1F, 0F, -3F, 2, 2, 1);
   Bar1C.setRotationPoint(0F, 7F, 0F);
   Bar1C.setTextureSize(128, 128);
   Bar1C.mirror = true;
   setRotation(Bar1C, 0F, -2.373648F, 0F);
   Bar1D = new ModelRenderer(this, 51, 27);
   Bar1D.addBox(-1F, 0F, -3F, 2, 2, 1);
   Bar1D.setRotationPoint(0F, 7F, 0F);
   Bar1D.setTextureSize(128, 128);
   Bar1D.mirror = true;
   setRotation(Bar1D, 0F, 2.373648F, 0F);
   Bar2A = new ModelRenderer(this, 50, 35);
   Bar2A.addBox(-1.5F, 0F, -3.5F, 3, 1, 1);
   Bar2A.setRotationPoint(0F, 12F, 0F);
   Bar2A.setTextureSize(128, 128);
   Bar2A.mirror = true;
   setRotation(Bar2A, 0F, 0.7853982F, 0F);
   Bar2B = new ModelRenderer(this, 50, 35);
   Bar2B.addBox(-1.5F, 0F, -3.5F, 3, 1, 1);
   Bar2B.setRotationPoint(0F, 12F, 0F);
   Bar2B.setTextureSize(128, 128);
   Bar2B.mirror = true;
   setRotation(Bar2B, 0F, -0.7853982F, 0F);
   Bar2C = new ModelRenderer(this, 50, 35);
   Bar2C.addBox(-1.5F, 0F, -3.5F, 3, 1, 1);
   Bar2C.setRotationPoint(0F, 12F, 0F);
   Bar2C.setTextureSize(128, 128);
   Bar2C.mirror = true;
   setRotation(Bar2C, 0F, -2.373648F, 0F);
   Bar2D = new ModelRenderer(this, 50, 35);
   Bar2D.addBox(-1.5F, 0F, -3.5F, 3, 1, 1);
   Bar2D.setRotationPoint(0F, 12F, 0F);
   Bar2D.setTextureSize(128, 128);
   Bar2D.mirror = true;
   setRotation(Bar2D, 0F, 2.373648F, 0F);
   Bar3A = new ModelRenderer(this, 60, 37);
   Bar3A.addBox(-1F, 0F, -4F, 2, 1, 1);
   Bar3A.setRotationPoint(0F, 13F, 0F);
   Bar3A.setTextureSize(128, 128);
   Bar3A.mirror = true;
   setRotation(Bar3A, 0F, 0F, 0F);
   Bar3B = new ModelRenderer(this, 60, 37);
   Bar3B.addBox(-1F, 0F, -4F, 2, 1, 1);
   Bar3B.setRotationPoint(0F, 13F, 0F);
   Bar3B.setTextureSize(128, 128);
   Bar3B.mirror = true;
   setRotation(Bar3B, 0F, -1.570796F, 0F);
   Bar3C = new ModelRenderer(this, 60, 37);
   Bar3C.addBox(-1F, 0F, -4F, 2, 1, 1);
   Bar3C.setRotationPoint(0F, 13F, 0F);
   Bar3C.setTextureSize(128, 128);
   Bar3C.mirror = true;
   setRotation(Bar3C, 0F, 3.141593F, 0F);
   Bar3D = new ModelRenderer(this, 60, 37);
   Bar3D.addBox(-1F, 0F, -4F, 2, 1, 1);
   Bar3D.setRotationPoint(0F, 13F, 0F);
   Bar3D.setTextureSize(128, 128);
   Bar3D.mirror = true;
   setRotation(Bar3D, 0F, 1.570796F, 0F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
 super.render(entity, f, f1, f2, f3, f4, f5);
 setRotationAngles(f, f1, f2, f3, f4, f5, entity);
 Wood.render(f5);
 Shaft.render(f5);
 Top1.render(f5);
 Top2.render(f5);
 Front1A.render(f5);
 Front1B.render(f5);
 Front1C.render(f5);
 Front1D.render(f5);
 Front2A.render(f5);
 Front2B.render(f5);
 Front2C.render(f5);
 Front2D.render(f5);
 Front3A.render(f5);
 Front3B.render(f5);
 Front3C.render(f5);
 Front3D.render(f5);
 Clapper.render(f5);
 Crook1A.render(f5);
 Crook1B.render(f5);
 Crook1C.render(f5);
 Crook1D.render(f5);
 Crook2A.render(f5);
 Crook2B.render(f5);
 Crook2C.render(f5);
 Crook2D.render(f5);
 Crook3A.render(f5);
 Crook3B.render(f5);
 Crook3C.render(f5);
 Crook3D.render(f5);
 Bar1A.render(f5);
 Bar1B.render(f5);
 Bar1C.render(f5);
 Bar1D.render(f5);
 Bar2A.render(f5);
 Bar2B.render(f5);
 Bar2C.render(f5);
 Bar2D.render(f5);
 Bar3A.render(f5);
 Bar3B.render(f5);
 Bar3C.render(f5);
 Bar3D.render(f5);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
 model.rotateAngleX = x;
 model.rotateAngleY = y;
 model.rotateAngleZ = z;
}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
{
 super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
}

public void renderModel(float f)
{
	 Wood.render(f);
	 Shaft.render(f);
	 Top1.render(f);
	 Top2.render(f);
	 Front1A.render(f);
	 Front1B.render(f);
	 Front1C.render(f);
	 Front1D.render(f);
	 Front2A.render(f);
	 Front2B.render(f);
	 Front2C.render(f);
	 Front2D.render(f);
	 Front3A.render(f);
	 Front3B.render(f);
	 Front3C.render(f);
	 Front3D.render(f);
	 Clapper.render(f);
	 Crook1A.render(f);
	 Crook1B.render(f);
	 Crook1C.render(f);
	 Crook1D.render(f);
	 Crook2A.render(f);
	 Crook2B.render(f);
	 Crook2C.render(f);
	 Crook2D.render(f);
	 Crook3A.render(f);
	 Crook3B.render(f);
	 Crook3C.render(f);
	 Crook3D.render(f);
	 Bar1A.render(f);
	 Bar1B.render(f);
	 Bar1C.render(f);
	 Bar1D.render(f);
	 Bar2A.render(f);
	 Bar2B.render(f);
	 Bar2C.render(f);
	 Bar2D.render(f);
	 Bar3A.render(f);
	 Bar3B.render(f);
	 Bar3C.render(f);
	 Bar3D.render(f);
}

}
