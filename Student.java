public class Student extends Human{
   String major;
   double gpa;
   int creditHours;
   Student(String m, double g, int ch, double h, double w, int a){
       super(h, w, a);
       major = m;
       gpa = g;
       creditHours = ch;
   }
   String getMajor(){
       return major;
   }
   double getGpa(){
       return gpa;
   }
   String getYear(){
       if(creditHours < 32) return "Freshman";
       else if(creditHours < 64) return "Sophomore";
       else if(creditHours < 96) return "Junior";
       else return "Senior";
   }
}