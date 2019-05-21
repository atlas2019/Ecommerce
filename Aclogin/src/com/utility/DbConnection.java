package com.utility;

import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.database.DbHandlerInterface;

public class DbConnection {
public MongoCollection<Document> getCollection(String collectionName) {
	MongoClient mongoClient = new MongoClient();
	MongoDatabase database = mongoClient.getDatabase("Aclogin");
	MongoCollection<Document> collection = database.getCollection(collectionName);
	return collection;
}
}
