public enum PlaneModel {
    BOEING747(20, 100),
    BOEING737(30, 100),
    Boeing787(40, 150),
    AirbusA320(20, 220),
    AirbusA380(10, 200);

    private final int seatsAvailable;
    private final int totalWeight;


    PlaneModel(int capacity, int totalWeight){
        this.seatsAvailable = capacity;
        this.totalWeight = totalWeight;
    }

    public int seatsAvailable(){
        return seatsAvailable;
    }

    public int getTotalWeight(){
        return totalWeight;
    }

}

