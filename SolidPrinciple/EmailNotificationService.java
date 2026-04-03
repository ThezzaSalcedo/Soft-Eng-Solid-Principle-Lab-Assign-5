package SolidPrinciple;

class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }
}