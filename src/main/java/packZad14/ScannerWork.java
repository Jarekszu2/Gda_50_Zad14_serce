package packZad14;

import java.util.Scanner;

public class ScannerWork {
    Scanner scanner = new Scanner(System.in);

    public int getInt(int min, int max) {
        boolean flag = false;
        int result = 0;
        String stringInt = "";
        do {
            System.out.println();
            System.out.println("Podaj liczbę z przedziału od " + min + " do " + max + ":");
            stringInt = scanner.next();
            try {
                result = Integer.valueOf(stringInt);
            } catch (NumberFormatException e) {
                System.err.println("To nie jest liczba!");
            }
            if (result >= min && result <= max) {
                flag = true;
            } else {
                System.err.println("Liczba spoza zakresu!");
            }
        } while (!flag);
        return result;
    }

    public char getCharAW() {
        boolean flag = false;
        char znak = 'a';
        do {
            System.out.println();
            System.out.println("Wybierz: a/w ?");
            znak = scanner.next().charAt(0);
            if (znak == 'a' || znak == 'w') {
                flag = true;
            }
        } while (!flag);
        return znak;
    }
}
