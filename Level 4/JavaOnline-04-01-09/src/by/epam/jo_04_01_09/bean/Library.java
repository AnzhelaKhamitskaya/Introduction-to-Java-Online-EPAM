package by.epam.jo_04_01_09.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import by.epam.jo_04_01_09.bean.Book.Cover;

public class Library implements Serializable{

	private static final long serialVersionUID = -6514033000418156481L;
	
	private List<Book> library;

	public Library(List<Book> library) {
		this.library = library;
	}

	public Library() {
		this(new ArrayList<>());
	}

	public List<Book> getLibrary() {
		return library;
	}

	public void setLibrary(List<Book> library) {
		this.library = library;
	}

	public void add(Book book) {
		this.library.add(book);
	}

	public void remove(Book book) {
		this.library.remove(book.getId());
	}

	public void allBookFrom(String publishingHouse) {
		this.library.stream().filter(book -> book.getPublishingHouse().equals(publishingHouse))
				.forEach(System.out::println);
	}

	public void allBookOf(String a) {
		this.library.stream().filter(book -> book.getAuthors().stream().anyMatch(a::equals) == true)
				.forEach(System.out::println);
	}

	public void allBookAfter(int year) {
		this.library.stream().filter(book -> book.getYear() > year).forEach(System.out::println);
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library == null) ? 0 : library.hashCode());
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
		Library other = (Library) obj;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "" + library + "";
	}

	public static void main(String[] args) {
		
		Library l = new Library();
		List<String> authors = new ArrayList<>();
		authors.add("Экзюпери");
		l.add(new Book("Цитадель", authors, "Азбука", 2006, 1256, 20.50, Cover.GLUTE));
		
		List<String> authors2 = new ArrayList<>();
		authors2.add("Кати Сьерра");
		authors2.add("Берт Бейтс");
		l.add(new Book("Изучаем Java", authors2, "Эксмо", 2015, 1256, 25, Cover.HARD));
		
		l.allBookFrom("Эксмо");
		
		l.allBookOf("Экзюпери");
		
		l.allBookAfter(1992);
		
		Library l2 = new Library();
		System.out.println(l2);
		System.out.println(l);
	}
}
