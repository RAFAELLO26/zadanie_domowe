import java.util.Scanner;

import static java.lang.System.in;

import java.util.Locale;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Witaj w aplikacji KALKULATOR!");
        Calculator calc = new Calculator();
        calc.choiceOperation();
    }

    void choiceOperation() {
        boolean calculate = true;
        Scanner scan = new Scanner(in);
        byte number;

        while (calculate) {
            System.out.println("Wybierz numer działania, które chcesz wykonać:");
            System.out.println("1. dodawanie");
            System.out.println("2. odejmowanie");
            System.out.println("3. mnożenie");
            System.out.println("4. dzielenie");
            System.out.println("5. Łączenie wyrazów");
            System.out.println("6. ZAKOŃCZ");
            number = scan.nextByte();

            while (number < 1 || number > 6) {
                System.out.println("Podałeś zły numer!");
                number = scan.nextByte();
            }

            switch (number) {
                case 1:
                    System.out.println("Wybrałeś dodawanie");
                    addOperation();
                    break;
                case 2:
                    System.out.println("Wybrałeś odejmowanie");
                    subOperation();
                    break;
                case 3:
                    System.out.println("Wybrałeś mnożenie");
                    mulOperation();
                    break;
                case 4:
                    System.out.println("Wybrałeś dzielenie");
                    divOperation();
                    break;
                case 5:
                    System.out.println("Wybrałeś łączenie wyrazów");
                    concatOperation();
                    break;
                case 6:
                    calculate = false;
                    System.out.println("Do zobaczenia!");
            }
        }
    }

    static void addOperation() {
        double a, b;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj pierwszą liczbę:");
        System.out.print(">>");
        a = scan1.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        System.out.print(">>");
        b = scan1.nextDouble();
        System.out.println(a + "+" + b + "=" + roundTo4DecimalPlace(a + b));
        System.out.println();
    }

    static void subOperation() {
        double a, b;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj pierwszą liczbę:");
        System.out.print(">>");
        a = scan1.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        System.out.print(">>");
        b = scan1.nextDouble();
        System.out.println(a + "-" + b + "=" + roundTo4DecimalPlace(a - b));
        System.out.println();
    }

    static void mulOperation() {
        double a, b;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj pierwszą liczbę:");
        System.out.print(">>");
        a = scan1.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        System.out.print(">>");
        b = scan1.nextDouble();
        System.out.println(a + "*" + b + "=" + roundTo4DecimalPlace(a * b));
        System.out.println();
    }

    static void divOperation() {
        double a, b;
        Scanner scan1 = new Scanner(in);
        scan1.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        System.out.println("Podaj pierwszą liczbę:");
        System.out.print(">>");
        a = scan1.nextDouble();
        System.out.println("Podaj drugą liczbę różną od zera:");
        System.out.print(">>");
        b = scan1.nextDouble();
        while (b == 0.0) {
            System.out.println("Podaj liczbę różną od zera:");
            b = scan1.nextDouble();
        }
        System.out.println(a + "/" + b + "=" + roundTo4DecimalPlace(a / b));
        System.out.println();
    }

    static double roundTo4DecimalPlace(double value) {
        return Math.round(value * 10000.0) / 10000.0;
    }

    void concatOperation() {
        System.out.println("Podaj liczbę wyrazów do połącznia (max 20):");
        Scanner scan2 = new Scanner(in);
        String sentence = "";
        String word;
        byte count = scan2.nextByte();
        while (count < 2 || count > 20) {
            System.out.println("Podaj liczbę od 2 do 20:");
            count = scan2.nextByte();
        }
        scan2.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("Podaj " + (i + 1) + " słowo:");
            word = scan2.nextLine();
            if (word.contains(" "))  //jeśli podano więcej słów niż jedno, to wybierz pierwsze
                word = word.substring(0, word.indexOf(" "));
            sentence = sentence + word + " ";
        }
        sentence = sentence.trim();
        System.out.println(sentence);
    }
}
