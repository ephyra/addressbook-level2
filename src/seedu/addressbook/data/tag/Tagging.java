package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {

    private Person personTagged;
    private Tag tag;
    private boolean isAdded;
    
    
    public Tagging(Person personTagged, Tag tag, boolean isAdded) {
        this.personTagged = personTagged;
        this.tag = tag;
        this.isAdded = isAdded;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isAdded) {
            builder.append("+ ");
        } else {
            builder.append("- ");
        }
        builder.append(this.personTagged.getName().toString() + " " + tag.toString());
        return builder.toString();
    }
    
    
}
