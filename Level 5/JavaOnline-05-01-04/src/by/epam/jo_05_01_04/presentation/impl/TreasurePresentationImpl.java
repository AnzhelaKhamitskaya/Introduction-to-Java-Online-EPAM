package by.epam.jo_05_01_04.presentation.impl;

import java.util.Scanner;

import by.epam.jo_05_01_04.presentation.TreasurePresentation;

public class TreasurePresentationImpl implements TreasurePresentation{
	
	@Override
	public String mainMenu() {
		Scanner scanner = new Scanner(System.in);
		String request = null;
		String amount = null;
		int choice = 0;
		boolean flag = true;
		
		System.out.print("� ������ ������� ���� ���������. ��� �� ������� ������� � ����?\n\n1 - ���������� ��� ���������\n2 - ���������� ������ ����� ������� ���������\n3 - ������� ��������� �� ������������ �����\n4 - ������\n\n��� ����� ");
		
		while(flag) {
			if(scanner.hasNextInt()) {
				choice = scanner.nextInt();	
					
				if(choice > 0 && choice < 5) {
					System.out.print("\n");
					flag = false;
				}else {
					System.out.print("\n�������� ���� �� ������������ ������� ����\n\n");
				}
			}else {

				System.out.print("\n�������� ���� �� ������������ ������� ����\n\n");
			}
		}
		
		switch(choice) {
		case 1: request = "GetAll";
				break;
		case 2: request = "FindTheMostExpensive";
				break;
		case 3:	
				amount = sub3Menu(scanner);
				request = "CollectForThe ".concat(amount);
				break;
		case 4:	
				request = "Exit";
				scanner.close();
				break;
		}
		
		return request;
	}

	private String sub3Menu(Scanner scanner) {
		
		int sum = 0;
		boolean flag = true;

		System.out.print("������� �������� ����� ");
		
		while (flag) {
			if (scanner.hasNextInt()) {
				sum = scanner.nextInt();
				System.out.print("\n");
				flag = false;
			}else {
				scanner.nextLine();
				System.out.print("\n������� �������� ����� ");
			}	
		}
		
		return String.valueOf(sum);
	}	
		
	@Override
	public void print(String response) {
		
		if(response.compareTo("������ �������� �� ����� ������ 10 �� ����� ���� �����������") == 0) {
			System.out.printf(response);	
			return;
		}
		
		System.out.printf("%-12s %-12s %-12s\n===============================\n", "TREASURE", "NAME", "PRICE");
		
		String str = new String(response);
		
		String[] list;
		int counter = 0;		

		str = str.replace("[", "").replace("]", "").replace("Treasure ", "").replace("id=", "").replace("name=", "").replace("price=", "");
		
		list = str.split(", ");
		
		for(String element : list) {
			System.out.printf("%-12s", element);	
			System.out.print(" ");
			
			counter++;
			if (counter == 3) {
				counter = 0;
				System.out.print("\n");
			}
		}
		
		System.out.print("\n\n\n");
	}

}
