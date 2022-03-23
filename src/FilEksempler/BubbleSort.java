package FilEksempler;

class BubbleSort <E extends Comparable<E>> {
    /**
     * Bubble sort method
     */
     public void bubbleSort(E[] list, objektComparator c) {

        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
               if (c.compare(list[i], list[i + 1]) > 0) {
                 // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
}

