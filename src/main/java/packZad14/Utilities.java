package packZad14;

public class Utilities {
    ScannerWork scannerWork = new ScannerWork();
    Serce serce = new Serce();

    public void mainWork() {
        boolean flag = false;
        char znak = 'a';
        do {
            System.out.println("Wybierz działanie:" +
                    "\n a) wybór serca" +
                    "\n w) wyjście");
            znak = scannerWork.getCharAW();
            if (znak == 'a') {
                System.out.println("Podaj wielkość serca z zakresu od 5 do 12:");
                int heartSize = scannerWork.getInt(5, 12);
                String heart = serce.getHeart(heartSize);
                serce.printHeart(heart);
            } else {
                flag = true;
            }
        } while (!flag);
    }

    public void firstText() {
        System.out.println("Aplikacja rysuje serce z pewnego przedziału wielkości.");
        System.out.println();
    }
}
