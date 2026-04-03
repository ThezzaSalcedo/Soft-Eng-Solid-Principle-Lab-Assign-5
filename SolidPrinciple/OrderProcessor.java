package SolidPrinciple;

class OrderProcessor {
    private final OrderCalculator calculator;
    private final OrderPlacer placer;

    public OrderProcessor(OrderCalculator calculator, OrderPlacer placer) {
        this.calculator = calculator;
        this.placer = placer;
    }

    public void process(String name, String address, double price, int qty) {
        double total = calculator.calculateTotal(price, qty);
        System.out.println("Total: $" + total);
        placer.placeOrder(name, address);
    }
}
