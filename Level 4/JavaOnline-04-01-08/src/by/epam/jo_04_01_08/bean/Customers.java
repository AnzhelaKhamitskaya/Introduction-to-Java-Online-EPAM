package by.epam.jo_04_01_08.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Customers implements Serializable{

	private static final long serialVersionUID = -5393071409714821657L;
	
	private Customer[] customers;
	private int capacity;
	private int size;

	public Customers(int capacity) {
		size = 0;
		this.capacity = capacity;
		customers = new Customer[capacity];
	}

	public Customers() {
		this(5);
	}

	public void add(Customer customer) {
		if (size < capacity) {

			customers[size] = customer;
			size++;

		} else {

			capacity *= 2;

			Customer[] buffer = new Customer[capacity];

			for (int i = 0; i < size; ++i) {
				buffer[i] = customers[i];
			}

			customers = buffer;

			customers[size] = customer;

			size++;

		}
	}

	public void print() {
		for (int i = 0; i < size; ++i) {
			System.out.println(customers[i]);
		}
	}

	public void sortByName() {
		Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
	}

	public void prinCardInRange(String from, String to) {

		for (int i = 0; i < size; ++i) {

			if (customers[i].getCardNumber().compareTo(from) >= 0 && customers[i].getCardNumber().compareTo(to) <= 0) {

				System.out.println(customers[i]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Customer c1 = Customer.createCustomer(scanner);
		c1.setSurname("Hanna");
		c1.setName("Lola");
		c1.setCardNumber("15");
		System.out.println(c1);
		System.out.println("===================== 1");

		Customer c2 = Customer.createCustomer(scanner);
		c2.setSurname("Hanna");
		c2.setName("Lala");
		c2.setCardNumber("19");
		System.out.println(c2);
		System.out.println("===================== 2");

		Customers cus = new Customers();
		cus.add(c1);
		cus.add(c2);
		cus.add(Customer.createCustomer(scanner));
		cus.add(Customer.createCustomer(scanner));
		cus.add(Customer.createCustomer(scanner));

		cus.print();
		System.out.println("===================== 4");

		cus.sortByName();
		cus.print();
		System.out.println("===================== 5");

		cus.prinCardInRange("15", "20");
	}

}
