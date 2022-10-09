public class AdventureQuest {
    public static void main (String[] args) {
        Spel spel = new Spel();
        spel.meldAan("Bob");
        spel.meldAan("Rosie");
        spel.teleporteer("Bob",17);
        spel.teleporteer("Rosie",33);
        spel.wisselVakje("Bob", 33);
        spel.teleporteer("Bob", 18);

        // Print originele vervoermiddelen van karakters
        System.out.println("Bob's vervoermiddel: " + spel.getKarakter("Bob").getVervoermiddel().toString());
        System.out.println("Rosie's vervoermiddel: " + spel.getKarakter("Rosie").getVervoermiddel().toString());

        // Ruilen slaagt omdat karakters naast elkaar staan
        spel.ruilVervoermiddel("Bob", "Rosie");

        System.out.println("Bob's vervoermiddel: " + spel.getKarakter("Bob").getVervoermiddel().toString());
        System.out.println("Rosie's vervoermiddel: " + spel.getKarakter("Rosie").getVervoermiddel().toString());

        spel.teleporteer("Bob", 1);

        // Ruilen faalt omdat karakters niet naast elkaar staan
        spel.ruilVervoermiddel("Bob", "Rosie");

        System.out.println("Bob's vervoermiddel: " + spel.getKarakter("Bob").getVervoermiddel().toString());
        System.out.println("Rosie's vervoermiddel: " + spel.getKarakter("Rosie").getVervoermiddel().toString());

    }
}