import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for storing data from each sorting algorithm Used for CS2430 Project 1
 * Group assignment
 * 
 * @author Corbin
 */
public class TestDriver {

	int size; // number of items in the array
	static BufferedWriter bw = null;

	public TestDriver(int n, String filepath) {

		int size = n;

		LexioGen gen = new LexioGen(size);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true))) {
			bw.write("Merge\n");
			for (int i = 0; i < gen.arrays.length; i++) {

				Integer[] gens = gen.arrays[i].clone();
				TestMerge(gens, bw);

			}
			bw.write("\n");

			bw.write("Heap\n");
			for (int i = 0; i < gen.arrays.length; i++) {

				Integer[] gens = gen.arrays[i].clone();
				TestHeap(gens, bw);

			}
			bw.write("\n");

			bw.write("Quick\n");
			for (int i = 0; i < gen.arrays.length; i++) {

				Integer[] gens = gen.arrays[i].clone();
				TestQuick(gens, bw);

			}
			bw.write("\n");

			bw.write("Shaker\n");
			for (int i = 0; i < gen.arrays.length; i++) {

				Integer[] gens = gen.arrays[i].clone();
				TestShaker(gens, bw);

			}
			bw.write("\n");
		} catch (IOException e) {
			System.err.println("Error appending data to the file: " + e.getMessage());
			e.printStackTrace();
		}

	}

	private static void TestMerge(Integer[] nums, BufferedWriter bw) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(String.valueOf(Merge.sort(test)));
		bw.write(",");
	}

	private static void TestHeap(Integer[] nums, BufferedWriter bw) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(String.valueOf(Heap.sort(test)));
		bw.write(",");
	}

	private static void TestQuick(Integer[] nums, BufferedWriter bw) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(String.valueOf(Quick.sort(test)));
		bw.write(",");
	}

	private static void TestShaker(Integer[] nums, BufferedWriter bw) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(String.valueOf(Shaker.sort(test)));
		bw.write(",");
	}

}
