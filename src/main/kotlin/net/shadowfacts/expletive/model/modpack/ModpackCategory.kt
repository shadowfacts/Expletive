package net.shadowfacts.expletive.model.modpack

/**
 * @author shadowfacts
 */
enum class ModpackCategory(val displayName: String) {

	ADVENTURE_RPG("Adventure and RPG"),
	COMBAT_PVP("Combat / PVP"),
	EXPLORATION("Exploration"),
	EXTRA_LARGE("Extra Large"),
	HARDCORE("Hardcore"),
	MAGIC("Magic"),
	MAP_BASED("Map Based"),
	MINI_GAME("Mini Game"),
	MULTIPLAYER("Multiplayer"),
	QUESTS("Quests"),
	SCI_FI("Sci-Fi"),
	SMALL_LIGHT("Small / Light"),
	TECH("Tech");

	val url: String
		get() = name.toLowerCase().replace('_', '-')

}