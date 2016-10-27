package net.shadowfacts.expletive.model.mod

import net.shadowfacts.expletive.list.ListCategory

/**
 * @author shadowfacts
 */
enum class ModCategory(val displayName: String, urlPath: String? = null, val parent: ModCategory? = null) : ListCategory<Mod> {

	ALL("All"),
	ADDONS("Addons", "mc-addons"),
	ADDONS_AE("Applied Energistics 2", "applied-energistics-2", ADDONS),
	ADDONS_BM("Blood Magic", "blood-magic", ADDONS),
	ADDONS_BC("Buildcraft", "addons-buildcraft", ADDONS),
	ADDONS_FORESTRY("Forestry", parent = ADDONS),
	ADDONS_IC("Industrial Craft", "addons-industrialcraft", ADDONS),
	ADDONS_TC("Thaumcraft", "addons-thaumcraft", ADDONS),
	ADDONS_TE("Thermal Expansion", "addons-thermalexpansion", ADDONS),
	ADDONS_TIC("Tinker's Construct", "addons-tinkers-construct", ADDONS),
	ADVENTURE_RPG("Adventure and RPG"),
	ARMOR_TOOLS_WEAPONS("Armor, Tools, and Weapons", "armor-weapons-tools"),
	COSMETIC("Cosmetic"),
	FOOD("Food", "mc-food"),
	MAGIC("Magic"),
	MAP_INFORMATION("Map and Information"),
	REDSTONE("Redstone"),
	SERVER_UTILITY("Server Utility"),
	STORAGE("Storage"),
	TECHNOLOGY("Technology"),
	TECHNOLOGY_ENERGY("Energy", parent = TECHNOLOGY),
	TECHNOLOGY_ITEM_FLUID_ENERGY_TRANSPORT("Energy, Fluid, and Item Transport", parent = TECHNOLOGY),
	TECHNOLOGY_FARMING("Farming", parent = TECHNOLOGY),
	TECHNOLOGY_GENETICS("Genetics", parent = TECHNOLOGY),
	TECHNOLOGY_PLAYER_TRANSPORT("Player Transport", parent = TECHNOLOGY),
	TECHNOLOGY_PROCESSING("Processing", parent = TECHNOLOGY),
	WORLD_GEN("World Gen"),
	WORLD_GEN_BIOMES("Biomes", "world-biomes", WORLD_GEN),
	WORLD_GEN_DIMENSIONS("Dimensions", "world-dimensions", WORLD_GEN),
	WORLD_GEN_MOBS("Mobs", "world-mobs", WORLD_GEN),
	WORLD_GEN_ORES_RESOURCES("Ores and Resources", "world-ores-resources", WORLD_GEN),
	WORLD_GEN_STRUCTURES("Structures", "world-structures", WORLD_GEN),
	API_LIBRARY("API and Library", "library-api"),
	MISC("Miscellaneous", "mc-miscellaneous");

	val urlPath = urlPath ?: name.toLowerCase().replace('_', '-')

	override val url: String
		get() {
			if (this == ALL) {
				return ""
			} else {
				if (parent != null) {
					return "/${parent.urlPath}/$urlPath"
				} else {
					return "/$urlPath"
				}
			}
		}

}