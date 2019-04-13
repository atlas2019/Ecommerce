package utility;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cart.CartOperation;
import cart.Cartitems;
import order.Order;
import order.OrderHandlerImpl;
import user.UserLogin;
import user.UserRegistration;
import user.UserManger;

@Path("/")
public class ApiCall {
	
@Path("/create")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int insertStudent(String data) {
	int result=0;
	UserManger op=new UserManger();
	try {
		result= op.create(data);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
@Path("/createproduct")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int insertproduct(String data) {
	int result=0;
	ProductOperation op=new ProductOperation();
	try {
		result= op.create(data);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
@Path("/update")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int updateStudent(String data) {
	UserManger op=new UserManger();
	int result=0;
	try {
		result= op.update(data);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
@Path("/authenticate")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public List<UserRegistration>	retrieveEcommerce(String data) {
	UserManger op=new UserManger();
	List<UserRegistration> result=null;
	try {
		result=op.retrieve(data);
	}
	catch(JSONException e) {
		e.printStackTrace();
	}
	return result;
}
@Path("/fetchproduct")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public List<Product>	fetchproduct(String data) {
	ProductOperation o=new ProductOperation();
	List<Product> result=new ArrayList<Product>();
	
		result=o.fetchproduct(data);
	
	
	return result;
}

@Path("/createOrder")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int	createOrder(String data) {
	OrderHandlerImpl o=new OrderHandlerImpl();
	int result=0;
	
		result=o.createOrder(data);
	
	
	return result;
}
@Path("/fetch")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public List<Order>	fetchOrder(String data) {
	OrderHandlerImpl o=new OrderHandlerImpl();
	List<Order> result=new ArrayList<Order>();
	
		result=o.fetchOrder(data);
	
	
	return result;
}
@Path("/createCart")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int	createCart(String data) {
	CartOperation o=new CartOperation();
	int result=0;
	
		result=o.createCart(data);
	
	
	return result;
}
@Path("/delete")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int deleteStudent(String data) {
	int result=0;
	CartOperation op=new CartOperation();
	try {
		result= op.delete(data);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}
@Path("/fetchCart")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public List<Cartitems>	fetchcart(String data) {
	CartOperation o=new CartOperation();
	List<Cartitems> result=new ArrayList<Cartitems>();
	
		result=o.fetchCart(data);
	
	
	return result;
}
}



