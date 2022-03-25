package FilEksempler;


import java.util.Comparator;

public class StudentAgeComparator extends objektComparator  {

    @Override
    public int compare(Comparable e, Comparable e1) {
        Student s=(Student)e;
        Student s1=(Student)e1;
        if(s.age==s1.age)
            return 0;
        else if(s.age>s1.age)
            return 1;
        else
            return -1;
    }
    }

