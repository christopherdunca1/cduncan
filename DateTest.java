
public class DateTest {

  
   public static void main(String[] args) {
       Date date=new Date(25,8,2015);

       System.out.println("current date:"+ date.toString());
       System.out.println("after addition of 5 days:");
      date.addDays(5);
       System.out.println("\ncurrent date:"+ date.toString());
       System.out.println("\nafter addition of 2 week:");
       date.addWeeks(2);
       System.out.println("\ncurrent date:"+ date.toString());
      
      
       Date date1=new Date(13,6,2016);
       System.out.println("\nnumber of days that this Date must be adjusted to make it equal to the given Date is :" +date.daysTo(date1));
      
   }

}