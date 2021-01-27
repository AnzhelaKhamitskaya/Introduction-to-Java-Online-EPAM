/*
 * ������� ����� ��������� � ���������� �������, � ������� �������� �������� ����� ������� ���������� �
 * �������� � ����������� ����.
 */

package by.epam.jo_05_01_03.main;

import java.time.DayOfWeek;

import by.epam.jo_05_01_03.bean.MyCalendar;
import by.epam.jo_05_01_03.view.MyCalendarView;

public class Main {

	public static void main(String[] args) {

		MyCalendar mc = new MyCalendar();
		MyCalendarView view = new MyCalendarView();
		
		mc.addDateNotes(mc.new DateNotes("2020-01-06", "�� ����. ������ � ���������"));
		mc.addDateNotes(mc.new DateNotes("2020-01-06", "����������"));
		mc.addDateNotes(mc.new DateNotes("2020-01-06", "�������"));		
		mc.addDateNotes(mc.new DateNotes("2020-05-23", "��� ��. ������ � ���������"));		
		mc.addDateNotes(mc.new DateNotes("2019-08-16", "������� � �����-���������"));
		mc.addDateNotes(mc.new DateNotes("2021-12-31", "����� ��� � ����"));
		
		mc.addDayOffs(2020, DayOfWeek.MONDAY);
		mc.addDayOffs(2020, DayOfWeek.FRIDAY);
		mc.addDayOffs(2021, DayOfWeek.WEDNESDAY);

		view.printMyCalendarFor(2020, mc);
		view.printMyCalendarFor(2019, mc);	
		view.printMyCalendarFor(2021, mc);
		
	}

}
