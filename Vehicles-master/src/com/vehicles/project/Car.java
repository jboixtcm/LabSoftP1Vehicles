package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
		int characters = countPlateChars(plate);
		if(countPlateNumbers(plate) != 4 || (characters != 2 && characters != 3)) {
			throw new Exception("Plate numbers must be 4 and 2 or 3 characters and UPPER CASE");
		}
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	
	public String toString() {
		System.out.println("DADES DEL COTXE");
		System.out.println("Matrícula:    " + this.plate);
		System.out.println("Marca:        " + this.brand);
		System.out.println("Color:        " + this.color);
		
		for(int i = 0; i<this.wheels.size() ; i ++) {
			wheels.get(i).toString();
		}
		return "";
	}
	
	private static int countPlateNumbers(String plate) {
		int count = 0;
		for(int i = 0; i <plate.length(); i++) {
			if(plate.charAt(i) >= 48 && plate.charAt(i) <= 57) {
				count++;
			}
		}
		return count;
	}
	
	private static int countPlateChars(String plate) {
		int count = 0;
		for(int i = 0; i <plate.length(); i++) {
			if(plate.charAt(i) >= 65 && plate.charAt(i) <= 90) {
				count++;
			}
		}
		return count;
	}

}
