package todo;

import java.util.ArrayList;

public class ToDoList {
    public ArrayList<ToDoEntry> itemsList = new ArrayList<ToDoEntry>();

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
        ToDoEntry lastEntry = itemsList.get(itemsList.size() - 1);
        return lastEntry;
    }

    public int getIndexOfEntry(String entry)
    {
        int entryIndex = itemsList.indexOf(entry);
        //System.out.print(entryIndex);

        return entryIndex;
    }

    //search
    public boolean searchForEntry(ToDoEntry entryItem)
    {
        boolean entry = itemsList.contains(entryItem);
        return entry;
    }

    //add, delete by index, update, check off
    public void add(ToDoEntry entry)
    {
        itemsList.add(entry);
        //displayAllEntries();
    }

    public void remove(ToDoEntry entryToDelete) //remove by entry
    {
        itemsList.remove(entryToDelete);
        //displayList()
    }

    public void remove(int entryIndexToDelete) //remove by index
    {
        itemsList.remove(entryIndexToDelete);
    }

    public ToDoEntry update(int index, ToDoEntry newEntry)
    {
        return itemsList.set(index, newEntry);
        //displayAllEntries();
    }

    public String checkOffCompletedEntry(String entry)
    {
        boolean completedEntry = true;
        String checkedEntry = "";

        if (completedEntry)
        {
            checkedEntry = "[√] " + entry;
        }
        return checkedEntry;
    }









}