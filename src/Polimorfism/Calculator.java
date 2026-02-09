package Polimorfism;

import Interfaces.IOperation;

public class Calculator {

    public double execute(IOperation operation, double a, double b) {
        return operation.apply(a, b);
    }
}
