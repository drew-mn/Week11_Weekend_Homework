import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    public FlightManager(Plane flight, Flight plane, Passenger passenger) {
        this.flight = flight;
        this.plane = plane;
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

}