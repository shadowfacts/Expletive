package net.shadowfacts.expletive.util

import javafx.scene.web.WebEngine
import net.shadowfacts.expletive.Expletive

/**
 * @author shadowfacts
 */
fun String.capitalizeWords(): String {
	return split(" ").map(String::capitalize).joinToString(" ")
}

fun WebEngine.loadView(path: String) {
	load(Expletive::class.java.getResource("/view/" + path).toExternalForm())
}