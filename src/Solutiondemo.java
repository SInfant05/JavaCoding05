import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class CipherDecipher1{
    /**
     * This method is used to cipher the message (normal) by following steps.
     * Swap the cases of String - UpperCase letters to LowerCase letters and viceversa.
     * Reverse the String
     * Replace the spaces of string with a star character("*")
     * Replace the characters in the even positions of the string
     * Append any integer at the last in that String
     *
     * @param normal
     * @return the ciphered message
     */
    public String ciphering(String normal){
        //Write your code here
        StringBuilder cipher=new StringBuilder(normal);
        for(int i=0;i<normal.length();i++){
            if(Character.isLowerCase(normal.charAt(i))){
                cipher.setCharAt(i,Character.toUpperCase(normal.charAt(i)));
            }
            else if(Character.isUpperCase(normal.charAt(i))){
                cipher.setCharAt(i,Character.toLowerCase(normal.charAt(i)));
            }
        }
        //Reversing here
        cipher.reverse();
        char rword='*';
        String newCipher=new String(cipher);
        String cipher1=new String(newCipher.replace(' ',rword));
        StringBuilder cipher2=new StringBuilder();
        for(int i=0;i<cipher1.length();i++){
            if (i%2!=0){
                int ascii=cipher1.charAt(i);
                cipher2.append(ascii);

            }
            else{
                cipher2.append(cipher1.charAt(i));
            }
        }
        cipher2.append('3');
        System.out.println(cipher2.toString());
        return null;
    }
    /**
     * This method is used to get the normal text by the reverse process of ciphering.
     *
     * @param ciphered
     * @return the deciphered message
     */
    public String deciphering(String ciphered){
        //Write your code here
        StringBuilder deciphered1=new StringBuilder(ciphered);
        //StringBuilder deciphered2=new StringBuilder(deciphered1);
        String deciphered2=new String(deciphered1.deleteCharAt(deciphered1.length()-1));

        for(int i=32;i<=47;i++){
            if(deciphered2.contains(Integer.toString(i))){

            }
        }
         System.out.println(deciphered2.toString());

        return null;
    }
}

public class Solutiondemo {

    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);
        String normal=readInput.nextLine();
        String ciphered=readInput.nextLine();

        CipherDecipher1 cipherOrDecipher1 = new CipherDecipher1();
        System.out.println(cipherOrDecipher1.ciphering(normal));
        System.out.println(cipherOrDecipher1.deciphering(ciphered));



    }

}
