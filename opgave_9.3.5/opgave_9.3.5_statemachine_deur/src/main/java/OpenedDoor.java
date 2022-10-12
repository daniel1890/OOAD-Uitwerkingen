public class OpenedDoor extends DoorState {

    public OpenedDoor(Door door) {
        super(door);
    }

    @Override
    public void openDoor() {

    }

    @Override
    public void closeDoor() {
        door.changeState(new ClosingDoor(door));
        System.out.println("State: opened - Closing");
    }

    @Override
    public boolean buttonClicked() {
        return false;
    }
}
