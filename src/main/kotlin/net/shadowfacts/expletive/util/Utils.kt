package net.shadowfacts.expletive.util

import org.jsoup.Connection
import org.jsoup.Jsoup

/**
 * @author shadowfacts
 */
object Utils {

	fun open(url: String): Connection {
		val conn = Jsoup.connect(url)
		conn.userAgent("Expletive")
		return conn
	}

}