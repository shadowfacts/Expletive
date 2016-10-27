import net.shadowfacts.expletive.list.ModpackList
import net.shadowfacts.expletive.model.modpack.ModpackCategory

/**
 * @author shadowfacts
 */
fun main(args: Array<String>) {
	val list = ModpackList.get(ModpackCategory.ALL)
	println("done")
}