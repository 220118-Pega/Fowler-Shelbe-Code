package com.revature.dl;

/**
 * This is a class regarding submitting issues
 * @author shelbefowler
 *
 */

import java.util.List;

import com.revature.bl.Solution;


 
public class Issue {
//The Class: the blue print, the template
	// The members: fields/attributes, methods, constructors
	
//Fields
	// used to define characteristics of a class
	// used to define dependencies of the class

	private String title;
	private String description;
	private int id;
	private List<Solution> solutions;
	
//Constructors
	//special methods that are used to initialize properties of a class
	// if you don't put in a constructor, that's fine, there's a default constructor that will be created for you
	// No Args Constructor
	public Issue() {
		// calls the constructor of the base class
		this("No title", "No description", 0);
	}
	//Parameterized constructor
	public Issue(String title, String description) {
		// the this keyword pertains to the particular instance's title and description properties
		// the title attribute of the object I'm constructing will have the value of the title parameter i am passing
		this.title = title;
		this.description = description;
	}
	public Issue(String title, String description, int id)
	{
		// Calling an existing constructor of the same class
		this(title, description);
		this.id = id;
	}
	public Issue(String title, String description, int id, List<Solution> solutions)
	{
		this(title, description, id);
		this.solutions = solutions;
	}
	// having multiple constructors is a form of polymorphism, called method overloading
	// when you call a constructor from another constructor, that's called constructor chaining
//Methods
	// describe the behavior of your object
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		//you can introduce validation logic here
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public List<Solution> getSolutions() {
		return solutions;
	}
	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}
	//Format of object when converted to string
	@Override
	public String toString() {
		return "Issue [title=" + title + ", description=" + description + ", id=" + id + "]";
	}}