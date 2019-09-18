package model;

import java.util.ArrayList;

public class CarList {
	private ArrayList<Car> cars;

	public CarList() {
		cars = new ArrayList<Car>();
	}
	
	public void addCars(Car car){
	     cars.add(car);
	}
	public int getSize() {
		return cars.size();
	}
	
	public Car getCar(int i) {
		return cars.get(i);
	}
	
	public void removeCars(Car car) {
		cars.remove(car);
	}
	
}
