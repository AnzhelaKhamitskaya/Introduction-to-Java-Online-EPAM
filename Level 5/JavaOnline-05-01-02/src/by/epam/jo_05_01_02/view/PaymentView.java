package by.epam.jo_05_01_02.view;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import by.epam.jo_05_01_02.bean.Payment;

public class PaymentView {
	
	public void getBill(Payment payment, BigDecimal totalSum, BigDecimal oddSum, BigDecimal cash) {
		
		System.out.printf("=====================================\n%25s\n=====================================\n", "��� \"�������\"");
		System.out.printf(" ��� �%-5s%25s\n\n", payment.getIdPayment(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.mm.yyyy HH:mm:ss")));
		System.out.printf("=====================================\n %-15s%6s%7s%7s\n=====================================\n", "�����", "����", "���-��", "�����");
		for(Payment.Good good : payment.getGoods()) {
			System.out.printf(" %-15s%6.2f%7.2f%7.2f\n", good.getName(), good.getPrice(), good.getQuontity(), good.getPrice().multiply(BigDecimal.valueOf(good.getQuontity())));
		}
		System.out.printf("=====================================\n %s%17.2f ���.\n=====================================\n", "����� �����: ", totalSum);
		System.out.printf("=====================================\n %s%21.2f ���.\n=====================================\n", "�������: ", cash);
		System.out.printf("=====================================\n %s%23.2f ���.\n=====================================\n", "�����: ", oddSum);
		System.out.printf("=====================================\n%28s\n=====================================\n", "������� �� �������!");
		
	}
}
