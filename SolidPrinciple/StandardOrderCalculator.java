package SolidPrinciple;

class StandardOrderCalculator implements OrderCalculator {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}

