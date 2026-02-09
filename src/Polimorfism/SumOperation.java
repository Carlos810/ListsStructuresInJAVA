package Polimorfism;

import Interfaces.IOperation;

public class SumOperation  implements IOperation {
    public double apply(double a, double b) {
        return a + b;
    }
}

