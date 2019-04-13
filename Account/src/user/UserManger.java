package user;
import order.Order;
import user.UserMangerInterface;
import utility.CommonRandomNum;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import databasehandler.MongodbHandler;


public class UserManger implements UserMangerInterface{
	@Override
	public int create(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		 JSONObject inputJson=new JSONObject(data);
		 inputJson.put("userid", CommonRandomNum.createRandomNumber());
		int i = 0;
			i = op.insert(inputJson,"Test");

		return i;
	}
	@Override
	public int update(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		int i = 0;
			JSONObject jsonData = new JSONObject(data);
			JSONObject updateData = (JSONObject) jsonData.get("data");
			JSONObject filterData = (JSONObject) jsonData.get("filter");
			i = op.update(updateData, filterData,"Test");
		return i;

	}
	@Override
	public List<UserRegistration> retrieve(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		List<String> userdata = new ArrayList<String>();
		userdata = op.retrieve(new JSONObject(data),"Test");
		List<UserRegistration> userinfo=new ArrayList<UserRegistration>();
		Gson gson=new Gson();
				for(String i:userdata) {
			userinfo.add(gson.fromJson(i, UserRegistration.class));
		}
		return userinfo;
	
	}

}



