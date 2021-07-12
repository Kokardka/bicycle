package pl.wsis.java;

public class Downhill extends MountainBike {

    // attributes:
    public String strongBicycleFrame = "strong bicycle frame";
    public String strongBikeSuspension = "strong bike suspension";

    // methods:
    public Downhill() {
    }

    public String getA() {
        return strongBicycleFrame;
    }

    public String getB() {
        return strongBikeSuspension;
    }

    public boolean offRoadCycling() {
        if (haveHandlebars == 1) {
        }
        System.out.println("This bike is the best on roads?");
        return false;
    }

    public String rideDownhill() {
        return strongBicycleFrame + " " + "is great for cycling down the hill.";
    }
}
