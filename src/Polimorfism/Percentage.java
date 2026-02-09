package Polimorfism;

import Interfaces.IOperation;

public class Percentage implements IOperation {
    public double apply(double price, double discount) {
        return price - (price * discount);
    }
}
