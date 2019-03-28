package databasehandler;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.json.JSONObject;

import com.mongodb.client.MongoCollection;

import utility.mongohandler;

/**
 * @author Akshata
 *
 */
public class MongodbHandler implements mongoint {
	@Override /*insert function used to out data in to database*/
	public int insert(JSONObject data) {
		mongohandler utility = new utility.mongohandler();
		MongoCollection<Document> col = utility.getCollection();
		Document doc = Document.parse(data.toString());
		col.insertOne(doc);
		return 1;
	}
@Override /*update function used to update the existing data in to database*/
	public int update(JSONObject data, JSONObject filter) {
		mongohandler utility = new mongohandler();
		MongoCollection<Document> col = utility.getCollection();
		Bson updateData = Document.parse(data.toString());
		Bson updateFilter = Document.parse(filter.toString());
		Bson modifiedData = new Document("$set", updateData);
		col.updateOne(updateFilter, modifiedData);
		return 1;
	}
@Override  /*retrieve function used to get the existing data from to database*/
	public List<String> retrieve(JSONObject data) {
		mongohandler utility = new mongohandler();
		MongoCollection<Document> col = utility.getCollection();
		List<String> retrieveData = new ArrayList<String>();
		for (Document i : col.find()) {
			retrieveData.add(i.toJson());
		}
		return retrieveData;
	}
}
