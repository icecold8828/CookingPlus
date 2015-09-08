package CookingPlus.models;

import org.lwjgl.opengl.GL11;

import ModelBoxes.CookingPlusBotModelBox;
import ModelBoxes.CookingPlusChestModelBox;
import ModelBoxes.CookingPlusCubeModelBox;
import ModelBoxes.CookingPlusCustomModelBox;
import ModelBoxes.CookingPlusPlateModelBox;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CookingPlusBot extends ModelBase
{
  //fields
    ModelRenderer Shape15;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public CookingPlusBot()
  {
    textureWidth = 64;
    textureHeight = 16;
 
      Shape15 = new ModelRenderer(this, 0, 0);
      Shape15.cubeList.add(new CookingPlusBotModelBox(Shape15, 0));
      Shape15.setRotationPoint(0F, 14F, 0F);
      Shape15.setTextureSize(64, 64);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.cubeList.add(new CookingPlusBotModelBox(Shape1, 0.25f));
      Shape1.setRotationPoint(0F, 14F, 0F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.cubeList.add(new CookingPlusBotModelBox(Shape2, 0.5f));
      Shape2.setRotationPoint(0F, 14F, 0F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    Shape15.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
  }

  public void RenderModel(float f5, int face)
  {
	  if(face == 0){
		  Shape15.render(f5);
	  }
	  else if(face == 1){
		  Shape1.render(f5);
	  }
	  else if(face == 2){
		  Shape2.render(f5);
	  }
  }
}