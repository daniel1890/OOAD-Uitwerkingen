public class AdventureQuest {
    public static void main (String[] args) {
        Spel spel = new Spel();
        spel.meldAan("Bob");
        spel.meldAan("Rosie");
        spel.teleporteer("Bob",17);
        spel.teleporteer("Rosie",33);
        spel.wisselVakje("Bob", 33);
    }
}