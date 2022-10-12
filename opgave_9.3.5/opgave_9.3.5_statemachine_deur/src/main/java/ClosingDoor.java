public class ClosingDoor extends DoorState {

    public ClosingDoor(Door door) {
        super(door);
    }

    @Override
    public void openDoor() {
        door.changeState(new OpeningDoor(door));
        System.out.println("State: closing - Opening");
    }

    @Override
    public void closeDoor() {
        door.changeState(new ClosedDoor(door));
        System.out.println("State: closing - Closed");
    }

    @Override
    public boolean buttonClicked() {
        return false;
    }
}
