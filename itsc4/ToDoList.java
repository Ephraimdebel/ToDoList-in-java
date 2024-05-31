package itsc4;

/*
 * ToDoList Class
The ToDoList class represents a simple implementation of a to-do list using a singly linked list. It allows users to add tasks, mark tasks as completed, and view the list of tasks.

Constructors
ToDoList(): Initializes an empty to-do list by setting the head reference to null.
Methods
addToDo(Task task): Adds a new task to the end of the list.
Parameters:
task (Task): The task object to be added to the list.
Returns: Void
Behavior:
Creates a new Node object with the provided Task object.
If the list is empty (i.e., head is null), sets the head reference to the new node.
Otherwise, traverses through the list until the last node is reached and appends the new node to the end.
markAscompleted(String title): Marks a task as completed based on its title.
Parameters:
title (String): The title of the task to be marked as completed.
Returns: Void
Behavior:
Iterates through the list starting from the head node.
Compares the title of each task with the provided title.
If a match is found, calls the markCompleted() method on the corresponding Task object to mark it as completed.
If no match is found, prints "task not found."
viewToDoList(): Prints the details of tasks in the to-do list.
Parameters: None
Returns: Void
Behavior:
Iterates through the list starting from the head node.
Prints the details of each task by calling the toString() method on the corresponding Task object.
Continues until the last node is reached.
 */
public class ToDoList {
    Node head;
    ToDoList(){//this is the constractor 
        head = null;
    }
    public void addToDo(Task task){
        //impelemenation detal, accept task and add to the todolist
        Node newNode = new Node(task);
        if(head==null){ 
            head = newNode;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = newNode;
        }
    }
    public void markAscompleted(String title){
        //implemenatation detail to mark complete
        Node n = head;
        while(n!=null){
            if(n.task.getTitle().equals(title)){
                n.task.markCompleted();
                return;
            }
            n=n.next;
        }
        System.out.println("task not found");
    }
    public void viewToDoList(){
        //implementation to view all elemenets
        Node n = head;
        while(n.next!=null){
            System.out.println(n.task);
            n = n.next;
        }
        System.out.println(n.task);

    }
}
