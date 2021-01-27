/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

package by.epam.jo_05_01_02.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import by.epam.jo_05_01_02.bean.Payment;
import by.epam.jo_05_01_02.bean.Payment.Good;
import by.epam.jo_05_01_02.logic.PaymentLogic;
import by.epam.jo_05_01_02.view.PaymentView;

public class Main {

	public static void main(String[] args) {
		
		Payment p1 = new Payment();
		
		p1.addGood("Молоко", 1.50, 2);
		p1.addGood("Хлеб", 2.80, 1);
		p1.addGood("Колбаса", 20.00, 0.500);
		
		PaymentLogic logic = new PaymentLogic();
		PaymentView view = new PaymentView();
		
		double cash = 100.00;
		
		try {
			view.getBill(p1, logic.getTotalSum(p1), logic.getOddSum(p1, cash), BigDecimal.valueOf(cash));
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		System.out.print("\n\n\n\n\n\n\n\n");
		
		List<Good> goods = new ArrayList<>();
		goods.add(new Good("Сникерс", 2.4, 1));
		goods.add(new Good("Кока-кола", 3.5, 1));
		
		Payment p2 = new Payment(goods);
		
		double cash2 = 100.00;
		
		try {
			view.getBill(p2, logic.getTotalSum(p2), logic.getOddSum(p2, cash2), BigDecimal.valueOf(cash2));
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}


	}
}
