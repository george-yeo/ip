package oyster.tasks;

public abstract class Task {
    private boolean isComplete = false;
    private String description;

    public static enum TASK_TYPES {
        TODO,
        DEADLINE,
        EVENT
    }

    /**
     * @param description Create a Task given a description
     */
    public Task(String description) {
        this.description = description;
    }

    /**
     * Marks the Task as complete
     */
    public void mark() {
        isComplete = true;
    }

    /**
     * Unmarks the Task as not complete
     */
    public void unmark() {
        isComplete = false;
    }

    public boolean isMarked() {
        return isComplete;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + (isComplete ? "X" : " ") + "] " + description;
    }

    /**
     * @return A writable save String of the Task
     */
    public abstract String[] compose();
}
