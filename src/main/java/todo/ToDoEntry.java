package todo;

public class ToDoEntry {

    String text;

    public ToDoEntry(String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return text;
    }
}