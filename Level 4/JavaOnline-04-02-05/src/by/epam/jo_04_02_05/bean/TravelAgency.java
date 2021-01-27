package by.epam.jo_04_02_05.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency implements Serializable {

	private static final long serialVersionUID = -2899453681129094843L;
	private List<Voucher> vouchers;

	public TravelAgency() {
		this.vouchers = new ArrayList<>();
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void add(Voucher voucher) {
		this.vouchers.add(voucher);
	}

	public class Voucher{

		private String direction;
		private LocalDate from;
		private LocalDate to;
		private BigDecimal price;
		private TourType tourType;
		private FoodType foodType;
		private TransportType transportType;
		private AccomodationType accomodationType;

		public Voucher() {
			super();
		}

		public Voucher(String direction, LocalDate from, LocalDate to, BigDecimal price, TourType tourType,
				FoodType foodType, TransportType transportType, AccomodationType accomodationType) {
			this.setDirection(direction);
			this.setPeriod(from, to);
			this.setPrice(price);
			this.setTourType(tourType);
			this.setTransportType(transportType);
			this.setFoodType(foodType);
			this.setAccomodationType(accomodationType);
		}

		public String getDirection() {
			return direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public LocalDate getFrom() {
			return from;
		}
		
		public LocalDate getTo() {
			return to;
		}
		
		public int getPeriod() {
			return Period.between(from, to).getDays();
		}

		public void setPeriod(LocalDate from, LocalDate to) {
			this.from = from;
			this.to = to;
		}

		public TourType getTourType() {
			return tourType;
		}

		public void setTourType(TourType tourType) {
			this.tourType = tourType;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public FoodType getFoodType() {
			return foodType;
		}

		public void setFoodType(FoodType foodType) {
			this.foodType = foodType;
		}

		public TransportType getTransportType() {
			return transportType;
		}

		public void setTransportType(TransportType transportType) {
			this.transportType = transportType;
		}

		public AccomodationType getAccomodationType() {
			return accomodationType;
		}

		public void setAccomodationType(AccomodationType accomodationType) {
			this.accomodationType = accomodationType;		
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((accomodationType == null) ? 0 : accomodationType.hashCode());
			result = prime * result + ((direction == null) ? 0 : direction.hashCode());
			result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
			result = prime * result + ((from == null) ? 0 : from.hashCode());
			result = prime * result + ((price == null) ? 0 : price.hashCode());
			result = prime * result + ((to == null) ? 0 : to.hashCode());
			result = prime * result + ((tourType == null) ? 0 : tourType.hashCode());
			result = prime * result + ((transportType == null) ? 0 : transportType.hashCode());
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
			Voucher other = (Voucher) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (accomodationType != other.accomodationType)
				return false;
			if (direction == null) {
				if (other.direction != null)
					return false;
			} else if (!direction.equals(other.direction))
				return false;
			if (foodType != other.foodType)
				return false;
			if (from == null) {
				if (other.from != null)
					return false;
			} else if (!from.equals(other.from))
				return false;
			if (price == null) {
				if (other.price != null)
					return false;
			} else if (!price.equals(other.price))
				return false;
			if (to == null) {
				if (other.to != null)
					return false;
			} else if (!to.equals(other.to))
				return false;
			if (tourType != other.tourType)
				return false;
			if (transportType != other.transportType)
				return false;
			return true;
		}

		private TravelAgency getEnclosingInstance() {
			return TravelAgency.this;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + " [direction=" + direction + ", from=" + from + ", to=" + to + ", price=" + price
					+ ", tourType=" + tourType + ", foodType=" + foodType + ", transportType=" + transportType
					+ ", accomodationType=" + accomodationType + "]";
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " TravelAgency [vouchers=" + vouchers + "]";
	}
}

