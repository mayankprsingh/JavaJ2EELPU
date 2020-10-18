package com.auribises.main;
/*
import com.auribises.model.User;
import com.auribises.dao.DB;

public class App{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Mongo DB Demo");
		User user = new User("John Watson","john@example.com","John123");
		System.out.println(user);
		
		DB db = new DB();
	}
}
*/


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.auribises.dao.DB;
import com.auribises.model.User;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to MongoDB Demo");
		
		//User user = new User("Lee", "lee@example.com", "pass@123");
		//System.out.println(user);
		
		List<Document> documents = new ArrayList<Document>();
		documents.add(new User("Pennie", "pennie@example.com", "pennie123").toDocument());
		documents.add(new User("Mack", "mack@example.com", "mack123").toDocument());
		documents.add(new User("Jim", "jim@example.com", "jim123").toDocument());
		documents.add(new User("Hoe", "hoe@example.com", "hoe123").toDocument());
		documents.add(new User("Tim", "tim@example.com", "tim123").toDocument());
		
		DB db = new DB();
		//db.addUserToCollection(user);
		
		//db.addManyUsers(documents);
		
		db.fetchAllDocuments();
		
		//db.fetchUser("email", "jim@example.com");
		//db.updateUser("email", "tim@example.com", "tim.watson@example.com");
		//db.deleteUser("email", "jim.watson@example.com");
	}
	
}

// Assignment: replicate CMSApp with MongoDB :)
