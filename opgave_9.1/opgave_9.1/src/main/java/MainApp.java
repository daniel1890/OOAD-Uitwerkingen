import java.util.Calendar;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();

        t.register(s.getTodoList());
        t.giveHomework(new Task("huiswerk 1", "dinsdag", new Date(2022, Calendar.JULY, 12)));
        t.giveHomework(new Task("huiswerk 2", "woensdag", new Date(2022, Calendar.JULY, 13)));
        t.giveHomework(new Task("huiswerk 3", "donderdag", new Date(2022, Calendar.JULY, 14)));

        s.work();
    }
}
