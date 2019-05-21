package com.database;

import java.util.List;

import org.json.JSONObject;

public interface DbHandlerInterface {
	int insert(JSONObject data,String collectionName);
	List<String> retrieve(JSONObject data,String collectionName);
	int delete (JSONObject data,String collectionName);

}
