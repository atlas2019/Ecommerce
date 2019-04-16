package order;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import common.CommonRandomNum;
import databasehandler.MongodbHandler;
import utility.EmailNotification;
import utility.SessionManager;
import databasehandler.MongoInterface;

/**
 * @author Akshata
 *
 */
public class OrderHandlerImpl implements OrderHandler {
	MongoInterface mongodbHandler;

	public int createOrder(String input) {
		mongodbHandler = new MongodbHandler();
		long orderId = CommonRandomNum.createRandomNumber();

		int result = 0;
		try {
			JSONObject data = new JSONObject(input);
			String sessiondt = SessionManager.getSession(data.getString("token"));
			if (sessiondt != null) {
				JSONObject session = new JSONObject(sessiondt);
				data.remove("token");
				data.put("userid", session.get("userid"));
				data.put("orderId", orderId);
			result = mongodbHandler.insert(data, "Order");
			EmailNotification.sendEmail(data.getString("email"), "Order "+orderId, "Your Order Placed Successfully");
		}
		}catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public List<Order> fetchOrder(String input) {
		mongodbHandler = new MongodbHandler();

		List<Order> order = new ArrayList<Order>();
		List<String> order1 = new ArrayList<String>();
		int result = 0;
		try {
			JSONObject data = new JSONObject(input);

			String sessiondt = SessionManager.getSession(data.getString("token"));

			if (sessiondt != null) {
				JSONObject session = new JSONObject(sessiondt);
				data.remove("token");
				data.put("userid", session.get("userid"));
				Gson g = new Gson();
				order1 = mongodbHandler.retrieve(data, "Order");
				for (String i : order1) {

					order.add(g.fromJson(i, Order.class));
				}
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

}
