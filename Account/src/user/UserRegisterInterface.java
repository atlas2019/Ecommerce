package user;
import java.util.List;
import org.json.JSONException;

public interface UserRegisterInterface {
	int create(String data) throws JSONException;
	int update(String data) throws JSONException;
	int retrieve(String data) throws JSONException ;


}
