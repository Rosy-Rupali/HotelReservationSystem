package javapractice.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	static Scanner sc=new Scanner(System.in);
	private static List<Hotel> hotelList=new ArrayList<>();
	public static void addHotel()
	{
		while(true) {
		System.out.println("Add a hotel:");
        System.out.println("Enter Hotel Name:");
        String hotelName=sc.nextLine();
        System.out.println("Enter rate for regular customer");
        int regularCustomerRate=sc.nextInt();
		Hotel hotel=new Hotel(hotelName,regularCustomerRate);
		hotelList.add(hotel);
		System.out.println("Do You Want to add More hotel(Y/N)");
		char choice=sc.next().charAt(0);
		if(choice != 'Y' || choice != 'y')
			break;
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Hotel Reservation System");
        addHotel();
    }

}
