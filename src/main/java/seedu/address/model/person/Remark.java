package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class Remark {
    public final String value;
    public static final String MESSAGE_CONSTRAINTS = "Remarks should be of the format local-part@domain "
            + "and adhere to the following constraints:\n"
            + "1. NIL";

    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Remark // instanceof handles nulls
                && value.equals(((Remark) other).value)); // state check
    }

    public static boolean isValidRemark(String test) {
        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}