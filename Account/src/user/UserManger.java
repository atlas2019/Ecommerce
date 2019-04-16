package user;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import common.CommonRandomNum;
import databasehandler.MongodbHandler;
import utility.SessionManager;


public class UserManger implements UserMangerInterface{
	@Override
	public int create(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		 JSONObject inputJson=new JSONObject(data);
		 int i = 0;
		 if(inputJson.has("email") && inputJson.has("password")) {
		 
		 
		 inputJson.put("userid", CommonRandomNum.createRandomNumber());
		
			i = op.insert(inputJson,"Test");
		 }
		return i;
	}
	public int createReg(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		 JSONObject inputJson=new JSONObject(data);
		// inputJson.put("userid", Common.createRandomNumber());
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
	public String retrieve(String data) throws JSONException {
		MongodbHandler op = new MongodbHandler();
		List<String> userdata = new ArrayList<String>();
		
		userdata = op.retrieve(new JSONObject(data),"Test");
		String token=null;
		List<UserRegistration> userinfo=new ArrayList<UserRegistration>();
		Gson gson=new Gson();
				for(String i:userdata) {
			userinfo.add(gson.fromJson(i, UserRegistration.class));
		}
				if(userinfo.size()>0) {
					JSONObject seJsonObject=new JSONObject();
					seJsonObject.put("userid", userinfo.get(0).getUserid());
					seJsonObject.put("email", userinfo.get(0).getEmail());
					token=SessionManager.createSession(seJsonObject.toString());
				}
		return token;
	
	}

}



