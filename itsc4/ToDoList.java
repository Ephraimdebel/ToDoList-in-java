package itsc4;

public class ToDoList {
    Node head;
    ToDoList(){
        head = null;
    }
    public void addToDo(Task task){
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
        Node n = head;
        while(n.next!=null){
            System.out.println(n.task);
            n = n.next;
        }
        System.out.println(n.task);

    }
}
