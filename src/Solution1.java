import java.util.*;

import static java.util.stream.Collectors.joining;


class CipherDecipher{
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
    public StringBuilder ciphering(String normal){
        //Write your code here
        StringBuilder str = new StringBuilder(normal);
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) >= 97 && str.charAt(i) <=122){
                int c= (int) str.charAt(i)-32;
               // System.out.println("upper : "+str.charAt(i)+":" + c);
                str.setCharAt(i, (char)c);
                //System.out.println(str);
            }
            else if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                int c= (int) str.charAt(i)+32;
                str.setCharAt(i, (char)c);
            }
            if(str.charAt(i) == 32){
                int c= 42;
                str.setCharAt(i, (char)c);
            }


        }
        /*for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                int c= str.charAt(i);
                str2.append(c);
            }
            else{
                str2.append(str.charAt(i));
            }
        }*/
        str.reverse();
        for (int i = 0; i < str.length(); i++) {
            if(i%2!=0){
                int c= str.charAt(i);
                //System.out.println("print number "+str.charAt(i)+":" + c);
                str2.append(c);
            }
            else{
                str2.append(str.charAt(i));
            }
        }
        str2.append(3);
        return str2;
    }
    /**
     * This method is used to get the normal text by the reverse process of ciphering.
     *
     * @param
     * @return the deciphered message
     */
    public StringBuilder deciphering(String ciphered){

        StringBuilder str = new StringBuilder(ciphered);
        StringBuilder str2= new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i));
            if(i == str.length()-1){

               char k = str.charAt(i);
               if(k == '3'){
                   break;

               }

            }
            if (((str.charAt(i) >= 48 && str.charAt(i) <= 57)&&(str.charAt(i+1) >= 48 && str.charAt(i+1) <= 57) && (str.charAt(i+2) >= 48 && str.charAt(i+2) <= 57))) {
                String ss1 = String.valueOf(str.charAt(i));
                String ss2 = String.valueOf(str.charAt(i + 1));
                String ss3 = String.valueOf(str.charAt(i + 2));
                String s = ss1 + ss2 + ss3;
               // System.out.print(s);
                int c = Integer.parseInt(s);
               // System.out.print(c);
               // System.out.println((char) c);
                str2.append((char) c);
                i=i+2;
            }
            else if((str.charAt(i) >= 48 && str.charAt(i) <= 57)&&(str.charAt(i+1) >= 48 && str.charAt(i+1) <= 57)){
                    // int num1 = 0,num2=0;
                    // System.out.println(Character.getNumericValue(str.charAt(i)));
                    // System.out.println(Character.getNumericValue(str.charAt(i+1)));
                    String ss1 = String.valueOf(str.charAt(i));
                    String ss2 = String.valueOf(str.charAt(i+1));
                    String s= ss1+ss2;
                   // System.out.print(s);
                    int c = Integer.parseInt(s);
                   // System.out.print(c);
                  //  System.out.println((char) c);
               /* num1 = Character.getNumericValue(str.charAt(i)) ;
                num2= + Character.getNumericValue(str.charAt(i+1));
                System.out.println( num1 + num2);
                String s1 = Integer.toString(num1);
                String s2 = Integer.toString(num2);
                String s = s1 + s2;
                System.out.println(s);
                int c = Integer.parseInt(s);
                char d = (char) c;
                System.out.println(d);*/
                    str2.append((char) c);
                    i++;

                }

            else{
                str2.append(str.charAt(i));
            }

        }
        str2.reverse();
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == 42){
                int c= 32;
                str2.setCharAt(i, (char)c);
            }
             if(str2.charAt(i) >= 65 && str2.charAt(i) <= 90){
                int c= (int) str2.charAt(i)+32;
                str2.setCharAt(i, (char)c);
            }
            else if(str2.charAt(i) >= 97 && str2.charAt(i) <=122){
                int c= (int) str2.charAt(i)-32;
                // System.out.println("upper : "+str.charAt(i)+":" + c);
                str2.setCharAt(i, (char)c);
                //System.out.println(str);
            }
           // System.out.println("upper"+str2);
        }

        //System.out.println(str2);

        return str2;
    }
}

public class Solution1 {

    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);
        String normal=readInput.nextLine();
        String ciphered=readInput.nextLine();

        CipherDecipher cipherOrDecipher = new CipherDecipher();
        System.out.println(cipherOrDecipher.ciphering(normal));
        System.out.println(cipherOrDecipher.deciphering(ciphered));



    }

}
