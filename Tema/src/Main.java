public class Main {
    public static void main(String[] args) {
        //1.Write a Java program to find the smallest number among three numbers.
        smallestNumber(322,123,565);

        //2.Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        media(24,33,44);

        //3.Write a Java program to display the middle character of a string.
        String text1="middle_character.";
                    //System.out.println(text1.length());
        middleCharacter(text1);

        //4.Write a Java program to count all words in a string.
        String text2="Write a Java program to count All words in a string";
        words(text2);

        //5.Write a Java program to print characters between two characters (i.e. A to P ) from a text
        String text3="Write a Java program To print chAracters between two characters (i.e. A to P ) from a text";
        substring(text3);

        //6.Write a Java program start with an integer n, divide n by 2 ,if n is even , multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
        rezultat(5);
        //7.Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20

        //8.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        //9.Write a Java program to check if the value 20 appears three times in an array
        //10.Write a Java program to add all the digits of a given positive integer until the result has a single digit.
        //11.Write a Java program to check if a positive number is a palindrome or not.https://simple.wikipedia.org/wiki/Palindrome
        //12.Write a Java program to check if a string is a palindrome or not.
        //13.Write a Java program to compute the sum of first n given prime numbers.
        //14.Write a Java program to find the find the word from the middle of a given string. 
        //15.Write a Java program to print the characters on positions that are multiple of 5 BUT NOT multiple of 10
        //16.Write a Java program to read a string and if the first or last characters are ’s’ or ’e’, return the string without the words from odd positions.
        //17.Write a Java program to count the number of words ending that have more than 2 vowels
        //18.Write a Java program to count all “,” and spaces in a text
        //19.Write a Java program to replace all spaces from a string with “;” if the space is on an even position and with “|” if the space is on an odd position from a given string.
    }

 //1.
    public static void smallestNumber(int a, int b, int c) {
        if (a<b && a<c) {
            System.out.println("Numarul cel mai mic este " +a);
        }else if (b<c && b<a){
                System.out.println("Numarul cel mai mic e "+b);

            }else {
                System.out.println("Numarul cel mai mic e "+c);
            }

        }
  //2.
    public static void media(int a, int b, int c)  {
        float media=(a+b+c)/3;
      System.out.println("Media numerelor "+a+" "+b+" "+c+" este"+media);

        }
  //3.
    public static int middleCharacter(String text1) {
      int mijloc = text1.length() / 2;
      char caracterul = text1.charAt(mijloc);
      System.out.println("Caracterul din mijloc este: " + caracterul);
      return mijloc;
    }

  //4.
    public static void words(String text2)  {
        int cuvinte=0;
        String [] words=text2.split(" ");
        for (int cursor=0; cursor<words.length; cursor++){
            cuvinte++;
        }
        System.out.println(cuvinte);

  }
  //5.
    public static void substring(String text3){
        int pozitieJ=text3.indexOf('J');
        int pozitieL=text3.indexOf('A');
        String rezultatSubstring=text3.substring(pozitieJ,pozitieL);
        System.out.println(rezultatSubstring);
    }

  //6.
    public static void rezultat(int a){

    }

  //7.

    }

