package net.shadowfacts.expletive.view

import javafx.fxml.FXML
import javafx.scene.web.WebEngine
import javafx.scene.web.WebView

/**
 * @author shadowfacts
 */
class ViewController {

	@FXML
	private var _view: WebView? = null
	val view: WebView
		get() = _view!!

}