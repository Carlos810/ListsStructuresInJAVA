package App;

import Polimorfism.*;
import TiposAvanzados.TiposAvanzadosDoc;
import TiposListas.TiposListasDoc;

public class Main {

    public static void main(String[] args) {

        TiposAvanzadosDoc advancedObject = new TiposAvanzadosDoc();
        advancedObject.PrintAdvancedTypes();

        TiposListasDoc listaObject = new TiposListasDoc();
        listaObject.PrintListsExamples();

        Calculator calculator = new Calculator();
        double total = calculator.execute(new SumOperation(), 10, 5);
        double priceWithTax = calculator.execute(new TaxOperation(), 100, 0.16);
        double discounted = calculator.execute(new Percentage(), 200, 0.10);
        System.out.println("Suma: " + total);
        System.out.println("Precio con impuesto: " + priceWithTax);
        System.out.println("Precio con descuento: " + discounted);
    }
}