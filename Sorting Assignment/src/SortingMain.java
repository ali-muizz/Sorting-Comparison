
public class SortingMain {

	public static void main(String[] args) {

		StopWatch watch = new StopWatch();
		double average = 0;
		
		System.out.print("Quick Sort, Unique Array, 10 Length               ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Unique Array, 100 Length              ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Unique Array, 1000 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(1000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Unique Array, 10000 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Unique Array, 100000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Unique Array, 10 Length               ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Unique Array, 100 Length              ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Unique Array, 1000 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(1000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Unique Array, 10000 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Unique Array, 100000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Unique Array, 10 Length              ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Unique Array, 100 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Unique Array, 1000 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(1000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Unique Array, 10000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Unique Array, 100000 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Unique Array, 10 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Unique Array, 100 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Insertion Sort, Unique Array, 1000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(1000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Unique Array, 10000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Unique Array, 100000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Selection Sort, Unique Array, 10 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Unique Array, 100 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Unique Array, 1000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(1000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Unique Array, 10000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(10000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Unique Array, 100000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.fewUniqueArray(100000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Quick Sort, Reversed Array, 10 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Reversed Array, 100 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Reversed Array, 1000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(1000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Reversed Array, 10000 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Reversed Array, 100000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Reversed Array, 10 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Reversed Array, 100 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Reversed Array, 1000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(1000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Reversed Array, 10000 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Reversed Array, 100000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Reversed Array, 10 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Reversed Array, 100 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Reversed Array, 1000 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(1000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Reversed Array, 10000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Reversed Array, 100000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Reversed Array, 10 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Reversed Array, 100 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Insertion Sort, Reversed Array, 1000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(1000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Reversed Array, 10000 Length      ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Reversed Array, 100000 Length     ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Selection Sort, Reversed Array, 10 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Reversed Array, 100 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Reversed Array, 1000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(1000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Reversed Array, 10000 Length      ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(10000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Reversed Array, 100000 Length     ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.reversedArray(100000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
			
		
		System.out.print("Quick Sort, Sorted Array, 10 Length               ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Sorted Array, 100 Length              ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Sorted Array, 1000 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(1000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Sorted Array, 10000 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Sorted Array, 100000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Sorted Array, 10 Length               ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Sorted Array, 100 Length              ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Sorted Array, 1000 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(1000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Sorted Array, 10000 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Sorted Array, 100000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Sorted Array, 10 Length              ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Sorted Array, 100 Length             ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Sorted Array, 1000 Length            ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(1000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Sorted Array, 10000 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Sorted Array, 100000 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Sorted Array, 10 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Sorted Array, 100 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Insertion Sort, Sorted Array, 1000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(1000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Sorted Array, 10000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Sorted Array, 100000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Selection Sort, Sorted Array, 10 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Sorted Array, 100 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Sorted Array, 1000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(1000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Sorted Array, 10000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(10000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Sorted Array, 100000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.nearlySortedArray(100000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Randomized Array, 10 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Randomized Array, 100 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Randomized Array, 1000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(1000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Randomized Array, 10000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Quick Sort, Randomized Array, 100000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100000);
			watch.start();
			Sorts.quickSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Randomized Array, 10 Length           ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Randomized Array, 100 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Randomized Array, 1000 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(1000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Randomized Array, 10000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Merge Sort, Randomized Array, 100000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100000);
			watch.start();
			Sorts.mergeSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Randomized Array, 10 Length          ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Randomized Array, 100 Length         ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Randomized Array, 1000 Length        ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(1000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Randomized Array, 10000 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Bubble Sort, Randomized Array, 100000 Length      ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100000);
			watch.start();
			Sorts.bubbleSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Randomized Array, 10 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Insertion Sort, Randomized Array, 100 Length      ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Randomized Array, 1000 Length     ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(1000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Randomized Array, 10000 Length    ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Insertion Sort, Randomized Array, 100000 Length   ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100000);
			watch.start();
			Sorts.insertSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
		System.out.print("Selection Sort, Randomized Array, 10 Length       ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Randomized Array, 100 Length      ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Randomized Array, 1000 Length     ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(1000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Randomized Array, 10000 Length    ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(10000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;

		System.out.print("Selection Sort, Randomized Array, 100000 Length   ");
		for(int i = 0; i < 11; i ++)
		{
			int[] list = ArrayGen.randomizedArray(100000);
			watch.start();
			Sorts.selectSort(list);
			watch.stop();
			if(i != 0)
			{
			average += watch.getElapsedTime();
			}
		}
		average /= 10;
		System.out.println("[Average Time: " + average + "]");
		average = 0;
		
	}
}