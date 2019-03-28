package accountmanager;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import databasehandler.MongodbHandler;
import accountmanager.authentic;


public class accountmanage implements authentic{
	@Override
	public int create(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		int i = 0;
			i = op.insert(new JSONObject(data));

		return i;
	}
	@Override
	public int update(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		int i = 0;
			JSONObject jsonData = new JSONObject(data);
			JSONObject updateData = (JSONObject) jsonData.get("data");
			JSONObject filterData = (JSONObject) jsonData.get("filter");
			i = op.update(updateData, filterData);
		return i;

	}
	@Override
	public int retrieve(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		List<String> userdata = new ArrayList<String>();
		//List<user> users = new ArrayList<user>();
		userdata = op.retrieve(new JSONObject(data));

		return userdata.size();
	
	}

}



