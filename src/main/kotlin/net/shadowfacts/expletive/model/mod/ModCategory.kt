package net.shadowfacts.expletive.model.mod

/**
 * @author shadowfacts
 */
enum class ModCategory(val displayName: String, val parent: ModCategory? = null) {

	ADDONS("Addons"),
	ADDONS_AE("Applied Energistics 2", ADDONS),
	ADDONS_BM("Blood Magic", ADDONS),
	ADDONS_BC("Buildcraft", ADDONS),
	ADDONS_FORESTRY("Forestry", ADDONS),
	ADDONS_IC("Industrial Craft", ADDONS),
	ADDONS_TC("Thaumcraft", ADDONS),
	ADDONS_TE("Thermal Expansion", ADDONS),
	ADDONS_TIC("Tinker's Construct", ADDONS),
	ADVENTURE_RPG("Adventure and RPG"),
	ARMOR_TOOLS_WEAPONS("Armor, Tools, and Weapons"),
	COSMETIC("Cosmetic"),
	FOOD("Food"),
	MAGIC("Magic"),
	MAP_INFORMATION("Map and Information"),
	REDSTONE("Redstone"),
	SERVER_UTILITY("Server Utility"),
	STORAGE("Storage"),
	TECH("Technology"),
	TECH_ENERGY("Energy", TECH),
	TECH_ENERGY_FLUID_ITEM_TRANSPORT("Energy, Fluid, and Item Transport", TECH),
	TECH_FARMING("Farming", TECH),
	TECH_GENETICS("Genetics", TECH),
	TECH_PLAYER_TRANSPORT("Player Transport", TECH),
	TECH_PROCESSING("Processing", TECH),
	WORLD_GEN("World Gen"),
	WORLD_GEN_BIOMES("Biomes", WORLD_GEN),
	WORLD_GEN_DIMENSIONS("Dimensions", WORLD_GEN),
	WORLD_GEN_MOBS("Mobs", WORLD_GEN),
	WORLD_GEN_ORES_RESOURCES("Ores and Resources", WORLD_GEN),
	WORLD_GEN_STRUCTURES("Structures", WORLD_GEN),
	API_LIBRARY("API and Library"),
	MISC("Miscellaneous")

}