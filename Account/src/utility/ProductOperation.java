package utility;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;


import com.google.gson.Gson;

import cart.Cartitems;
import databasehandler.MongodbHandler;
import databasehandler.MongoInterface;

public class ProductOperation {
	MongoInterface mongodbHandler;
	public int create(String data) throws JSONException {
		mongodbHandler = new MongodbHandler();
		int i = 0;
			i = mongodbHandler.insert(new JSONObject(data), "Product");

		return i;
	}
	


	public List<Product> fetchproduct(String input) {
		mongodbHandler=new MongodbHandler();
	
		List<Product> product=new ArrayList<Product>();
		List<String> product1=new ArrayList<String>();
		int result=0;
		try {
		JSONObject data=new JSONObject(input);
		Gson g=new Gson();
		product1=	mongodbHandler.retrieve(data,"Product");
		for(String i:product1) {
		
			
			product.add(g.fromJson(i,Product.class));
		}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

}
