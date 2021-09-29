package duke.logic.commands;

import duke.data.task.Todo;

import static duke.ui.Ui.LS;
import static duke.ui.Ui.QUOTATION;

public class AddTodoCommand extends Command {
    public static final String COMMAND_WORD = "todo";
    public static final String MESSAGE_COMMAND_FORMAT =  QUOTATION + COMMAND_WORD + " X" + QUOTATION;
    public static final String MESSAGE_COMMAND_DESCRIPTION = MESSAGE_COMMAND_FORMAT + " : Add task X with deadline Y";
    public static final String MESSAGE_INVALID_FORMAT = "Please specify a name for the task!";
    private static final String MESSAGE_SUCCESS = "Added to list: %1$s " + LS + "Current number of tasks: %2$d";

    private Todo toAdd;

    public AddTodoCommand(String description) {
        this.toAdd = new Todo(description);
    }

    @Override
    public CommandResult execute() {
        super.tasks.addTask(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd, super.tasks.getNumTasks()));
    }
}
