package by.epam.jo_05_01_03.view;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import by.epam.jo_05_01_03.bean.MyCalendar;
import by.epam.jo_05_01_03.bean.MyCalendar.DateOff;

public class MyCalendarView {

	public void printMyCalendarFor(int year, MyCalendar myCalendar) {

		LocalDate start = LocalDate.of(year, Month.JANUARY, 01);
		LocalDate end = LocalDate.of(++year, Month.JANUARY, 01);
		List<LocalDate> cyrrentYear = start.datesUntil(end).collect(Collectors.toList());

		System.out.printf("\n\n*************************\nMY CALENDAR FOR %s YEAR\n*************************", --year);

		int currentMonth = 0;

		for (LocalDate date : cyrrentYear) {

			if (currentMonth != date.getMonth().getValue()) {
				currentMonth++;
				System.out.printf("\n\n%S:\n", Month.of(currentMonth));
				System.out.printf("\n%6S  %13S  %-8S %S\n", "DATE", "DAY OF WEEK", "DAY OFF", "NOTE");
			}

			System.out.printf("%4s%02d  %13s  ", "", date.getDayOfMonth(), date.getDayOfWeek());
			
			int currentYear = year;
			List<DateOff> dateOffs_currentYear = myCalendar.getDayOffs().stream().filter(dayOff -> dayOff.getYear() == currentYear).collect(Collectors.toList());
			
			if (dateOffs_currentYear.size() == 0) {
				System.out.printf("%-8s ", "");
			}
			
			for (int i = 0; i < dateOffs_currentYear.size(); i++) {
				if (date.getDayOfWeek().compareTo(dateOffs_currentYear.get(i).getDw()) != 0) {
					if (i == dateOffs_currentYear.size() - 1) {
						System.out.printf("%-8s ", "");
					}
					continue;
				} else {
					System.out.printf("%-8s ", "Да");
					break;
				}
			}

			for (int i = 0; i < myCalendar.getDateNotes().size(); i++) {
				if (date.compareTo(LocalDate.parse(myCalendar.getDateNotes().get(i).getDate())) != 0) {
					continue;
				} else {
					System.out.printf("%s ", myCalendar.getDateNotes().get(i).getNotes());
				}
			}

			System.out.printf("\n");
		}

	}
}
