package com.eacuamba.java_como_programar.chapter_10._10_9_creating_and_using_interfaces.creating_and_using_interfaces;

import java.text.NumberFormat;
import java.util.Locale;

public class PayableInterfaceContext {
    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[4];
        payableObjects[0] = new Invoice(
                "123456789",
                "Wheel",
                10,
                3_500D
        );
        payableObjects[1] = new Invoice(
                "987456321",
                "Boxe",
                5,
                200D
        );
        payableObjects[2] = new SalariedEmployee(
                "Edilson",
                "Cuamba",
                "1010101010",
                20_000D
        );
        payableObjects[3] = new SalariedEmployee(
                "Gopo",
                "Filde",
                "28928282",
                15_500D
        );

        System.out.printf("%s%n", "Printing the Inveice and Employee instances  polymorphically.");

        for(Payable payable: payableObjects){
            System.out.println("This is a class: " + payable.getClass());
            System.out.println(payable.toString());
            System.out.printf("%s%s%n%n", "Payment due: ", formatToMetical(payable.getPaymentAmount()));

        }

    }
    public static String formatToMetical(double payments){
        return NumberFormat.getCurrencyInstance(new Locale("pt", "MZ")).format(payments);
    }
}
