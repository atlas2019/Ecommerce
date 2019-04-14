package productmanager;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;


//import productmanager.mobileoperation;

@Path("/")
public class Restapi {
@Path("/create")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public int insertmobile(String data) {
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
@Path("/retrieve")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public List<Product> retrieveProduct(String data) {
	ProductOperation op=new ProductOperation();
	List<Product> result=new ArrayList<Product>();
	try {
		result= op.retrieve(data);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}


}




//package productmanager;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import productmanager.ProductOperation;
////import user.UserManger;
////import utility.Product;
//
//@Path("/")
//public class Restapi {
//
//	@Path("/")
//	public class restapi {
//	@Path("/create")
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public int insertmobile(String data) {
//		int result=0;
//		ProductOperation op=new ProductOperation();
//		try {
//			result= op.create(data);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}
//
//@Path("/fetch")
//@POST
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//
//public List<Product>	fetchproduct(String data) {
//	ProductOperation o=new ProductOperation();
//	List<Product> result=new ArrayList<Product>();
//	
//		result=o.fetchproduct(data);
//	
//	
//	return result;
//}
////@Path("/retrieve")
////@POST
////@Consumes(MediaType.APPLICATION_JSON)
////@Produces(MediaType.APPLICATION_JSON)
////
////public List<Product> retrieveproduct(JSONObject data) {
////	ProductOperation  op=new ProductOperation ();
////	List<Product> result=new ArrayList<Product>();
////	try {
////		result= op.retrieveproduct(data);
////	} catch (JSONException e) {
////		// TODO Auto-generated catch block
////		e.printStackTrace();
////	}
////	return result;
////}
//
//	}
//}
