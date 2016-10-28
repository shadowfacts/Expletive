package net.shadowfacts.expletive

import javafx.application.Application
import javafx.stage.Stage
import net.shadowfacts.expletive.config.Config

/**
 * @author shadowfacts
 */
class Expletive : Application() {

	override fun start(primaryStage: Stage) {
		Config.init()
	}

}