package user;
import java.util.List;
import org.json.JSONException;

public interface UserMangerInterface {
	int create(String data) throws JSONException;
	int update(String data) throws JSONException;
	List<UserRegistration> retrieve(String data) throws JSONException ;


}