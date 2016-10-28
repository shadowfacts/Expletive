package net.shadowfacts.expletive.config

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import com.typesafe.config.ConfigRenderOptions
import java.io.File

/**
 * @author shadowfacts
 */
object Config {

	var config: Config = ConfigFactory.load("reference.conf")
		private set

	fun init() {
		val f = File("Expletive.conf")
		if (!f.exists()) {
			f.createNewFile()
		}

		config = ConfigFactory.parseFile(f).withFallback(config)

		val toRender = config.root().withOnlyKey("expletive")
		val s = toRender.render(ConfigRenderOptions.defaults().setOriginComments(false).setJson(false))
		f.writeText(s)
	}

}