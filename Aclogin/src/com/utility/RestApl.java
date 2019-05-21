package com.utility;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import com.user.AccManager;


@Path("/")
public class RestApl {
	
@Path("/create")
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public int insert(String data) {
	int result=0;
	AccManager op=new AccManager();
	try {
		result= op.create(data);
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

public List<String> retrievedata(String data) {
	AccManager op=new AccManager();
	List<String> result=new ArrayList<String>();
	try {
		result=op.retrieve(data);
	}
	catch(JSONException e) {
		e.printStackTrace();
	}
	return result;
}
}


