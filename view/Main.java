package view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

import controller.Controller;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Car;

public class Main extends Application implements Serializable{
	ArrayList<Car>list = new ArrayList<Car>();
	private Controller controller1;
	Integer o = new Integer(0);
	int p,a;
	@Override
	public void start(Stage primaryStage) {
		controller1 = new Controller();
		Button buttonAdd = new Button();
		buttonAdd.setText("Enter your info");
		buttonAdd.setOnAction(actionEvent -> {
				
				Dialog<Car> dialog = new Dialog<>();

				dialog.setTitle("User info");

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
				
				dialog.showAndWait();
				
				/*try {
				this.o =  Integer.parseInt(textRegNo.getText());
				 p=Integer.parseInt(textMillage.getText());
				 a=Integer.parseInt(textYearMan.getText());
				controller1.dialogBox(textMake.getText(), textModel.getText(),o,p,a);
				}catch(NumberFormatException e) {
					System.out.println("numberformatexp.");}*/
			//controller1.dialogBox(textMake.getText(), textModel.getText(),o,p,a); //Integer.parseInt(textRegNo.getText()), Integer.parseInt(textMillage.getText()), Integer.parseInt(textYearMan.getText()));
			controller1.dialogBox(textMake.getText(), textModel.getText(), Integer.parseInt(textRegNo.getText()), Integer.parseInt(textMillage.getText()), Integer.parseInt(textYearMan.getText()));
		
		
		});
		
		Button buttonRemove = new Button();
		buttonRemove.setText("Remove a car");
		buttonRemove.setOnAction(actionEvent -> {
			controller1.RemoveCars();
		});
		
		Button buttonList = new Button();
		buttonList.setText("List all car");
		buttonList.setOnAction(actionEvent -> {
				controller1.ListAllCars();
		});

		StackPane pane = new StackPane();
		HBox hbox = new HBox();
		hbox.getChildren().addAll(buttonAdd, buttonRemove, buttonList);
		hbox.setPadding(new Insets(20, 20, 20, 20));
		pane.getChildren().add(hbox);
		
		Scene scene = new Scene(pane, 500, 300);

		primaryStage.setTitle("Useful GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
}

	public void quitApplication() {
		Platform.exit();
	}
	public static void main(String[] args) {
		launch(args);
	}
}



