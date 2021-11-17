
public class RecursiveSorter {
	 public static void swap(IntegerArray numbers, int IndexA, int IndexB){
	        int numbersA = numbers.read(IndexA);
	        numbers.write(IndexA, numbers.read(IndexB));;
	        numbers.write(IndexB, numbersA);
	    }
	private void partition(IntegerArray clone, int low, int high) {
		
		 int pivot = clone.read(high);  
		 
		    int i = (low - 1); 

		    for (j = low; j <= high- 1; j++)
		    {
		        if (clone.read(j) < pivot)
		        {
		            i++; 
		            swap arr[i] and arr[j]
		        }
		    }
		    swap arr[i + 1] and arr[high])
		    return (i + 1)
		}
	}

	
	public void doQuickSort(IntegerArray clone) {
	}

	private void partition(IntegerArray clone, int low, int high) {
		
		 int pivot = clone.read(high);  
		 
		    int i = (low - 1); 

		    for (j = low; j <= high- 1; j++)
		    {
		        if (clone.read(j) < pivot)
		        {
		            i++; 
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
