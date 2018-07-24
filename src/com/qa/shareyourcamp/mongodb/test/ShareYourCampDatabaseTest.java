package com.qa.shareyourcamp.mongodb.test;

import java.util.Iterator;


import org.testng.annotations.Test;


import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ShareYourCampDatabaseTest {
	
	
	public static void  main(String[] args) throws  ClassNotFoundException {	
		try {
			DatabaseTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	@Test
	public static void DatabaseTest() throws Exception{
		
		try{   
			
	    	  
			//Connecting to the mongoDB instance
		        MongoClientURI mongoClientURI = new MongoClientURI(utilities.Constants.MongoConnect);
				@SuppressWarnings("resource")
				MongoClient mongoClient = new MongoClient( mongoClientURI );
				
			//Selecting the database
		        @SuppressWarnings("deprecation")
				DB db = mongoClient.getDB("shareyourcamp");
		        
		        //Selecting the collection
		        DBCollection collection = db.getCollection("users");
		        
		        DBCursor iterDoc = collection.find(); 
		        int i = 1; 
		        
		        // Getting the iterator 
		        Iterator<DBObject> it = iterDoc.iterator(); 
		      
		        while (it.hasNext()) {  
		           System.out.println(it.next());  
		        i++; 
		        
		        }
		}catch(Exception e){
			
			throw e;
			
		}
	
	}}
	
		   
	

