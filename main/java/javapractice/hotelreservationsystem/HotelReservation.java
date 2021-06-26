/************************************************************
 * Purpose Hotel Reservation System
 * @author Rosy Rupali
 * @Version 1.0
 * @since 26-06-2021
 *
 ************************************************************/
package javapractice.hotelreservationsystem;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Hotel> hotelList = new ArrayList<>();
	
	/**
	 *This method is taking input from user about the hotel name and price 
	 */
	public static void addHotel() {
		System.out.println("Add a hotel:");
        System.out.println("Enter Hotel Name:");
        String hotelName=scanner.nextLine();
        
        System.out.println("Enter rate for regular customer");
        double regularCustomerRate=scanner.nextDouble();
        
		Hotel hotel=new Hotel(hotelName,regularCustomerRate);
		hotelList.add(hotel);
		System.out.println("Do You Want to add More hotel(Y/N)");
		char choice=scanner.next().charAt(0);
		if(choice != 'Y' || choice != 'y') {
			System.exit(0);
	}
	
    }

	public static void getCheapestHotel() {
		Date startDate=null;
		Date endDate=null;
		System.out.println("Enter Start Date in ddMMMYYYY");
		String start=scanner.next();
		System.out.println("Enter end date in ddMMMYYYY");
		String end=scanner.next();
		try {
			startDate = (Date) new SimpleDateFormat("ddMMMyyyy").parse(start);
			endDate = (Date) new SimpleDateFormat("ddMMMyyyy").parse(end); 
			}
		catch (ParseException e) 
		{
			e.printStackTrace();
		} 
		long numberOfDays = (endDate.getTime()- startDate.getTime())/1000/60/60/24;
		double minCost = hotelList.get(0).getRegularCustomerRate();
		String cheapestHotelName = hotelList.get(0).getHotelName();
		for(int i = 1; i < hotelList.size(); i++) 
			if(hotelList.get(i).getRegularCustomerRate()< minCost) {
				minCost = hotelList.get(i).getRegularCustomerRate();
				cheapestHotelName = hotelList.get(i).getHotelName();
			}
		System.out.println(cheapestHotelName+" ,Total Cost: "+minCost*numberOfDays);
	}
	
	public static void main(String args[]) {
		addHotel();
        System.out.println("Enter dates for finding cheapest hotel");
        getCheapestHotel();
        System.out.println(hotelList);
	}

}
