package com.user;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;


import com.database.DbHandler;
import com.google.gson.Gson;
import com.user.AccManagerInterface;

import com.database.DbHandler;
import com.user.UserReg;

import com.common.CommonRandomNum;

	public class AccManager implements AccManagerInterface{
		@Override
		public int create(String data) throws JSONException {
			DbHandler op = new DbHandler();
			 JSONObject inputJson=new JSONObject(data);
			 int i = 0;
			 if(inputJson.has("email") && inputJson.has("password")) {
			 
			 
			 inputJson.put("userid", CommonRandomNum.createRandomNumber());
			
				i = op.insert(inputJson,"Test");
			 }
			return i;
		}
//		public int createReg(String data) throws JSONException {
//			DbHandler op = new DbHandler();
//			 JSONObject inputJson=new JSONObject(data);
//			int i = 0;
//				i = op.insert(inputJson,"Test");
//
//			return i;
//		}
	@Override
	
//	public List<String> retrievedata(JSONObject data) {
//		DbHandler op = new DbHandler();
//		List<String> userdata = new ArrayList<String>();
//		//List<user> users = new ArrayList<user>();
//		userdata = op.retrieve(new JSONObject(data),"Test");
//
//		return userdata;
//	
//	}
		public List<String> retrieve(String data) throws JSONException {
			DbHandler op = new DbHandler();
			List<String> userdata = new ArrayList<String>();
			List<Userlogin> userinfo=new ArrayList<Userlogin>();
			userdata = op.retrieve(new JSONObject(data),"Test");
			for(String i:userdata) {
						Gson gson=new Gson();
				userinfo.add(gson.fromJson(i, Userlogin.class));
			}
					
		return userdata;
		
	}
}