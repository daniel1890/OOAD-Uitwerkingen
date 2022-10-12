public class OpeningDoor extends DoorState {

    public OpeningDoor(Door door) {
        super(door);
    }

    @Override
    public void openDoor() {
        door.changeState(new OpenedDoor(door));
        System.out.println("State: opening - Open");
    }

    @Override
    public void closeDoor() {
        door.changeState(new ClosingDoor(door));
        System.out.println("State: opening - Closing");
    }

    @Override
    public boolean buttonClicked() {
        return false;
    }
}
