package productmanager;


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;

//import databasehandler.MongodbHandler;
import productmanager.Mongodboperation;
import productmanager.utility;
//import utility.Product;
import productmanager.utility;

/**
 * @author Akshata
 *
 */

// This operation is carried out on Product
public class ProductOperation {
	
	int create(String data) throws JSONException {
		Mongodboperation op = new Mongodboperation();
		int i = 0;
			i = op.insert(new JSONObject(data));

		return i;
	}
	
	List<Product> retrieve(String data) throws JSONException {
		Mongodboperation op = new Mongodboperation();
		List<String> productData = new ArrayList<String>();
		List<Product> products = new ArrayList<Product>();
		productData = op.retrieve(new JSONObject(data));

		for (String i : productData) {
			Gson gson = new Gson();
			products.add(gson.fromJson(i, Product.class));

		}

		return products;
	}

}