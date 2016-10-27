package net.shadowfacts.expletive.model.modpack

import net.shadowfacts.expletive.model.Project

/**
 * @author shadowfacts
 */
class Modpack(id: String, name: String, tagline: String, icon: String, authors: String, categories: Array<ModpackCategory>) : Project<Modpack, ModpackCategory>(id, name, tagline, icon, authors, categories) {

}