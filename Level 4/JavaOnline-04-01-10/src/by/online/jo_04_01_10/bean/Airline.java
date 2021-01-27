/* 
 * Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
package by.online.jo_04_01_10.bean;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public class Airline implements Serializable{

	private static final long serialVersionUID = 429953952187407721L;

	public enum AircrafType{
		A, B, C, D
	}
	
	private static int NUMBER = 1;
	
	private int number;
	private String destination;
	private AircrafType aircraftType;
	private LocalTime departureTime;
	private List <DayOfWeek> departureDay;
	
	public Airline(String destination, AircrafType aircraftType, String departureTime, List <DayOfWeek> departureDay) {
		number = NUMBER++;
		this.setDestination(destination);
		this.setAircraftType(aircraftType);
		this.setDepartureTime(LocalTime.parse(departureTime));
		this.setDepartureDay(departureDay);
	}

	public int getNumber() {
		return number;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public AircrafType getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(AircrafType aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public List <DayOfWeek> getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(List <DayOfWeek> departureDay) {
		this.departureDay = departureDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + ((departureDay == null) ? 0 : departureDay.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + number;
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
		Airline other = (Airline) obj;
		if (aircraftType != other.aircraftType)
			return false;
		if (departureDay == null) {
			if (other.departureDay != null)
				return false;
		} else if (!departureDay.equals(other.departureDay))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [number=" + number + ", destination=" + destination + ", aircraftType=" + aircraftType
				+ ", departureTime=" + departureTime + ", departureDay=" + departureDay + "]";
	}

	public void add(DayOfWeek departureDay) {
		this.departureDay.add(departureDay);
	}

}
