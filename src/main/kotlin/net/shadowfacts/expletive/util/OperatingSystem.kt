package net.shadowfacts.expletive.util

/**
 * @author shadowfacts
 */
enum class OperatingSystem(vararg val names: String) {

	LINUX("linux", "bsd", "unix"),
	WINDOWS("windows", "win"),
	MACOS("osx", "mac"),
	UNKNOWN("unknown");

	companion object {
		fun get(name: String): OperatingSystem {
			return OperatingSystem.values().filter {
				it.names.forEach {
					if (name.contains(it, ignoreCase = true)) {
						return@filter true
					}
				}
				return@filter false
			}.firstOrNull() ?: UNKNOWN
		}

		fun get(): OperatingSystem {
			return get(System.getProperty("os.name"))
		}
	}

}