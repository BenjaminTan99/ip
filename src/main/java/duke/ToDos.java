package duke;

/**
 * This class simulates a unique type of Task which only has description
 * but no designated deadline.
 */
public class ToDos extends Task {

    /**
     * Constructor for ToDos.
     *
     * @param description Description of the ToDos object.
     */
    public ToDos(String description) {
        super(description);
    }

    /**
     * Returns description of the current ToDos object.
     *
     * @return Description of the current ToDos object.
     */
    @Override
    public String getDescription() {
        return super.getDescription().replace("todo ", "");
    }

    /**
     * Marks the current ToDos object as done.
     */
    @Override
    public void markDone() {
        super.markDone();
    }

    /**
     * Returns the status icon of the current ToDos object.
     *
     * @return Status icon of the current ToDos object.
     */
    @Override
    public String getStatusIcon() {
        return "[T]" + super.getStatusIcon();
    }

    /**
     * Returns the current ToDos's description and completion status.
     *
     * @return Current ToDos's description and completion status.
     */
    @Override
    public String printTask() {
        return this.getStatusIcon() + " " + this.getDescription();
    }
}
