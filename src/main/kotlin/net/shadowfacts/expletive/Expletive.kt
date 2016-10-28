package net.shadowfacts.expletive

import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.application.Application
import javafx.concurrent.Worker
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.web.WebEngine
import javafx.stage.Stage
import javafx.util.Duration
import net.shadowfacts.expletive.config.Config
import net.shadowfacts.expletive.util.Utils
import net.shadowfacts.expletive.util.loadView
import net.shadowfacts.expletive.view.ViewController

/**
 * @author shadowfacts
 */
class Expletive : Application() {

	private var _primaryStage: Stage? = null
	val primaryStage: Stage
		get() = _primaryStage!!

	private var _controller: ViewController? = null
	val controller: ViewController
		get() = _controller!!

	private var _engine: WebEngine? = null
	val engine: WebEngine
		get() = _engine!!

	private var _scene: Scene? = null
	val scene: Scene
		get() = _scene!!

	override fun start(primaryStage: Stage) {
		Config.init()
		_primaryStage = primaryStage

		val loader = FXMLLoader()
		loader.location = javaClass.getResource("/gui.fxml")

		val root: Parent = loader.load(javaClass.getResourceAsStream("/gui.fxml"))
		_controller = loader.getController()

		_engine = controller.view.engine

		_scene = Scene(root, 700.0, 400.0)
		primaryStage.scene = scene
		primaryStage.isResizable = true
		primaryStage.show()

		engine.userStyleSheetLocation = javaClass.getResource("/base.css").toExternalForm()
		engine.isJavaScriptEnabled = true
		engine.loadView("loading.html")

		engine.setOnError {
			it.exception.printStackTrace()
			engine.executeScript("error('${it.message}')")
		}

		engine.loadWorker.stateProperty().addListener { observableValue, old, new ->
			if (new == Worker.State.SUCCEEDED) {
				Utils.runIn(2000) {
					engine.loadView("index.html")
				}
			}
		}
	}



}