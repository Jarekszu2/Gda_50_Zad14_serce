package packZad14;

public class Serce {
    private int size;

    public String getHeart(int size) {
        String coeur = "";

        // budowa pierwszej linii
        coeur += "  ";
        for (int i = 0; i < (size - 3); i++) {
            coeur += "#";
        }
        coeur += "   ";
        for (int i = 0; i < (size - 3); i++) {
            coeur += "#";
        }
        coeur += "\n";

        // budowa drugiej linii
        coeur += " ";
        coeur += "#";
        for (int i = 0; i < (size - 3); i++) {
            coeur += " ";
        }
        coeur += "#";
        coeur += " ";
        coeur += "#";
        for (int i = 0; i < (size - 3); i++) {
            coeur += " ";
        }
        coeur += "#";
        coeur += "\n";

        // budowa trzeciej linii
        coeur += "#";
        for (int i = 0; i < (size - 1); i++) {
            coeur += " ";
        }
        coeur += "#";
        for (int i = 0; i < (size - 1); i++) {
            coeur += " ";
        }
        coeur += "#";
        coeur += "\n";

        // budowa skosów
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (i + 1); j++) {
                coeur += " ";
            }

            coeur += "#";

            if (i < (size - 1)) {
                for (int j = 0; j < ((2 * (size - i)) - 3); j++) {
                    coeur += " ";
                }
            }

            if (i < (size - 1)) {
                coeur += "#";
            }

            coeur += "\n";
        }

        return coeur;
    }

    public void printHeart(String heart) {
        System.out.println(heart);
    }
}
