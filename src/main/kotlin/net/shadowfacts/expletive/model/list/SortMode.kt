package net.shadowfacts.expletive.model.list

import net.shadowfacts.expletive.util.capitalizeWords

/**
 * @author shadowfacts
 */
enum class SortMode(val id: String) {

	DATE_CREATED("created"),
	LAST_RELEASED_FILE("updated"),
	NAME("name"),
	POPULARITY("popularity"),
	TOTAL_DOWNLOADS("downloads");

	val displayName by lazy {
		name.toLowerCase().replace('_', ' ').capitalizeWords()
	}

	val urlQueryParam: String
		get() = "filter-sort=$id"

	companion object {
		fun get(name: String): SortMode {
			return SortMode.values().filter {
				it.id.equals(name, ignoreCase = true) || it.displayName.equals(name, ignoreCase = true)
			}.firstOrNull() ?: POPULARITY
		}
	}

}