// ������� ������ ������ �����������, ��������� ������ �������, �����, �����. ������: ������� �� �������
// �������, ���������� ��������, �������, ��������� ������. 
package by.epam.jo_04_02_03.bean;

import java.util.ArrayList;
import java.util.List;

import by.epam.jo_04_02_03.view.View;

public class Program {

	public static void main(String[] args) {
				
		List <Town> townsLoevskiyDistrict = new ArrayList<>();
		townsLoevskiyDistrict.add(new Town("����", 1060));
		townsLoevskiyDistrict.add(new Town("���������", 100));
		townsLoevskiyDistrict.add(new Town("���������", 100));
		townsLoevskiyDistrict.add(new Town("���������", 107));
		townsLoevskiyDistrict.add(new Town("��������", 100));
		townsLoevskiyDistrict.add(new Town("�������", 100));

	    List <District> districtsGomelRegion = new ArrayList<>();
	    districtsGomelRegion.add(new District("����������", "������"));
	    districtsGomelRegion.add(new District("��������", "����", townsLoevskiyDistrict, 1567));
	    districtsGomelRegion.add(new District("��������", "������"));
	    districtsGomelRegion.add(new District("����������", "������"));
	    districtsGomelRegion.add(new District("����������", "������"));
	    
	    List <Region> regions = new ArrayList<>();
	    regions.add(new Region("����������", "������", districtsGomelRegion, 40372));
	    regions.add(new Region("����������", "������"));
	    regions.add(new Region("���������", "�������"));
	    regions.add(new Region("�����������", "������"));
	    regions.add(new Region("���������", "�����"));
	    regions.add(new Region("�������", "�����"));

		State state1 = new State("��������", "�����", regions, 207600);

	    System.out.println(state1.getCapital());	
	    System.out.println(state1.getRegions().size());	
	    System.out.println(state1.getSquare());	// ������� ������
	    System.out.println(regions.get(0).getSquare());	// ������� ���������� �������
	    System.out.println(districtsGomelRegion.get(1).getSquare());	// ������� ��������� ������
	    View.getSquareEveryTown(districtsGomelRegion.get(1)); // ������� ������� ����������� ������ � �������� ������
	    System.out.println(townsLoevskiyDistrict.get(0).getSquare());	// ������� �����
	}
}
