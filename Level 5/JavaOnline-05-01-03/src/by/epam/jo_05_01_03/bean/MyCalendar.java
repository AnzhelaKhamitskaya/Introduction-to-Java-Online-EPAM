package by.epam.jo_05_01_03.bean;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class MyCalendar implements Serializable {

	private static final long serialVersionUID = -7275488613577322481L;

	private List<DateNotes> dateNotes;
	private List<DateOff> dateOffs;

	public MyCalendar() {
		dateNotes = new ArrayList<>();
		dateOffs = new ArrayList<>();
	}

	public class DateOff{
		
		private int year;
		private  DayOfWeek dw;
		
		private DateOff(int year, DayOfWeek dw){
			this.year = year;
			this.dw = dw;		
		}
		
		public DayOfWeek getDw() {
			return dw;
		}

		public int getYear() {
			return year;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((dw == null) ? 0 : dw.hashCode());
			result = prime * result + year;
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
			DateOff other = (DateOff) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (dw != other.dw)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		private MyCalendar getEnclosingInstance() {
			return MyCalendar.this;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + " [year=" + year + ", dw=" + dw + "]";
		}

	}
	
	public class DateNotes {

		private String date;
		private String notes;

		public DateNotes(String date, String notes) {
			this.date = date;
			this.notes = notes;
		}

		public String getDate() {
			return date;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
			DateNotes other = (DateNotes) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (notes == null) {
				if (other.notes != null)
					return false;
			} else if (!notes.equals(other.notes))
				return false;
			return true;
		}

		private MyCalendar getEnclosingInstance() {
			return MyCalendar.this;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + " [date=" + date + ", notes=" + notes + "]";
		}
	}

	public List<DateNotes> getDateNotes() {
		return dateNotes;
	}

	public List<DateOff> getDayOffs() {
		return dateOffs;
	}

	public void addDateNotes(DateNotes dateNotes) {
		this.dateNotes.add(dateNotes);
	}

	public void addDayOffs(int year, DayOfWeek dayOff) {
		dateOffs.add(new DateOff(year, dayOff));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateNotes == null) ? 0 : dateNotes.hashCode());
		result = prime * result + ((dateOffs == null) ? 0 : dateOffs.hashCode());
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
		MyCalendar other = (MyCalendar) obj;
		if (dateNotes == null) {
			if (other.dateNotes != null)
				return false;
		} else if (!dateNotes.equals(other.dateNotes))
			return false;
		if (dateOffs == null) {
			if (other.dateOffs != null)
				return false;
		} else if (!dateOffs.equals(other.dateOffs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [dateNotes=" + dateNotes + ", dateOffs=" + dateOffs + "]";
	}
}
