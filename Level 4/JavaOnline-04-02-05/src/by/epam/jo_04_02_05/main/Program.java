/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

package by.epam.jo_04_02_05.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import by.epam.jo_04_02_05.bean.AccomodationType;
import by.epam.jo_04_02_05.bean.FoodType;
import by.epam.jo_04_02_05.bean.TourType;
import by.epam.jo_04_02_05.bean.TransportType;
import by.epam.jo_04_02_05.bean.TravelAgency;
import by.epam.jo_04_02_05.bean.TravelAgency.Voucher;
import by.epam.jo_04_02_05.view.TravelAgencyView;

public class Program {

	public static void main(String[] args) {
		
			TravelAgency agency = new TravelAgency();	
		agency.add(agency.new Voucher("Париж", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-06"), BigDecimal.valueOf(850), TourType.EXCURSION,
				FoodType.AI, TransportType.LAND, AccomodationType.DBL));
		agency.add(agency.new Voucher("Париж", LocalDate.parse("2020-12-07"), LocalDate.parse("2020-12-14"), BigDecimal.valueOf(650), TourType.EXCURSION,
				FoodType.FB, TransportType.LAND, AccomodationType.DBL));
		agency.add(agency.new Voucher("Париж", LocalDate.parse("2020-12-21"), LocalDate.parse("2020-12-28"), BigDecimal.valueOf(350), TourType.EXCURSION,
				FoodType.HB_PLUS, TransportType.LAND, AccomodationType.DBL_EXB));
		agency.add(agency.new Voucher("Лондон", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-14"), BigDecimal.valueOf(1500), TourType.SHOPPING,
				FoodType.BB, TransportType.AIR, AccomodationType.DBL));
		agency.add(agency.new Voucher("Лондон", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-07"), BigDecimal.valueOf(1000), TourType.EXCURSION,
				FoodType.BB, TransportType.AIR, AccomodationType.SGL));
		agency.add(agency.new Voucher("Прага", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-10"), BigDecimal.valueOf(400), TourType.EXCURSION,
				FoodType.BB, TransportType.LAND, AccomodationType.DBL));
		agency.add(agency.new Voucher("Венеция", LocalDate.parse("2020-11-15"), LocalDate.parse("2021-01-02"), BigDecimal.valueOf(350), TourType.SHOPPING,
				FoodType.UAI, TransportType.AIR, AccomodationType.DBL_EXB));
		agency.add(agency.new Voucher("Закапаны", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-10"), BigDecimal.valueOf(550), TourType.TREATMENT,
				FoodType.HB, TransportType.LAND, AccomodationType.SGL));
		agency.add(agency.new Voucher("Карловы Вары", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-15"), BigDecimal.valueOf(700), TourType.TREATMENT,
				FoodType.HB_PLUS, TransportType.LAND, AccomodationType.DBL_EXB_CHD));
		agency.add(agency.new Voucher("Осло", LocalDate.parse("2020-11-30"), LocalDate.parse("2020-12-21"), BigDecimal.valueOf(1250), TourType.CRUISE,
				FoodType.FB_PLUS, TransportType.WATER, AccomodationType.DBL_CHD));
		agency.add(agency.new Voucher("Мадагаскар", LocalDate.parse("2020-12-12"), LocalDate.parse("2021-01-02"), BigDecimal.valueOf(2500), TourType.CRUISE,
				FoodType.RO, TransportType.AIR, AccomodationType.SGL));

        TravelAgencyView view = new  TravelAgencyView(); 
        
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        
        do {    	
        	List <Voucher> list = view.getMenu(agency, sc);
       	
        	if(list != null) {
        		view.print(list);
        	}
        	
        	System.out.println("\nПродолжить работу? Да - 1 Нет - 2");

			if (sc.hasNextInt()) {
				if (sc.nextInt() == 2) {
					flag = false;
				}
			}
			
        } while (flag);
     
        sc.close();
	}

}
