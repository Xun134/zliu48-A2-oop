// Author: zliu48
// The VisitorComparator class compares two Visitor objects based on age and name for sorting purposes.

import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First, compare by age
        int ageComparison = Integer.compare(v1.getAge(), v2.getAge());

        // If ages are equal, compare by name
        if (ageComparison != 0) {
            return ageComparison;
        }

        // Return comparison result of names when ages are the same
        return v1.getName().compareTo(v2.getName());
    }
}
