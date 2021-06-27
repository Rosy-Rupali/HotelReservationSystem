/************************************************************
 * Purpose POJO for Hotel Reservation System
 * @author Rosy Rupali
 * @Version 1.0
 * @since 26-06-2021
 *
 ************************************************************/
package model;

public class Hotel {
	private String hotelName;
	private String typeOfCustomer;
	private int weekDayRate;
	private int weekendRate;
	private int costWeekDay;

	public Hotel() {

	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}

	public Hotel(String hotelName, String typeOfCustomer, int weekDayRate, int weekendRate) {
		this.hotelName = hotelName;
		this.typeOfCustomer = typeOfCustomer;
		this.weekDayRate = weekDayRate;
		this.weekendRate = weekendRate;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getWeekDayRate() {
		return weekDayRate;
	}

	public void setWeekDayRate(int weekDayRate) {
		this.weekDayRate = weekDayRate;
	}

	public String getTypeOfCustomer() {
		return typeOfCustomer;
	}

	public void setTypeOfCustomer(String typeOfCustomer) {
		this.typeOfCustomer = typeOfCustomer;
	}

	public int getCostWeekDay() {
		return costWeekDay;
	}

	public void setCostWeekDay(int costWeekDay) {
		this.costWeekDay = costWeekDay;
	}

}
