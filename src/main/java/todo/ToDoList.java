package todo;

import java.util.ArrayList;

public class ToDoList {
    public ArrayList<ToDoEntry> itemsList = new ArrayList<ToDoEntry>();
    boolean completedEntry;
    boolean containsCheck;

    //display options
    public void displayAllEntries()
    {
        for (int i = 0; i < itemsList.size(); i++)
        {
            System.out.println(i + " " + getEntryByIndex(i).toString());
        }
    }

    public ToDoEntry getEntryByIndex(int index)
    {
        //indexOf
        return itemsList.get(index);
    }

    public ToDoEntry getLastEntry()
    {

        return itemsList.get(itemsList.size() - 1);
    }

    public int getIndexOfEntry(String entry)
    {
        //System.out.print(itemsList.indexOf(entry));
        return itemsList.indexOf(entry);
    }


    //search
    public boolean searchForEntry(ToDoEntry entryItem)
    {
        boolean entry = itemsList.contains(entryItem);
        return entry;
    }


    //add, delete by index, update
    public void add(ToDoEntry entry)
    {
        itemsList.add(entry);
        //displayAllEntries();
    }

    public void remove(ToDoEntry index)
    {
        itemsList.remove(index);
        //displayList()
    }

    public ToDoEntry update(int index, ToDoEntry newEntry)
    {
        return itemsList.set(index, newEntry);
        //displayAllEntries();
    }

    public boolean checkOffCompletedEntry()
    {
          return completedEntry = true;
    }









}