public class Main {
    public static void main(String[] args) {
        //Write a Java function to find the length of last word of a given string.
        String text="Zeus is the child of Cronus and Rhea, the youngest of his siblings to be born, though sometimes reckoned the eldest as the others required disgorging from Cronus's stomach";
        int lengthUltimulCuvant=text(text);
        System.out.println("Lungimea ultimului cuvant este "+lengthUltimulCuvant);


        //Write a java function to compare two strings

        String text2="He was respected as an allfather who was chief of the gods[13] and assigned roles to the others";
        String text3="Even the gods who are not his natural children address him as Father, and all the gods rise in his presence.\"[15][16] He was equated with many foreign weather gods";
    comparare(text2, text3);

        //Write a Java function to print the characters on odd positions

        String text4="The god's name in the nominative is Ζεύς (Zeús). It is inflected as follows: vocative";
        oddNumbers(text4);


        //Write a Java function to read a string and if the first and  last characters are 't', return the string without those 't' otherwise return the string unchanged.

        String text5="As a token of their appreciation, the Cyclopes gave him thunder and the thunderbolt, or lightning";
        verificareCaractere(text5);

        //Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive).

        String text6="When Zeus was atop Mount Olympus he was appalled by human sacrifice and other signs of human decadence.";
        int numarare=numarareCuvinte(text6);
        System.out.println("suma este "+numarare);

        // Write a Java program to count all spaces in a text

        String text7="Throughout history Zeus has been depicted as using violence to get his way and terrorize humans";
        int numarare1=numarulSpatiilor(text7);
        System.out.println("suma spatiilor este "+numarare1);


        //Write a Java program to remove vowels from a given string.

        
    }
    public static int text(String text){
        String[] arrays=text.split(" ");//a pus intr-un vector cuvintele stringului text
        int lengthArray=arrays.length;
        String ultimulCuvant=arrays[lengthArray-1];
        System.out.println("ultimul cuvant est  "+ultimulCuvant);
        int lengthUltimulCuvant=ultimulCuvant.length();
        return lengthUltimulCuvant;
    }
    public static void comparare(String text2, String text3){
        int rezultatComparare=text2.compareTo(text3);
        if( rezultatComparare==0){
            System.out.println("Textele sunt egale");
        }else if(rezultatComparare>0) {
            System.out.println("textul2 este mai mare ca textul3 ");
        }else {
            System.out.println("Textul2 e mai mic decat textul3");
        }
    }
    public static void oddNumbers(String text4) {
        int primaPozitie = 1;
        int ultimaPozitie = text4.length()-1;
        for(int cursor=primaPozitie; cursor<=ultimaPozitie; cursor+=2){
            char caracterImpar=text4.charAt(cursor);
            System.out.println("Caracter pe o pozitie impare  "+caracterImpar);
        }

    }

    public static void verificareCaractere(String text5){
        char primulCaracter=text5.charAt(0);
        char ultimulCaracter=text5.charAt(text5.length()-1);
        if (primulCaracter=='t' && ultimulCaracter=='t'){
            String inlocuire=text5.replace('t',' ');
            System.out.println("Afisam stringul inlocuit "+inlocuire);
        }else {
            System.out.println(text5);
        }
    }
    public static int numarareCuvinte(String text6){
        int sum=0;
        String [] numarulCuvintelor=text6.split(" ");
        for(int cursor=0; cursor<numarulCuvintelor.length-1; cursor++){
            if(numarulCuvintelor[cursor].endsWith("m") || numarulCuvintelor[cursor].endsWith("n")){
                sum++;
                System.out.println("cuvintele gasite sunt "+numarulCuvintelor[cursor]);

            }

        }
    return sum;
    }
    public static int numarulSpatiilor(String text7){
        int sum=0;
        for(int cursor=0; cursor<=text7.length()-1; cursor++){
            char caracterCautat=text7.charAt(cursor);
            if (caracterCautat==' '){
                sum++;
            }
        }
        return sum;
    }
    public static

}
