import java.util.*;
public class Lab5 {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(7);
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(6);
		list.add(7);
		
		minToFront(list);
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(7);
		list2.add(9);
		list2.add(2);
		list2.add(7);
		list2.add(7);
		list2.add(5);
		list2.add(3);
		list2.add(5);
		list2.add(1);
		list2.add(7);
		list2.add(8);
		list2.add(6);
		list2.add(7);
		
		filterRange(list2, 2, 3);
		System.out.println(list2);
		System.out.println(intersect(list, list2));
	}
	private static Object intersect(ArrayList<Integer> list, ArrayList<Integer> list2) {
		// TODO Auto-generated method stub
		{

	        ArrayList<Integer> res = new ArrayList<Integer>();

	        for (int var : list) {

	            if(list2.contains(var))

	                res.add(var);

	        }

	        return res;

	    }
	}
	private static void minToFront(ArrayList<Integer>list){
	int min = Integer.MAX_VALUE;
	int index = 0;
	for(int i = 0; i < list.size(); i++)
	{
		if (list.get(i) < min){
			min = list.get(i);
			index= i;
		}
	}
		list.remove(index);
		list.add(0, min);
	}
	
	public static ArrayList<Integer> filterRange(ArrayList<Integer> list, int min, int max){
		for(int i=0;i< list.size(); i++){
		if(list.get(i) >= min && list.get(i) <= max){
			list.remove(i);
			}
	}
		return list;
	}
}
