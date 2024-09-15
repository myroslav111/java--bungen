package org.example;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Taschenrehner taschenrehner = new Taschenrehner();


        System.out.println("Herzlich willkommen in Taschenrechner! Hier kann nur Ganzzahlzählung verwendet werden");

        boolean fortfahren = true;

        while (fortfahren){
            char operation;
            int x;
            int y;

            System.out.println("Wähle die Operation +, -, / oder *. Dann drück enter");
            operation = scanner.next().charAt(0);

            System.out.println("Gib die Zahlen");
            x = scanner.nextInt();
            y = scanner.nextInt();

            switch (operation){
                case '+':
                    taschenrehner.add(x, y);
                    break;

                case '-':
                    taschenrehner.min(x, y);
                    break;

                case '*':
                    taschenrehner.mul(x, y);
                    break;

                case '/':
                    taschenrehner.div(x, y);
                    break;

                default:
                    System.out.println("Gib den richtigen Befehl ein");
            }

            System.out.println("Willst du fortfahren j/n");

            fortfahren = (scanner.next().charAt(0) == 'j') ? true: false;


        }
    }
}
