package com.user;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public interface AccManagerInterface {
	public int create(String data) throws JSONException ;
//public List<String> retrievedata(JSONObject data)throws JSONException ;
	//public String retrieve(String data) throws JSONException ;
List<String> retrieve(String data) throws JSONException;
}
