package pl.wsis.java;

public abstract class RacingBike extends Bicycle {

    // attribute:
    public String haveMoreSpeed = "racing speed";

    // methods:
    public String ride() {
        return "Cycling on a racing bike is faster than cycling on a mountain bike.";
    }

    public boolean onRoadCycling() {
        if (haveMoreSpeed.equals("racing speed")) {
        }
        System.out.println("Does this bike is ok on roads?");
        return true;
    }

    @Override
    public String brakes() {
        return "It is very important to have good brakes with this speed.";
    }
}
