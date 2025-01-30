package com.specs.cars;
import org.springframework.stereotype.Component;

@Component
public class Ferrari implements fuelonsumption, Tyres
{
	public void name() {
		System.out.println("FERRARI");
	}
	
	
	
public void fuelconsumption() {
	System.out.println("3L/km");
	
}public void Tyresnames() {
	System.out.println("BRIDGESTONE");
		
	}








}
