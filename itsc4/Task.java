package itsc4;

/*
 * Task Class
The Task class represents a single task in the to-do list. It contains properties to store the task's title, description, and completion status. It also provides methods to access and modify these properties.

Constructors
Task(String title, String description): Initializes a new Task object with the given title and description.
Parameters:
title (String): The title of the task.
description (String): The description or details of the task.
Properties
title (String): Stores the title of the task.
description (String): Stores the description or details of the task.
completed (boolean): Indicates whether the task is completed (true) or not completed (false).
Methods
getTitle(): String: Retrieves the title of the task.
Returns:
A string representing the title of the task.
getDescription(): String: Retrieves the description of the task.
Returns:
A string representing the description of the task.
isCompleted(): boolean: Checks if the task is completed.
Returns:
true if the task is completed.
false if the task is not completed.
markCompleted(): void: Marks the task as completed by setting the completed property to true.
Returns: Void
toString(): String: Returns a string representation of the task.
Returns:
A formatted string that includes the title, description, and completion status of the task.
 */
public class Task {
    private String title,description;
    private boolean completed;
    Task(String title,String description){
        this.title = title;
        this.description = description;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public boolean isCompleted(){
        return completed;
    }
    public void markCompleted(){
        completed = true;
    }
    public String toString(){
        return "Title: "+title+", Description:- "+description+", completed:- "+completed;
    }
}
