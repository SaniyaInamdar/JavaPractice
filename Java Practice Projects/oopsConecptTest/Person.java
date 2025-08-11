package oopsConecptTest;
//Program me tumhe ye OOP concepts use karne honge:

//Class & Object
//Constructor (default + parameterized)
//Encapsulation (private fields + getters/setters)
//Inheritance
//Method Overloading & Overriding
//this & super keywords
//Polymorphism (compile-time + runtime)
//Abstract Class
//Interface
//Access Modifiers

//Program Statement
//💡 Scenario:
//Ek Person abstract class banao, jisme:
//Common properties: name, age
//Abstract method: displayInfo()


public abstract class Person {
		private String name;
		private int age;
		
		public void setname(String name) {
			this.name=name;
		}
		public String getname() {
			return name;
		}
		
		public void setage(int age) {
			this.age=age;
		}
		public int getage() {
			return age;
		}
		
		public abstract void displayInfo();
}
