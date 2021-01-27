package by.epam.jo_04_02_03.view;

import java.util.ArrayList;
import java.util.List;

import by.epam.jo_04_02_03.bean.District;
import by.epam.jo_04_02_03.bean.Region;
import by.epam.jo_04_02_03.bean.State;
import by.epam.jo_04_02_03.bean.Town;

public class View {

	public static double getSquare(Region region) {
		double square = 0;
		for (District district : region.getDistricts()) {
			square += getSquare(district);
		}
		return square;
	}

	public static double getSquare(District district) {
		double square = 0;
		for (Town town : district.getTowns()) {
			square += town.getSquare();
		}
		return square;
	}

	public static List<String> getRegionCenters(State state) {
		List<String> list = new ArrayList<String>();
		for (Region region : state.getRegions()) {
			list.add(region.getRegionCenter());
		}
		return list;
	}

	public static List<String> getDistrictCenters(Region region) {
		List<String> list = new ArrayList<String>();
		for (District district : region.getDistricts()) {
			list.add(district.getDistrictCenter());
		}
		return list;
	}

	public static void getSquareEveryTown(District district) {
		for (Town town : district.getTowns()) {
			System.out.println(town.getName() + " - " + town.getSquare());
		}
	}

}
