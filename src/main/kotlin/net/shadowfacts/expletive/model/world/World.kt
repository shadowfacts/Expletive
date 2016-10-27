package net.shadowfacts.expletive.model.world

import net.shadowfacts.expletive.model.Project

/**
 * @author shadowfacts
 */
class World(id: String, name: String, tagline: String, icon: String, authors: String, categories: Array<WorldCategory>) : Project<World, WorldCategory>(id, name, tagline, icon, authors, categories) {
}