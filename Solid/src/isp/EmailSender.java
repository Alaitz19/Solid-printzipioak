package isp;

public class EmailSender {
    public static void sendEmail(Emailable recipient, String message) {
        // Email helbidea jasotzen dugu eta mezua bidaltzen dugu
        String emailAddress = recipient.getEmail();
        System.out.println("Email sent to: " + emailAddress + " with message: " + message);
    }
}
