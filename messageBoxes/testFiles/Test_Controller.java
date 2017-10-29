package testFiles;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sourceFiles.ConfirmBox;
import sourceFiles.Error;
import sourceFiles.TextBox;

public class Test_Controller {
	//VARIABLES --------------------------------------------------------------------------------------------------------

	//FXML
	@FXML private Label result;



	//METHODS ----------------------------------------------------------------------------------------------------------

	//FXML
	@FXML void onPressFirst() {
		Error error = new Error("Error message x", 500, "Title!!!!");
		error.showWindow();
	}
	@FXML void onPressSecond() {
		TextBox textBox = new TextBox("Enter word:", 700, "Words");
		result.setText(textBox.createResponseBox());
	}
	@FXML void onPressThird() {
		ConfirmBox confirmBox = new ConfirmBox("Would you like to press yes?", 600, "Title???");
		result.setText(Boolean.toString(confirmBox.createResponseBox()));
	}
	@FXML void onPressFourth() {

	}
}
