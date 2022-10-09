public class AdventureQuest {
    public static void main (String[] args) {
        Spel spel = new Spel();
        spel.meldAan("Bob", "Fiets");
        spel.meldAan("Rosie", "Step");
        spel.teleporteer("Bob",17);
        spel.teleporteer("Rosie",33);
        spel.wisselVakje("Bob", 33);
        spel.teleporteer("Rosie", 34);

        // Slagende vervoermiddel switch
        spel.ruilVervoermiddel("Bob", "Rosie");

        // Falende vervoermiddel switch
        spel.teleporteer("Bob", 1);
        spel.ruilVervoermiddel("Rosie", "Bob");
    }
}