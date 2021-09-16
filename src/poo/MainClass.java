package src.poo;

import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        Item tuna = new Item();
        tuna.name = "Gomez";
        tuna.price = 180.0;
        tuna.expirationDate = new Date( 2021, 8, 12);
        tuna.calculateTax();
        tuna.getTotalToPay();

        if (tuna.canItBeSold()) {
            System.out.println("Nombre del item: " + tuna.name);
            System.out.println("Precio del item: " + tuna.price);
            System.out.println("Impuesto del item: " + tuna.tax);
            System.out.println("Total a pagar por el item: " + tuna.getTotalToPay());
        }else {
            System.out.println("Nada");
        }
    }
}
