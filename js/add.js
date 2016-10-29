const {listAllPacks, ModpackCategory, GameVersion, SortMode} = require("./js/scraper");

$(document).ready(() => {
	const category = $("#category");
	category.change(load);
	for (const k in ModpackCategory) {
		const val = ModpackCategory[k];
		category.append(`<option value="${val.id}">${val.name}</option>`);
	}

	const version = $("#version");
	version.change(load);
	for (const k in GameVersion) {
		const val = GameVersion[k];
		version.append(`<option value="${val.id}">${val.name}</option>`);
	}
	version.val(GameVersion.ONE_TEN_TWO.id);

	const sort = $("#sort");
	sort.change(load);
	for (const k in SortMode) {
		const val = SortMode[k];
		sort.append(`<option value="${val.id}">${val.name}</option>`);
	}
	sort.val(SortMode.POPULARITY.id);

	load();

	function load() {
		const selectedCategory = category.val();
		const selectedVersion = version.val();
		const selectedSort = sort.val();

		listAllPacks(selectedCategory, selectedVersion, selectedSort, (packs) => {
			const list = $("#packs");
			list.empty();
			for (var i = 0; i < packs.length; i++) {
				const pack = $("<li></li>");
				pack.append(`<h1>${packs[i].name}</h1>`);
				pack.append(`<p>${packs[i].tagline}</p>`);
				list.append(pack);
			}
		});
	}
});
