/**
 * 
 */
package com.core.generics;

/**
 * @author Prasad
 *
 */
public class Animal {

	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
}
