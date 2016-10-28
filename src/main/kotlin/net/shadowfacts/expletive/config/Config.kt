package net.shadowfacts.expletive.config

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import com.typesafe.config.ConfigRenderOptions
import net.shadowfacts.expletive.util.OperatingSystem
import java.io.File

/**
 * @author shadowfacts
 */
object Config {

	private var config: Config = ConfigFactory.load("reference.conf")

	val runDir: String
		get() = config.getString("expletive.runDir")

	fun init() {
		val f = File(getConfFile())
		if (!f.parentFile.exists()) {
			f.parentFile.mkdirs()
		}
		if (!f.exists()) {
			f.createNewFile()
		}

		config = ConfigFactory.parseFile(f).withFallback(config)

		val toRender = config.root().withOnlyKey("expletive")
		val s = toRender.render(ConfigRenderOptions.defaults().setOriginComments(false).setJson(false))
		f.writeText(s)
	}

	fun getConfFile(): String {
		return System.getProperty("user.home") + when (OperatingSystem.get()) {
			OperatingSystem.MACOS -> "/Library/Application Support/expletive/"
			OperatingSystem.WINDOWS -> "\\AppData\\Roaming\\"
			else -> "/.expletive/"
		} + "expletive.conf"
	}

}