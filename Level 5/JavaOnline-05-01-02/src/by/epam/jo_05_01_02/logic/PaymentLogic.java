package by.epam.jo_05_01_02.logic;

import java.math.BigDecimal;

import by.epam.jo_05_01_02.bean.Payment;

public class PaymentLogic {
	
	public BigDecimal getTotalSum(Payment payment) {
		BigDecimal totalSum = BigDecimal.ZERO;
		for(Payment.Good good : payment.getGoods()) {
			totalSum = totalSum.add(good.getPrice().multiply(BigDecimal.valueOf(good.getQuontity())));
		}
		return totalSum;
	}
	
	public BigDecimal getOddSum(Payment payment, double cash) throws Exception {
		BigDecimal totalSum = getTotalSum(payment);
		if(BigDecimal.valueOf(cash).compareTo(totalSum) < 0) {
			throw new Exception("Недостаточно внесённой суммы для оплаты покупки");
		}
		BigDecimal oddSum = BigDecimal.valueOf(cash).subtract(totalSum);
		return oddSum;
	}
}
