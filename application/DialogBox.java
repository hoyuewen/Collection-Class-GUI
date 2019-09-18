package application;

import javafx.scene.control.ButtonBar.ButtonData;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Car;

public class DialogBox {
	public static void display(String title) {
		Dialog<Car> dialog = new Dialog<>();
		Stage window = new Stage();
		dialog.setTitle("User info");
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		Label make = new Label("Make: ");
		Label model = new Label("Model: ");
		Label regNo = new Label("Registration Number: ");
		Label millage = new Label("Millage: ");
		Label yearMan = new Label("Year of Manufacture: ");
		TextField textMake = new TextField();
		TextField textModel = new TextField();
		TextField textRegNo = new TextField();
		TextField textMillage = new TextField();
		TextField textYearMan = new TextField();

		GridPane grid = new GridPane();
		grid.add(make, 1, 1);
		grid.add(textMake, 2, 1);
		grid.add(model, 1, 2);
		grid.add(textModel, 2, 2);
		grid.add(regNo, 1, 3);
		grid.add(textRegNo, 2, 3);
		grid.add(millage, 1, 4);
		grid.add(textMillage, 2, 4);
		grid.add(yearMan, 1, 5);
		grid.add(textYearMan, 2, 5);
		dialog.getDialogPane().setContent(grid);

		ButtonType buttonType = new ButtonType("Ok", ButtonData.OK_DONE);
		dialog.getDialogPane().getButtonTypes().addAll(buttonType, ButtonType.CANCEL);
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(dialog);
		layout.setAlignment(Pos.CENTER);
		//Display window and wait for it to be closed before returning
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}
}
