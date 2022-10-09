import Vervoermiddelen.*;

public class Garage {
    public static Garage garage;

    public static IVervoermiddel verkrijgNieuwVervoermiddel(String vervoermiddel) {
        switch (vervoermiddel) {
            case "Auto" -> {
                return new Auto();
            }
            case "Scooter" -> {
                return new Scooter();
            }
            case "Step" -> {
                return new Step();
            }
            case "Fiets" -> {
                return new Fiets();
            }
        }

        return null;
    }
}
