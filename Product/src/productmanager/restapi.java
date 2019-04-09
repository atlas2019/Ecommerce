package productmanager;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;


import productmanager.mobileoperation;

@Path("/")
public class restapi {
@Path("/create")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public int insertmobile(String data) {
	int result=0;
	mobileoperation op=new mobileoperation();
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

public List<mobile> retrieveStudent(String data) {
	mobileoperation op=new mobileoperation();
	List<mobile> result=new ArrayList<mobile>();
	try {
		result= op.retrieve(data);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
}


}
