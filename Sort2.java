
public class Sort2 {
	public static void selectionSort2(int arr[]){
	      
	       int i=0;
	   while(i<=(arr.length-i-1)) {
	   int minIndex = i;
	   int maxIndex=arr.length-i-1;
	   for (int j = i; j <=arr.length-i-1; j++) {

	   if (arr[j] <=arr[minIndex]) {
	   minIndex = j;
	   }
	   if(arr[j]>=arr[maxIndex]){
	   maxIndex = j;
	   }
	   }
	   swap(arr, i, minIndex);
	   if(i == maxIndex) {
	       maxIndex = minIndex;
	       }
	   swap(arr, (arr.length-i-1), maxIndex);
	   i++;
	   }
	   }
	  
	   private static void swap(int[] arr, int oldIndex, int newIndex){

	   int temp=arr[oldIndex];
	   arr[oldIndex]=arr[newIndex];
	   arr[newIndex]=temp;
	   }
	  
	   public static void main(String[] args) {
	      
	       int arr2[] = {6,1,7,2,8,3,20,50,-61,4,0,5};
	       selectionSort2(arr2);
	       for(int i=0; i<arr2.length; i++)
	           System.out.print(arr2[i]+" ");
	       System.out.println();
	   }
	}
