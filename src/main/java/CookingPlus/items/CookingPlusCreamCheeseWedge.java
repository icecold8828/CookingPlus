package CookingPlus.items;

import CookingPlus.items.CookingPlusCustomJuice;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusCreamCheeseWedge extends CookingPlusCustomEdibleFood
{

	private final String name = "creamwedge";
	
	public CookingPlusCreamCheeseWedge() 
    {
        super(8, 6F);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabFood);
        setPotionEffect(32, 200, 15, 100);
    }
    
    @Override
    public String getName()
    {
    	return name;
    }
}