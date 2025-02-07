// This is my attempt at a Lexiographic Array Generator - Markus
public class LexioGen
{

    Integer size;   // how large is the array
    Integer arrayNum;   // how many possible arrays are there
    Integer[][] arrays; // generated arrays

    public LexioGen(Integer n) // constructor
    {
        size = n;
        arrayNum = fact(n);
        arrays = new Integer[arrayNum][size];
    }

    private static Integer fact(Integer n) // factorial function
    {
        return facttr(n, 1);
    }
    
    /*
    the generator function creates the first iteration and then utilizes the process and store functions
    to create the rest of the arrays
    */
    private void generator(){
    Integer[] tempVal = new Integer[size];
    
    // first iteration
    for (Integer i = 0; i < size; i++){
       arrays[0][i] = i;
    }
    
    int index = 1;
    
    
    }
    
    // This is the function where you would calculate the next lexiographic permutation.
    // I will finish writing this later unless someone wants to pick up where I left off before I get back to it.
    private boolean process(Integer [] temp){
        /*
        Search "Compute The Next Permutation of A Numeric Sequence - Case Analysis" on youtube to understand more about what the
        function will do. Once the function reaches the end of the iterations it should return a negative boolean value to indicate the while loop
        in the generator function to stop storing values.
        */
    }
    
    
    // used to store next iteration
    private void store(Integer[] j, int index){
     for (int i = 0; i < size; i++){
       arrays[index][i] = j[i];
    }
    }

    private static Integer facttr(Integer n, Integer acc) // continuation of factorial function so it is tail recursive
    {
        if (n == 0)
        {
            return acc;
        } else
        {
            return facttr(n - 1, acc * n);
        }
    }

}