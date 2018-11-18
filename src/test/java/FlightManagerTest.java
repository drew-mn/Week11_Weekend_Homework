import org.junit.Before;
import org.junit.Test;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1, passenger2, passenger3;


    @Before
    public void before(){
        plane = new Plane(PlaneModel.AirbusA380);
        flight = new Flight("AMS123",PlaneModel.AirbusA380,"Amsterdam", "Glasgow", "08:00");
        passenger1 = new Passenger("Drew", 2);
        passenger2 = new Passenger("Lauren", 0);
        passenger3 = new Passenger("Judith", 1);
        this.flightManager = new FlightManager(plane, flight, passenger1);
    }


}

//        calculate how much weight in baggage is booked by passengers for a flight
//        calculate how much overall weight reserved for baggage remains for a flight
//        calculate how much baggage weight should be reserved for each passenger for a flight