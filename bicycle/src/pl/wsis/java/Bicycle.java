package pl.wsis.java;

public abstract class Bicycle {

    // attributes:
    public int haveTwoWheels = 2;
    public int haveHandlebars = 1;
    public int havePedals = 2;

    // getters:
    public int getHaveTwoWheels() {
        return haveTwoWheels;
    }

    public int getHaveHandlebars() {
        return haveHandlebars;
    }

    public int getHavePedals() {
        return havePedals;
    }

    // methods:
    public String ride() {
        if (haveTwoWheels == 2) {
            return "can ride with two wheels";
        }
        if (haveHandlebars == 1) {
            return "can ride with handlebars";
        } else {
            return "can't ride without two wheels and without handlebars";
        }
    }

    public String brakes() {
        if (havePedals == 2) {
        }
        return "Each bike should have good brakes to brake well.";
    }
}