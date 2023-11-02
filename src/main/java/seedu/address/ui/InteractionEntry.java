package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import seedu.address.model.person.interaction.Interaction;

/**
 * A UI component that displays information of a {@code Client} {@code Interaction}.
 */
public class InteractionEntry extends UiPart<Region> {

    private static final String FXML = "InteractionEntry.fxml";

    public final Interaction interaction;

    @FXML
    private Label note;
    @FXML
    private Label outcome;
    @FXML
    private Label date;

    /**
     * Creates a {@code InteractionEntry} with the given {@code Interaction}.
     */
    public InteractionEntry(Interaction interaction) {
        super(FXML);
        this.interaction = interaction;
        note.setText(interaction.getInteractionNote());
        outcome.setText(interaction.getOutcome().toString());
        date.setText(interaction.getDate().toString());
    }
}
