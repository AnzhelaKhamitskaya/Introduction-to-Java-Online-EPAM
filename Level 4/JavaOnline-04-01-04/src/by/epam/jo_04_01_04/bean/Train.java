/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

package by.epam.jo_04_01_04.bean;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Train implements Serializable {

	private static final long serialVersionUID = -5023686710684355128L;

	private String destination;
	private String number;
	private LocalTime departureTime;

	public Train() {
		this("", "", LocalTime.of(00, 00));
	}

	public Train(String Destination, String number, LocalTime departureTime) {
		this.destination = Destination;
		this.number = number;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public String getNymber() {
		return number;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setNymber(String number) {
		this.number = number;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public static class ComparatorByNumber implements Comparator<Train> {
		@Override
		public int compare(Train t1, Train t2) {
			return t1.number.compareTo(t2.number);
		}
	}

	public static class ComparatorByDestinationAndTime implements Comparator<Train> {
		@Override
		public int compare(Train t1, Train t2) {
			if (t1.destination == t2.destination) {
				return t1.departureTime.compareTo(t2.departureTime);
			}
			return t1.destination.compareTo(t2.destination);
		}
	}

	public void print() {
		String str = String.format("Destination: %s " + "Number of the train: %s " + "Depature time: %tR", destination,
				number, departureTime);
		System.out.println(str);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Train other = (Train) obj;
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
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [destination=" + destination + ", number=" + number
				+ ", departureTime=" + departureTime + "]";
	}

	public static void main(String[] args) {

		List<Train> trains = new ArrayList<>();

		trains.add(new Train("Минск-Гомель", "306C", LocalTime.of(16, 30)));
		trains.add(new Train("Минск-Витебск", "309C", LocalTime.of(18, 40)));
		trains.add(new Train("Минск-Могилев", "309B", LocalTime.of(15, 50)));
		trains.add(new Train("Минск-Могилев", "104В", LocalTime.of(10, 15)));
		trains.add(new Train("Минск-Могилев", "309B", LocalTime.of(9, 10)));
		trains.forEach(System.out::println);
		System.out.println("********************************************************************");

		trains.stream().sorted(new Train.ComparatorByNumber()).forEach(System.out::println); // вариант 1
		System.out.println("********************************************************************");

		Collections.sort(trains, new Train.ComparatorByDestinationAndTime()); // вариант 2
		trains.forEach(System.out::println);
		System.out.println("********************************************************************");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите номер поезда: ");
		String userChoice1 = scanner.nextLine();
		trains.stream().filter(train -> train.getNymber().equalsIgnoreCase(userChoice1)).forEach(System.out::println);
		scanner.close();

	}
}
