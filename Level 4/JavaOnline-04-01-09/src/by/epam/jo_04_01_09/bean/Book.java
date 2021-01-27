/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами 
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

package by.epam.jo_04_01_09.bean;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable{

	private static final long serialVersionUID = -2443631638899550054L;

	public enum Cover{
		HARD, SOFT, GLUTE, SPRING, NOT_SET;
	}
	
	private static int ID = 1;

	private int id;
	private String title;
	private List <String> authors;
	private String publishingHouse;
	private int year;
	private int pages;
	private double price;
	private Cover cover;
	
	public Book(String title, List <String> authors, String publishingHouse, int year, int pages, double price, Cover cover) {
		id = ID++;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.cover = cover;
	}
	
	public Book() {
		this("", null, "", 0, 0, 0, Cover.NOT_SET);
	}

	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List <String> getAuthors() {
		return authors;
	}
	public void setAuthors(List <String> authors) {
		this.authors = authors;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	public int getYear() {
		return year;
	}
	public void setYear(Short year) {
		this.year = year;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(Short pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Cover getCover() {
		return cover;
	}
	public void setCover(Cover cover) {
		this.cover = cover;
	}
	
	public void add(String author) {
		this.authors.add(author);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((cover == null) ? 0 : cover.hashCode());
		result = prime * result + id;
		result = prime * result + pages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
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
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (cover != other.cover)
			return false;
		if (id != other.id)
			return false;
		if (pages != other.pages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", title=" + title + ", authors=" + authors + ", publishingHouse=" + publishingHouse
				+ ", year=" + year + ", pages=" + pages + ", price=" + price + ", cover=" + cover + "]";
	}
	
}
