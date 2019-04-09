package productmanager;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.JSONObject;
import com.mongodb.client.MongoCollection;

import productmanager.Mongodboperation;
import productmanager.utility;

public class Mongodboperation {
	int insert(JSONObject data) {
		utility utility = new utility();
		MongoCollection<Document> col = utility.getCollection();
		Document doc = Document.parse(data.toString());
		col.insertOne(doc);
		return 1;
	}
	List<String> retrieve(JSONObject data) {
		utility utility = new utility();
		MongoCollection<Document> col = utility.getCollection();
		List<String> retrieveData = new ArrayList<String>();
		for (Document i : col.find()) {
			retrieveData.add(i.toJson());
		}
		return retrieveData;
	}
	
	
}
	

	
