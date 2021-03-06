package CookingPlus;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CookingPlusConfig {

	public static int OrchardSpawnWeight;
	public static int BambooGroveSpawnWeight;
	public static int KelpForestSpawnWeight;
	public static int CoralReefSpawnWeight;
	public static int TropicalSpawnWeight;
	public static int DeepReefSpawnWeight;
	
	public static int AbandonedFarmHouseSpawnRate;
	public static int BushSpawnRate;
	public static int FruitTreeSpawnRate;
	public static int HerbSpawnRate;
	public static int CornucopiaSpawnRate;
	public static int ShipWreckSpawnRate;
	public static int SeaweedSpawnRate;
	public static int TempleSpawnRate;
	public static int TropicalHutSpawnRate;
	public static int UnderwaterVentSpawnRate;
	public static int GiantCoralDensity;
	public static int NetherTangleSpawnRate;
	public static int InlandHydrothermalVeinSpawnRate;
	
	public static int CoralReefID;
	public static int BambooGroveID;
	public static int OrchardID;
	public static int KelpForestID;
	public static int TropicalID;
	public static int DeepReefID;
	public static int EdenDimensionID;
	
	public static boolean vanillarecipes;
	public static boolean SpawnedHerbSpreading;
	public static boolean PlayerHerbSpreading;
	public static boolean CoralSpreading;
	public static boolean SjinBot;
	public static boolean OverwriteMushroomBiomes;
	public static boolean AllowGuideCopy;
	public static boolean EnableBotNetwork;
	
	public static int FruitDropRate;
	public static int CoralSpreadRate;
	public static int HerbSpreadRate;
	
	public static int HydrophonicGrowthRate;
	public static int HHBHarvestRate;
	public static int HHBPickRate;
	public static int HHBFishRate;
	public static int HHBGatherRate;
	public static int GrowthCrystalGrowRate;
	
	public void PreInt(FMLPreInitializationEvent e){
		
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		
		config.load();

		
		OrchardSpawnWeight = config.getInt("orchardSpawnWeight", "SpawnRates", 2, 0, 1000, "");
		BambooGroveSpawnWeight = config.getInt("bambooGroveSpawnWeight", "SpawnRates", 10, 0, 1000, "");
		KelpForestSpawnWeight = config.getInt("kelpForestSpawnWeight", "SpawnRates", 10, 0, 1000, "");
		CoralReefSpawnWeight = config.getInt("coralReefSpawnWeight", "SpawnRates", 10, 0, 1000, "");
		TropicalSpawnWeight = config.getInt("TropicalSpawnWeight", "SpawnRates", 10, 0, 1000, "");
		DeepReefSpawnWeight = config.getInt("DeepReefSpawnWeight", "SpawnRates", 10, 0, 1000, "");
			
		AbandonedFarmHouseSpawnRate = config.getInt("AbandonedFarmHouseSpawnRate", "SpawnRates", 192, 0, 1000, "0 prevents these from spawning");
		BushSpawnRate = config.getInt("BushSpawnRate", "SpawnRates", 10, 0, 1000, "0 prevents these from spawning");
		HerbSpawnRate = config.getInt("HerbSpawnRate", "SpawnRates", 15, 0, 1000, "0 prevents these from spawning");
		FruitTreeSpawnRate = config.getInt("FruitTreeSpawnRate", "SpawnRates", 35, 0, 1000, "0 prevents these from spawning");
		CornucopiaSpawnRate = config.getInt("CornucopiaSpawnRate", "SpawnRates", 85, 0, 1000, "0 prevents these from spawning");
		ShipWreckSpawnRate = config.getInt("ShipWreckSpawnRate", "SpawnRates", 30, 0, 1000, "0 prevents these from spawning");
		SeaweedSpawnRate = config.getInt("SeaweedSpawnRate", "SpawnRates", 6, 0, 1000, "0 prevents these from spawning");
		TempleSpawnRate = config.getInt("TempleSpawnRate", "SpawnRates", 30, 0, 1000, "0 prevents these from spawning");
		TropicalHutSpawnRate = config.getInt("TropicalHutSpawnRate", "SpawnRates", 40, 0, 1000, "0 prevents these from spawning");
		UnderwaterVentSpawnRate = config.getInt("UnderwaterVentSpawnRate", "SpawnRates", 20, 0, 1000, "0 prevents these from spawning");
		GiantCoralDensity = config.getInt("GiantCoralDensity", "SpawnRates", 5, 0, 1000, "Number of attempts made to spawn a giant coral");
		NetherTangleSpawnRate = config.getInt("NetherTangleSpawnRate", "SpawnRates", 20, 0, 100, "0 prevents these from spawning");
		InlandHydrothermalVeinSpawnRate = config.getInt("InlandHydrothermalVeinSpawnRate", "SpawnRates", 200, 0, 1000, "0 prevents these from spawning");
		
		CoralReefID = config.getInt("CoralReefID", "Mod IDs", 53, 0, 1000, "");
		BambooGroveID = config.getInt("BambooGroveID", "Mod IDs", 51, 0, 1000, "");
		OrchardID = config.getInt("OrchardID", "Mod IDs", 50, 0, 1000, "");
		KelpForestID = config.getInt("KelpForestID", "Mod IDs", 52, 0, 1000, "");
		TropicalID = config.getInt("TropicalID", "Mod IDs", 54, 0, 1000, "");
		DeepReefID = config.getInt("DeepReefID", "Mod IDs", 55, 0, 1000, "");
		
		vanillarecipes = config.getBoolean("DisableVanillaFoodRecipes", "Options", true, "");
		SpawnedHerbSpreading = config.getBoolean("HerbSpreading", "Options", false, "This Determines whether naturally spawned herbs are allowed to spread");
		PlayerHerbSpreading = config.getBoolean("PlayerHerbSpreading", "Options", true, "This Determines whether player placed herbs are allowed to spread");
		CoralSpreading = config.getBoolean("CoralSpreading", "Options", true, "");
		SjinBot = config.getBoolean("SjinBot", "Options", false, "");
		OverwriteMushroomBiomes = config.getBoolean("OverwriteMushroomBiomes", "Options", true, "");
		AllowGuideCopy = config.getBoolean("AllowGuideCopying", "Options", true, "");
		EnableBotNetwork = config.getBoolean("EnableBotNetwork", "Options", true, "");
		
		FruitDropRate = config.getInt("FruitDropRate", "GrowthRate", 50, 0, 100, "The rate is a percentage");
		CoralSpreadRate = config.getInt("CoralSpreadRate", "GrowthRate", 25, 0, 100, "The rate is a percentage");
		HerbSpreadRate = config.getInt("HerbSpreadRate", "GrowthRate", 25, 0, 100, "The rate is a percentage");
		
		HydrophonicGrowthRate = config.getInt("HydrophonicGrowthRate", "BlockRates", 200, 0, 100, "Ticks till growth");
		HHBHarvestRate = config.getInt("HappyHarvetBotHarvestRate", "BlockRates", 30, 0, 10000, "Ticks till harvest");
		HHBFishRate = config.getInt("HappyHarvetBotFishRate", "BlockRates", 300, 0, 10000, "Ticks till fish");
		HHBPickRate = config.getInt("HappyHarvetBotPickRate", "BlockRates", 30, 0, 10000, "Ticks till attempt to harvest");
		HHBGatherRate = config.getInt("HappyHarvetBotPickRate", "BlockRates", 30, 0, 10000, "Ticks till attempt to gather");
		GrowthCrystalGrowRate = config.getInt("GrowthCrystalGrowRate", "BlockRates", 50, 0, 100, "Ticks till attempt to grow");
		
		config.save();
		
	}
	
}
