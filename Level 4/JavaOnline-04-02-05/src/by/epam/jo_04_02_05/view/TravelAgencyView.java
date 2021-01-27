package by.epam.jo_04_02_05.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.jo_04_02_05.bean.AccomodationType;
import by.epam.jo_04_02_05.bean.FoodType;
import by.epam.jo_04_02_05.bean.SamplingParameter;
import by.epam.jo_04_02_05.bean.SortingParameter;
import by.epam.jo_04_02_05.bean.TourType;
import by.epam.jo_04_02_05.bean.TransportType;
import by.epam.jo_04_02_05.bean.TravelAgency;
import by.epam.jo_04_02_05.bean.TravelAgency.Voucher;
import by.epam.jo_04_02_05.logic.TravelAgencyLogic;

public class TravelAgencyView {

	public List<Voucher> getMenu(TravelAgency agency, Scanner sc) {

		List<Voucher> list = new ArrayList<>();
		List<Voucher> list_ = new ArrayList<>();
		int choice = 0;

		
			System.out.println("�������� ��������:");
			System.out.println("1 - �������� ��� ����");
			System.out.println("2 - ������� ���� �� ����������");
			System.out.println("3 - ������������� ����");
			System.out.println("4 - ������� ���� �� ���������� � �������������");

			if (sc.hasNextInt()) {
				
				choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1:
					list = TravelAgencyLogic.getListAllTour(agency.getVouchers());
					break;
				case 2:
					List<SamplingParameter> parametersSampling = chooseSamplingParameter(sc);
					list = TravelAgencyLogic.getListTourBySemplingParameter(agency.getVouchers(), parametersSampling);
					break;
				case 3:
					List<SortingParameter> parametersSorting = chooseSortingParameter(sc);
					list = TravelAgencyLogic.getListTourBySortingParameter(agency.getVouchers(), parametersSorting);
					break;
				case 4:
					List<SamplingParameter> parametersSampling_ = chooseSamplingParameter(sc);
					list_ = TravelAgencyLogic.getListTourBySemplingParameter(agency.getVouchers(), parametersSampling_);
					
					List<SortingParameter> parametersSorting_ = chooseSortingParameter(sc);
					list = TravelAgencyLogic.getListTourBySortingParameter(list_, parametersSorting_);
					break;
				default:
					System.out.println("��� ������ ������ ����");
					list = null;
				}
				
			} else {
				System.out.println("��� ������ ������ ����");
				sc.nextLine();
				list = null;
			}

		return list;
	}


	private List<SamplingParameter> chooseSamplingParameter(Scanner sc) {

		List<SamplingParameter> parameters = new ArrayList<>();

		int choice = 0;
		boolean flag = true;
		String className = "";
		String value = "";

		System.out.println("�������� �������� ������:");

		do {
			short index = 1;

			for (SamplingParameter p : SamplingParameter.values()) {
				System.out.println(index++ + " - " + p);
			}

			if (sc.hasNextInt()) {
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					className = "FoodType";
					break;
				case 2:
					className = "TransportType";
					break;
				case 3:
					className = "AccomodationType";
					break;
				case 4:
					className = "TourType";
					break;
				default:
					System.out.println("��� ������ ���������");
				}

				
				if (choice > 0 && choice < 5) {
					value = getValue(className, sc).toString();
					SamplingParameter parameter = SamplingParameter.values()[--choice];
					parameter.setParameter(value);
					if(!parameters.contains(parameter)) {
						parameters.add(parameter);
					}
				}

			} else {
				System.out.println("��� ������ ���������");
				sc.nextLine();
			}

			System.out.println("�������� ��� ��������? �� - 1 ��� - 2");

			if (sc.hasNextInt()) {
				if (sc.nextInt() == 2) {
					flag = false;
				}
			}

		} while (flag);

		return parameters;
	}

	
	private List<SortingParameter> chooseSortingParameter(Scanner sc) {
		
		List<SortingParameter> parameters = new ArrayList<>();
		SortingParameter parameter = null;
		int choice = 0;
		boolean flag = true;

		System.out.println("���������� ��������� ����������:");

		do {
			short index = 1;

			for (SortingParameter p : SortingParameter.values()) {
				System.out.println(index++ + " - " + p);
			}

			if (sc.hasNextInt()) {
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					parameter = SortingParameter.PERIOD;
					parameter.setParameter(true);
					break;
				case 2:
					parameter = SortingParameter.PRICE;
					parameter.setParameter(true);
					break;
				default:
					System.out.println("��� ������ ���������");
				}

				if (choice > 0 && choice < 3 && parameter != null && !parameters.contains(parameter)) {
						parameters.add(parameter);
				}

			} else {
				System.out.println("��� ������ ���������");
				sc.nextLine();
			}

			System.out.println("�������� ��� ��������? �� - 1 ��� - 2");

			if (sc.hasNextInt()) {
				if (sc.nextInt() == 2) {
					flag = false;
				}
			}

		} while (flag);

		return parameters;
	}
	
	
	private StringBuilder getValue(String className, Scanner sc) {

		StringBuilder value = new StringBuilder();
		int index = 1;

		System.out.println("�������� ��������:");
		switch (className) {
		case "FoodType":
			for (FoodType p : FoodType.values()) {
				System.out.println(index++ + " - " + p);
			}
			break;
		case "TransportType":
			for (TransportType p : TransportType.values()) {
				System.out.println(index++ + " - " + p);
			}
			break;
		case "AccomodationType":
			for (AccomodationType p : AccomodationType.values()) {
				System.out.println(index++ + " - " + p);
			}
			break;
		case "TourType":
			for (TourType p : TourType.values()) {
				System.out.println(index++ + " - " + p);
			}
			break;
		default:
			System.out.println("������ �������� �� ������");
		}

		boolean flag = false;
		do {
			flag = false;
			if (sc.hasNextInt()) {

				try {
					int choice = sc.nextInt();
					sc.nextLine();
					choice--;
					value.append(Class.forName("by.epam.jo_04_02_05.bean." + className).getEnumConstants()[choice]
							.toString());
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("�������� �� ������������ ��������");
					flag = true;
				}
			}
		} while (flag);
		
		return value;
	}

	
	public void print(List<Voucher> list) {
		for (Voucher v : list) {
			System.out.println(v);
		}
	}
}
