package utility;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import databasehandler.mongoint;


public class mongohandler {
	public MongoCollection<Document> getCollection() {
	MongoClient mongoClient = new MongoClient();
	MongoDatabase database = mongoClient.getDatabase("Account");
	MongoCollection<Document> coll = database.getCollection("Test");
	return coll;
}
}