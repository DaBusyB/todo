package todo;

import java.util.ArrayList;

import todo.ToDoEntry;

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

    public void remove(int index)
    {
        itemsList.remove(index);
    }




}