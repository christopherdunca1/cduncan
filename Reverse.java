package reverse;

import java.util.ArrayList;

public class Reverse {
  
   private ArrayList<Integer> reverse3(ArrayList<Integer> arrayList) {//this method accepts an arraylist of integers
       int length = arrayList.size();
       int i = 0;
       Integer temp;
       while (i+2 < length) {
           temp = arrayList.get(i);
           arrayList.set(i, arrayList.get(i+2));
           arrayList.set(i+2, temp);
           i += 3;
       }
       return arrayList;
   }
  
   public static void main(String[] args) {
       Reverse reverse = new Reverse();
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(13);
       list.add(2);
       list.add(8);
       list.add(7);
       list.add(90);
       list.add(-1);
       list.add(-2);
       list = reverse.reverse3(list);
       System.out.println(list);
   }

}