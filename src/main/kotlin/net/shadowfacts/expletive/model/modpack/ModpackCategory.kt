package net.shadowfacts.expletive.model.modpack

import net.shadowfacts.expletive.list.ListCategory

/**
 * @author shadowfacts
 */
enum class ModpackCategory(val displayName: String) : ListCategory<Modpack> {

	ALL("All"),
	ADVENTURE_AND_RPG("Adventure and RPG"),
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

	override val url: String
		get() = if (this == ALL) "" else ("/" + name.toLowerCase().replace('_', '-'))

	companion object {
		fun get(name: String): ModpackCategory {
			return ModpackCategory.values().filter {
				it.name.equals(name, ignoreCase = true) || it.displayName.equals(name, ignoreCase = true)
			}.firstOrNull() ?: ALL
		}
	}

}