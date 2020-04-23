package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		if(diameter < 0.4 && diameter >4) {
			throw new Exception("Diameter must be bigger than 0.4 and less than 4");
		}
		this.brand = brand;
		this.diameter = diameter;
	}

	public boolean equals(Object obj) {
		Wheel w = (Wheel)obj;
		
		return this.brand.equals(w.brand) &&  this.diameter == w.diameter;
	}
	
	public String toString() {
		System.out.println("--RODA");
		System.out.println("--Marca:    " + this.brand);
		System.out.println("--Diametre: " + this.diameter);
		return "";
	}

}
