package CookingPlus.items;

import CookingPlus.CookingPlusConfig;
import CookingPlus.CookingPlusMain;
import CookingPlus.Dimension.CookingPlusEdenTeleport;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CookingPlusKnife extends CookingPlusCustomItem {

	private final String name = "knife";
	
	public CookingPlusKnife(){
		GameRegistry.registerItem(this, name);
		setUnlocalizedName("knife");
		//setTextureName(CookingPlusMain.MODID + ":knife");
		setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer entityIn)
	{
	//var3.mcServer.getConfigurationManager().transferPlayerToDimension(var4, 20, new TeleporterAlzairio(worldserver));
		
		if (entityIn instanceof EntityPlayerMP) {

			EntityPlayerMP player = (EntityPlayerMP) entityIn;
			MinecraftServer mcServer = player.mcServer;

			if (player.timeUntilPortal > 0) {
				player.timeUntilPortal = 10;
			}
			else if (player.dimension != CookingPlusConfig.EdenDimensionID) {
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, CookingPlusConfig.EdenDimensionID, new CookingPlusEdenTeleport(player.mcServer.worldServerForDimension(CookingPlusConfig.EdenDimensionID)));
			}
			else {
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new CookingPlusEdenTeleport(player.mcServer.worldServerForDimension(0)));
			}
		}
		
		return var1;
	}

	
	@Override
    public String getName()
    {
    	return name;
    }
	
}
