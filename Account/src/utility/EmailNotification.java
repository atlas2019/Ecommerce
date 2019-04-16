package utility;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author avikdas
 *
 */
public class EmailNotification {

	public static void sendEmail(String toEmail, String subject, String body) {
		try {
			Properties props=new Properties();
			props=readProperties();
			final String fromEmail = (String)props.getProperty("fromEmail");
			final String password = (String)props.getProperty("password");
			
			Authenticator auth = new Authenticator() {
				// override the getPasswordAuthentication method
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromEmail, password);
				}
			};

			Session session = Session.getDefaultInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			// set message headers
			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
			msg.addHeader("format", "flowed");
			msg.addHeader("Content-Transfer-Encoding", "8bit");

			msg.setFrom(new InternetAddress("no_reply@atlas.com", "NoReply-AT"));

			msg.setReplyTo(InternetAddress.parse("no_reply@atlas.com", false));

			msg.setSubject(subject, "UTF-8");

			msg.setText(body, "UTF-8");

			msg.setSentDate(new Date());

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));

			Transport.send(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Properties readProperties() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
		props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); //SMTP Port
		
		props.put("fromEmail", "atlasapp19@gmail.com"); //SMTP Port
		props.put("password", "atlas@2019"); //SMTP Port
		
		return props;
		
	}

	
	public static void main(String[] args) throws IOException {

		sendEmail("devdasaks821@gmail.com", "Your Order Placed Successfully", "Atlas Ecommerce");

	}

}

