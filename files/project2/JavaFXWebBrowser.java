package javafx1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class JavaFXWebBrowser extends Application {
 	
	@Override
 	public void start(Stage primaryStage) {
 		WebView view = new WebView();
 		WebEngine engine = view.getEngine();
 		engine.load(“http://web.prz.edu.pl”);
 		StackPane root = new StackPane();
 		root.getChildren().add(view);
 		Scene scene = new Scene(root, 1200, 800);
		primaryStage.setTitle(“My Simple Browser !”);
		primaryStage.setScene(scene);
 		primaryStage.show();
 	}
 
	public static void main(String[] args) {
 		launch(args);
 	}
}