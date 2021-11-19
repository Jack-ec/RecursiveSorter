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
	
	 void merge(IntegerArray array, int l, int m, int r)
	    {

	        int n1 = m - l + 1;
	        int n2 = r - m;
	  
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	  
	        for (int i = 0; i < n1; ++i)
	            L[i] = array.read(l + i);
	        for (int j = 0; j < n2; ++j)
	            R[j] = array.read(m + 1 + j);
	        int i = 0, j = 0;
	        int k = l;
	        
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                array.write(k, L[i]);
	                i++;
	            }
	            else {
	                array.write(k, R[j]);
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            array.write(k, L[i]);;
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            array.write(k, R[j]);
	            j++;
	            k++;
	        }
	    }
	 void mergesort(IntegerArray array, int l, int r)
	    {
	        if (l < r) {

	            int m =l+ (r-l)/2;
	  
	            mergesort(array, l, m);
	            mergesort(array, m + 1, r);
	  
	            merge(array, l, m, r);
	        }
	    }

	public void doMergeSort(IntegerArray array) {
		quickSort(array, 0, array.length() - 1);
	}

}
