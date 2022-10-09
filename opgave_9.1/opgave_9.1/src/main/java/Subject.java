import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<IObserver> observers;

    public abstract void register(IObserver observer);
    public abstract void remove(IObserver observer);
    public abstract void giveHomework(Task t);
}
