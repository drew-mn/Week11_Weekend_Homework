public class Plane {

    private PlaneModel planeModel;
    private String airLine;

    public Plane(String airLine, PlaneModel planeModel){
        this.airLine = airLine;
        this.planeModel = planeModel;
    }


    public PlaneModel getPlaneModel() {
        return planeModel;
    }

    public String hasAirline() {
        return airLine;
    }


    public int getTotalWeight() {
        return this.planeModel.getTotalWeight();
    }
}