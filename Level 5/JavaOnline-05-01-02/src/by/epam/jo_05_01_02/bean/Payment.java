package by.epam.jo_05_01_02.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Payment implements Serializable{

	private static final long serialVersionUID = -4615311496625589750L;
	
	private static int ID = 1;
	private int idPayment;
	private List<Good> goods;
	
	public Payment(List<Good> goods) {
		this.goods = goods;
		idPayment = ID++;
	}
	
	public Payment() {
		this(new ArrayList<>());
	}
	
	public List<Good> getGoods() {
		return goods;
	}

	public int getIdPayment() {
		return idPayment;
	}
	

	public void addGood(String name, double price, double quontity) {
		this.goods.add(new Good(name, price, quontity));
	}
	

	public static class Good implements Serializable{
		
		private static final long serialVersionUID = -1318606242337545225L;
		
		private String name;
		private BigDecimal price;
		private double quontity;
		
		public Good(String name, double price, double quontity) {
			this.name = name;
			this.price = BigDecimal.valueOf(price);
			this.quontity = quontity;
		}
		

		public String getName() {
			return name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public double getQuontity() {
			return quontity;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((price == null) ? 0 : price.hashCode());
			long temp;
			temp = Double.doubleToLongBits(quontity);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Good other = (Good) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price == null) {
				if (other.price != null)
					return false;
			} else if (!price.equals(other.price))
				return false;
			if (Double.doubleToLongBits(quontity) != Double.doubleToLongBits(other.quontity))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return getClass().getSimpleName() + " [name=" + name + ", price=" + price + ", quontity=" + quontity + "]";
		}		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods == null) ? 0 : goods.hashCode());
		result = prime * result + idPayment;
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
		Payment other = (Payment) obj;
		if (goods == null) {
			if (other.goods != null)
				return false;
		} else if (!goods.equals(other.goods))
			return false;
		if (idPayment != other.idPayment)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [idPayment=" + idPayment + ", goods=" + goods + "]";
	}


}
