public class Human extends Mammal{
   double height;
   Human(double h, double w, int a) {
       super(w, a);
       height = h;
   }
   double getHeight(){
       return height;
   }
}