import net.shadowfacts.expletive.list.ModpackList
import net.shadowfacts.expletive.model.list.GameVersion
import net.shadowfacts.expletive.model.list.SortMode
import net.shadowfacts.expletive.model.modpack.ModpackCategory
import java.util.*

/**
 * @author shadowfacts
 */
fun main(args: Array<String>) {
	val scanner = Scanner(System.`in`)

	println("Enter modpack list options")

	print("Category: ")
	val category = ModpackCategory.get(scanner.nextLine())

	print("Game version: ")
	val version = GameVersion.get(scanner.nextLine())

	print("Sort mode: ")
	val sort = SortMode.get(scanner.nextLine())

	println("Listing with options:\n\tCategory: %s\n\tGame version: %s\n\tSort mode: %s\n".format(category, version, sort))

	val list = ModpackList.get(category, version, sort)
	list.forEach {
		println("%s by %s\n%s\nhttps://minecraft.curseforge.com/projects/%s\n".format(it.name, it.authors, it.tagline, it.id))
	}
}