package productmanager;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class utility {
	MongoCollection<Document> getCollection() {

		@SuppressWarnings("resource")
		MongoClient mongoClient = new MongoClient();
		MongoDatabase database = mongoClient.getDatabase("Product");
		MongoCollection<Document> coll = database.getCollection("Test");
		return coll;

	}

}
