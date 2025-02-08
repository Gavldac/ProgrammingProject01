import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for storing data from each sorting algorithm Used for CS2430 Project 1
 * Group assignment
 * 
 * This is my attempt at a Lexiographic Array Generator - Corbin
 * 
 * 
 * @author Corbin
 */
public class TestDriver {

	int size; // number of items in the array
	static BufferedWriter bw = null;

	public TestDriver(int n) {

		int size = n;

		LexioGen gen = new LexioGen(size);

		String filepathN4 = "n4.csv";
		String filepathN6 = "n6.csv";
		String filepathN8 = "n8.csv";

		try {
			bw = new BufferedWriter(new FileWriter(filepathN4, true));
			for (int i = 0; i < gen.arrays.length; i++) {
				Integer[] gens = gen.arrays[i].clone();
				show(gens);
				TestMerge(gens);
				TestHeap(gens);
				TestQuick(gens);
				TestShaker(gens);
				System.out.println();
				for (int j = 0; j < gen.arrays[i].length; j++) {
				}
			}
		} catch (IOException e) {
			System.err.println("Error appending data to the file: " + e.getMessage());
			e.printStackTrace();
		}

		try {
			bw = new BufferedWriter(new FileWriter(filepathN6, true));
			for (int i = 0; i < gen.arrays.length; i++) {
				Integer[] gens = gen.arrays[i].clone();
				show(gens);
				TestMerge(gens);
				TestHeap(gens);
				TestQuick(gens);
				TestShaker(gens);
				System.out.println();
				for (int j = 0; j < gen.arrays[i].length; j++) {
				}
			}
		} catch (IOException e) {
			System.err.println("Error appending data to the file: " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			bw = new BufferedWriter(new FileWriter(filepathN8, true));
			for (int i = 0; i < gen.arrays.length; i++) {
				Integer[] gens = gen.arrays[i].clone();
				show(gens);
				TestMerge(gens);
				TestHeap(gens);
				TestQuick(gens);
				TestShaker(gens);
				System.out.println();
				for (int j = 0; j < gen.arrays[i].length; j++) {
				}
			}
		} catch (IOException e) {
			System.err.println("Error appending data to the file: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

	private void TestMerge(Integer[] nums) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(Merge.sort(test));
		bw.write(",");
	}

	private void TestHeap(Integer[] nums) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(Heap.sort(test));
		bw.write(",");
	}

	private void TestQuick(Integer[] nums) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(Quick.sort(test));
		bw.write(",");
	}

	private void TestShaker(Integer[] nums) throws IOException {

		Integer[] test;
		test = nums.clone();
		bw.write(Shaker.sort(test));
		bw.write(",");
	}

	private static void show(Integer[] a) throws IOException {
		for (int i = 0; i < a.length; i++) {
			bw.write(a[i]);
		}
		bw.write(",");
	}

}
