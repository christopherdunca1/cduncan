import java.util.Arrays;

public class Sorts {
	public static void main(String[] a){
	int [] arrayList = {13,65,75,45,38,29,53,};
	System.out.println("The original Array is:" +Arrays.toString(arrayList));
	
	int [] sortList = selectionSort(arrayList);
	System.out.println("The sorted Array is:"+Arrays.toString(sortList));
	System.out.println();
	
	int[] arrayList1 = {20,45,33,11,10,65,78};
	System.out.println("The original Array is:" +Arrays.toString(arrayList1));
	
	int [] sortList1 = bubbleSort(arrayList);
	System.out.println("The sorted Array is:"+Arrays.toString(sortList1));
	System.out.println();
	
	int[] arrayList2 = {34,25,78,45,23,98,14,18};
	System.out.println("The original Array is:" +Arrays.toString(arrayList2));
	
	int [] sortList2 = insertionSort(arrayList2);
	System.out.println("The sorted Array is:"+Arrays.toString(sortList2));
	}
	public static int[] selectionSort(int[] intArray){
		for (int i = 0; i < intArray.length - 1; i++){
			int index = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < intArray[index]) {
					index = j;
				}
			}
			
			int smallerNumber = intArray[index];
			intArray[index] = intArray[i];
			intArray[i] = smallerNumber;
		}
		return intArray;
	}
	public static int[] bubbleSort(int[] intArray){
		int n = intArray.length;
		int k;
		for (int m = n; m >= 0; m--){
			for (int i = 0; i < n - 1; i++){
				k = i + 1;
				if (intArray[i] > intArray[k]){
					// Swap Numbers
					int temp = intArray[i];
					intArray[i] = intArray[k];
					intArray[k] = temp;
				}
			}
		}
		return intArray;
	}
	public static int[] insertionSort(int [] arrayList){
		for (int i=1; i<arrayList.length;i++){
				for(int j = i; j > 0; j--){
					if(arrayList[j] < arrayList[j-1]){
					int temp = arrayList[j];
					arrayList[j] = arrayList[j-1];
					arrayList[j-1] = temp;
					}
				}
		}
		return arrayList;
		}
	}

	

