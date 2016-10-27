package net.shadowfacts.expletive.model.modpack

import java.util.*

/**
 * @author shadowfacts
 */
data class Modpack(val id: String, val name: String, val authors: String, val tagline: String, val icon: String, val categories: Array<ModpackCategory>) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		else if (other is Modpack) {
			if (name != other.name) return false
			if (authors != other.authors) return false
			if (tagline != other.tagline) return false
			if (icon != other.icon) return false
			return Arrays.equals(categories, other.categories)
		}
		return false

	}

	override fun hashCode(): Int {
		var result = name.hashCode()
		result = 31 * result + authors.hashCode()
		result = 31 * result + tagline.hashCode()
		result = 31 * result + icon.hashCode()
		result = 31 * result + Arrays.hashCode(categories)
		return result
	}

}