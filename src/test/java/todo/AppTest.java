/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    //add list entry
    @Test 
    public void testAddToDoEntry()
    {
        //App classUnderTest = new App();
        ToDoList myList = new ToDoList();

        String entry = "buy groceries!";

        myList.add(new ToDoEntry(entry));
        assertEquals(entry, myList.getLastEntry().toString());
    }

    //delete list entry
    @Test
    public void testDeleteEntry()
    {
        // given
        ToDoList myList = new ToDoList();


        String entry = "buy food for Loki";
        myList.add(new ToDoEntry(entry)); // add item to the list


        int entryIndex = 0; //index i want deleted

        /*
        I had this type as String, editor suggested type ToDoEntry. Why?
        */
        ToDoEntry entryToDelete = myList.getEntry(entryIndex); // value of that index

        // when
        myList.remove(entryToDelete); // deletes that value

        // then
        assertFalse(myList.searchForEntry(entryToDelete)); // false indicates that value is no longer contained in list

    }


    @Test
    public void testUpdateExistingEntry()
    {
        //given
        ToDoList myList = new ToDoList();

        String entry = "buy food for Loki";
        myList.add(new ToDoEntry(entry)); // add item to the list

        //when
        String newEntry = "buy food for Pickles";
        ToDoEntry replacedEntry = myList.update(0, new ToDoEntry(newEntry)); //returns oldEntry that's getting replaced

        //then
        assertEquals(entry, replacedEntry.toString()); //ensure that entry and replacedEntry are the same (should be the entry that gets changed)
        assertNotEquals(myList.getEntry(0), newEntry);

        myList.displayAllEntries(); //confirm newEntry replaced entry
    }

//    //undo deletion of list entry
//    @Test
//    public void testUndoDeleteEntry()
//    {}

//    //mark entry as completed
//    @Test
//    public void testUndoDeleteEntry()
//    {}

//    //scrap entire list
//    @Test
//    public void testUndoDeleteEntry()
//    {}


}
