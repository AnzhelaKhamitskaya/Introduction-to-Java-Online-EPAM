/*
 * Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
 */
package by.epam.jo_04_01_08.bean;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Scanner;

public class Customer implements Serializable{

	private static final long serialVersionUID = 5372844851226106516L;
	private static int ID = 1;

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String cardNumber;
	private String checkingAccountNumber;

	public Customer(String surname, String name, String patronymic, String address, String cardNumber,
			String checkingAccountNumber) {
		
		id = ID++;

		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNumber = cardNumber;
		this.checkingAccountNumber = checkingAccountNumber;
	}

	private Customer() {
		this("", "", "", "", "", "");
	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCheckingAccountNumber() {
		return checkingAccountNumber;
	}

	public void setCheckingAccountNumber(String checkingAccountNumber) {
		this.checkingAccountNumber = checkingAccountNumber;
	}

	public static Customer createCustomer(Scanner scanner) {
		
		Customer customer = new Customer();
		System.out.print("surname: ");
		customer.surname = scanner.nextLine();
		System.out.print("name: ");
		customer.name = scanner.nextLine();
		System.out.print("patronymic: ");
		customer.patronymic = scanner.nextLine();
		System.out.print("address: ");
		customer.address = scanner.nextLine();
		System.out.print("credit_сard_number: ");
		customer.cardNumber = scanner.nextLine();
		System.out.print("account_number: ");
		customer.checkingAccountNumber = scanner.nextLine();
		return customer;
	}

	public static class ByNameComparator implements Comparator <Customer> {
		public int compare(Customer left, Customer right) {
			String str1 = left.getSurname().trim() + left.getName().trim() + left.getPatronymic().trim();
			String str2 = right.getSurname().trim() + right.getName().trim() + right.getPatronymic().trim();
			return str1.compareTo(str2);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + ((checkingAccountNumber == null) ? 0 : checkingAccountNumber.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (checkingAccountNumber == null) {
			if (other.checkingAccountNumber != null)
				return false;
		} else if (!checkingAccountNumber.equals(other.checkingAccountNumber))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", cardNumber=" + cardNumber + ", checkingAccountNumber="
				+ checkingAccountNumber + "]";
	}

}
