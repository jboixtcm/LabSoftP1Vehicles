package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] data = askCarPlateBrandColor();
		Car car;
		try {
			car = new Car(data[0], data[1], data[2]);
			System.out.println("Adding front wheels");
			List<Wheel> wheels = orderTwoWheels();
			afegir2Rodes(car, wheels);

			System.out.println("Adding back wheels");
			wheels = orderTwoWheels();
			afegir2Rodes(car, wheels);

			car.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String[] askCarPlateBrandColor() {
		String[] data = new String[3];
		data[0] = askCarPlate();
		data[1] = askCarBrand();
		data[2] = askCarColor();

		return data;
	}

	public static String askCarPlate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the car's plate number:");
		String plate = scan.next();
		return plate;
	}

	public static String askCarBrand() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the car's brand:");
		String brand = scan.next();
		return brand;
	}

	public static String askCarColor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the car's color:");
		String color = scan.next();
		return color;
	}

	public static Wheel orderOneWheel() throws Exception {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the wheel's brand:");
		String brand = scan.next();
		System.out.println("Enter the wheel's diameter:");
		Double diameter = scan.nextDouble();

		Wheel wheel = new Wheel(brand, diameter);
		return wheel;
	}

	public static List<Wheel> orderTwoWheels() throws Exception {
		List<Wheel> wheels = new ArrayList<Wheel>();
		Wheel one = orderOneWheel();
		Wheel two = orderOneWheel();

		wheels.add(one);
		wheels.add(two);

		return wheels;
	}

	public static void afegir2Rodes(Car car, List<Wheel> wheels) {
		try {
			car.addTwoWheels(wheels);
		} catch (Exception e) {
			System.out.println("Error a l'intentar afegir dues rodes al main");
		}
	}

}
