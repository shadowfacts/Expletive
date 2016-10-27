package net.shadowfacts.expletive.list

import net.shadowfacts.expletive.model.list.GameVersion
import net.shadowfacts.expletive.model.list.SortMode
import net.shadowfacts.expletive.util.Utils
import org.jsoup.nodes.Element

/**
 * @author shadowfacts
 */
abstract class ListBrowser<T> {

	abstract val baseUrl: String

	abstract fun create(el: Element): T

	fun get(category: ListCategory<T>, version: GameVersion = GameVersion.ALL, sort: SortMode = SortMode.POPULARITY): List<T> {
		val conn = Utils.open(baseUrl + category.url + "?" + version.urlQueryParam + "&" + sort.urlQueryParam)
		val doc = conn.get()
		return doc.select("li.project-list-item").map {
			create(it)
		}
	}

}