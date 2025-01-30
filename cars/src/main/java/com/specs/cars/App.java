package com.specs.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ac=new AnnotationConfigApplicationContext(Appconfig.class);
      Pajero p=ac.getBean(Pajero.class);
      p.name();
      p.fuelconsumption();
      p.Tyresnames();
      Ferrari f=ac.getBean(Ferrari.class);
      f.name();
      f.fuelconsumption();
      f.Tyresnames();
     /* capacity c=ac.getBean(capacity.class);
      System.out.println(c);*/
    }
}
