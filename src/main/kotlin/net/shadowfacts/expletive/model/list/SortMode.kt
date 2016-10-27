package net.shadowfacts.expletive.model.list

/**
 * @author shadowfacts
 */
enum class SortMode(val id: String) {

	DATE_CREATED("created"),
	LAST_RELEASED_FILE("updated"),
	NAME("name"),
	POPULARITY("popularity"),
	TOTAL_DOWNLOADS("downloads")

}