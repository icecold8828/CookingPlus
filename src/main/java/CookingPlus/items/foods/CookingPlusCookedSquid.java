package CookingPlus.items.foods;

import CookingPlus.items.CookingPlusCustomEdibleFood;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CookingPlusCookedSquid extends CookingPlusCustomEdibleFood {
	
	private final String name = "cookedsquid";
	
	public CookingPlusCookedSquid() 
    {
        super(3, 0.5F);
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        setPotionEffect(32, 50, 5, 100);
    }

	@Override
    public String getName()
    {
    	return name;
    }
}
