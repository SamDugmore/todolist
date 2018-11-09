import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<TodoListItem> itemList = new ArrayList<>();
    /*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority) {
        TodoListItem item = new TodoListItem(description, priority);
        itemList.add(item);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int index) {
        return itemList.get(index);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        return itemList.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        for(TodoListItem item : itemList){
            if(!item.isDone()) {
                return item;
            }
        }
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        int highestPriority = 0;
        TodoListItem itemOfHighestPriority = null;
        for (TodoListItem item: itemList) {
            if(!item.isDone() && item.getPriority() > highestPriority){
                highestPriority = item.getPriority();
                itemOfHighestPriority = item;
            }

        }
        return itemOfHighestPriority;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        List<String> results = new ArrayList<>();
        for (TodoListItem item: itemList) {
            if (item.getDescription().contains(text)){
                results.add()
            }
        }
        return null;
    }
}
