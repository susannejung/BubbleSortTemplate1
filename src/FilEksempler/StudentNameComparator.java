package FilEksempler;

import java.util.Comparator;
import java.util.*;
public class StudentNameComparator extends objektComparator   {

           public  int compare(Student e, Student e1) {
            return e.name.compareTo(e1.name);
        }
    }

