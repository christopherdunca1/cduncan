
public class Lab9 {
	public static void main(String[] args){
		int[] input = {1,6,7,9,12,18,23,26,41,55}; 
		System.out.println(sequentialSearch(input,23));
		System.out.println(sequentialSearch(input,26));
		System.out.println(binarySearch(input,41)); 
		System.out.println(binarySearchRecursive(input,18));
		}
	public static int sequentialSearch(int[] input, int n)
	{
		for(int i = 0; i<input.length; i++)
			if(input[i]== n) return i;
				return -1;
	}
	public static int binarySearch(int[] input, int n){
		int min = 0;
		int max = input.length - 1;
		while( min <= max){
			int mid = (min+max) /2;
			if(input[mid] < n){
				min = mid + 1;
			} else if (input[mid] > n){
				max = mid - 1;
			}else{
				return mid;
			}
		}
		return -(min+1);
	}
	public static int binarySearch(int[] input, int n){
		return binarySearch(input, n, 0, input.length-1);
	}
	public static int binarySearchRecursive(int[] input, int n, int min, int max){
		      if (min > max){ 
		      return -1;
		      } 
			   int mid = (min + max) / 2;  
			      if (input[mid] == n){
			    		return mid;
			      }
			      else if(input[mid] < n){
			  return binarySearchRecursive(input, n, mid+1, max);
			    }else{
			  return binarySearchRecursive(input, n, min, mid-1);
			    }
	}
}

    
 
			    		   