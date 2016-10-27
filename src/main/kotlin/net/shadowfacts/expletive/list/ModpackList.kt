package net.shadowfacts.expletive.list

import net.shadowfacts.expletive.model.list.GameVersion
import net.shadowfacts.expletive.model.list.SortMode
import net.shadowfacts.expletive.model.modpack.Modpack
import net.shadowfacts.expletive.model.modpack.ModpackCategory
import net.shadowfacts.expletive.util.Utils

/**
 * @author shadowfacts
 */
object ModpackList {

	fun get(version: GameVersion = GameVersion.ALL, sort: SortMode = SortMode.POPULARITY, category: ModpackCategory = ModpackCategory.ALL): List<Modpack> {
		val conn = Utils.open("https://minecraft.curseforge.com/modpacks${category.url}?${version.urlQueryParam}&${sort.urlQueryParam}")
		val doc = conn.get()
		return doc.select("li.project-list-item").map {
			Modpack.get(it)
		}
	}

}