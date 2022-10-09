import java.util.ArrayList;

public class TodoList implements IObserver{
    private Subject subject;
    private ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    @Override
    public void addTask(Task t) {
        this.tasks.add(t);
    }

    public void removeTask(int i) {
        this.tasks.remove(i);
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }
}
