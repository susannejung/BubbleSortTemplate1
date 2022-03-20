package FilEksempler;

import java.util.Comparator;

import java.util.*;

 class objektComparator <E extends Comparator<E>>  {
    public <E extends Comparable<E>> int compare(E e, E e1) {
        return e.compareTo(e1);
    }
}
