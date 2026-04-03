package SolidPrinciple;

public class OrderTest {
    public static void main(String[] args) {
        // Initialize services
        OrderCalculator calculator = new StandardOrderCalculator();
        OrderPlacer placer = new OrderRepository();
        NotificationService emailService = new EmailNotificationService();
        InvoiceGenerator invoiceGen = new PdfInvoiceGenerator();

        // Process basic order
        OrderProcessor processor = new OrderProcessor(calculator, placer);
        processor.process("John Doe", "123 Main St", 10.0, 2);

        // Optional steps are now independent
        invoiceGen.generateInvoice("order_123.pdf");
        emailService.sendNotification("Your order is on the way!", "johndoe@example.com");
    }
}
