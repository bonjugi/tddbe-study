package dev.bonjugi.boottemp.videoshop;

import java.util.Objects;

public class Customer {

	private String name;

	public Customer(String name) {
		this.name = name;
	}


	public static Customer of(String name) {
		return new Customer(name);
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return Objects.equals(name, customer.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				'}';
	}
}
