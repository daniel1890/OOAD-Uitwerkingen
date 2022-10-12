public class Door {
    protected DoorState state;

    public Door() {
        this.state = new ClosedDoor(this);
    }

    public void changeState(DoorState state) {
        this.state = state;
    }

    public DoorState getState() {
        return this.state;
    }

    public void openDoor() {
        this.state.openDoor();
    }

    public void closeDoor() {
        this.state.closeDoor();
    }

    public boolean buttonClicked() {
        return false;
    }
}
