package FilEksempler;

public class Main {
    /**
     * A test method
     */
    public static void main(String[] args) {
      /*  objektComparator nc1 = new objektComparator();
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        BubbleSort b2 = new BubbleSort();
        b2.bubbleSort(list, nc1);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

        objektComparator nc = new objektComparator();
        String[] tabel = {"Bent", "Anne", "Anna", "Peter", "Jens", "Bodil"};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(tabel, nc);
        for (int i = 0; i < tabel.length; i++)
            System.out.print(tabel[i] + " ");
        System.out.println();

        objektComparator nc2 = new objektComparator();
        Character[] list1 = {'d', 'e', 'a', 'c', 'b', 'g', 'h', 'p', 'o', 'l'};
        BubbleSort b3 = new BubbleSort();
        b3.bubbleSort(list1, nc2);
        for (int i = 0; i < list1.length; i++)
            System.out.print(list1[i] + " ");
        System.out.println();

        Student[] tabel1 = new Student[6];
        tabel1[0] = (new Student(1, "Bent", 17));
        tabel1[1] = (new Student(2, "Anne", 20));
        tabel1[2] = (new Student(3, "Anna", 20));
        tabel1[3] = (new Student(4, "Peter", 22));
        tabel1[4] = (new Student(5, "Jens", 25));
        tabel1[5] = (new Student(6, "Bodil", 22));
       // objektComparator nc3 = new objektComparator();
        StudentAgeComparator nc3=new StudentAgeComparator();
        BubbleSort b4 = new BubbleSort();
        b4.bubbleSort(tabel1, nc3);
        for (int i = 0; i < tabel1.length; i++)
            System.out.print(tabel1[i] + " ");
        System.out.println();
        */

        String[] tabel = {"Bent", "Anne", "Anna", "Peter", "Jens", "Bodil"};
        BubbleSort1 b1=new BubbleSort1();
        b1.bubbleSort(tabel);
        for (int i = 0; i < tabel.length; i++)
            System.out.print(tabel[i] + " ");
        System.out.println();

        Character[] list1 = {'d', 'e', 'a', 'c', 'b', 'g', 'h', 'p', 'o', 'l'};
        b1.bubbleSort(list1);
        for (int i = 0; i < list1.length; i++)
            System.out.print(list1[i] + " ");
        System.out.println();

        Student[] tabel1 = new Student[6];
        tabel1[0] = (new Student(1, "Bent", 17));
        tabel1[1] = (new Student(2, "Anne", 20));
        tabel1[2] = (new Student(3, "Anna", 20));
        tabel1[3] = (new Student(4, "Peter", 22));
        tabel1[4] = (new Student(5, "Jens", 25));
        tabel1[5] = (new Student(6, "Bodil", 22));
        b1.bubbleSort(tabel1);
        for (int i = 0; i < tabel1.length; i++)
            System.out.print(tabel1[i] + " ");
        System.out.println();


    }
}

