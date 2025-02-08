import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for storing data from each sorting algorithm Used for CS2430 Project 1
 * Group assignment
 * 
 * 
 * 
 * 
 * @author Corbin
 * @author (revisions by) Edwin
 * @author (revisions by) Markus
 */
public class TestDriver {

	int size; // number of items in the array
	static BufferedWriter bw = null;

	public TestDriver(int n, String filepath)
	{

		int size = n;

		LexioGen gen = new LexioGen(size);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))) {

			for (int i = 0; i < gen.arrays.length; i++) 
			{
				Integer[] gens = gen.arrays[i].clone();
				Test(gens, bw);
			}
		}
		catch (IOException e) 
		{
			System.err.println("Error appending data to the file: " + e.getMessage());
			e.printStackTrace();
		}

	}


	/*
	I made it so only 1 method needs to be called. I also changed the formatting so
	it writes the data in columns instead of rows. Lastly, I removed any words from the CSV's.
	The CSV's can run in MATLAB now.
	*/

	private static void Test(Integer[] nums, BufferedWriter bw) throws IOException 
	{

		Integer[] test;
		test = nums.clone();
		StringBuilder sb = new StringBuilder();
		String r;

		for (int i:test)
		{
		sb.append(i);
		}
		r = sb.toString();
		bw.write(r);
		bw.write(",");

		bw.write(String.valueOf(Merge.sort(test)));
		bw.write(",");
		
		bw.write(String.valueOf(Heap.sort(test)));
		bw.write(",");
		
		bw.write(String.valueOf(Quick.sort(test)));
		bw.write(",");

		bw.write(String.valueOf(Shaker.sort(test)));
		bw.write("\n");
	}
}
