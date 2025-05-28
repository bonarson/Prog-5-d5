package com.example.demo_spect.model;

public enum CoffeeType {
    EXPRESSO("Expresso", 2.0),
    LATTE("Latte", 3.0),
    CAPPUCCINO("Cappuccino", 3.5);

    private final String label;
    private final double price;

    CoffeeType(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    public static void displayMenu() {
        System.out.println("\nMenu :");
        for (int i = 0; i < values().length; i++) {
            CoffeeType coffee = values()[i];
            System.out.printf("%d. %s - %.2f €%n", i + 1, coffee.getLabel(), coffee.getPrice());
        }
        System.out.printf("%d. Quitter%n", values().length + 1);
    }

    public static CoffeeType fromChoice(int choice) {
        if (choice < 1 || choice > values().length) {
            throw new IllegalArgumentException("Option invalide.");
        }
        return values()[choice - 1];
    }

    public static int quitOption() {
        return values().length + 1;
    }
}
