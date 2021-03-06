package cart;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;

import common.CommonRandomNum;
//import accountmanager.authentic;
import databasehandler.MongodbHandler;
import order.Order;
import databasehandler.MongoInterface;
import utility.MongoDbConnect;
import utility.SessionManager;
public class CartOperation {
	MongoInterface mongodbhandler;
	//For creating cart item in cart collection.
	public int createCart(String input) {
		mongodbhandler=new MongodbHandler();
		long cartid=CommonRandomNum.createRandomNumber();
		int result=0;
		
		try {
		JSONObject data=new JSONObject(input);
		String sessiondt = SessionManager.getSession(data.getString("token"));
		if (sessiondt != null) {
			JSONObject session = new JSONObject(sessiondt);
			data.remove("token");
			data.put("userid", session.get("userid"));
		//data.put("cartId", cartid);
		result=	mongodbhandler.insert(data,"Cart");
		}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
		//for deleting a cart object
	public int delete(String data) throws JSONException {
		
		mongodbhandler = new MongodbHandler();
				int i = 0;
				i = mongodbhandler.delete(new JSONObject(data),"Cart");
				return i;
}
	//to fetch cart items
//	public List<Cartitems> fetchCart(String input) {
//		mongodbhandler=new MongodbHandler();
//	
//		List<Cartitems> cart=new ArrayList<Cartitems>();
//		List<String> cart1=new ArrayList<String>();
//		int result=0;
//		try {
//		JSONObject data=new JSONObject(input);
//		Gson g=new Gson();
//		cart1=	mongodbhandler.retrieve(data,"Cart");
//		for(String i:cart1) {
//		
//			
//			cart.add(g.fromJson(i, Cartitems.class));
//		}
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return cart;
//	}
	
	
	public List<Cartitems> fetchCart(String input) {
		mongodbhandler = new MongodbHandler();

		List<Cartitems> cart = new ArrayList<Cartitems>();
		List<String> cart1 = new ArrayList<String>();
		int result = 0;
		try {
			JSONObject data = new JSONObject(input);

			String sessiondt = SessionManager.getSession(data.getString("token"));

			if (sessiondt != null) {
				JSONObject session = new JSONObject(sessiondt);
				data.remove("token");
				data.put("userid", session.get("userid"));
				Gson g = new Gson();
				cart1 = mongodbhandler.retrieve(data, "Cart");
				for (String i : cart1) {

					cart.add(g.fromJson(i, Cartitems.class));
				}
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cart;
	}
	
	
	
}