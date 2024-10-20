package isp;

public class SMSSender {
    public static void sendSMS(SMSable recipient, String message) {
        // Telefono zenbakia jasotzen dugu eta mezua bidaltzen dugu
        String telephoneNumber = recipient.getTelephone();
        System.out.println("SMS sent to: " + telephoneNumber + " with message: " + message);
    }
}
