package com.exercise23generics.app;
import java.util.ArrayList;
import java.util.HashMap;

import com.exercise23generics.model.Resta;
import com.exercise23generics.model.Suma;

public class GenericsApp {

	public static void main(String[] args) {
		Suma<Integer> myObject = new Suma<Integer>(15);
		Suma<String> myObjectString = new Suma<String>("testo");
		Resta<Integer, Integer> myObjectResta = new Resta<Integer, Integer> (10,20);
		
		System.out.println("Object of myObject: " + myObject.getMyObject());
		System.out.println("Object of myObject: " + myObjectString.getMyObject());
		
		System.out.println("Key: " + myObjectResta.getKey());
		System.out.println("Value: " + myObjectResta.getValue());
		System.out.println(myObjectResta.toString());
	}

}
