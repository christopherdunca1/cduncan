
public class Sort {
		   // selecting largest element in each iteration
		   public static void selectionSort(int arr[]){
		      
		       for(int i=arr.length-1; i>0; i--){
		           int max_index = i;
		           for(int j= i-1; j>=0; j--){
		               if(arr[j] > arr[max_index])
		                   max_index = j;
		           }
		          
		           //swapping
		           int temp = arr[i];
		           arr[i] = arr[max_index];
		           arr[max_index] = temp;
		       }
		   }
		  
		   public static void main(String[] args) {
		      
		       int arr1[] = {6,1,7,2,8,3,9,4,0,5};
		      
		       selectionSort(arr1);
		      
		       for(int i=0; i<arr1.length; i++)
		           System.out.print(arr1[i]+" ");
		       System.out.println();
		      
		   }
		}

