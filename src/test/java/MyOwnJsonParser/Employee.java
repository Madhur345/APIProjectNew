package MyOwnJsonParser;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder(value ={
		"id",
		"name",
		"salary"
})

public class Employee {

	String name;
	int id;
	int salary;
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee(){

	}
	public String toString(){
		return "name : "+name + " id : " +id + " Salary : "+salary;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
