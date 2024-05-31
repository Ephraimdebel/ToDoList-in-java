package itsc4;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        //add to the todolist
        list.addToDo(new Task("task 1", "dsa lab"));
        list.addToDo(new Task("task 2", "oop lecture"));
        //mark as compelted
        list.markAscompleted("task 1");
        //view all task
        list.viewToDoList();
    }
}
