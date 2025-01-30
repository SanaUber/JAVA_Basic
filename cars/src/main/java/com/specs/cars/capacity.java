package com.specs.cars;


//import org.springframework.stereotype.Component;

//@Component
public class capacity {
	
String capacity;


public capacity(String capacity) {
	super();
	this.capacity = capacity;
}

public String getCapacity() {
	return capacity;
}

public void setCapacity(String capacity) {
	this.capacity = capacity;
}

@Override
public String toString() {
	return "capacity [capacity=" + capacity + "]";
}
}
