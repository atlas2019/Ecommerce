package utility;
import org.json.JSONException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import accountmanager.accountmanage;

@Path("/")
public class mongoapi {
	
@Path("/create")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int insertStudent(String data) {
	int result=0;
	accountmanage op=new accountmanage();
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
	accountmanage op=new accountmanage();
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

public int	retrieveEcommerce(String data) {
	accountmanage op=new accountmanage();
	int result=0;
	try {
		result=op.retrieve(data);
	}
	catch(JSONException e) {
		e.printStackTrace();
	}
	return result;
}
}




