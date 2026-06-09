package abstractionProgram;

import java.util.Scanner;


public class Qsn2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your choice: ");
		int ch = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your Massage: ");
		String Msg = sc.nextLine();
		
		MessageService m = MessageFactory.getService(ch);
		
		NotificationService n = new NotificationService();
		n.notifyUser(m, Msg);
		
	}
}


//Interface(Abstraction Layer)
interface MessageService{
	boolean sendMessage(String message);
}

//Implementation Classes (System 2)

class EmailService implements MessageService{
	public boolean sendMessage(String massage) {
		System.out.println("Sends message via Email");
		return true;
	}
}

class SMSService implements MessageService{
	public boolean sendMessage(String massage) {
		System.out.println("Sends message via SMS");
		return true;
	}
}

class WhatsAppService implements MessageService{
	public boolean sendMessage(String massage) {
		System.out.println("Sends message via WhatsApp");
		return true;
	}
}


//Notification System Class (System 1)

class NotificationService{
	void notifyUser(MessageService service, String message) {
		if(service.sendMessage(message)) {
			System.out.println("Notification sent successfully");
		}
		else {
			System.out.println("Notification failed");
		}
	}
}

class MessageFactory{
	public static MessageService getService(int choice) {
		MessageService m = null;
		switch(choice) {
			case 1 -> m = new EmailService();
			
			case 2 -> m = new SMSService();
			
			case 3 -> m = new WhatsAppService();
			
			default -> System.out.println("Invalid Choice...");
		}
		return m;
	}
}