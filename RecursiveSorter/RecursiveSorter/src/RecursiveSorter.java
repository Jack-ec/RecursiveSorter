public class RecursiveSorter {
	
	public void doQuickSort(IntegerArray clone) {
		int low = 0;
		int high = clone.length();
		
		 if (low < high)
		    {
		        pi = partition(clone, low, high);

		        doQuickSort(clone, low, pi - 1);  // Before pi
		        doQuickSort(clone, pi + 1, high); // After pi
		    }
	}

	private void partition(IntegerArray clone, int low, int high) {
		
		 int pivot = clone.read(high);  
		 
		    int i = (low - 1) 

		    for (j = low; j <= high- 1; j++)
		    {
		        // If current element is smaller than the pivot
		        if (clone.read(j) < pivot)
		        {
		            i++;    // increment index of smaller element
		            swap arr[i] and arr[j]
		        }
		    }
		    swap arr[i + 1] and arr[high])
		    return (i + 1)
		}
	}

	public void doMergeSort(IntegerArray array) {
	}

}
