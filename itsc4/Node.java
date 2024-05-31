package itsc4;
/*
 * Node Class
The Node class represents a single node in the linked list. Each node contains a reference to a Task object and a reference to the next node in the list.

Constructors
Node(Task task): Initializes a new Node object with the given Task object.
Parameters:
task (Task): The task object associated with the node.
Properties
task (Task): Stores the task object associated with the node.
next (Node): Stores the reference to the next node in the list.
 */
public class Node {
    Task task;
    Node next;
    Node(Task task){
        this.task = task;
        next = null;
    }
}
