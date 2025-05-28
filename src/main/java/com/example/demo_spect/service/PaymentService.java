package com.example.demo_spect.service;
import com.example.demo_spect.exception.PaymentException;

public class PaymentService {

    public void processPayment(double price, double bill) throws PaymentException {
        if (bill <= 0) {
            throw new PaymentException("Montant invalide. Veuillez insérer un billet positif.");
        }

        if (bill < price) {
            throw new PaymentException("Paiement insuffisant. Prix du café : " + price + " €, vous avez inséré : " + bill + " €.");
        }

        System.out.println("Paiement accepté.");

        double change = bill - price;
        if (change > 0) {
            System.out.printf(" Monnaie rendue : %.2f €\n", change);
        }
    }
}
