/**
 * Class for generating lexicographic arrays
 * Used for CS2430 Project 1 
 * Group assignment
 * 
 * This is my attempt at a Lexiographic Array Generator - Markus
 * 
 * 
 * @author Markus
 * @author (revisions by) Edwin 
 */
public class LexioGen {

    int size; // how large is the array
    int arrayNum; // how many possible arrays are there
    Integer[][] arrays; // generated arrays

    public LexioGen(int n) // constructor
    {
        size = n;
        arrayNum = fact(n);
        arrays = new Integer[arrayNum][size];

        generator();
    }

    private static int fact(Integer n) // factorial function
    {
        int factorial = 1;
        while (n > 0) {
            factorial *= n--;
        }
        return factorial;
    }

    /*
     * the generator function creates the first iteration and then 
     * increments through each array 
     * and stores the next lexicographic permutation
     */
    private void generator() {
        /*
         * first generate values 0 to size-1 to the first array
         * i.e. (arrays[0], {0,1,2,...,size-1} )
         */
        for (int i = 0; i < size; i++) {
            arrays[0][i] = i;
        }

        /*
         * next we generate the sequences of lexicographic permutations
         * and store each permutation after arrays[0]
         * i.e. arrays[1,2,3,...,arrayNum-1], [(next permutaion)]
         */
        Integer[] next = arrays[0].clone(); // pointers are so much fun
        for (int i = 1; i < arrays.length; i++) {
            next = nextPermutation(next); // pointers are so much fun
            arrays[i] = next.clone(); // pointers are so much fun
        }
    }

    /**
     * Generates the next permutation of an array of integers
     * according to the lexicographic order
     * 
     * @param Integer [] arrInts
     * @return Interger[] next
     */
    private Integer[] nextPermutation(Integer[] arrInts) {
        /*
         * Using arrInts as a starting point, we need to create a new
         * array to be the new/next permutation.
         */
        Integer[] next = arrInts.clone();

        /*
         * working right to left from the end of the array,
         * find the first pair where arr[i]<arr[i+1]
         */
        int i = next.length - 2;
        while (i >= 0 && next[i] >= next[i + 1])
            i--;

        /*
         * working right to left from the end of the array,
         * ind the first index j where arr[i]<arr[j]
         */
        int j = next.length - 1;
        while (next[j] <= next[i])
            j--;

        /*
         * swap arr[i] and arr[j]
         */
        swap(next, i, j);

        /*
         * reverse the order of elements after index i to the end of the array
         */
        i++;
        j = next.length - 1;
        while (i < j) {
            swap(next, i++, j--);

        }

        /*
         * next permutation is returned
         */
        return next;
    }
    // helper function for nextPermutation()
    private void swap(Integer[] next, int i, int j) {
        Integer tmp = next[i];
        next[i] = next[j];
        next[j] = tmp;
    }

}