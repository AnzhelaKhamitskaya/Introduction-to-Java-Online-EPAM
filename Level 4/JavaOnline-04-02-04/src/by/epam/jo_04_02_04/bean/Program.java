/*
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета.
 */
package by.epam.jo_04_02_04.bean;

import java.util.ArrayList;
import java.util.List;
import by.epam.jo_04_02_04.bean.BankClient.BankAccount;
import by.epam.jo_04_02_04.logic.BankLogic;

public class Program {

	public static void main(String[] args) {

		List<BankClient> clients = new ArrayList<>();
		BankClient bc1 = new BankClient("Манойленко Анжела Юрьевна", TypeClient.INDIVIDUAL);
		bc1.addBankAccount("200002010001", Currency.BYN, "2020-11-01");
		bc1.addBankAccount("300002010002", Currency.USD, "2020-11-15");
		bc1.getAccounts().get(0).setBalance(10000);
		bc1.getAccounts().get(1).setBalance(1000);
		clients.add(bc1);
		BankClient bc2 = new BankClient("Хомицкий Игорь Викторович", TypeClient.INDIVIDUAL_ENTREPRENEUR);
		bc2.addBankAccount("200002010003", Currency.BYN, "2020-11-15");
		bc2.addBankAccount("300002010004", Currency.USD, "2020-11-26");
		bc2.getAccounts().get(0).setBalance(5000);
		bc2.getAccounts().get(1).setBalance(-3000);
		clients.add(bc2);
		BankClient bc3 = new BankClient("ООО \"Юдик\"", TypeClient.ENTITY);
		bc3.addBankAccount("200002010005", Currency.BYN, "2020-11-26");
		bc3.addBankAccount("300002010006", Currency.USD, "2020-11-30");
		bc3.getAccounts().get(0).setBalance(5000);
		bc3.getAccounts().get(1).setBalance(-3000);
		clients.add(bc3);

		BankLogic logic = new BankLogic();

		List<BankAccount> list = logic.getAllBankAccountBy(Currency.USD, clients);
		for (BankAccount ba : list) {
			System.out.println(ba.getInfoAboutAccount());
		}

		List<BankAccount> list1 = logic.getAllBankAccountByPeriod("2020-10-06", "2020-11-14", clients);
		for (BankAccount ba : list1) {
			System.out.println(ba.getInfoAboutAccount());
		}

		List<BankClient> list2 = logic.getAllBankClientBy(TypeClient.INDIVIDUAL, clients);
		for (BankClient bc : list2) {
			System.out.println(bc);
		}

		List<BankClient> list3 = logic.getAllBankClientWithNegativeBalance(clients);
		for (BankClient bc : list3) {
			System.out.println(bc);
		}

		List<BankAccount> list4 = logic.sortByBalance(clients);
		for (BankAccount ba : list4) {
			System.out.println(ba.getInfoAboutAccount());
		}
		
		List<BankClient> list5 = logic.sortByFullName(clients);
		for (BankClient bc : list5) {
			System.out.println(bc);
		}
		
		for (BankClient bc : clients) {
			System.out.println(bc.getFullName());
			System.out.println(logic.getAmountsOnCustomerAccounts(bc));
		}
		
		System.out.println(logic.getPositiveBalance(clients));
		System.out.println(logic.getNegativeBalance(clients));
	}
}
