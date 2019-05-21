package com.database;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;

import com.utility.DbConnection;



public class DbHandler implements DbHandlerInterface{
	
		public int insert (JSONObject data, String collectionName){
			DbConnection utility = new DbConnection();
			MongoCollection<Document> col = utility.getCollection(collectionName);
			Document doc = Document.parse(data.toString());
			col.insertOne(doc);
			return 1;
		}
		
		public List<String> retrieve(JSONObject data,String collectionName) {
			DbConnection utility = new DbConnection();
			MongoCollection<Document> col = utility.getCollection(collectionName);
			List<String> retrieveData = new ArrayList<String>();
			Bson filter = Document.parse(data.toString());
			
		   for (Document i :col.find(filter))
		   {
				retrieveData.add(i.toJson());
			}
			return retrieveData;
		}
		
		public int delete(JSONObject data,String collectionName) {
			DbConnection utility = new DbConnection();
			MongoCollection<Document> col = utility.getCollection(collectionName);
			Bson filter = Document.parse(data.toString());
			DeleteResult del=col.deleteMany(filter);
			return 1;
		}
			
			
			
			
		
	}


