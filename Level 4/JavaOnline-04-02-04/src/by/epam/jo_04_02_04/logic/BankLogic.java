/* Реализовать поиск и сортировку счетов. 
 * Вычисление общей суммы по счетам. 
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно
 */
package by.epam.jo_04_02_04.logic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.jo_04_02_04.bean.BankClient;
import by.epam.jo_04_02_04.bean.BankClient.BankAccount;
import by.epam.jo_04_02_04.bean.Currency;
import by.epam.jo_04_02_04.bean.TypeClient;

public class BankLogic {

	public List<BankAccount> getAllBankAccountBy(Currency currency, List<BankClient> clients){
		List<BankAccount> list = new ArrayList<>();
		for(BankClient bc : clients) {
			bc.getAccounts().stream().filter(ba -> ba.getCurrency().equals(currency)).forEach(ba -> list.add(ba));
		}
		return list;
	}
	
	
	public List<BankAccount> getAllBankAccountByPeriod(String dateFrom, String dateTo, List<BankClient> clients){
		List<BankAccount> list = new ArrayList<>();
		for(BankClient bc : clients) {
			bc.getAccounts().stream().filter(ba -> 
			ba.getAgreementDate().isAfter(LocalDate.parse(dateFrom).minusDays(1))
			&& ba.getAgreementDate().isBefore(LocalDate.parse(dateTo).plusDays(1)))
			.forEach(ba -> list.add(ba));
		}
		return list;
	}
	
	public List<BankClient> getAllBankClientBy(TypeClient typeClient, List<BankClient> clients){
		List<BankClient> list = new ArrayList<>();
		for(BankClient bc : clients) {
			if(bc.getType().equals(typeClient)) {
				list.add(bc);
			}
		}
		return list;
	}
	
	public List<BankClient> getAllBankClientWithNegativeBalance(List<BankClient> clients) {
		List<BankClient> list = new ArrayList<>();

		for (int i = 0; i < clients.size(); i++) {
			for (int j = 0; j < clients.get(i).getAccounts().size(); j++) {
				if(clients.get(i).getAccounts().get(j).getBalance().compareTo(BigDecimal.valueOf(0)) < 0) {
					list.add(clients.get(i));
					break;
				}
			}
		}
		return list;
	}
	
	public List<BankAccount> sortByBalance(List<BankClient> clients) {
		List<BankAccount> list = new ArrayList<>();
		for (int i = 0; i < clients.size(); i++) {
			for(BankAccount ba : clients.get(i).getAccounts()) {
				list.add(ba);
			}
		}
		
		Collections.sort(list, new Comparator<BankAccount>(){
			public int compare (BankAccount ba1, BankAccount ba2) {
				return ba1.getBalance().compareTo(ba2.getBalance());
			}
		});	
		
		return list;
	}
	
	public List<BankClient> sortByFullName(List<BankClient> clients) {
		List<BankClient> list = new ArrayList<>();
		list.addAll(clients);
		
		Collections.sort(list, new Comparator<BankClient>(){
			public int compare (BankClient bc1, BankClient bc2) {
				return bc1.getFullName().compareTo(bc2.getFullName());
			}
		});	
		
		return list;
	}
	
	public StringBuilder getAmountsOnCustomerAccounts(BankClient client) {
		StringBuilder str = new StringBuilder();
		BigDecimal sumBYN = new BigDecimal(0);
		BigDecimal sumUSD = new BigDecimal(0);
		BigDecimal sumEUR = new BigDecimal(0);
		for (BankAccount ba : client.getAccounts()) {
			if (ba.getCurrency() == Currency.BYN) {
				sumBYN = sumBYN.add(ba.getBalance());
			}
			if (ba.getCurrency() == Currency.EUR) {
				sumEUR = sumEUR.add(ba.getBalance());
			}
			if (ba.getCurrency() == Currency.USD) {
				sumUSD = sumUSD.add(ba.getBalance());
			}
		}
		str.append(sumBYN.toString()).append(" " + Currency.BYN + " ").append(sumEUR.toString())
				.append(" " + Currency.EUR + " ").append(sumUSD.toString()).append(" " + Currency.USD + " ");
		return str;
	}
	
	public StringBuilder getPositiveBalance(List <BankClient> clients) {
		StringBuilder str = new StringBuilder();
		BigDecimal sumBYN = new BigDecimal(0);
		BigDecimal sumUSD = new BigDecimal(0);
		BigDecimal sumEUR = new BigDecimal(0);
		for (BankClient bc : clients) {
			for (BankAccount ba : bc.getAccounts()) {
				if (ba.getBalance().compareTo(BigDecimal.valueOf(0)) >= 0) {
					if (ba.getCurrency() == Currency.BYN) {
						sumBYN = sumBYN.add(ba.getBalance());
					}
					if (ba.getCurrency() == Currency.EUR) {
						sumEUR = sumEUR.add(ba.getBalance());
					}
					if (ba.getCurrency() == Currency.USD) {
						sumUSD = sumUSD.add(ba.getBalance());
					}
				}
			}
		}
		str.append(sumBYN.toString()).append(" " + Currency.BYN + " ").append(sumEUR.toString())
				.append(" " + Currency.EUR + " ").append(sumUSD.toString()).append(" " + Currency.USD + " ");
		return str;
	}
	
	public StringBuilder getNegativeBalance(List <BankClient> clients) {
		StringBuilder str = new StringBuilder();
		BigDecimal sumBYN = new BigDecimal(0);
		BigDecimal sumUSD = new BigDecimal(0);
		BigDecimal sumEUR = new BigDecimal(0);
		for (BankClient bc : clients) {
			for (BankAccount ba : bc.getAccounts()) {
				if (ba.getBalance().compareTo(BigDecimal.valueOf(0)) < 0) {
					if (ba.getCurrency() == Currency.BYN) {
						sumBYN = sumBYN.add(ba.getBalance());
					}
					if (ba.getCurrency() == Currency.EUR) {
						sumEUR = sumEUR.add(ba.getBalance());
					}
					if (ba.getCurrency() == Currency.USD) {
						sumUSD = sumUSD.add(ba.getBalance());
					}
				}
			}
		}
		str.append(sumBYN.toString()).append(" " + Currency.BYN + " ").append(sumEUR.toString())
				.append(" " + Currency.EUR + " ").append(sumUSD.toString()).append(" " + Currency.USD + " ");
		return str;
	}
}

