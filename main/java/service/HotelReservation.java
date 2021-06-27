/************************************************************
 * Purpose Hotel Reservation System
 * @author Rosy Rupali
 * @Version 1.0
 * @since 26-06-2021
 *
 ************************************************************/
package service;
import model.*;
public class HotelReservation {
	
	/**
	 * This method is adding Hotel with name and rates for 
	 * regular customer
	 * @param hotelName : takes name of the hotel as first argument
	 * @param weekDayRate : takes week day rate of hotel as second argument
	 * @param weekendRate : takes weekend rate of hotel as third argument
	 * @return the hotel name, week day and weekend rates of the hotel
	 */
	public Hotel addHotel(String hotelName, int weekDayRate, int weekendRate) {
		return new Hotel(hotelName, weekDayRate, weekendRate);
	}
}
