package packZad14;
/*
14 Zadanie:
Stwórz za pomocą pętli for/while itd. kształt serca o zadanej wielkości, z dowolnych wybranych przez siebie znaków. Przykład:

Serce rozmiaru X (możesz założyć pewną minimalną wielkość):
   #####    #####
 #      #  #     #
#        ##       #
#                 #
 #               #
  #             #
   #           #
    #         #
     #       #
      #     #
       #   #
        # #
         #

Stwórz za pomocą pętli for/while itd. kształt napisu SDA o zadanej wielkości, z dowolnych wybranych przez siebie znaków. (jeśli będzie ci łatwiej, spróbuj wypisać tekst za pionowo) Przykład:

SDA rozmiaru 7

###### ####    ###
##     #   #  #   #
##     #    # #   #
###### #    # #####
    ## #    # #   #
    ## #   #  #   #
###### ####   #   #

(wiem, że to nie wygląda tutaj dobrze, ale jeśli przekopiujecie to do innego edytora, to wygląda elegancko)



 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Utilities utilities = new Utilities();

        utilities.firstText();
        utilities.mainWork();
    }
}
