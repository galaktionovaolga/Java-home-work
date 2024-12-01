package tel.ran1;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Calkulatorr mycalkulatorr = new Calkulatorr();
        mycalkulatorr.printAllCalk(a, b);

        a = 30;
        b = 2;

        System.out.println("mycalkulatorr.getSum(a, b) = " + mycalkulatorr.getSum(a, b));


        String message = new String("I study Java!");

        printMessage(message);
    }

        public static void printMessage(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.length() - 5, str.length() - 1));

    }


    }



