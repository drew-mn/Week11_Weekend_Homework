import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void before(){
        plane = new Plane("KLM", PlaneModel.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneModel.BOEING747, plane.getPlaneModel());
    }

    @Test
    public void hasAirline(){
        assertEquals("KLM", plane.hasAirline());
    }


    @Test
    public void getTotalWeight(){
        assertEquals(100, plane.getTotalWeight());
    }


}