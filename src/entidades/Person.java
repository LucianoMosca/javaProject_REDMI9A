package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;

public class Person {
	
	//Atributos solicitados
	public int idPerson;
	public String name;
	public String lastName;
	public String country;
	private int children;
	private LocalDate birthDate;
	public ArrayList<Vehicule> vehicules = new ArrayList<>();
	private int age;
    private int amountVehicules= vehicules.size();
	////////////////////////////////////////////////////

    
	//Constructor
	public Person(int idPersona, String nombre, String apellido, String dptoResidencia, int cantHijos, LocalDate fechaNacimiento) {
		this.idPerson = idPersona;
		this.name = nombre;
		this.lastName = apellido;
		this.country = dptoResidencia;
		this.children = cantHijos;
		this.birthDate = fechaNacimiento;			
		this.age = calculateAge(fechaNacimiento).getYears();
	}
	
	
	//Method to get person's age
	public Period calculateAge(LocalDate birthDate) {
		return Period.between(birthDate, LocalDate.now());
		
	}
	
	//Method toString
	public String toString() {
		return "ID: " + idPerson + "\nName: " + name + "\nLastName: " + lastName + "\nCountry: " + country + "\nAmount of children: " + children + "\nDate of birth: " + birthDate + "\nAge: " + age + "\n" + "vehicules: " + vehicules + "\n";                        
	}
	
	
	//Getters and setters
	public int getChildren() {
		return children;
	}
	
	public void setChildren(int children) {
		this.children = children;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}


}