package databasehandler;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;

import com.mongodb.client.MongoCollection;

import utility.MongoDbConnect;

/**
 * @author Akshata
 *
 */
public class MongodbHandler implements MongoInterface {
	@Override /*insert function used to out data in to database*/
	public int insert(JSONObject data,String collectionName) {
		MongoDbConnect utility = new utility.MongoDbConnect();
		MongoCollection<Document> col = utility.getCollection(collectionName);
		Document doc = Document.parse(data.toString());
		col.insertOne(doc);
		return 1;
	}
@Override /*update function used to update the existing data in to database*/
	public int update(JSONObject data, JSONObject filter,String collectionName) {
		MongoDbConnect utility = new MongoDbConnect();
		MongoCollection<Document> col = utility.getCollection(collectionName);
		Bson updateData = Document.parse(data.toString());
		Bson updateFilter = Document.parse(filter.toString());
		Bson modifiedData = new Document("$set", updateData);
		col.updateOne(updateFilter, modifiedData);
		return 1;
	}
@Override  /*retrieve function used to get the existing data from to database*/
public List<String> retrieve(JSONObject data,String collectionName) {
	MongoDbConnect utility = new MongoDbConnect();
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
	MongoDbConnect utility = new MongoDbConnect();
	MongoCollection<Document> col = utility.getCollection(collectionName);
	Bson filter = Document.parse(data.toString());
	col.deleteMany(filter);
	return 1;
}
}
