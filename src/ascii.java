public class ascii {
    public static void main(String args[])
    {
        /*
            ASCII  -  American Standard Code For Information Interchange

            Computers can only understand numbers,
            so an ASCII code is the numerical representation of a character such as 'a' or '@' etc.

            The first 32 characters in the ASCII-table
            are unprintable control codes and are used to control peripherals such as printers.

            Codes 32-127 are common for all the different variations of the ASCII table, they are
            called printable characters, represent letters, digits, punctuation marks,
            and a few miscellaneous symbols.

            65-90  A-Z
            97-122 a-z
            48-57  0-9
            Space  32
        */
        StringBuilder str = new StringBuilder("ABCDE");

        for(int i=65;i<=90;i++)
        {
            System.out.println(i+" "+(char)i);
            if(i%2 !=0) {
                str.charAt(i) ;
            }
        }



    }
}