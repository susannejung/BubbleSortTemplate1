package FilEksempler;
import java.util.Comparator;

public class StudentRollnoComparator extends objektComparator  {

    @Override
    public int compare(Comparable e, Comparable e1) {
        Student s=(Student)e;
        Student s1=(Student)e1;
        if(s.rollno==s1.rollno)
            return 0;
        else if(s.rollno>s1.rollno)
            return 1;
        else
            return -1;
    }
}
