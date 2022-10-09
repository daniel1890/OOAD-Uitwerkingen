import java.util.ArrayList;

public class Teacher extends Subject{
    private String teacherCode;

    public Teacher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void giveHomework(Task t) {
        for (IObserver obs : observers) {
            obs.addTask(t);
        }
    }
}
