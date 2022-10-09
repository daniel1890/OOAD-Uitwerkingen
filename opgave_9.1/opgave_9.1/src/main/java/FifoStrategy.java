public class FifoStrategy implements IWorkStrategy{
    @Override
    public void doHomework(TodoList todo) {
        todo.removeTask(0);
        System.out.println(todo.getTasks().size());
    }
}
