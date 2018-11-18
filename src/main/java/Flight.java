import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private PlaneModel planeModel;
    private String destination;
    private String departure;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, PlaneModel planeModel, String destination, String departure, String departureTime) {
        this.flightNumber = flightNumber;
        this.planeModel = planeModel;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();

    }

    public int seatsAvailable() {
        return this.planeModel.seatsAvailable();
    }

    public String hasFlightNumber() {
        return this.flightNumber;
    }

    public PlaneModel hasPlane() {
        return this.planeModel;
    }


    public String hasDestination() {
        return this.destination;
    }

    public String hasDeparture() {
        return this.departure;
    }

    public String hasDepartureTime() {
        return this.departureTime;
    }

    public int hasNoPassengers() {
        return passengers.size();
    }

    public int passengerCount(Passenger passenger) {
        this.passengers.add(passenger);
        return passengers.size();
    }

    public int removePassengers(Passenger passenger) {
        this.passengers.remove(passenger);
        return passengers.size();
    }

    public int bookPassengers(Passenger passenger) {
        if (passengers.size() < this.planeModel.seatsAvailable()){
        for (int i = 0; i < 10; i++) this.passengers.add(passenger);
        }
        return passengers.size();
    }


}

