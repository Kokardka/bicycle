package pl.wsis.java;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Bicycle bicycle = new Bicycle() {
        };

        MountainBike mountainBike = new MountainBike() {
        };

        RacingBike racingBike = new RacingBike() {
        };

        Downhill downhill = new Downhill();
        Trial trial = new Trial();

        TriathlonBicycle triathlonBicycle = new TriathlonBicycle();
        RoadBicycle roadBicycle = new RoadBicycle();

        // presentation of the program:
        System.out.println("___________________________________________________________________________");
        System.out.println("This program contain informations about bicycle and some " +
                "bicycle models.");
        System.out.println("       ,_o");
        System.out.println("      _ Y<");
        System.out.println(".....(_)'(_)");
        System.out.println("___________________________________________________________________________");

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about bicycle:
        System.out.println("Informations about bicycle:");
        System.out.println("How many wheels, handlebars and pedals bicycle have?");
        System.out.println("wheels: " + bicycle.getHaveTwoWheels());
        System.out.println("handlebar: " + bicycle.getHaveHandlebars());
        System.out.println("pedals: " + bicycle.getHavePedals());
        System.out.println("and " + bicycle.ride());
        System.out.println(bicycle.brakes());

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about mountain bike:
        System.out.println("Informations about mountain bike:");
        System.out.println("Is there any specific design that mountain bike have?");
        System.out.println("Mountain bike is " + mountainBike.specificDesign + ".");
        System.out.println(mountainBike.offRoadCycling());
        System.out.println(mountainBike.ride());
        System.out.println(mountainBike.brakes());

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about downhill bike:
        System.out.println("Informations about downhill bike:");
        System.out.println("This bike have " + downhill.getA());
        System.out.println("and " + downhill.getB());
        System.out.println(downhill.offRoadCycling());
        downhill.rideDownhill();

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about trail bike:
        System.out.println("Informations about trial bike:");
        System.out.println("This bike is good for singletracks?"+ "\n" + trial.singletracks);
        trial.climbTheHill();

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about racing bike:
        System.out.println("Informations about racing bike:");
        System.out.println(racingBike.ride());
        System.out.println(racingBike.onRoadCycling());
        System.out.println(racingBike.brakes());

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about triathlon bicycle:
        System.out.println("Informations about triathlon bicycle:");
        triathlonBicycle.racing();
        System.out.println(triathlonBicycle.cyclingCompetition);
        System.out.println(triathlonBicycle.aerodynamicPosture);

        java.util.concurrent.TimeUnit.SECONDS.sleep(4);
        System.out.println();

        // Informations about road bicycle:
        System.out.println("Informations about road bike:");
        System.out.println("Is this bike good for all families?");
        System.out.println(roadBicycle.bikeForFamily);
        System.out.println("Is this bike good for cycling on roads?");
        System.out.println(roadBicycle.onRoadCycling());

    }
}