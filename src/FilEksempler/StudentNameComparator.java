package FilEksempler;

import java.util.Comparator;
import java.util.*;
public class StudentNameComparator extends objektComparator  {


    @Override
    public int compare(Comparable e, Comparable e1) {
        Student s=(Student)e;
        Student s1=(Student)e1;
        if(s.name.compareTo(s1.name)==0)
            return 0;
        else if(s.name.compareTo(s1.name)>0)
            return 1;
        else
            return -1;
    }
}

