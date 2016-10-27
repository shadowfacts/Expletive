package net.shadowfacts.expletive.util

/**
 * @author shadowfacts
 */
fun String.capitalizeWords(): String {
	return split(" ").map(String::capitalize).joinToString(" ")
}