/*
 * ��������� �������� ������ ��� ������������� �������. ������������ ����������� ��������� ������� �
 * ��������� ��� ��������� ����� (���, ������, �������) � ��������� ������������ �������� ��������. � ������
 * ������������ �������� ����� ���� ��������������� � �������� 0. ������� ������ ��������� ������� ��
 * �������� ���������� �����, ����� � ������.
 */

package by.epam.jo_04_01_06.bean;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.temporal.ValueRange;

public class TimeController implements Serializable {

	private static final long serialVersionUID = -7363440255743953494L;

	private final ValueRange rangeOfHourValue = ValueRange.of(0, 23);
	private final ValueRange rangeOfMinuteOrSecodValue = ValueRange.of(0, 59);

	private int hour;
	private int minute;
	private int second;

	public TimeController() {
		this(LocalTime.now().getHour(), LocalTime.now().getMinute(), LocalTime.now().getSecond());
	}

	public TimeController(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setHour(int hour) {
		this.hour = rangeOfHourValue.isValidIntValue(hour) ? hour : 0;
	}

	public void setMinute(int minute) {
		this.minute = rangeOfMinuteOrSecodValue.isValidIntValue(minute) ? minute : 0;
	}

	public void setSecond(int second) {
		this.second = rangeOfMinuteOrSecodValue.isValidIntValue(second) ? second : 0;
	}

	private int getEquivalentCurrentTimeInSeconds() {
		return hour * 3600 + minute * 60 + second;
	}

	public void changeSecondsFor(int valueOfSeconds) {
		valueOfSeconds %= 86400;
		int EquivalentCurrentTimeInSeconds = getEquivalentCurrentTimeInSeconds();
		valueOfSeconds += EquivalentCurrentTimeInSeconds;
		valueOfSeconds = valueOfSeconds < 0 ? (86400 + valueOfSeconds) : valueOfSeconds;
		hour = valueOfSeconds / 3600;
		valueOfSeconds -= hour * 3600;
		minute = valueOfSeconds / 60;
		valueOfSeconds -= minute * 60;
		second = valueOfSeconds;
	}

	public void changeMinutesFor(int valueOfMinutes) {
		int valueOfSeconds = valueOfMinutes * 60;
		changeSecondsFor(valueOfSeconds);
	}

	public void changeHourFor(int valueOfHours) {
		int valueOfSeconds = valueOfHours * 3600;
		changeSecondsFor(valueOfSeconds);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + ((rangeOfHourValue == null) ? 0 : rangeOfHourValue.hashCode());
		result = prime * result + ((rangeOfMinuteOrSecodValue == null) ? 0 : rangeOfMinuteOrSecodValue.hashCode());
		result = prime * result + second;
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
		TimeController other = (TimeController) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (rangeOfHourValue == null) {
			if (other.rangeOfHourValue != null)
				return false;
		} else if (!rangeOfHourValue.equals(other.rangeOfHourValue))
			return false;
		if (rangeOfMinuteOrSecodValue == null) {
			if (other.rangeOfMinuteOrSecodValue != null)
				return false;
		} else if (!rangeOfMinuteOrSecodValue.equals(other.rangeOfMinuteOrSecodValue))
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [rangeOfHourValue=" + rangeOfHourValue
				+ ", rangeOfMinuteOrSecodValue=" + rangeOfMinuteOrSecodValue + ", hour=" + hour + ", minute=" + minute
				+ ", second=" + second + "]";
	}

	public static void main(String[] args) {

		TimeController tc1 = new TimeController();
		System.out.println(tc1);
		TimeController tc2 = new TimeController(23, 15, 18);
		System.out.println(tc2);
		tc2.setTime(24, 00, 00);
		System.out.println(tc2);
		tc2.setHour(5);
		System.out.println(tc2);
		tc2.setMinute(15);
		System.out.println(tc2);
		tc2.setSecond(30);
		System.out.println(tc2);
		tc2.setSecond(150);
		System.out.println(tc2);
		tc2.setTime(25, 60, 60);
		System.out.println(tc2);
		TimeController tc3 = new TimeController(0, 0, 0);
		tc3.changeSecondsFor(-86390);
		System.out.println(tc3);
		tc3.changeHourFor(50);
		System.out.println(tc3);
		tc3.changeHourFor(-50);
		System.out.println(tc3);
		tc3.changeMinutesFor(1);
		System.out.println(tc3);
		tc3.changeMinutesFor(-2);
		System.out.println(tc3);
	}

}
