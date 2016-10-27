package net.shadowfacts.expletive.model.world

import net.shadowfacts.expletive.list.ListCategory

/**
 * @author shadowfacts
 */
enum class WorldCategory : ListCategory<World> {

	ADVENTURE,
	CREATION,
	GAME_MAP,
	MODDED_WORLD,
	PARKOUR,
	PUZZLE,
	SURVIVAL;

	override val url: String
		get() = name.toLowerCase().replace('_', '-')

}