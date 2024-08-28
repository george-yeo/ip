package oyster.tasks;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<Task>();
    }

    /**
     * @param task Inserts a Task at the end
     */
    public void insert(Task task) {
        tasks.add(task);
    }

    /**
     * @param index Index to remove Task
     */
    public void delete(int index) {
        tasks.remove(index);
    }

    /**
     * @param index Index to remove Task
     * @return Removed Task object
     */
    public Task pop(int index) {
        return tasks.remove(index);
    }

    /**
     * @param index Index of Task to mark
     */
    public void mark(int index) {
        tasks.get(index).mark();
    }

    /**
     * @param index Index of Task to unmark
     */
    public void unmark(int index) {
        tasks.get(index).unmark();
    }

    /**
     * @return True if the TaskList has no Tasks
     */
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    /**
     * @param index Index of the Task in the TaskList
     * @return Task object at the index
     */
    public Task getTask(int index) {
        return tasks.get(index);
    }

    /**
     * @return Number of Tasks in the TaskList
     */
    public int length() {
        return tasks.size();
    }

    /**
     * @return A copy of the ArrayList used to hold all the Tasks
     */
    public ArrayList<Task> getItems() {
        @SuppressWarnings("unchecked")
        ArrayList<Task> copy = (ArrayList<Task>) tasks.clone();
        return copy;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < tasks.size(); i++) {
            result += String.format("%d. %s",i + 1 , tasks.get(i)) + (i < tasks.size() - 1 ? "\n" : "");
        }

        return result;
    }
}
