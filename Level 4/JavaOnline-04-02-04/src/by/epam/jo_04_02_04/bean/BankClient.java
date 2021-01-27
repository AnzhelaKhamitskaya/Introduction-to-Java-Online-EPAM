package by.epam.jo_04_02_04.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankClient implements Serializable {
	
	private static final long serialVersionUID = -3493204022851939908L;	
	
	private String fullName;
	private List <BankClient.BankAccount> accounts;
	private TypeClient type;
	
	public BankClient(String fullName, TypeClient type){
		this.fullName = fullName;
		this.type = type;
		accounts = new ArrayList<>();
	}
		
	public class BankAccount {
		
		private StringBuilder number;
		private LocalDate agreementDate;
		private BigDecimal balance;
		private Currency currency;
		private boolean isBlocked;
			
		public BankAccount() {
			super();
		}
			
		public BankAccount(String number, Currency currency, String agreementDate) {
			this.number = new StringBuilder(number); 
			this.currency = currency; 
			this.balance = BigDecimal.valueOf(0);
			this.agreementDate = LocalDate.parse(agreementDate);
			this.isBlocked = false;
		}

		public StringBuilder getNumber() {
			StringBuilder number = new StringBuilder();
			number.append("BY06MMBN");
			number.append(type.getNumber());
			number.append(this.number);
			return number;
		}


		public LocalDate getAgreementDate() {
			return agreementDate;
		}

		public void setAgreementDate(LocalDate agreementDate) {
			this.agreementDate = agreementDate;
		}

		public BigDecimal getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			this.balance = BigDecimal.valueOf(balance);
		}

		public Currency getCurrency() {
			return currency;
		}

		public void setCurrency(Currency currency) {
			this.currency = currency;
		}

		public boolean isBlocked() {
			return isBlocked;
		}

		public void setBlocked(boolean isBlocked) {
			this.isBlocked = isBlocked;
		}
		
		public String getInfoAboutAccount() {			
			return getNumber() + " " + getFullName()  + " " + getType()  + " " + getAgreementDate().toString()  + " " + getCurrency()  + " " + getBalance();			
		}
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public List <BankAccount> getAccounts() {
		return accounts;
	}


	public TypeClient getType() {
		return type;
	}


	public void setType(TypeClient type) {
		this.type = type;
	}	
	
	public void addBankAccount(String number, Currency currency, String agreementDate) {
		accounts.add(new BankClient.BankAccount(number, currency, agreementDate));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankClient other = (BankClient) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(BankAccount ba : accounts) {
			str.append(ba.getNumber());
			str.append(", ");
		}
		return getClass().getSimpleName() + " [fullName=" + fullName + ", accounts=" + str + "type=" + type + "]";
	}
}
