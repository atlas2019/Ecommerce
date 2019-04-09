package productmanager;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;


import com.google.gson.Gson;

import productmanager.Mongodboperation;

public class mobileoperation {
	int create(String data) throws JSONException {
		Mongodboperation op = new Mongodboperation();
		int i = 0;
			i = op.insert(new JSONObject(data));

		return i;
	}
	
	List<mobile> retrieve(String data) throws JSONException {
		Mongodboperation op = new Mongodboperation();
		List<String> studentData = new ArrayList<String>();
		List<mobile> students = new ArrayList<mobile>();
		studentData = op.retrieve(new JSONObject(data));

		for (String i : studentData) {
			Gson gson = new Gson();
			students.add(gson.fromJson(i, mobile.class));

		}

		return students;
	}

}
