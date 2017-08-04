
public class TelDirectory implements Comparable<TelDirectory> {
private String name;
private String Phonenumber;

public TelDirectory(String name, String Phonenumber){ //initializes object
	this.name = name;
	this.Phonenumber = Phonenumber;
}
public String getName(){
	return name;
}
public String getPhonenumber(){
	return Phonenumber;
}
public void setName(String name){
	this.name = name;
}
public void setPhonenumber(String Phonenumber){
	this.Phonenumber = Phonenumber;
}
public String toString(){
	return "Name: " +name+ "Phone Number:" +Phonenumber ;
}
public int compareTo(TelDirectory object){
	return 0;
}
}
