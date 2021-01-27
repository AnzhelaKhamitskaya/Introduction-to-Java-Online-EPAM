package by.epam.jo_04_02_05.logic;


import java.math.BigDecimal;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import by.epam.jo_04_02_05.bean.SamplingParameter;
import by.epam.jo_04_02_05.bean.SortingParameter;
import by.epam.jo_04_02_05.bean.TravelAgency;
import by.epam.jo_04_02_05.bean.TravelAgency.Voucher;

public class TravelAgencyLogic {

	public static List<Voucher> getListAllTour(List<Voucher> vouchers) {
		List<Voucher> list = new ArrayList<Voucher>(vouchers);
		return list;
	}

	public static List<Voucher> getListTourBySemplingParameter(List<Voucher> vouchers, List<SamplingParameter> parameters) {
		
		List<Voucher> list =  new ArrayList<>(vouchers);
		List<Voucher> list_;
		
		for(SamplingParameter p : parameters) {
			switch (p) {
			case FOOD:
				list_ = list.stream().filter(voucher -> voucher.getFoodType().toString().equals(p.getParameter()))
						.collect(Collectors.toList());
				list = list_;
				break;
			case TRANSPORT:
				list_ = list.stream()
						.filter(voucher -> voucher.getTransportType().toString().equals(p.getParameter()))
						.collect(Collectors.toList());
				list = list_;
				break;
			case ACCOMODATION:
				list_ = list.stream()
						.filter(voucher -> voucher.getAccomodationType().toString().equals(p.getParameter()))
						.collect(Collectors.toList());
				list = list_;
				break;
			case TOUR:
				list_ = list.stream().filter(voucher -> voucher.getTourType().toString().equals(p.getParameter()))
						.collect(Collectors.toList());
				list = list_;
				break;
			}
		}

		return list;
	}

	public static List<Voucher> getListTourBySortingParameter(List<Voucher> vouchers, List<SortingParameter> parameters) {
		
		List<Voucher> list = new ArrayList<Voucher>(vouchers);

		for(SortingParameter p : parameters) {
			switch (p) {
			case PERIOD:
				Collections.sort(list, new Comparator<TravelAgency.Voucher>() {

					@Override
					public int compare(Voucher arg0, Voucher arg1) {

						if (parameters.indexOf(p) == 1) {
							BigDecimal dif = arg0.getPrice().subtract(arg1.getPrice());
							if (dif.compareTo(BigDecimal.valueOf(0)) != 0) {
								return dif.intValue();
							}

							return arg0.getFrom().compareTo(arg1.getFrom());
						}

						return arg0.getFrom().compareTo(arg1.getFrom());
					}
				});
				break;
			case PRICE:	
				Collections.sort(list, new Comparator<TravelAgency.Voucher>(){
					
					@Override
					public int compare(Voucher arg0, Voucher arg1) {
						
						if(parameters.indexOf(p)==1) {
							Period dif = Period.between(arg1.getFrom(), arg0.getFrom());
							if(dif.getDays() != 0) {
								return dif.getDays();
							}
							
							return arg0.getPrice().compareTo(arg1.getPrice());
						}
						
						return arg0.getPrice().compareTo(arg1.getPrice());
					}
				});
				break;
			}
		}

		return list;
	}
}
