package net.shadowfacts.expletive.model.resourcepack

import net.shadowfacts.expletive.model.Project

/**
 * @author shadowfacts
 */
class ResourcePack(id: String, name: String, tagline: String, icon: String, authors: String, categories: Array<ResourcePackCategory>) : Project<ResourcePack, ResourcePackCategory>(id, name, tagline, icon, authors, categories) {
}