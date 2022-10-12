public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) {
        this.door = door;
    }
    public abstract void openDoor();

    public abstract void closeDoor();

    public abstract boolean buttonClicked();
}
