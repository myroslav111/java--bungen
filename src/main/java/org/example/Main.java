package org.example;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Taschenrehner taschenrehner = new Taschenrehner();


//        System.out.println("Herzlich willkommen in Taschenrechner! Hier kann nur Ganzzahlzählung verwendet werden");
//
//        boolean fortfahren = true;
//
//        while (fortfahren){
//            char operation;
//            int x;
//            int y;
//
//            System.out.println("Wähle die Operation +, -, / oder *. Dann drück enter");
//            operation = scanner.next().charAt(0);
//
//            System.out.println("Gib die Zahlen");
//            x = scanner.nextInt();
//            y = scanner.nextInt();
//
//            switch (operation){
//                case '+':
//                    taschenrehner.add(x, y);
//                    break;
//
//                case '-':
//                    taschenrehner.min(x, y);
//                    break;
//
//                case '*':
//                    taschenrehner.mul(x, y);
//                    break;
//
//                case '/':
//                    taschenrehner.div(x, y);
//                    break;
//
//                default:
//                    System.out.println("Gib den richtigen Befehl ein");
//            }
//
//            System.out.println("Willst du fortfahren j/n");
//
//            fortfahren = (scanner.next().charAt(0) == 'j') ? true: false;
//
//
//        }




        //Anzahl von Waren

        //Kassenbon
        // Anzahl Waren
        int anzahlWaren1 = 1;
        int anzahlWaren2 = 1;
        int anzahlWaren3 = 1;
        int anzahlWaren4 = 2;

        //Einzelpreise der Waren
        double einzelpreise1 = 4.20;
        double einzelpreise2 = 4.20;
        double einzelpreise3 = 4.20;
        double einzelpreise4 = 4.20;

        double inhaltBrieftasche = 40.0;

        double gesamt = (anzahlWaren1 * einzelpreise1) + (anzahlWaren2 * einzelpreise2) + (anzahlWaren3 * einzelpreise3) + (anzahlWaren4 * einzelpreise4);

        if (gesamt > inhaltBrieftasche) {
            double unterschid = gesamt - inhaltBrieftasche;

            System.out.println("Es reicht nicht der Inhalt der Brieftasche für den Einkauf aus. Fehlt noch: " + unterschid);
        }else {
            double restgeld = inhaltBrieftasche - gesamt;

            // Kassenbon ausgeben
            System.out.println("----- KASSENBON -----");
            System.out.println("Anzahl | Artikel | Einzelpreis | Gesamt");
            System.out.println("--------------------------------------");
            System.out.println(anzahlWaren1 + "      | Ware 1  | " + einzelpreise1 + " €       | " +
                    (anzahlWaren1 * einzelpreise1) + " €");
            System.out.println(anzahlWaren2 + "      | Ware 2  | " + einzelpreise2 + " €       | " +
                    (anzahlWaren2 * einzelpreise2) + " €");
            System.out.println(anzahlWaren3 + "      | Ware 3  | " + einzelpreise3 + " €       | " +
                    (anzahlWaren3 * einzelpreise3) + " €");
            System.out.println(anzahlWaren4 + "      | Ware 4  | " + einzelpreise4 + " €       | " +
                    (anzahlWaren4 * einzelpreise4) + " €");
            System.out.println("--------------------------------------");
            System.out.println("Gesamtpreis: " + gesamt + " €");
            System.out.println("Gezahlter Betrag: " + inhaltBrieftasche + " €");
            System.out.println("Restgeld: " + restgeld + " €");
        }

            int menge = 0;
            double gesamtpreis = 0;
        while (inhaltBrieftasche >= 0){
            System.out.println("Gib die Zahl der Waren");
            int eingabe = scanner.nextInt();

            menge += eingabe;

            double bestellwert = Math.round((eingabe * einzelpreise1) * 100.0) / 100.0;

            System.out.println("Der Bestellwert beträgt: " + bestellwert);
            if (bestellwert >= inhaltBrieftasche){
                menge -= eingabe;

                System.out.println("Sie haben noch " + inhaltBrieftasche + " aber das reiht nicht.");
                System.out.println("----- KASSENBON -----");
                System.out.println("Anzahl | Artikel | Einzelpreis | Gesamt");
                System.out.println("--------------------------------------");
                System.out.println(menge + "      | Ware 1  | " + einzelpreise1 + " €       | " +
                        (menge * einzelpreise1) + " €");
                System.out.println("--------------------------------------");
                System.out.println("Gesamtpreis: " + Math.round(gesamtpreis * 100.0) / 100.0  + " €");
                System.out.println("Restgeld: " + Math.round(inhaltBrieftasche * 100.0) / 100.0 + " €");
                break;
            }
            gesamtpreis = menge * einzelpreise1;
            inhaltBrieftasche -= bestellwert;
            System.out.println("Gesamtpreis: " + Math.round(gesamtpreis * 100.0) / 100.0 );
            System.out.println("Rest: " + Math.round(inhaltBrieftasche * 100.0) / 100.0 );


        }

    }


}
