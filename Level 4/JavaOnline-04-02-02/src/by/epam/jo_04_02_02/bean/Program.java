// Создать объект класса Автомобиль, 
// используя классы Колесо, Двигатель. 
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 

package by.epam.jo_04_02_02.bean;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		Car car1 = new Car(FuelType.DIESEL, 60, RubberType.SUMMER, DiskType.STEEL, 5, "Mersedes", 8, 1.8, 0);
		System.out.println(car1);

		double km = 20;
		if (km > 0) {
			car1.toMove(km);
		}
		System.out.println(car1);
		
		  
		  for(Wheel wheel : car1.getWheels()) { System.out.println(wheel); }
		 
		  car1.changeWheel(new Wheel(RubberType.SUMMER, DiskType.CAST),
		  WheelPosition.FRONT_RIGHT);
		 
		  for(Wheel wheel : car1.getWheels()) { System.out.println(wheel); }
		  
		  car1.getWheels().get(WheelPosition.FRONT_RIGHT.getIndex()).setDiskType(
		  DiskType.STEEL);
		  
		  for(Wheel wheel : car1.getWheels()) { System.out.println(wheel); }
		  
		  int quontity = 6; List <Wheel> wheels = new ArrayList<>(); for (int i = 0; i
		  < quontity; i++) { wheels.add(new Wheel(RubberType.ALL_SEASON,
		  DiskType.CAST)); }
		 
		  try { car1.setWheels(wheels); } catch (NotEnoughWheelsException e) {
		  System.out.println(e.getMessage() + " " + e.getSize()); }finally { for(Wheel
		  wheel : car1.getWheels()) { System.out.println(wheel); } }
		  
		  System.out.println(car1.getModel());
		  
		  System.out.println(car1.getBrand());
		  
		  System.out.println(car1.getEngine());
		  
		  System.out.println(car1.getCurrentLitre());
		  
		  System.out.println(car1.getConsumptionLitre());
		  
		  System.out.println(car1.getOdometer());
		  
		  System.out.println(car1.getSerialNumber());
		  
		  System.out.println(car1.getWheels());
		  
		  Car car2 = new Car(FuelType.DIESEL, 60, RubberType.SUMMER, DiskType.STEEL, 5,
		  "Mersedes", 0.0, 8, 0);
		  
		  System.out.println(car1.equals(car2)); System.out.println(car1.equals(car1));
		  System.out.println(car2);
		 
		  System.out.println(car1.hashCode()); System.out.println(car2.hashCode());
		  
		  System.out.println(car1.getClass());
		 
	}
}
