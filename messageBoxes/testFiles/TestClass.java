package testFiles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sourceFiles.Error;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Holds the main class to test the functioning of the program
 */
public class TestClass extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Set's scene to that given by a FXML file and set's the title
		URL classLocation = getClass().getClassLoader().getResource("testFiles/Test.fxml");
		if(classLocation==null) throw new NullPointerException("FXML file could not be found");
		Parent root = FXMLLoader.load(classLocation);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Main Window");
		primaryStage.show();
	}
}
