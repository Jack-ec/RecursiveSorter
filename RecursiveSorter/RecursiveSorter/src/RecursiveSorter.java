
public class RecursiveSorter {
	public static void swap(IntegerArray numbers, int IndexA, int IndexB){
		int numbersA = numbers.read(IndexA);
		numbers.write(IndexA, numbers.read(IndexB));;
		numbers.write(IndexB, numbersA);
	}
	private int partition(IntegerArray clone, int low, int high) {

		int pivot = clone.read(high);  

		int i = (low - 1); 

		for (int j = low; j <= high- 1; j++)
		{
			if (clone.read(j) < pivot)
			{
				i++; 
				swap(clone, i, j);
			}
		}
		swap(clone, i + 1, high);

		return (i + 1);
	}

	public void quickSort(IntegerArray clone, int low, int high)
	{
		if (low < high)
		{
			int pivot_index = partition(clone, low, high);

			quickSort(clone, low, pivot_index - 1);
			quickSort(clone, pivot_index + 1, high); 
		}
	}
	public void doQuickSort(IntegerArray clone) {
		quickSort(clone, 0, clone.length() - 1);
	}



	public void doMergeSort(IntegerArray array) {
	}

}
