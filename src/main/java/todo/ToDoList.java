package todo;

import java.util.ArrayList;

public class ToDoList {
    public ArrayList<ToDoEntry> itemsList = new ArrayList<ToDoEntry>();

    //display options
    public void displayAllEntries()
    {
        for (int i = 0; i < itemsList.size(); i++)
        {
            System.out.println(i + " " + getEntry(i).toString());
        }
    }

    public ToDoEntry getEntry(int index)
    {
        //indexOf
        return itemsList.get(index);
    }

    public ToDoEntry getLastEntry()
    {

        return itemsList.get(itemsList.size() - 1);
    }

    //search
    public boolean searchForEntry(ToDoEntry entryItem) /* why is this type ToDoEntry? */
    {
        boolean entry = itemsList.contains(entryItem);
        return entry;
    }

    //add, delete by index, update
    public void add(ToDoEntry entry)
    {

        itemsList.add(entry);
        displayAllEntries();
    }

    public void remove(ToDoEntry index) /* why is this type ToDoEntry? */
    {
        itemsList.remove(index);
        //displayList()
    }





}