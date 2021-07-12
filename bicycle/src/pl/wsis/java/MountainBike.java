package pl.wsis.java;

public abstract class MountainBike extends Bicycle {

    // attribute:
    public String specificDesign = "strong";

    // methods:
    public String ride() {
        return "Riding mountain bike is really wonderful.";
    }

    public boolean offRoadCycling() {
        if (haveHandlebars == 1) {
        }
        System.out.println("Mountain bike can't use brakes?");
        return false;
    }

    @Override
    public String brakes() {
        return "Remember to check your brakes before cycling.";
    }
}
