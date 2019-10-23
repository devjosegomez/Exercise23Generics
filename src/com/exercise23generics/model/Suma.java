package com.exercise23generics.model;

public class Suma<T> {
	T myObject;
	public Suma(T myObject) {
		this.myObject = myObject;
	}
	
	public T getMyObject() {
		return this.myObject;
	}
}
