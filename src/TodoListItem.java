public class TodoListItem {
    int priority;
    boolean done;
    String description;

    public TodoListItem(String description, int priority){
        this.description = description;
        this.priority = priority;
        done = false;
    }

    public String getDescription(){
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isDone() {
        return done;
    }

    public void markDone() {
        done = true;
    }
}

