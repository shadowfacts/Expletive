package net.shadowfacts.expletive.list

import net.shadowfacts.expletive.model.modpack.Modpack
import net.shadowfacts.expletive.model.modpack.ModpackCategory
import org.jsoup.nodes.Element

/**
 * @author shadowfacts
 */
object ModpackList : ListBrowser<Modpack>() {

	override val baseUrl: String
		get() = "https://minecraft.curseforge.com/modpacks"

	override fun create(el: Element): Modpack {
		val id = el.select("div.details div.info.name div.name-wrapper a").attr("href").split('/').last()
		val name = el.select("div.details div.info.name div.name-wrapper a").text()
		val authors = el.select("div.details div.info.name span.byline a").text()
		val tagline = el.select("div.details div.description").text()
		val icon = el.select("div.avatar img").attr("src")
		val categories = el.select("div.categories-box div.category-icons a").map {
			ModpackCategory.get(it.attr("href").split('/').last())
		}.toTypedArray()
		return Modpack(id, name, tagline, icon, authors, categories)
	}

}