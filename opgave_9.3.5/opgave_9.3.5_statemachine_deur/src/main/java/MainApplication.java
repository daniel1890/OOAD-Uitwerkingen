public class MainApplication {
    public static void main(String[] args) {
        Door door = new Door();

        door.getState().openDoor();
        door.getState().openDoor();
        door.getState().closeDoor();
        door.getState().closeDoor();
    }
}
