public class Mammal{
   private int age;
   private double weight;
   Mammal(double weight, int age){
       this.age = age;
       this.weight = weight;
   }
   public double getWeight(){
       return weight;
   }
   public int getAge(){
       return age;
   }
}