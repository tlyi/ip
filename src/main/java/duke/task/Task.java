package duke.task;

/**
 * This class is used to create tasks.
 * Each Task must contain a description and can either be marked done or not done.
 */
public class Task {
    protected String description;
    protected boolean isDone;

    protected static final String ICON_DONE = "[X]";
    protected static final String ICON_NOT_DONE =  "[ ]";

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatusIcon() {
        return (this.isDone ? ICON_DONE : ICON_NOT_DONE); //marks task done with "X"
    }

    public void markAsDone() {
        if (!this.isDone) {
            this.isDone = true;
            System.out.println("Well done! I've marked this task as done. *w*");
        } else {
            System.out.println("Task has already been marked as done! Good job!");
            System.out.println("Try marking another task as done! ^=^");
        }
    }

    /**
     * Returns Task formatted in the form "[ ] description"
     *
     * @return Formatted Task string
     */
    @Override
    public String toString() {
        return getStatusIcon() + " " + getDescription();
    }
}
