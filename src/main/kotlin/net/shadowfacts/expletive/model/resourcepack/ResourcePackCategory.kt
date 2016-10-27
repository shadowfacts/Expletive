package net.shadowfacts.expletive.model.resourcepack

import net.shadowfacts.expletive.list.ListCategory

/**
 * @author shadowfacts
 */
enum class ResourcePackCategory(val displayName: String) : ListCategory<ResourcePack> {

	ALL("All"),
	SIXTEEN_X("16x"),
	THIRTY_TWO_X("32x"),
	SIXTY_FOUR_X("64x"),
	ONE_TWENTY_EIGHT_X("128x"),
	TWO_FIFTY_SIX_X("256x"),
	FIVE_TWELVE_X_AND_BEYOND("512x and Higher"),
	ANIMATED("Animated"),
	MEDIEVAL("Medieval"),
	MOD_SUPPORT("Mod Support"),
	MODERN("Modenr"),
	PHOTO_REALISTIC("Photo Realistic"),
	STEAMPUNK("Steampunk"),
	TRADITIONAL("Traditional"),
	MISC("Miscellaneous");

	override val url: String
		get() = if (this == ALL) "" else ("/" + name.toLowerCase().replace('_', '-'))

}