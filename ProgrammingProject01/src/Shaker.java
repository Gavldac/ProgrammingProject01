/**
 * Class for implementing a shaker style sort that is capable 
 * of counting the number of comparisons and returning that amount
 * 
 * @author Edwin Casady
 */
public class Shaker {
    static int coutner;
    
    
    public static int sort(Comparable[] a){    
        int counter = 0;
        boolean  swapped = true;

        while (swapped){
            swapped = false;

            // low to high index
            for (int i = 0; i < a.length - 1; i++) {
                counter++;
                if ( less(a[i], a[i+1]) ) {
                   Comparable temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swapped = true;
               }
            }
            // break point so we can exit if the first loop
            // did not have anymore swaps todo
            if (!swapped) break;

            // high to low index
            for (int i = a.length - 1; i > 0; i--) {
                counter++;
               if ( less(a[i], a[i-1]) ) {
                Comparable temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
                swapped = true;
               }
            }


        }
        return counter;
    }

    private static boolean less(Comparable a, Comparable b){
        coutner++;
        return a.compareTo(b) < 0;

    }
}
