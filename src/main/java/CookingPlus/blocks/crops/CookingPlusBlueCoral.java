package CookingPlus.blocks.crops;

import CookingPlus.CookingPlusMain;
import CookingPlus.blocks.CookingPlusCustomSpreadingCoral;
import CookingPlus.blocks.CookingPlusCustomUnderwaterCrop;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusBlueCoral extends CookingPlusCustomSpreadingCoral{

	private final String name = "bluecoral";
	
	public CookingPlusBlueCoral(){
		super();
		this.setUnlocalizedName(name);
		GameRegistry.registerBlock(this, name);
	}
	
	public String getName()
	{
		return name;
	}
	
	public Block GetCropBlock(){
		return CookingPlusMain.blockBlueCoral;
	}
	
}
