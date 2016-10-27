package net.shadowfacts.expletive.model.modpack

import org.jsoup.nodes.Element
import java.util.*

/**
 * @author shadowfacts
 */
data class Modpack(val id: String, val name: String, val authors: String, val tagline: String, val icon: String, val categories: Array<ModpackCategory>) {

	companion object {
		fun get(el: Element): Modpack {
			val id = el.select("div.details div.info.name div.name-wrapper a").attr("href").split('/').last()
			val name = el.select("div.details div.info.name div.name-wrapper a").text()
			val authors = el.select("div.details div.info.name span.byline a").text()
			val tagline = el.select("div.details div.description").text()
			val icon = el.select("div.avatar img").attr("src")
			val categories = el.select("div.categories-box div.category-icons a").map {
				ModpackCategory.get(it.attr("href").split('/').last())
			}.toTypedArray()
			return Modpack(id, name, authors, tagline, icon, categories)
		}
	}

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