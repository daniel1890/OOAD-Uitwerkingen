public class ClosedDoor extends DoorState {
    public ClosedDoor(Door door) {
        super(door);
    }

    @Override
    public void openDoor() {
        door.changeState(new OpeningDoor(door));
        System.out.println("State: closed - Opening");
    }

    @Override
    public void closeDoor() {

    }

    @Override
    public boolean buttonClicked() {
        return false;
    }
}
