
public class Program2 {
	public static void main(String[] args){
		int [] array1 = {2,4,3,2,4,4,5,2};
		System.out.println(seqSearch(array1,8));
	}
	public static int seqSearch(int [] array1, int n){
		for(int i=0; i<array1.length; i++){
			if(array1[i] == n){
				return i;
			}
		}
	return -1;
	}
}