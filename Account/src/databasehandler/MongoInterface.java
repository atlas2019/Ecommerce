package databasehandler;

import java.util.List;

import org.json.JSONObject;

public interface MongoInterface {
	int insert(JSONObject data,String collectionName);
	int update(JSONObject data, JSONObject filter,String collectionName);
	List<String> retrieve(JSONObject data,String collectionName);
	int delete (JSONObject data,String collectionName);

}
