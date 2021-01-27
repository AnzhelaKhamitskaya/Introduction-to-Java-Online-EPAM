package by.epam.jo_04_02_02.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car implements Serializable {

	private static final long serialVersionUID = 8364424971823385207L;	
	private static int SERIAL_NUMBER = 1;
	private static double CALCULATED_DISTANCE = 100.0;	
	private final int serialNumber;
	private final double consumptionLitre;
	public final double calculatedDistanceFullTank;
	private String brand;
	private List<Wheel> wheels;
	private Engine engine;
	private double currentLitre;
	private double odometer;

	{
		serialNumber = SERIAL_NUMBER++;
	}

	
	public Car(FuelType fuelType, int capacityLitre, RubberType rubberType, DiskType diskType, int quontity, String brand,
			double consumptionLitre, double currentLitre, double odometer) {
		
		this.consumptionLitre = consumptionLitre;
		calculatedDistanceFullTank =  capacityLitre * CALCULATED_DISTANCE / consumptionLitre;
		this.brand = brand;
		wheels = new ArrayList<>(quontity);
		for (int i = 0; i < quontity; i++) {
			wheels.add(new Wheel(rubberType, diskType));
		}
		engine = new Engine(fuelType,  capacityLitre);
		this.currentLitre = currentLitre;
		this.odometer = odometer;
	}
	
	
	/* public Car() {} */


	public int getSerialNumber() {
		return serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public double getCurrentLitre() {
		return currentLitre;
	}

	public double getConsumptionLitre() {
		return consumptionLitre;
	}
	
	public double getOdometer() {
		return odometer;
	}
	
	public String getModel() {
		return this.brand + " V" + this.engine.getCapacity() + " " + this.engine.getFuelTipe().getAbbreviation();
	}
	
	public List<Wheel> getWheels() {
		return wheels;
	}
	
	public void setWheels(List<Wheel> wheels) throws NotEnoughWheelsException {
		if (this.wheels.size() <= wheels.size()) {
			for (int i = 0; i < this.wheels.size(); i++) {
				this.wheels.set(i, wheels.get(i));
			}
		}else {
			throw new NotEnoughWheelsException("Недостаточное количество колёс", (this.wheels.size() - wheels.size()));
		}
	}
	
	
	public void changeWheel(Wheel wheel, WheelPosition position){		
		wheels.set(position.getIndex(), wheel);
	}

	public double getNeedLitre(double km) {	
		double needLitre = km / CALCULATED_DISTANCE * consumptionLitre;
		return needLitre;
	}
	
	
	public double getDistanseCanMove() {	
		double distanseCanMove = currentLitre / consumptionLitre * CALCULATED_DISTANCE;
		return distanseCanMove;
	};
	
	
	public void toMove(double km) {

		do {
			System.out.println("Нужно проехать " + km);
			double needLitre = getNeedLitre(km);
			System.out.println("Нужно литров " + needLitre);
			System.out.println("Есть литров " + currentLitre);
			
			if (needLitre > currentLitre) {
				toRefuel(engine.getCapacity());
				System.out.println("Заправили ");
				System.out.println("Есть литров " + currentLitre);
			}

			
			System.out.println("Могу проехать " + getDistanseCanMove());
			System.out.println("Счётчик км " + odometer);

			if(km > this.getDistanseCanMove()) {
				double distanceCanMove = getDistanseCanMove();
				odometer += distanceCanMove;
				System.out.println("Проехала и счётчик равен " + odometer);
				currentLitre -= this.getNeedLitre(distanceCanMove);
				km -=  distanceCanMove;

				System.out.println("Проехать осталось " + km);
				
			}else {
				odometer += km;
				currentLitre -= this.getNeedLitre(km);
				System.out.println("Проехала и счётчик равен " + odometer);
				km -=  km;
				System.out.println("Проехать осталось " + km);
			}
						
			System.out.println("литров осталось " + currentLitre);

		} while (km > 0);
	}

	
	public void toRefuel(double litre) {	
		if((currentLitre + litre) <= this.engine.getCapacity()) {
			currentLitre += litre;
		}else {
			currentLitre = this.engine.getCapacity();
		}
			
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		long temp;
		temp = Double.doubleToLongBits(currentLitre);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(consumptionLitre);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(odometer);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + serialNumber;
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (Double.doubleToLongBits(currentLitre) != Double.doubleToLongBits(other.currentLitre))
			return false;
		if (Double.doubleToLongBits(consumptionLitre) != Double.doubleToLongBits(other.consumptionLitre))
			return false;
		if (Double.doubleToLongBits(odometer) != Double.doubleToLongBits(other.odometer))
			return false;
		if (serialNumber != other.serialNumber)
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " [serialNumber=" + serialNumber + ", brand=" + brand + ", wheels=" + wheels.size() + ", " + wheels.get(0).getDiskType() + ", " + wheels.get(0).getRubberType() + ", engine=" + engine
				+ ", currentLitre=" + currentLitre + ", fuelСonsumption=" + consumptionLitre + ", odometer=" + odometer + "]";
	}
}
