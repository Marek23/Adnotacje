package pl.com.home;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private String firstName;
	private String lastName;
	private int age;
 
	public User(String firstName, String lastName, int age) {
		this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}