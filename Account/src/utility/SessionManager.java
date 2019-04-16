
package utility;

import common.CommonRandomNum;
import redis.clients.jedis.Jedis;

public class SessionManager {

	public static String createSession(String input) {
		Jedis jedis = new Jedis();
		String token = String.valueOf(CommonRandomNum.createRandomNumber());
		jedis.setex(token, 1000, input);
		return token;
	}

	public static String getSession(String input) {
		Jedis jedis = new Jedis();
		String value = jedis.get(input);
		if (value != null) {
			jedis.setex(input, 1000, value);
		}
		return value;
	}

	public static void deleteSession(String input) {
		Jedis jedis = new Jedis();
		jedis.del(input);

	}
	
	public static void main (String args[]) {
		System.out.print(getSession("121"));
	}
}
