const request = require("request");

const ModpackCategory = {
	ALL: {
		id: "all",
		name: "All"
	},
	ADVENTURE_RPG: {
		id: "adventure-and-rpg",
		name: "Adventure and RPG"
	},
	COMBAT_PVP: {
		id: "combat-pvp",
		name: "Combat / PVP"
	},
	EXPLORATION: {
		id: "exploration",
		name: "Exploration"
	},
	EXTRA_LARGE: {
		id: "extra-large",
		name: "Extra Large"
	},
	HARDCORE: {
		id: "hardcore",
		name: "Hardcore"
	},
	MAGIC: {
		id: "magic",
		name: "Magic"
	},
	MAP_BASED: {
		id: "map-based",
		name: "Map Based"
	},
	MINI_GAME: {
		id: "mini-game",
		name: "Mini Game"
	},
	MULTIPLAYER: {
		id: "multiplayer",
		name: "Multiplayer"
	},
	QUESTS: {
		id: "quests",
		name: "Quests"
	},
	SCI_FI: {
		id: "sci-fi",
		name: "Sci-Fi"
	},
	SMALL_LIGHT: {
		id: "small-light",
		name: "Small / Light"
	},
	TECH: {
		id: "tech",
		name: "Tech"
	}
};
exports.ModpackCategory = ModpackCategory;

const GameVersion = {
	ONE_FIVE_TWO: {
		id: 312,
		name: "1.5.2"
	},
	ONE_SIX_FOUR: {
		id: 326,
		name: "1.6.4"
	},
	ONE_SEVEN_TWO: {
		id: 361,
		name: "1.7.2"
	},
	ONE_SEVEN_TEN: {
		id: 4449,
		name: "1.7.10"
	},
	ONE_EIGHT: {
		id: 4455,
		name: "1.8"
	},
	ONE_EIGHT_EIGHT: {
		id: 5703,
		name: "1.8.8"
	},
	ONE_EIGHT_NINE: {
		id: 5806,
		name: "1.8.9"
	},
	ONE_NINE: {
		id: 5946,
		name: "1.9"
	},
	ONE_NINE_FOUR: {
		id: 6084,
		name: "1.9.4"
	},
	ONE_TEN: {
		id: 6144,
		name: "1.10"
	},
	ONE_TEN_TWO: {
		id: 6170,
		name: "1.10.2"
	}
};
exports.GameVersion = GameVersion;

const SortMode = {
	DATE_CREATED: {
		id: "created",
		name: "Date Created"
	},
	LAST_RELEASED_FILE: {
		id: "updated",
		name: "Last Released File"
	},
	NAME: {
		id: "name",
		name: "Name"
	},
	POPULARITY: {
		id: "popularity",
		name: "Popularity"
	},
	TOTAL_DOWNLOADS: {
		id: "total-downloads",
		name: "Total Downloads"
	}
};
exports.SortMode = SortMode;

function listAllPacks(category, version, sort, callback) {
	let url = "https://minecraft.curseforge.com/modpacks";
	if (typeof category == "string") {
		url += category;
	} else if (category != ModpackCategory.ALL) {
		url += category.id;
	}
	url += "?filter-game-version=";
	url += "2020709689:";
	if (typeof version == "string" || typeof version == "number") {
		url += version;
	} else {
		url += version.id;
	}
	url += "&filter-sort=";
	if (typeof version == "string") {
		url += sort;
	} else {
		url += sort.id;
	}

	request(url, (err, res, html) => {
		const parsed = $(html);

	});
}
exports.listAllPacks = listAllPacks;
