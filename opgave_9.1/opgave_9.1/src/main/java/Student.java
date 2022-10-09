public class Student {
    private int studentN;
    private TodoList todoList;
    private IWorkStrategy homeworkStrategy;

    public Student(IWorkStrategy homeworkStrategy) {
        this.todoList = new TodoList();
        this.homeworkStrategy = homeworkStrategy;
    }

    public void setWorkStrategy(IWorkStrategy homeworkStrategy) {
        this.homeworkStrategy = homeworkStrategy;
    }

    public void work() {
        for (Task t : getTodoList().getTasks()) {
            homeworkStrategy.doHomework(this.todoList);
        }
    }

    public TodoList getTodoList() {
        return this.todoList;
    }
}
