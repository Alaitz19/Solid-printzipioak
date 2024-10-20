package isp;

public class Proba {
	  public static void main(String[] args) {
	        // GmailAccount objektu bat sortu
	        GmailAccount gmailAccount = new GmailAccount("Alaitz ye", "aye@gmail.com");

	        // Email bat bidali
	        EmailSender.sendEmail(gmailAccount, "Kaixo, email test bat da!");
	    }
}
