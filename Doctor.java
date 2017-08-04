public class Doctor extends Human{
   int years;
   String Speciality;
   Doctor(int y, String s, double h, double w, int a){
       super(h, w, a);
       years = y;
       Speciality = s;
   }
   int getYears(){
       return years;
   }
   String getSpecialty(){
       return Speciality;
   }
   double getSalary(){
       return 40000 + (years - 1) * 5000;
   }
}