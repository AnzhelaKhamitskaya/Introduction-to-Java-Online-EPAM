// Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
// столицу, количество областей, площадь, областные центры. 
package by.epam.jo_04_02_03.bean;

import java.util.ArrayList;
import java.util.List;

import by.epam.jo_04_02_03.view.View;

public class Program {

	public static void main(String[] args) {
				
		List <Town> townsLoevskiyDistrict = new ArrayList<>();
		townsLoevskiyDistrict.add(new Town("Лоев", 1060));
		townsLoevskiyDistrict.add(new Town("Страдубка", 100));
		townsLoevskiyDistrict.add(new Town("Переделка", 100));
		townsLoevskiyDistrict.add(new Town("Малиновка", 107));
		townsLoevskiyDistrict.add(new Town("Бывальки", 100));
		townsLoevskiyDistrict.add(new Town("Ручаёвка", 100));

	    List <District> districtsGomelRegion = new ArrayList<>();
	    districtsGomelRegion.add(new District("Гомельский", "Гомель"));
	    districtsGomelRegion.add(new District("Лоевский", "Лоев", townsLoevskiyDistrict, 1567));
	    districtsGomelRegion.add(new District("Речицкий", "Речица"));
	    districtsGomelRegion.add(new District("Брагинский", "Брагин"));
	    districtsGomelRegion.add(new District("Добрушский", "Добруш"));
	    
	    List <Region> regions = new ArrayList<>();
	    regions.add(new Region("Гомельская", "Гомель", districtsGomelRegion, 40372));
	    regions.add(new Region("Могилёвская", "Могилёв"));
	    regions.add(new Region("Витебская", "Витебск"));
	    regions.add(new Region("Гродненская", "Гродно"));
	    regions.add(new Region("Брестская", "Брест"));
	    regions.add(new Region("Минская", "Минск"));

		State state1 = new State("Беларусь", "Минск", regions, 207600);

	    System.out.println(state1.getCapital());	
	    System.out.println(state1.getRegions().size());	
	    System.out.println(state1.getSquare());	// площадь страны
	    System.out.println(regions.get(0).getSquare());	// площадь Гомельской области
	    System.out.println(districtsGomelRegion.get(1).getSquare());	// площадь лоевского района
	    View.getSquareEveryTown(districtsGomelRegion.get(1)); // площадь каждого населенного пункта в Лоевском районе
	    System.out.println(townsLoevskiyDistrict.get(0).getSquare());	// площадь Лоева
	}
}
