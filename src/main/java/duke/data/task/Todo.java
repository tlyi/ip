package duke.data.task;

/**
 * Represents tasks without any date/time attached to it.
 * E.g: visit new theme park
 */
public class Todo extends Task {


    public Todo(String description) {
        super(description);
    }

    public Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    /**
     * Returns Todo task formatted for application UI, in the form "[T][ ] description"
     *
     * @return Formatted Todo task string for application
     */
    @Override
    public String toString() {
        return TODO_LOGO + super.toString();
    }

    /**
     * Returns Todo task formatted for data file in the form "T | 1/0 | description"
     *
     * @return Formatted Todo task string for data file
     */
    @Override
    public String toTextFileString() {
        return TODO_ACRONYM + " | " + super.toTextFileString();
    }

}
