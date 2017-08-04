public class Person implements Comparable<Person> {
private String name;
private int ranking;

public Person(String name, int ranking){ //initializes object
	this.name = name;
	this.ranking = ranking;
}
public String getName(){
	return name;
}
public int getranking(){
	return ranking;
}
public void setName(String name){
	this.name = name;
}
public void setranking(int ranking){
	this.ranking = ranking;
}
public String toString(){
	return "Name: " +name+ "Ranking:" +ranking ;
}
public int compareTo(Person object){
	return 0;
}
}
