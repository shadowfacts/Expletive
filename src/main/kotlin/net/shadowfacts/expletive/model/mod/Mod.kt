package net.shadowfacts.expletive.model.mod

import net.shadowfacts.expletive.model.Project

/**
 * @author shadowfacts
 */
class Mod(id: String, name: String, tagline: String, icon: String, authors: String, categories: Array<ModCategory>) : Project<Mod, ModCategory>(id, name, tagline, icon, authors, categories) {
}