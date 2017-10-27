import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sourceFiles.Error;

/**
 * Holds the main class to test the functioning of the program
 */
public class TestClass extends Application{
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene randomScene = new Scene(new Button("Hiya"));
		primaryStage.setScene(randomScene);
		primaryStage.show();

		Error thisError = new Error("This is an Error", 600, "A title!");
		thisError.showWindow();
	}
}
