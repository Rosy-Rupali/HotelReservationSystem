/************************************************************
 * Purpose Test cases for Hotel Reservation System
 * @author Rosy Rupali
 * @Version 1.0
 * @since 26-06-2021
 *
 ************************************************************/
package javapractice.hotelreservationsystem;
import model.*;
import service.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;

public class HotelReservationTest {

	ArrayList<Hotel> hotelList = new ArrayList<>();
	HotelReservation hotelReservation = null;

	@Before
	public void setup() {
		hotelReservation = new HotelReservation();
	}

	@Test
	public void givenHotelDetails_whenAddedForHotel_Should_returnEnteredName() {

		Hotel newHotel = hotelReservation.addHotel("Lakewood", 110 , 90);
		assertEquals(newHotel.getHotelName(), "Lakewood");
	}

	@Test
	public void givenHotelDetails_whenAddedForHotel_Should_returnEnteredWeekDayRate() {

		Hotel newHotel = hotelReservation.addHotel("Lakewood", 110 , 90);
		assertEquals(newHotel.getWeekDayRate(), 110);
	}

	   @Test
	    public void givenDateRange_WhenAddedForHotel_ShouldReturnCheapestHotelName() {
	        hotelList.add(hotelReservation.addHotel("Lakewood" , 110 , 90 ));
	        hotelList.add(hotelReservation.addHotel("Bridgewood" , 150 , 50 ));
	        hotelList.add(hotelReservation.addHotel("Ridgewood" , 220 , 150 ));
	        Result cheapestHotel = hotelReservation.findCheapestHotel(hotelList,"10092020" , "12092020");
	        assertEquals("Lakewood" , cheapestHotel.getHotelName());

	    }

	    @Test
	    public void givenDateRange_WhenAddedForHotel_ShouldReturnCheapestHotelRate() {
	        
	        hotelList.add(hotelReservation.addHotel("Lakewood" , 110 , 90));
	        hotelList.add(hotelReservation.addHotel("Bridgewood"  , 150 , 50));
	        hotelList.add(hotelReservation.addHotel("Ridgewood"  , 220 , 150 ));
	        Result cheapestHotel = hotelReservation.findCheapestHotel(hotelList,"10092020" , "14092020");
	        assertEquals(110*4 , cheapestHotel.getTotalCost());

	    }
	    @Test
	    public void givenHotelDetails_WhenAddedForHotel_ShoulReturnEnteredWeekendRate() {
	        Hotel firstHotel = hotelReservation.addHotel("Lakewood", 110 , 90 );
	        Hotel secondHotel = hotelReservation.addHotel("Bridgewood", 150 , 50 );
	        Hotel thirdHotel = hotelReservation.addHotel("Ridgewood" , 220 , 150 );
	        assertEquals(50 , secondHotel.getWeekendRate());
	    }
}