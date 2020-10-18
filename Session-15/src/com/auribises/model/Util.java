package com.auribises.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {

	// Symbolic Constants
	public static final String URI = "mongodb://atpl:atpl1234@cluster0-shard-00-00.hexb7.mongodb.net:27017,cluster0-shard-00-01.hexb7.mongodb.net:27017,cluster0-shard-00-02.hexb7.mongodb.net:27017/auridb?ssl=true&replicaSet=atlas-fig0j8-shard-0&authSource=admin&retryWrites=true&w=majority";
	public static final String DB_NAME = "auridb";
	public static final String COLLECTION_USERS = "users";
	public static final String COLLECTION_CUSTOMERS = "customers";
	
	//Making your strings secure
	public static String encryptStirng(String input) {
		String encryptedOutput = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			digest.update(input.getBytes());
			
			encryptedOutput = new String(digest.digest());
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return encryptedOutput;
	}
	
}
