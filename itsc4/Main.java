package itsc4;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.addToDo(new Task("task 1", "dsa lab"));
        list.addToDo(new Task("task 2", "oop lecture"));
        list.markAscompleted("task 1");
        list.viewToDoList();
    }
}
