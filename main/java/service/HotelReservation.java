/************************************************************
 * Purpose Hotel Reservation System
 * @author Rosy Rupali
 * @Version 1.0
 * @since 26-06-2021
 *
 ************************************************************/
package service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;


import model.*;
public class HotelReservation {
	
	/**
	 * This method is adding Hotel with name and rates for 
	 * regular customer
	 * @param hotelName : takes name of the hotel as first argument
	 * @param weekDayRate : takes week day rate of hotel as second argument
	 * @return the hotel name, week day and weekend rates of the hotel
	 */
	public Hotel addHotel(String hotelName, int weekDayRate) {
		return new Hotel(hotelName, weekDayRate);
	}
	
	/**
	 * UC-2 This method is to find out the cheapest hotel in the week day rates
	 * 
	 * @param hotelList : first argument of method add hotels to the hotel list 
	 * @param startDate : second argument of method takes the check in date in hotel
	 * @param endDate : third argument of method takes the check out date in hotel
	 * @return : cheapest hotel
	 */
	public Result findCheapestHotel(ArrayList<Hotel> hotelList, String startDate, String endDate) {
		int daysInBetween = getDaysInBetween(startDate, endDate);
		Result cheapestHotel = getCheapestHotel(daysInBetween, hotelList);
		System.out.println("Hotel Name: "+cheapestHotel.getHotelName()+" Total Rate is: "+cheapestHotel.getTotalCost());
		return cheapestHotel;
	}

	/**
	 * This method is used to give us the rate and name of hotel for staying in week day
	 * @param daysInBetween : first argument of method 
	 * @param hotelList : second argument of method add hotels to the hotel list 
	 * @return : total cost and hotel name to stay for couple of days
	 */
	private static Result getCheapestHotel(int daysInBetween, ArrayList<Hotel> hotelList) {
		int currentHotelCost;
		for(Hotel currentHotel : hotelList) {
			currentHotelCost = daysInBetween*currentHotel.getWeekDayRate();
			currentHotel.setCostWeekDay(currentHotelCost);
		}
		Optional<Hotel> cheapestHotel = hotelList.stream().min(Comparator.comparing(Hotel::getCostWeekDay));
		Result result = new Result();
		result.setHotelName(cheapestHotel.get().getHotelName());
		result.setTotalCost(cheapestHotel.get().getCostWeekDay());
		return result;
	}

	/**
	 * This method is to calculate the days according to check in and checkout time
	 * @param startDate : first argument of method 
	 * @param endDate : second argument of method
	 * @return : total days for staying in hotel
	 */
	private static int getDaysInBetween(String startDate, String endDate) {
	SimpleDateFormat formatter	= new SimpleDateFormat("ddMMyyyy");
	Date startingDate = new Date();
	try {
		startingDate = formatter.parse(startDate);
	}catch(Exception e) {
		e.printStackTrace();
	}
	Date endingDate = new Date();
	try {
		endingDate = formatter.parse(endDate);
	}catch(Exception e) {
		e.printStackTrace();
	}
	long difference = endingDate.getTime() - startingDate.getTime();
	System.out.println(difference);
	int daysInBetween = (int)Math.ceil(difference/1000*60*60*24);
	return daysInBetween;
	}
}
