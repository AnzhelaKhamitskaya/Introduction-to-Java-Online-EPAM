package by.online.jo_04_01_10.bean;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import by.online.jo_04_01_10.bean.Airline.AircrafType;

public class Airlines implements Serializable {

	private static final long serialVersionUID = -3280953373129271620L;
	
	private List <Airline> airlines;

	public Airlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public Airlines() {
		this(new ArrayList<>());
	}

	public List <Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List <Airline> airlines) {
		this.airlines = airlines;
	}

	public void add(Airline airline) {
		this.airlines.add(airline);
	}

	public void remove(Airline airline) {
		this.airlines.remove(airline.getNumber());
	}

	public void AirlinesTo(String destination) {
		this.airlines.stream().filter(airline ->airline.getDestination().equals(destination))
				.forEach(System.out::println);
	}

	public void AirlinesAt(DayOfWeek departureDay) { 
		this.airlines.stream().filter(airline -> airline.getDepartureDay().stream().anyMatch(departureDay::equals) == true)
		.forEach(System.out::println);

	}

	public void AirlinesPeriod(DayOfWeek departureDay, String departureTimeAfter) {
		this.airlines.stream()
				.filter(airline -> airline.getDepartureDay().stream().anyMatch(departureDay::equals) == true)
				.filter(airline -> airline.getDepartureTime().isAfter(LocalTime.parse(departureTimeAfter)))
				.forEach(System.out::println);

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
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
		Airlines other = (Airlines) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airlines [airlines=" + airlines + "]";
	}

	public static void main(String[] args) {
		List <DayOfWeek> arr = new ArrayList<>();	
		List <DayOfWeek> arr2 = new ArrayList<>();	
		List <DayOfWeek> arr3 = new ArrayList<>();	
		List <DayOfWeek> arr4 = new ArrayList<>();	
		
		Airline a1 = new Airline("Москва", AircrafType.A, "18:04", arr);
		a1.add(DayOfWeek.FRIDAY);
		
		
		Airline a2 = new Airline("Рига", AircrafType.A, "12:05", arr2);
		a2.add(DayOfWeek.FRIDAY);
		Airline a3 = new Airline("Москва", AircrafType.A, "18:05", arr3);
		a3.add(DayOfWeek.MONDAY);
		Airline a4 = new Airline("Москва", AircrafType.A, "23:09", arr4);
		a4.add(DayOfWeek.FRIDAY);
		
		Airlines al = new Airlines();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		
		al.AirlinesAt(DayOfWeek.MONDAY);
		al.AirlinesTo("Рига");
		al.AirlinesPeriod(DayOfWeek.FRIDAY, "18:05");
	}

}
