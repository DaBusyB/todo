package todo;

import java.util.ArrayList;

public class ToDoList {

    public ArrayList<ToDoEntry> itemsList = new ArrayList<ToDoEntry>();

    public void add(ToDoEntry entry)
    {
        itemsList.add(entry);
    }

    public ToDoEntry getLastItem()
    {
        return itemsList.get(itemsList.size() - 1);
    }

    public void remove(ToDoEntry index) /* why is this type ToDoEntry? */
    {
        itemsList.remove(index);
    }

    public ToDoEntry getEntry(int index)
    {
        return itemsList.get(index);
    }

    public boolean searchForEntry(ToDoEntry entryItem) /* why is this type ToDoEntry? */
    {
        boolean ans = itemsList.contains(entryItem);
        return ans;
    }



}