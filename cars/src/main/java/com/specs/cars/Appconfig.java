package com.specs.cars;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.specs.cars")


public class Appconfig {
	@Bean
	public Pajero getPajero()
	{
		return new Pajero();
	}
	@Bean
	public Ferrari getFerrari()
	{
		return new Ferrari();
	}
	@Bean
	public capacity getcapacity()
	{String capacity="Six";
		return new capacity(capacity);//because of constructor
	}
	@Bean
	public paint getpaint()//obj for interface
	{
		return  new black();
	}
	
	

}
