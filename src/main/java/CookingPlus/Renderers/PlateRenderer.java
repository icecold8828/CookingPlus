package CookingPlus.Renderers;

import org.lwjgl.opengl.GL11;

import CookingPlus.models.CookingPlusBrickOven;
import CookingPlus.models.CookingPlusFermenter;
import CookingPlus.models.CookingPlusOrnateChest;
import CookingPlus.models.CookingPlusPlate;
import CookingPlus.models.CookingPlusTeapot;
import CookingPlus.tiles.BrickOvenTileEntity;
import CookingPlus.tiles.FermenterTileEntity;
import CookingPlus.tiles.OrnateChestTileEntity;
import CookingPlus.tiles.PlateTileEntity;
import CookingPlus.tiles.TeapotTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class PlateRenderer extends TileEntitySpecialRenderer {
	
	EntityItem entItem;
	ResourceLocation texture = new ResourceLocation("cookingplus:textures/blocks/platemap.png");
	
	private CookingPlusPlate model;
	
	public PlateRenderer(){
		this.model = new CookingPlusPlate();
		entItem = null;
	}
	
	
	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float f, int dunno) {
		GL11.glPushMatrix();
		GL11.glTranslated((float)x + 0.5f, (float)y + 1.5f, (float)z + 0.5f);
		GL11.glRotatef(180, 0f, 0f, 1f);
		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
		this.model.RenderModel(0.0625f);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		
		if(entity instanceof PlateTileEntity){
		PlateTileEntity MyOven = (PlateTileEntity) entity;
		if(MyOven.hasWorldObj() == true){
			 int slot = 0; //Example: int slot = 1;
			 if(MyOven.getStackInSlot(slot) != null){
				 entItem = new EntityItem(MyOven.getWorld(), x, y, z, MyOven.getStackInSlot(slot));
				 //if((entItem == null) || entItem.getEntityItem().getItem() != MyOven.getStackInSlot(slot).getItem())entItem = new EntityItem(MyOven.getWorld(), x, y, z, MyOven.getStackInSlot(slot));
				 GL11.glPushMatrix();
				 GL11.glTranslatef((float)x + 0.5f, (float)y, (float)z + 0.5f);
				 
				 this.entItem.hoverStart = 0.0F;
				 
				 RenderHelper.disableStandardItemLighting();
				 if(MyOven.getStackInSlot(slot).stackSize > 0){
					 	GL11.glPushMatrix();//item two
					 	GL11.glTranslatef(0.0F, 0.05f, -0.35F);
					 	GL11.glRotatef(90, 1, 0, 0);
					 	Minecraft.getMinecraft().getRenderManager().renderEntityWithPosYaw(this.entItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
					 	GL11.glPopMatrix();
				 }
				 RenderHelper.enableStandardItemLighting();
				 
				 GL11.glPopMatrix();
			 }
			}
		}
	}

}
