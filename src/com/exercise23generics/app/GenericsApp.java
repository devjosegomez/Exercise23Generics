package com.exercise23generics.app;

import com.exercise23generics.model.Suma;

public class GenericsApp {

	public static void main(String[] args) {
		Suma<Integer> myObject = new Suma<Integer>(15);
		Suma<String> myObjectString = new Suma<String>("testo");
		
		System.out.println("Object of myObject: " + myObject.getMyObject());
		System.out.println("Object of myObject: " + myObjectString.getMyObject());

	}

}
