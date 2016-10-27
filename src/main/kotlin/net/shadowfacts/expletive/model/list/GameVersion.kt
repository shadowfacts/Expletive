package net.shadowfacts.expletive.model.list

/**
 * @author shadowfacts
 */
enum class GameVersion(val displayName: String, val id: String) {

	ONE_FIVE_TWO("1.5.2", "312"),
	ONE_SIX_FOUR("1.6.4", "326"),
	ONE_SEVEN_TWO("1.7.2", "361"),
	ONE_SEVEN_TEN("1.7.10", "4449"),
	ONE_EIGHT("1.8", "4455"),
	ONE_EIGHT_EIGHT("1.8.8", "5703"),
	ONE_EIGHT_NINE("1.8.9", "5806"),
	ONE_NINE("1.9", "5946"),
	ONE_NINE_FOUR("1.9.4", "6084"),
	ONE_TEN("1.10", "6144"),
	ONE_TEN_TWO("1.10.2", "6170");
	
	companion object {
		val ENTITY_ID = "2020709689"
	}

}