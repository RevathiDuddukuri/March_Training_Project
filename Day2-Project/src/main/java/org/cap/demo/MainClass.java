package org.cap.demo;

public class MainClass {

	public static void main(String[] args){
		greetings();
		
		SalesClass obj=new SalesClass();
		obj.show();
	}

	private static void greetings() {
		System.out.println("Hello! Good Morning!");
		System.out.println("Hello! Good Afternoon!");
		System.out.println("Hello! Good Evening!");
		System.out.println("Hello! Good Night!");
		
	}
	
	private static void hello() {
		System.out.println("Hello! Have a good day!");
		System.out.println("Hello! How are you?");

		
	}
}
