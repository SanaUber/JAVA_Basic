package com.specs.cars;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Pajero implements Tyres, fuelonsumption {
/*	@Autowired
	capacity c;
	public capacity getC() {
		return c;
	}



	public void setC(capacity c) {
		this.c = c;
	}*/
	@Autowired
	paint p;
	


	public paint getP() {
		return p;
	}



	public void setP(paint p) {
		this.p = p;
	}



	public void name() {
		System.out.println("PAJERO" );
	p.metallicpaint();
	}
	
	
	
public void fuelconsumption() {
	System.out.println("8L/km");
	
}public void Tyresnames() {
	System.out.println("Dunlop");
		
	}
}
