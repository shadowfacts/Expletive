package net.shadowfacts.expletive.util

import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.util.Duration
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

	fun runIn(millis: Int, action: () -> Unit) {
		Timeline(KeyFrame(Duration.millis(millis.toDouble()), EventHandler<ActionEvent> {
			action()
		})).play()
	}

}