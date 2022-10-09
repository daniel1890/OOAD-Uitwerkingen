import java.util.Date;

public class Task {
    private String description;
    private String taskReady;
    private Date dateReady;

    public Task(String d, String t, Date date) {
        this.description = d;
        this.taskReady = t;
        this.dateReady = date;
    }

    public String toString() {
        return description + " " + taskReady +  " " + dateReady;
    }
}
