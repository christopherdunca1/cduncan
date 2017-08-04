import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List; 
public class PersonClient{ 
	public static void main(String args[]) { 
		Person James= new Person("James", 5); 
		Person Mike = new Person("Mike", 7); 
		Person Gabby = new Person("Gabby", 2); 
		Person Jake = new Person("Jake", 6); 
		Person Josh = new Person("Josh", 3); 
		Person Frank= new Person("Frank", 4); 
		
		List<Person> Persons = new ArrayList<Person>(); 
		Persons.add(James); 
		Persons.add(Mike); 
		Persons.add(Gabby); 
		Persons.add(Jake); 
		Persons.add(Josh); 
		Persons.add(Frank); 
		
		System.out.println("List of Persons in unsorted order" + Persons);
		Collections.sort(Persons); 
		System.out.println("List of Persons in sorted order" + Persons);
		
		
	}
	
}