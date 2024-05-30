package itsc4;

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
