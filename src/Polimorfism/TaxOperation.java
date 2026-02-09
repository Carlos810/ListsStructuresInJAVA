package Polimorfism;

import Interfaces.IOperation;

public class TaxOperation implements IOperation {
    public double apply(double base, double taxRate) {
        return base + (base * taxRate);
    }
}
