import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void beforeEach(){
        passenger = new Passenger("Drew", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Drew", passenger.getName() );
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger.getBags() );
    }

    @Test
    public void hasLuggageWeight(){
        double luggageWeight = passenger.getBags() * 20;
        assertEquals(40, luggageWeight, 0.01 );
    }

}

