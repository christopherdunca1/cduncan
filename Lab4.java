
public class Lab4 {
	public static void main(String args[]){
	       Student alex = new Student("CS", 3.4, 54, 170, 150, 18);
	       Doctor jack = new Doctor(4, "Dermatology", 173, 179, 40);
	       System.out.println(alex.getMajor() + ", " + alex.getGpa() + ", " + alex.getYear() + ", " + alex.getAge());
	       System.out.println(jack.getSpecialty() + ", " + jack.getHeight() + ", " + jack.getWeight() + ", " + jack.getSalary());
	      
	   }
	}

