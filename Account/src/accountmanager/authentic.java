package accountmanager;
import java.util.List;
import org.json.JSONException;

public interface authentic {
	int create(String data) throws JSONException;
	int update(String data) throws JSONException;
	int retrieve(String data) throws JSONException ;


}