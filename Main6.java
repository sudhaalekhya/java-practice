package inheritance;
//Interface for a message sender
public interface MessageSender {
 void sendMessage(String message);
}
//Implementation of MessageSender for Email
public class EmailMessageSender implements MessageSender {
 @Override
 public void sendMessage(String message) {
     // Logic to send message via email
     System.out.println("Sending email: " + message);
 }
}

//Implementation of MessageSender for SMS
public class SmsMessageSender implements MessageSender {
 @Override
 public void sendMessage(String message) {
     // Logic to send message via SMS
     System.out.println("Sending SMS: " + message);
 }
}

//Implementation of MessageSender for Push Notifications
public class PushNotificationSender implements MessageSender {
 @Override
 public void sendMessage(String message) {
     // Logic to send message via push notification
     System.out.println("Sending push notification: " + message);
 }
}
//Messaging service class
public class MessagingService {
 private MessageSender messageSender;

 // Constructor to initialize with a specific message sender
 public MessagingService(MessageSender messageSender) {
     this.messageSender = messageSender;
 }

 // Method to send a message
 public void send(String message) {
     messageSender.sendMessage(message);
 }
}
//Main class to demonstrate usage
public class Main6 {

	public static void main(String[] args) {
	      // Using different message senders
        MessageSender emailSender = new EmailMessageSender();
        MessageSender smsSender = new SmsMessageSender();
        MessageSender pushSender = new PushNotificationSender();

        // Creating messaging service instances with different senders
        MessagingService emailService = new MessagingService(emailSender);
        MessagingService smsService = new MessagingService(smsSender);
        MessagingService pushService = new MessagingService(pushSender);

        // Sending messages using different services
        emailService.send("Hello via email");
        smsService.send("Hello via SMS");
        pushService.send("Hello via push notification");
	}

}
