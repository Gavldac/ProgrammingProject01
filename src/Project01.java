/**
 * Class for running the test driver Used for CS2430 Project 1 Group assignment
 * TestDriver is used to run the tests on the sorting algorithms with arguements  
 * for array size and the file path to write the results to.
 * 
 * @author Edwin Casady
 */
public class Project01 {
    public static void main(String[] args) throws Exception {


        String n4 = "Matlab Script/n4.csv";
        String n6 = "Matlab Script/n6.csv";
        String n8 = "Matlab Script/n8.csv";

        TestDriver test1 = new TestDriver(4, n4);

        TestDriver test2 = new TestDriver(6, n6);

        TestDriver test3 = new TestDriver(8, n8);

       

    }  
}

// hello
