package controller;

import java.util.ArrayList;
import java.util.Optional;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;
import model.Car;
import model.CarList;
import view.Question1;

public class Controller {
	private Question1 lucas;
	CarList cl =new CarList();
	
	public Controller(Question1 lucas) {
		//lucas = this.lucas;
	} 
	
	
	public Car dialogBox(String string, String string2, int i, int j, int k) {
		System.out.print("Info Added.\n NEWUSER \n");
		// Adds user to list
		cl.addCars(new Car(string, string2, i, j, k));
		return new Car(string, string2, i, j, k);
	}

	public void ListAllCars() {
		for (int i = 0; i < cl.getSize(); i++) {
			int a= i + 1;
			System.out.println(a + ". " + cl.getCar(i));
		}
	}

	public void RemoveCars() {
		Dialog<Car> removeDialog = new Dialog<>();
		removeDialog.setTitle("Remove which result?");

		removeDialog.setHeaderText("This is a custom dialog. Enter info and \n" +
				"press Okay (or click title bar 'X' for cancel).");
		removeDialog.setResizable(true);

		Label label1 = new Label("Registration Number? ");
		TextField text1 = new TextField();

		Button buttonTypeOk = new Button("Okay");
		
		GridPane grid = new GridPane();
		grid.add(label1, 1, 1);
		grid.add(text1, 2, 1);
		grid.add(buttonTypeOk, 1, 2);
		removeDialog.getDialogPane().setContent(grid);

		
/*
		removeDialog.setResultConverter(new Callback<ButtonType, Car>() {
			@Override 
			Optional<Car> result = removeDialog.showAndWait();
	*/		
			/*if (result.isPresent()) {
				entered = Integer.parseInt(result.get());
			}
			list.remove(entered);
			*/
			int a = Integer.parseInt(text1.getText());
			Car b = null ;
			for (int i = 0 ; i< cl.getSize(); i++)
				if (cl.getCar(i).getRegNo() == a)
					b = new Car(cl.getCar(i).getMake(), cl.getCar(i).getModel(), cl.getCar(i).getMillage(), cl.getCar(i).getRegNo(), cl.getCar(i).getYearMan())	;
					cl.removeCars(b);
		
	}
}
