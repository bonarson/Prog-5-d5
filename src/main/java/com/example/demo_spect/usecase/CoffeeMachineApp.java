package com.example.demo_spect.usecase;

import com.example.demo_spect.exception.InvalidChoiceException;
import com.example.demo_spect.exception.PaymentException;
import com.example.demo_spect.model.CoffeeType;
import com.example.demo_spect.service.CoffeeService;
import com.example.demo_spect.service.PaymentService;

import java.util.Scanner;

public class CoffeeMachineApp {

    private final Scanner scanner = new Scanner(System.in);
    private final PaymentService paymentService = new PaymentService();
    private final CoffeeService coffeeService = new CoffeeService();

    public void start() {
        System.out.println("Bienvenue dans la machine à café !");

        while (true) {
            try {
                CoffeeType.displayMenu();
                System.out.print("Veuillez choisir une option : ");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == CoffeeType.quitOption()) {
                    System.out.println("Merci d’avoir utilisé la machine à café. À bientôt !");
                    break;
                }

                CoffeeType selectedCoffee = CoffeeType.fromChoice(choice);
                double price = selectedCoffee.getPrice();
                System.out.printf("Prix du %s : %.2f €%n", selectedCoffee.getLabel(), price);

                System.out.print("Veuillez entrer un billet (2, 5, 10) € : ");
                double bill = Double.parseDouble(scanner.nextLine());

                if (bill != 2 && bill != 5 && bill != 10) {
                    throw new PaymentException("Billet invalide. Veuillez insérer 2, 5 ou 10 euros.");
                }

                // Étape paiement
                paymentService.processPayment(price, bill);

                // Étape café
                coffeeService.prepare(selectedCoffee);

            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide : vous devez entrer un chiffre.");
            } catch (IllegalArgumentException | InvalidChoiceException e) {
                System.out.println("Erreur : " + e.getMessage());
            } catch (PaymentException e) {
                System.out.println("Erreur de paiement : " + e.getMessage());
            }
        }
    }
}
