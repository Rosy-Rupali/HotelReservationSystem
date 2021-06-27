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
	private int weekDayRate;
	private String typeOfCustomer;
	private int costWeekDay;
	
	public Hotel(String hotelName, int weekDayRate) {
		this.hotelName = hotelName;
		this.weekDayRate = weekDayRate;
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
