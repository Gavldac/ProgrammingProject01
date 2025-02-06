/* import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
 */
public class Project01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Need test client here");

        Integer[] bigNums = { 1, 3, 5, 7, 43, 8, 76, 34, 45, 83, 90, 13, 16, 58, 53, 42, 89, 14, 61, 2 };
        Integer[] smallNums = { 5, 4, 3, 2, 1 };
        Integer[] orderedNums = { 1, 2, 3, 4, 5 };

        // reused variables for testing
        Integer[] test;
        int result;

        // Merge sort
        System.out.println("Merge sort");
        System.out.println("---------------------------------------------------");

        test = bigNums.clone();
        System.out.println("Comparisons: " + Merge.sort(test));
        show(test);

        test = smallNums.clone();
        System.out.println("Comparisons: " + Merge.sort(test));
        show(test);

        test = orderedNums.clone();
        System.out.println("Comparisons: " + Merge.sort(test));
        show(test);
        System.out.println();

        // Quick.sort(test);
        System.out.println("Quick sort");
        System.out.println("---------------------------------------------------");

        test = bigNums.clone();
        System.out.println("Comparisons: " + Quick.sort(test));
        show(test);

        test = smallNums.clone();
        System.out.println("Comparisons: " + Quick.sort(test));
        show(test);

        test = orderedNums.clone();
        System.out.println("Comparisons: " + Quick.sort(test));
        show(test);

        // Heap.sort(test);
        System.out.println("Heap sort");
        System.out.println("---------------------------------------------------");

        test = bigNums.clone();
        System.out.println("Comparisons: " + Heap.sort(test));
        show(test);

        test = smallNums.clone();
        System.out.println("Comparisons: " + Heap.sort(test));
        show(test);
 
        test = orderedNums.clone();
        System.out.println("Comparisons: " + Heap.sort(test));
        show(test);       
        
        // Shaker.sort(args);
        System.out.println("Shaker sort");
        System.out.println("---------------------------------------------------");
        
        test = bigNums.clone();
        System.out.println("Comparisons: " + Shaker.sort(test));
        show(test);

        test = smallNums.clone();
        System.out.println("Comparisons: " + Shaker.sort(test));
        show(test);

        test = orderedNums.clone();
        System.out.println("Comparisons: " + Shaker.sort(test));
        show(test);


    }

    private static void show(Integer[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
            if (count % 10 > 0)
                System.out.print(a[i] + " ");
            else {
                System.out.println(a[i]);
            }
        }
        System.out.println();
    }

}

// hello