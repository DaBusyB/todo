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

    public void remove(ToDoEntry index)
    {
        itemsList.remove(index);
    }

    public ToDoEntry getEntry(int index)
    {
        return itemsList.get(index);
    }

    public boolean findEntry(ToDoEntry entryItem)
    {
        boolean ans = itemsList.contains(entryItem);
        return ans;
    }



}