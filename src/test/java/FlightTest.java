import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @Before
    public void before(){
        flight = new Flight("AMS123",PlaneModel.AirbusA380,"Amsterdam", "Glasgow", "08:00");
    }


    @Test
    public void hasAvailableSeats(){
        assertEquals(10, flight.seatsAvailable());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("AMS123", flight.hasFlightNumber());
    }

    @Test
    public void flightHasPlaneType(){
        assertEquals(PlaneModel.AirbusA380, flight.hasPlane());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Amsterdam", flight.hasDestination());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals("Glasgow", flight.hasDeparture());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("08:00", flight.hasDepartureTime());
    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0, flight.hasNoPassengers());
    }
    @Test
    public void canAddPassengers(){
        assertEquals(1, flight.passengerCount(passenger));
    }

    @Test
    public void canRemovePassengers(){
        flight.passengerCount(passenger);
        flight.removePassengers(passenger);
        assertEquals(0, flight.removePassengers(passenger));
    }

    @Test
    public void canBookPassengers(){
        flight.hasNoPassengers();
        assertEquals(10, flight.bookPassengers(passenger));
    }

}
