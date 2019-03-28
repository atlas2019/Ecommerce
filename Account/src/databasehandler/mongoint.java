package databasehandler;

import java.util.List;

import org.json.JSONObject;

public interface mongoint {
	int insert(JSONObject data);
	int update(JSONObject data, JSONObject filter);
	List<String> retrieve(JSONObject data);

}
